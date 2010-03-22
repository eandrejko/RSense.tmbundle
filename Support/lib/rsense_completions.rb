class RSenseCompletions
  attr_accessor :tm_line_index, :tm_line_number, :tm_current_line
  
  def current_line_ends_with_dot?
    @tm_current_line[(@tm_line_index-1)..(@tm_line_index-1)] == "."
  end
  
  def contains_dot?
    @tm_current_line[0..@tm_line_index].include?(".")
  end
  
  def column
    @tm_line_index - self.prefix.to_s.length - 1
  end
  
  def prefix
    if self.current_line_ends_with_dot?
      nil
    else
      if self.contains_dot?
        @tm_current_line[@tm_current_line.rindex(".")..@tm_line_index][1..-1].strip
      else
        @tm_current_line[0..@tm_line_index].strip
      end
    end
  end

  def rsense_location
    "'#{File.join(ENV['TM_BUNDLE_SUPPORT'], "rsense-0.2", "bin", "rsense")}'"
  end
  
  def cmd
    "/usr/bin/ruby #{rsense_location} code-completion --file='#{ENV['TM_FILEPATH']}' --location=#{@tm_line_number}:#{column}"
  end
  
  def rsense_completions
    `#{cmd}`
  end

  def completion_list
    possibilities = self.rsense_completions.split("\n").map{|x| x.chomp}.map{|x| x.match(/completion: ([^\s]+) ([^\s]+)/)[1..2] rescue nil}.compact.sort
    if prefix
      possibilities.select{|x| x[0].start_with?(prefix)}.uniq
    else
      possibilities.uniq
    end
  end
end

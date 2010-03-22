require ENV['TM_SUPPORT_PATH'] + '/lib/web_preview.rb'
require ENV['TM_SUPPORT_PATH'] + '/lib/textmate.rb'
require ENV['TM_SUPPORT_PATH'] + '/lib/ui.rb'

require File.dirname(__FILE__) + '/rsense_completions'

rsense = RSenseCompletions.new

rsense.tm_current_line = ENV['TM_CURRENT_LINE']
rsense.tm_line_index = ENV['TM_LINE_INDEX'].to_i
rsense.tm_line_number = ENV['TM_LINE_NUMBER'].to_i

choices = rsense.completion_list.map{|m| {"display" => "#{m[0]}"}}
options = {:case_insensitive => false, :initial_filter => rsense.prefix}

TextMate::UI.complete(choices, options)

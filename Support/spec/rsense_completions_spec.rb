require File.dirname(__FILE__) + "/../lib/rsense_completions"


describe RSenseCompletions do
  before(:each) do
    @rc = RSenseCompletions.new
  end
  
  it "should compute correct column for method completion when method is empty" do
    input =%Q("hi".)
    @rc.tm_current_line = input
    @rc.tm_line_index = 5
    @rc.tm_line_number = 1

    @rc.prefix.should == nil
    @rc.column.should == 4
  end

  it "should not compute completions when no . occurs on current line" do
    input = %Q(foo("a"))
    @rc.tm_current_line = input
    @rc.tm_line_index = 8
    @rc.tm_line_number = 1
    
    @rc.contains_dot?.should == false 
  end
  
  it "should determine method prefix" do
    input = %Q(op)
    @rc.tm_current_line = input
    @rc.tm_line_index = 2
    @rc.tm_line_number = 1
    
    @rc.prefix.should == "op"
  end

  it "should determine method prefix with whitespace" do
    input = %Q(  op)
    @rc.tm_current_line = input
    @rc.tm_line_index = 5
    @rc.tm_line_number = 1
    
    @rc.prefix.should == "op"
  end

  it "should compute correct column for method completion when method has prefix" do
    input =%Q("hi".ea)
    @rc.tm_current_line = input
    @rc.tm_line_index = 7
    @rc.tm_line_number = 1

    @rc.column.should == 4
    @rc.prefix.should == "ea"
  end
  
  it "should parse rsense completions" do
    completions = "completion: to_enum Object#to_enum\ncompletion: succ! String#succ!"
    @rc.stub!(:rsense_completions).and_return(completions)
    @rc.stub!(:prefix).and_return(nil)
    
    @rc.completion_list.should == [["to_enum", "Object#to_enum"], ["succ!", "String#succ!"]].sort
  end

  it "should select completions using prefix" do
    completions = "completion: to_enum Object#to_enum\ncompletion: succ! String#succ!"
    @rc.stub!(:rsense_completions).and_return(completions)
    @rc.stub!(:prefix).and_return("s")
    
    @rc.completion_list.should == [["succ!", "String#succ!"]]
  end
end
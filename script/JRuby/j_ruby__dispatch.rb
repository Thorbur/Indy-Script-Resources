class German
  def greet
    puts "Guten Tag.";
  end
end

class Japanese
  def greet
    puts "Konnichiwa.";
  end
end

def meets(person)
  person.greet
end

def after_greeting
  puts "Do you speak English?";
end

meets(German.new)
meets(Japanese.new)
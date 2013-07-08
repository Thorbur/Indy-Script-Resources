#taken from http://www.javaworld.com/javaworld/jw-07-2006/jw-0717-ruby.html

class ADuck
    def quack()
        puts "quack A";
    end
end

class BDuck
    def quack()
        puts "quack B";
    end
end

# quack_it doesn't care about the type of the argument duck, as long
# as it has a method called quack. Classes A and B have no
# inheritance relationship.
def quack_it(duck)
    duck.quack
end

a = ADuck.new
b = BDuck.new
quack_it(a)
quack_it(b)
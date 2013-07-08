class German{
  def greet(){
    println "Guten Tag."
  }
}

class Japanese{
  def greet(){
    println "Konnichiwa."
  }
}

def meets(person){
  person.greet()
}

meets(new German())
meets(new Japanese())
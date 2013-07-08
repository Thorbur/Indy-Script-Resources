function German(){
  this.greet = function() {print('Guten Tag.');};
}

function Japanese(){
  this.greet= function(){
    print( 'Konnichiwa.');
  };
}

function meets(person){
  person.greet();
}

meets(new German());
meets(new Japanese());
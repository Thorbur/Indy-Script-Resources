class duck{
def yell(){println 'Quaaak!'}
}

class goose{
def yell(){println 'GackGackGack!'}
}

def poke(bird){
    bird.yell()
}

def afteryell(){
println 'Sorry, birdy.'
}

poke(new duck())
poke(new goose())
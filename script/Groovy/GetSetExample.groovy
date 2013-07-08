class myObject{
    
    int val
    
    def getVal(){
        return this.val
    }
    def setVal(x){
        this.val = x
    }
}

myo = new myObject()

myo.setVal(5)

print(myo.getVal())
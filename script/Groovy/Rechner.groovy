import groovy.swing.SwingBuilder
import javax.swing.WindowConstants
import java.awt.BorderLayout
import javax.swing.BorderFactory

def swing = new SwingBuilder()

def Functions = new Functions()

def frame = swing.frame(
    title:'Rechner',
    size:[360,260],
    defaultCloseOperation:WindowConstants.EXIT_ON_CLOSE) {
        tableLayout {
            tr {
                td(colspan:2, align:'left') { label('Operand 1 ') }
                td(colspan:2, align:'right'){ textField(id:'op1', columns:10) }
            }
            tr {
                td (colspan:2, align:'left'){ label('Operand 2 ') }
                td (colspan:2, align:'right'){ textField(id:'op2', columns:10) }
            }
            tr {
                td (colspan:1, align:'left'){
                    button(id:'plus', text:' + ', actionPerformed:{
                    def resultat = Functions.indyAdd(Functions.parse(swing.op1.text), Functions.parse(swing.op2.text))
                    swing.erg.setText(resultat.toString())
                    })
                    }
                    td(colspan:1, align:'left'){
                    button(id:'minus', text:' - ', actionPerformed:{
                    def resultat = Functions.indySub(Functions.parse(swing.op1.text), Functions.parse(swing.op2.text))
                    swing.erg.setText(resultat.toString())
                    })
                    }
                    td(colspan:1, align:'left'){
                    button(id:'times', text:' * ', actionPerformed:{
                    def resultat = Functions.indyMul(Functions.parse(swing.op1.text), Functions.parse(swing.op2.text))
                    swing.erg.setText(resultat.toString())
                    })
                    }
                    td(colspan:1, align:'left'){
                    button(id:'divide', text:' / ', actionPerformed:{
                    def resultat = Functions.indyDiv(Functions.parse(swing.op1.text), Functions.parse(swing.op2.text))
                    swing.erg.setText(resultat.toString())
                    })
                }
            }
            tr {
                td (colspan:2, align:'left'){ label('Ergebnis ') }
                td (colspan:2, align:'right'){ textField(id:'erg', columns:10) }
            }
            tr {
                td (colspan:4, align:'left'){ label('History: ') }
            }
            tr {
                td (colspan:4, align:'left'){
                    scrollPane(border:BorderFactory.createRaisedBevelBorder()) { 
                        textArea(id:'history', columns:20, rows:5) 
                    }
                  }
            }
        }
    }
    
Functions.register('history', swing.history)
Functions.register('op1', swing.op1)
Functions.register('op2', swing.op2)
Functions.register('erg', swing.erg)
Functions.register('plus', swing.plus)
Functions.register('minus', swing.minus)
Functions.register('times', swing.times)
Functions.register('divide', swing.divide)
Functions.register('frame', frame)
Functions.register('swing', swing)

frame.show()

class Functions{
def parse(text){
    def num
    
    try{
        num = Integer.parseInt(text)
    } catch(e){
        try{
            num = Double.parseDouble(text)
        } catch(e2){
            num = text
        }
    }
    
    return num
}

def indyAdd(op1, op2){
    return op1 + op2
}

def indySub(op1, op2){
    return op1 - op2
}

def indyMul(op1, op2){
try{
    return op1 * op2
}catch(e){}
}

def indyDiv(op1, op2){
try{
    return op1 / op2
}catch(e){}
}

def register(name, instance){}

}
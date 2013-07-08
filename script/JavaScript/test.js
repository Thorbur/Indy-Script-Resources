function A() {

this.prop = 'hallo';

this.func = function() {print(this.prop);};

}

var obj = new A();

obj.func();
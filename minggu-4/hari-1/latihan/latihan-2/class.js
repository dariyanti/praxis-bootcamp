//contoh class Expression
//(no such term in the spec, but that's similar to Named Function Expression)
let User = class MyClass {
    sayHi() {
        alert(MyClass); // nama MyClass hanya terlihat didalam class ini saja
    }
};


new User().sayHi(); // ini berfungsi, menunjukan definis dari MyClass

alert("hello User");
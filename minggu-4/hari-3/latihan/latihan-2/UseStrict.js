"use strict";

function Person(name) {
    this.name = name;
}
let ferdinand = Person("Ferdinand"); // forgot new
// → TypeError: Cannot set property 'name' of undefined
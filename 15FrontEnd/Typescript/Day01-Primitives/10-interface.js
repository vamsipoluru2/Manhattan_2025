var person = {
    name: "Bhavya Samidala",
    age: 22,
    // spouse is optional — you can skip it or include it
    // spouse: "Alex",
    celebrateBirthday: function (by) {
        this.age += by;
        return this.age;
    },
};
// Using the object
console.log(person.name);
console.log(person.age);
person.celebrateBirthday(1);
//use-case-2:Define "contract " in the class
var Person3 = /** @class */ (function () {
    function Person3(name, age, spouse) {
        this.name = name;
        this.age = age;
        if (spouse) {
            this.spouse = spouse;
        }
    }
    Person3.prototype.celebrateBirthday = function (by) {
        this.age += by;
        return this.age;
    };
    return Person3;
}());
var jane = new Person3('janedane', 28);
console.log(jane);

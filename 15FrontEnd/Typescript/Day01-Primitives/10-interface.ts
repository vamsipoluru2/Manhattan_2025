interface Person2{
    name:String,
    age: number,
    spouse?:string,
    celebrateBirthday:(by:number)=>number
}//use-case 1:provide data for obj

const person: Person2 = {
  name: "Bhavya Samidala",
  age: 22,
  // spouse is optional — you can skip it or include it
  // spouse: "Alex",
  celebrateBirthday(by: number) {
    this.age += by;
    return this.age;
  },
};

// Using the object
console.log(person.name);           
console.log(person.age);            
person.celebrateBirthday(1);        

//use-case-2:Define "contract " in the class
class Person3 implements Person2{
    name:String
    age: number
    spouse?:string;

    constructor(name:string,age:number,spouse?:string){
        this.name=name;
        this.age=age;

        if(spouse){
            this.spouse=spouse
        }
    }

    celebrateBirthday (by: number) {
        this.age+=by;
        return this.age;

    }

}
const jane=new Person3('janedane',28);


console.log(jane);
// create type alias 
type Person={
    name:String;
   readonly age:number;
    spouse?:string;//to make optional
};

let john:Person={
    name:'john',
    age:32

}

//all the argumnets should be declared
let jane:Person={
    name:'jane',
    age:28
};


let jane2:Person={
    name:'jane',
    age:28,
    spouse:'sai'
};

// john.age=29;//error -> age is readonlySS
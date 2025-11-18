//number boolean string

//unlike js onlce type is declared then youa cant assaing a diff type
let PI:number;
PI=3.14;
// PI="vmais";

let message: string;
message="hello world";

let isMonsoon:boolean;

isMonsoon=true;

//null is value and datatype
let x=null;
x=null;
x=0;

// let PI=3.14;//in js it is not error 

//union type two data types to one var
let checkamount:number|string=1000;
checkamount='oneAmount';

//type alias
// A type alias is a "short and sweet name" for any type - a simple
//  primitive, a union type, a function, an object type etc.

type NS =number|string;
let checquamount:NS=1000;
checquamount='oneAmount';

let quantity:NS="two";
quantity=2;

export{}//dont export anything-firle is compiled on its own
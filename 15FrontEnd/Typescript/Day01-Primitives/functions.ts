//function declaration syntax
//return type ois infered /*string|number*/
function add1(x:number|string,y:number|string){
   //type narrowing === is preffered due to == make type cast implictly
   //type narrorwing is done to restrict to one type
    if(typeof x==='number'&&typeof y==='number'){
        return x+y;
    }
    if(typeof x==='string'&&typeof y==='string'){
        return x+' '+y;
    }
    throw new Error('arrgumnets must both be number/both be strings');
    // throw "Wrong argument";// you can throw non-error values
}
try{
add1(12,13);
add1("Hello","World");
add1(12,"thriteen");
}catch(error){
    // if(error instanceof Error){
    //     console.log(error.message)
    // }else{
        // console.log(error);
    // }
console.log((error as Error)?.message);
}


//function expresion syntax
const add2:(a:number,b:number)=> number = function(x,y){
    return x+y;
}
// //arrow function
const add3:(a:number,b:number) => number = (x,y)=>{
    return x+y;
}

//higher order function is takes another function as an arguement and return function 
// bar();

// baz(bar)\
type CartItem={
    name:String,
    quantity:number,
    price:number
};

type Cart={
    cart:CartItem[]
};

type AjaxCallback=(cart:Cart) =>  void;

const ajax=function(url:string,callback:(cart:Cart)=>void){//callback is a funcion
    //make a call to thr backend url

    const data={
        cart:[
            {name:'pen',quantity:2,price:50},
            {name:'pens',quantity:50,price:5}
        ]
    };
    callback(data);
};

    ajax(
        "http//localhost:8080/api/cart",
        function(data:Cart){
            console.log(data)
        }
    )

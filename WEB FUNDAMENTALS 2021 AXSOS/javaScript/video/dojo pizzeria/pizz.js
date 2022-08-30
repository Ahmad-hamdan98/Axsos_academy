var sandwich = {
    bread:    "sourdough",
    protein:  "london broil",
    cheese:   "lacey swiss cheese",
    toppings: ["romaine lettuce", "heirloom tomatoes", "horseradish sauce"]
};
    
console.log(sandwich);


function sandwichFactory(bread, protein, cheese, toppings) {
    var sandwich = {};
    sandwich.bread = bread;
    sandwich.protein = protein;
    sandwich.cheese = cheese;
    sandwich.toppings = toppings;
    return sandwich;
}
var bread =["b2","b4","b5" ]   ;
var protin =["t2","y4","t5" ]   ;
var chees =["che","che5,","ch8","rfsd" ];
var toppings =["che","234,","238","rfsd" ];


var s1 = sandwichFactory("wheat", "turkey", "provolone", ["m ustard", "fried onions", "arugula"]);
console.log(s1,s1.toppings);


var pizzaOven =sandwichFactory("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);
console.log(pizzaOven,pizzaOven.toppings);



var pizzaOven1 =sandwichFactory("hand tossed", "marinara", ["mozzarella", "feta"],  ["mushrooms", "olives", "onions"]);
console.log(pizzaOven1.toppings);

//var randompizza=

function picorder(arrey){
    var rand = Math.floor(Math.random()*arrey.length);
    return arrey[rand];
}
var arr=[];
for(i=0;i<=Math.floor(Math.random()*chees.length);i++){
arr.push(picorder(chees));

}
// console.log(arr);
var arr1=[];
for(i=0;i<=Math.floor(Math.random()*chees.length);i++){
arr1.push(picorder(toppings));

}
// console.log(arr1);

function rondompizza(){
var pizza={};
pizza.brid=picorder(bread);
pizza.protin=picorder(protin);
pizza.chees=arr;

pizza.toppings=arr1;

return pizza;


}
console.log("Bonus Challenge:-------------------------------------------------------------------------------------")
var s=rondompizza();
console.log(s);
console.log("This For Chees ["+arr+"]");
console.log("This For Toppings [ "+arr1+"]");

function remove(){
    document.getElementById("cookie1").remove();
}


var t1=document.getElementById("rain1").innerText;
console.log(t1);
var int1=parseInt(t1);

// var t1=document.getElementById("rain1").innerText;
// console.log(t1);
// var int1=parseInt(t1);

var t1=document.getElementById("rain-l").innerText;
console.log(t1);
var int2=parseInt(t1);

var t1=document.getElementById("tom-h").innerText;
console.log(t1);
var int3=parseInt(t1);

var t1=document.getElementById("tom-l").innerText;
console.log(t1);
var int4=parseInt(t1);

var t1=document.getElementById("fri-h").innerText;
console.log(t1);
var int5=parseInt(t1);

var t1=document.getElementById("fri-l").innerText;
console.log(t1);
var int6=parseInt(t1);

var t1=document.getElementById("sat-h").innerText;
console.log(t1);
var int7=parseInt(t1);

var t1=document.getElementById("sat-l").innerText;
console.log(t1);
var int8=parseInt(t1);












function temp1(){
var degre=document.getElementById("op").value;
if (degre =="fh"){

   int1=Math.floor(1.8*int1+32)+"°F";
   document.getElementById("rain1").innerText=int1;

   int2=Math.floor(1.8*int2+32)+"°F";
   document.getElementById("rain-l").innerText=int2;


   int3=Math.floor(1.8*int3+32)+"°F";
   document.getElementById("tom-h").innerText=int3;


   int4=Math.floor(1.8*int4+32)+"°F";
   document.getElementById("tom-l").innerText=int4;


   int5=Math.floor(1.8*int5+32)+"°F";
   document.getElementById("fri-h").innerText=int5;


   int6=Math.floor(1.8*int6+32)+"°F";
   document.getElementById("fri-l").innerText=int6;


   int7=Math.floor(1.8*int7+32)+"°F";
   document.getElementById("sat-h").innerText=int7;

   int8=Math.floor(1.8*int8+32)+"°F";
   document.getElementById("sat-l").innerText=int8;


}


}
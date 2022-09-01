function alwaysHungry(arr) {
    var r = Boolean;
    for(i=0;i<arr.length;i++){
        if(arr[i]=="food"){

        r =true;
            
        } 
   
    else{
     r=false;
    }
}


if (r==true)
console.log("yummy");
else
console.log("i'm hangry");
}

   
alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// ________________________________________________________________________________________________________Assaiment 1 done


// ____________________________________________________________________________________________________________Assaiment 2 
function highPass(arr, cutoff) {
    var filteredArr = [];
    for(i=0;i<arr.length;i++){
        if(arr[i]>cutoff)
        filteredArr.push(arr[i]);
    }


    return filteredArr;
}
var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log("bass filter",result); // we expect back [6, 8, 10, 9]


// ___________________________________________________________________________________________________________Assaiment 2 done
function betterThanAverage(arr) {
    var sum = 0;
    var count = 0
    for(i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    var average=sum/arr.length
    // count how many values are greated than the average
    for(i=0;i<arr.length;i++){
        if (arr[i]>average)
        count++;
    }
    return count;

}
var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log("the average ...",result); // we expect back 4

// ___________________________________________________________________________________________________________________-Assaiment 2 done

// _______________________________________________________________________________________________________________________Assaiment 3

function reverse(arr) {
    arr.reverse();
    return arr;
}
   
var result = reverse(["a", "b", "c", "d", "e"]);
console.log("revers",result); // we expect back ["e", "d", "c", "b", "a"]
// ______________________________________________________________________________________________Assaiment 4 done

// --------------------------------------------------------------------------------------------------last assaiment 

function fibonacciArray(n) {
    // the [0, 1] are the starting values of the array to calculate the rest from
    var fibArr = [0, 1];
    for (i=2;i<n;i++){
        fibArr[i]=fibArr[i-2]+fibArr[i-1];
    }
    return fibArr;
}
   
var result = fibonacciArray(10);
console.log("fibonachi",result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

















































// // this should console log "I'm hungry"
//  alwaysHungry[5]=234
//  console.log( alwaysHungry);

// var c=[1,3,4];

// function frut(arr,r){


// ______________________________________________________________________________________________________________________________

// var d=[];
// for(i=0;i<c.length;i++){

// d[i+1]=arr[i];
// d[0]=r;
// }
// console.log(d);}

// frut(c,"srtraa");

// function rem(arr,x){
//   var d = arr.length-1;   

// var temp = arr[x];
// arr[x]=arr[d]
// arr[d]=temp
// arr.pop();
// console.log(arr);
// }
// v=[14,2,5,6,3];
// rem(v,1)
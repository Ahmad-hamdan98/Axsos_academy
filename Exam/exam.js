
function incres(){

   var number = document.getElementById("bays").innerText;
   var incres=parseInt(number);
   incres+=1;
   document.getElementById("bays").innerText=incres;

}

function sort(){
    var sortoptions=document.getElementById("op").value;
    if (sortoptions=="Name"){
        document.getElementById("sorted").innerText="62 Products , sorted py Name";
        
    }else if(sortoptions=="Price"){
        document.getElementById("sorted").innerText="62 Products , sorted py Price";
    }
    else if(sortoptions=="Size"){
        document.getElementById("sorted").innerText="62 Products , sorted py Size";
    }
}


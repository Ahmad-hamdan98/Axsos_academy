console.log("page loaded...");


function name1()
{
 document.getElementById("jd").innerText="Hala mohammad";
}

function add1(){

var c=document.getElementById("card-list-item");
c.remove();
    var cx =document.getElementById("badge").innerText;
    var c1 = parseInt(cx); 
    document.getElementById("badge").innerText=c1-1;


    var cx =document.getElementById("badge1").innerText;
    var c1 = parseInt(cx); 
    document.getElementById("badge1").innerText=c1+1;
}

 function rem1(){

        var c=document.getElementById("card-list-item");
        c.remove();

        
 }
    
counter=0;
// function vedio(element){
//     element.play();
// }
counter=9;
counter1=12;
counter2=9;


function clicker1(element){
    counter+=1;
    counter1+=1;
    counter2+=1;
    document.getElementById("c1").innerText=counter;
    document.getElementById("c2").innerText=counter1;
    document.getElementById("c3").innerText=counter2;
}
function clicker2(element){
    counter-=1;
    counter1-=1;
    counter2-=1;
    document.getElementById("c1").innerText=counter;
    document.getElementById("c2").innerText=counter1;
    document.getElementById("c3").innerText=counter2;
}
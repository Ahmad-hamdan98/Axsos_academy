counter=0;
// function vedio(element){
//     element.play();
// }
counter=0;
function clicker1(element){
    counter+=1;
    document.getElementById("c1").innerText=counter;
}
function clicker2(element){
    counter-=1;
    document.getElementById("c1").innerText=counter;
}
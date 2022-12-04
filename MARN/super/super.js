
class Ninja {
    constructor(name,health){
        this.name=name;
        this.health=health;
        this.speed=3;
        this.strength=3;

    }
    sayName=(name)=>console.log(this.name)
    showStats=(name,health,speed,strength)=>console.log(this.name,this.health,this.speed,this.strength)
    drinkSake=()=>console.log(this.strength+=10)
}


const ninja1 = new Ninja("Hyabusa",5);
ninja1.sayName();
ninja1.showStats();


class Sensei extends Ninja{
        constructor(name){
            super(name)
            this.health=200;
            this.speed=10;
            this.strength=10;
            this.wisdom =10;
        }



        speakWisdom=()=> this.drinkSake()
}


const sense=new Sensei("Ahmad")
console.log(sense.strength)
sense.drinkSake()
sense.speakWisdom()

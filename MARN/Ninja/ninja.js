
class Ninja {
    constructor(name,health){
        this.name=name;
        this.health=health;
        this.speed=3;
        this.strength=3;

    }
    sayName=(name)=>console.log(this.name)
    showStats=(name,health,speed,strength)=>console.log(this.name,this.health,this.speed,this.strength)
}


const ninja1 = new Ninja("Hyabusa",5);
ninja1.sayName();
ninja1.showStats();
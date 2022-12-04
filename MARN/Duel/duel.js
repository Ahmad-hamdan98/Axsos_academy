class unit{
    constructor(name,cost,power,resilience){
    this.name=name;
    this.cost=cost;
    this.power=power;
    this.resilience=resilience;
}
attack(attacker,defender){
    if (attacker.power < defender.power){
        return attacker.name+" You loos " +(attacker.power-=2);
    }
    else if(attacker.power == defender.power){
    return "Your powers are eqals";
    }
    else {
    return attacker.name+"You win" +(defender.power-= attacker.power); 
    }

}}

const red_belt= new unit("red belt" , 5 ,7,3)
const black_belt= new unit("black belt" , 5 ,9,4)

class Effect extends unit{
    constructor(name,text,cos,magnitude,stat){
        super(name )
        // this.cost=cost;
        this.text=text;
        this.cos=cos;
        this.stat=stat;
        this.magnitude=magnitude

    }
    playHard(unit){
        unit.resilience+=4;
    }
    Unhandled_Promise_Rejection(unit){
        unit.resilience-=2;
    }
    Pair_Programming(unit){
        unit.power+=2;
    }

}
// cinst duel=new unit()
const eff = new Effect("name","shit",4,23,"doura")
const eeff = new Effect("name","shit",5,23,"doura")
// console.log(eff().playHard(red_belt))
// eff.playHard(red_belt)
// console.log(red_belt.resilience)
// eeff.playHard(black_belt)
// console.log(black_belt.resilience)
// eeff.Unhandled_Promise_Rejection(black_belt)
// console.log(black_belt.resilience)
// eeff.Pair_Programming(red_belt)
// console.log(red_belt.power)

console.log(red_belt.attack(red_belt,black_belt));
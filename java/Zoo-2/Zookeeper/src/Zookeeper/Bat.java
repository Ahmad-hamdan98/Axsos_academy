package Zookeeper;

public class Bat extends Mammal {
//	public int getEnergyLevel() {
//		return energyLevel;
//	}

	public  Bat(){
		this.setEnergyLevel(300);
	}
	
//	public void setEnergyLevel(int energyLevel) {
//		this.energyLevel = energyLevel;
//	}
//	private int energyLevel=300;

	public void fly() {
		this.setEnergyLevel(this.getEnergyLevel());
		System.out.println("ZZZZZZZZZZZZZZZZZ");
		System.out.println("Bats enargy decreses by 50 : and its now"+(this.getEnergyLevel()-50));
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}

	
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel());
		System.out.println("Yamyy");
		System.out.println("Bat enargy increse by 25 it becomes :"+(this.getEnergyLevel()+25));
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel());
		System.out.println("waxxaax the fire sound");
		
		System.out.println("Bat enargy decrese by 100 it becomes :"+(this.getEnergyLevel()-100));
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}
	
}

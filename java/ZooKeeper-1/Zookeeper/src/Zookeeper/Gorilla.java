package Zookeeper;

public class Gorilla extends Mammal {
	
	
	public void throwSomething() {
		System.out.println("Gorella throws smething");
		this.setEnergyLevel(this.getEnergyLevel()-5);
		System.out.println("Gorallas enargy now"+(this.getEnergyLevel()));
	}
	
	public void eatBananas()
{
		System.out.println("Gorella Stasfied");
		this.setEnergyLevel(this.getEnergyLevel()+10);
		System.out.println("Gorallas enargy now"+(this.getEnergyLevel()));

}
	public void  climb()
	{
		System.out.println("Gorella has Climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
		System.out.println("Gorallas enargy now"+(this.getEnergyLevel()));
		
	}
	}

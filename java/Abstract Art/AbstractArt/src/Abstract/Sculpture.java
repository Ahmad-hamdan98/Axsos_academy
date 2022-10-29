package Abstract;

public class Sculpture extends Art{

	private String material;
	public Sculpture(String title, String auther, String description,String material) {
		super(title, auther, description);
		// TODO Auto-generated constructor stub
		this.material=material;
	}

	

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}



	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		String art="";
		 art += "The Title is "+" "+ this.getTitle()+" ";
		 art +="The Author is "+" "+this.getAuther()+" ";
		 art +="Description is "+" "+this.getDescription()+" ";
		 art +="Paint type is "+" "+this.material;
		 System.out.println(art);
		
	}
}

package Abstract;

public class Painting extends Art{
 
	private String paintType;

	

	public String getPaintType() {
		return paintType;
	}



	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}



	public Painting(String title, String auther, String description, String paintType) {
		super(title, auther, description);
		this.paintType = paintType;
	}



	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		String art="";
		 art += "The Title is "+" "+ this.getTitle()+" ";
		 art +="The Author is "+" "+this.getAuther()+" ";
		 art +="Description is "+" "+this.getDescription()+" ";
		 art +="Paint type is "+" "+this.paintType +" ";
		 System.out.println(art);
		
	}
	
	
}

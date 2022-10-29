package Abstract;

public abstract class Art {
	private String title; 
	private String auther; 
	private String description; 

	
	public Art(String title, String auther, String description) {
		super();
		this.title = title;
		this.auther = auther;
		this.description = description;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuther() {
		return auther;
	}


	public void setAuther(String auther) {
		this.auther = auther;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public abstract void viewArt();
}

package by.htp.dz2.biblioteka;

public abstract class PrintedEdition {

	private double price;
	private String title;
	private String type;
	
	public PrintedEdition(String type, String title, double price) {
		this.type = type;
		this.title = title;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setType (String type){
		this.type=type;
	}
	
	public String getType (){
		return type;
	}

}

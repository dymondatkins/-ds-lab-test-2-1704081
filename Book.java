
public class Book {
 
	private int id;
	private String title;
	private float cost;
	
public Book(){
	id=0;
	title="";
	cost = 0;
}

public Book(int id, String title,float cost) {}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}




public void Display() {
	System.out.println(id + " " + title + "" + cost);
}


}

public class Dog {
private int size; 
private String name;

static String BIG_BARK = "Wooof! Wooof!";
static String MEDIUM_BARK = "Ruff! Ruff!";
static String SMALL_BARK = "Yip! Yip!";


void bark()
{
	if (size > 60){
		System.out.println(name + " barked, " + BIG_BARK); 
		 
	} 
	else if (size > 14) {
		System.out.println(name + " barked, " + MEDIUM_BARK);
	}
	else {
		System.out.println(name + " barked, " + SMALL_BARK);
	}		
}


public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

}

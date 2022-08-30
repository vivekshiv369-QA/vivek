package assignment;

interface  fruit {
	int age =9;
	void shade ();
}

class Orange implements fruit {
	public void shade() {
		System.out.println("abcd");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		System.out.println("abcd"+fruit.age);
	Orange r2=new Orange();
	r2.shade();

	}

}

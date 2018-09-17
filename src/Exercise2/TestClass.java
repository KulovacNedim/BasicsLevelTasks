package Exercise2;

public class TestClass {

	public static void main(String[] args) {
		
		PC pc = new PC(8, 250, 2.5, 19, 450.50);
		Laptop laptop = new Laptop(4, 250, 2.2, 15, 450.50, 2.5);
		
		System.out.println(pc.toString());
		System.out.println(pc.calculatePrice());
		
		System.out.println();
		System.out.println(laptop.toString());
		System.out.println(laptop.calculatePrice());

	}

}

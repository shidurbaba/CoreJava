package demo1;

public class Class2 extends Class1 {
	Class2(){
		super();
	}
	protected void printMessage() {
		System.out.println("This will come after super method's message");
	}
	
	
 public static void main(String[] args) {
	Class2 obj1 = new Class2();
	obj1.printMessage();
}
}

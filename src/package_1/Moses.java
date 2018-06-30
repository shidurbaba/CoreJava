package package_1;

public class Moses {
	static private String privateSalve = "wifey";
	static protected String protectedMistress = "Smantha";
	static String maid = "comfortGirl";
	static public String publicWomen = "whore";

	public void userName() {
		System.out.println("This is Moses");
	}
	public void workAt() {
		System.out.println("Works for PBM company");
	}
	public void printLine() {
		System.out.println("This is from Moses Class");
	}
	public void eatSugarWalls(Moses m) {
		if(m == (Moses)m) {
			System.out.println( "Moses likes " +privateSalve+" sugar wall");	
		}else if (m == (Joshua)m) {
			System.out.println("Joshua likes " + privateSalve + " sugar wall") ;
		}else {
			System.out.println("Julius likes " + privateSalve + " sugar wall");
		}
		
	}
	public void powerLift() {
		System.out.println("Moses likes to lift weight and hates boring cardio");
	}
	public void fast2Fast() {
		System.out.println("Fast 2 days in a week");
	}
	public void powerLifer() {
		System.out.println("Moses worships power");
		powerLift();
		fast2Fast();
	}
	public void goToChurch() {
		System.out.println("My church is the gym.");
		powerLifer();
	}
}

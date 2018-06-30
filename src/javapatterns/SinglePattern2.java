package javapatterns;

public class SinglePattern2 {

	private static SinglePattern2 sp2 = null;
	private String car;
	private String year;
	private String make;
	private SinglePattern2() {  car = null;  year = null;  make = null;} 
	
	public String setCarMake(String car) {
		this.car = car;
		return car;
	}
	public String setYear(String year) {
		this.year = year;
		return year;
	}
	public String setMake(String make) {
		this.make = make;
		return make;
	}
	public static SinglePattern2 setPattern2() {
		if(sp2 == null)
		sp2 = new SinglePattern2();
		return sp2;	
	}
	
	public static void main(String[] args) {
	
		SinglePattern2 y = SinglePattern2.setPattern2();
		String carName = y.setCarMake("Toyota");
		String carYear = y.setYear("2018");
		String carModel = y.setMake("Corolla");
		System.out.println(carName + " " + carYear + " " + carModel);

	}
}
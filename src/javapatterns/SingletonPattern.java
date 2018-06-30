package javapatterns;

public class SingletonPattern {

	private static SingletonPattern sp = null;
	public String name = null;
	private SingletonPattern() {}
	
	public String setName(String name) {
		this.name = name;
		return name;
	}
	
	public static SingletonPattern setPattern() {
		if(sp == null) 
			sp = new SingletonPattern();
			return sp;
	}
	
	public static void main(String[] args) {
		
		SingletonPattern x = SingletonPattern.setPattern();
		String student = x.setName("Moses");
		System.out.println(student);

	}

}

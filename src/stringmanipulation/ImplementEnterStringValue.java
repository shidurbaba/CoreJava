package stringmanipulation;

public class ImplementEnterStringValue implements EnterStringValue, GoodDogHunting  {

	@Override
	public void passAValue() {
		System.out.println("HelloWorld");
		
	}

	@Override
	public void jumpUp() {
		System.out.println("Jump And Catch");
		
	}

	@Override
	public void rollOver() {
		System.out.println("Roll over ");
		
	}

	@Override
	public void makeMeSwim() {
		System.out.println("Take him to swimming");
		
	}

	@Override
	public void feedMe() {
		System.out.println("Feed him biscuts");
		
	}
	
}

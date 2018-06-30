package stringmanipulation;

public class PrintingMessage {
		public void greet(EnterStringValue esv) { //This is an interface that accepts concrete reference type
			esv.passAValue();
			esv.rollOver();
			esv.jumpUp();
		}
		public void goodDogBehaviour(GoodDogHunting gdh) {
			gdh.feedMe();
			gdh.makeMeSwim();
		}
	
	public static void main(String[] args) {
		PrintingMessage pm = new PrintingMessage();
		ImplementEnterStringValue ies = new ImplementEnterStringValue();
		pm.greet(ies); //passing object of implemented class i.e ImplementEnterStringValue to perform those behaviour
		pm.goodDogBehaviour(ies);
	}

}

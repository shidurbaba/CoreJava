package stringmanipulation;

public class RemoveJunk {

	public static void main(String[] args) {
		String alphabets = "এ বি সি ডি abcdABCD 012345";
		
		alphabets = alphabets.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(alphabets);
	}

}

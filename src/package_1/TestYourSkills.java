package package_1;

public class TestYourSkills {
	
	
	public void callUserName(Moses m) {
		m.userName();
		
	}
	
	public void validateInstances(Moses m) {
		if(m instanceof Moses) {
			System.out.println("It is not an instance of Object Type Moses");
		}else if (m instanceof Moses){
			System.out.println("Invalid object type");
		}
	}

	public static void main(String[] args) {
		Moses moe = new Moses();
		Moses joshua = new Joshua();
		Moses julius = new Julius();
		Julius realJulius = new Julius();
		TestYourSkills tySkills = new TestYourSkills();
		/*tySkills.callUserName(moe);
		tySkills.callUserName(joshua);
		tySkills.callUserName(julius);
		tySkills.validateInstances(julius);
		*/
		julius.workAt();
		realJulius.brianiac(); //without type casting.
		((Julius)julius).brianiac(); //with type casting.
		((Julius)julius).cardioJunkie();
		//realJulius.eatSugarWalls(realJulius);
		
	}

}

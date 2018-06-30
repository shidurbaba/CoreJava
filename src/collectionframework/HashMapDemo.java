package collectionframework;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		DrugConverage_Demo dc_demo_1 = new DrugConverage_Demo("Pfizer", "Juliet", 123456, 234234);
		DrugConverage_Demo dc_demo_2 = new DrugConverage_Demo("Pfizer_1", "Juliet_1", 83748927, 3287482);
		DrugConverage_Demo dc_demo_3 = new DrugConverage_Demo("Pfizer_2", "Juliet_2", 83278923, 7893214);
		DrugConverage_Demo dc_demo_4 = new DrugConverage_Demo("Pfizer_3", "Juliet_3", 34324234, 4653432);
		DrugConverage_Demo dc_demo_5 = new DrugConverage_Demo("Pfizer_4", "Juliet_4", 83578275, 8578047);

		
		HashMap<Integer, DrugConverage_Demo> hp_mp = new HashMap<Integer, DrugConverage_Demo>();
		hp_mp.put(1, dc_demo_1);
		hp_mp.put(2, dc_demo_2);
		hp_mp.put(3, dc_demo_3);
		hp_mp.put(4, dc_demo_4);
		hp_mp.put(5, dc_demo_5);
		for(Entry<Integer, DrugConverage_Demo> m : hp_mp.entrySet()) {
			int number = m.getKey();
			DrugConverage_Demo prescription = m.getValue();
			
			System.out.println("Information " + number);
			System.out.println(prescription.drug + " | " + prescription.patientname + " | " + prescription.RxNum + " | " + prescription.ServiceProvider);
		}	
			
		
		
		//sout(hp_mp.number);
		//sout(prescription.);
	}

}

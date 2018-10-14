package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

	public static List<Integer> computePrimeFactor(int number) {
		// TODO Auto-generated method stub
	 List<Integer> numberList = new ArrayList<>();
	
		for (int incrementNumber = 2;incrementNumber <= number;incrementNumber++) {
			for (;number % incrementNumber == 0;number=number/incrementNumber) {
					if (incrementNumber > 1) {
					numberList.add(incrementNumber);
				}
				
			}
			
			
		}
		return numberList;
	}

}

package fizbuzz;

public class FuzzLogic {

	public String isNumberFuzzBuzz(int number) {
		// TODO Auto-generated method stub
		String result = String.valueOf(number);
		if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
			result = "FuzzBuzz";
		}
     	else if (isMultipleOfThree(number)) {
			result = "Fuzz";
		} else if (isMultipleOfFive(number)) {
			result = "Buzz";
		}
		return result;
	}

	private boolean isMultipleOfFive(int number) {
		return number % 5 == 0;
	}

	private boolean isMultipleOfThree(int number) {
		return number % 3 == 0;
	}

}

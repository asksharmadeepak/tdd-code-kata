package roman;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dsm2061 on 8/7/18.
 */
public class RomanConverter {

    int repeatCounter = 0;

    public int convertToArabic(String input) {

        //DCCCLXXXVIII

        char[] inputArray = input.toCharArray();
        int totalValue = 0;

        if (inputArray.length == 1) {
            return getValue(inputArray[0]);
        } else {

            //VI
            for (int i = 0; i < inputArray.length-1; i++) {
                int currentValue = getValue(inputArray[i]);
                int nextValue =  getValue(inputArray[i+1]);
                if( repeatCounter == 3){
                    int value = getValue(inputArray[i]);
                    continue;
                    //totalValue = totalValue + currentValue;
                }else{
                    totalValue = totalValue + getTotalValue(currentValue, nextValue);

                }
//                totalValue = totalValue + getTotalValue(currentValue, nextValue);

//                if (i < inputArray.length - 1) {
//                    valueFirst = getValue(inputArray[i + 1]);
//                    totalValue = totalValue + getTotalValue(value, valueFirst);
//                    i++;
//                } else {
//
//                }
            }
        }
        return totalValue;
    }

    private int getTotalValue(int currentValue, int nextValue) {
        int totalValue = 0;
        if ( (currentValue > nextValue)) {
            totalValue = currentValue + nextValue;
        }else if(currentValue == nextValue){
           repeatCounter++;
        }else {
            totalValue = nextValue - currentValue;
        }
        return totalValue;
    }


    public int getValue(Character key) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map.get(key);
    }
}

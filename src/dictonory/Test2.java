package dictonory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by dsm2061 on 8/6/18.
 */
public class Test2 {

    public static void main(String[] args) {
        int result = solve(2, "1A 2F 1C");
        System.out.println(result);

    }

    public static int solve(int n , String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);
        map.put('D', 3);
        map.put('E', 4);
        map.put('F', 5);
        map.put('G', 6);
        map.put('H', 7);
        map.put('I', 8);
        map.put('J', 9);

        String[] split = s.split(" ");
        int[][] array= new int[n][12];
        int count = 0;

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("1A");
        hashSet.add("2F");
        hashSet.add("1C");

        for (int l = 0; l < split.length ; l++) {
            //int temp = 0;

            //System.out.println("Count" +temp++);
            if(hashSet.contains(split[l])){
            for (int i = 0; i <array.length ; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    char charAt = split[l].charAt(1);
                    if (map.containsKey(charAt)) {
                        Integer integer = map.get(charAt);
                        if ((array[i][3] == array[i][j]) || (array[i][8] == array[i][j])) {
                            array[i][j] = -1;
                        } else {
                            array[i][integer] = 1;

                        }
                    }
                }
             }
                //hashSet.add(split[l]);
            }

        }
System.out.println(hashSet);

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.println("Values at arr["+i+"]["+j+"] is "+array[i][j]);
            }
        }


        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == -1 || array[i][j] == 1){
                    continue;
                }else{
                    if(j+3 < 10){
                        for (int k = j; k < j+3 ; k++) {
                            if(k==3){
                                count++;
                            }
                        }
                    }

                }
            }
        }

        return count;
    }
}

package dictonory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dsm2061 on 8/6/18.
 */
public class Test1 {

    public static void main(String[] args) {

        int result = solve("23A84Q", "K2Q25J");
        System.out.println("Result" +result);
    }

    private static int solve(String s1, String s2) {
        int winCountPlayer1 = 0;
        int winCountPlayer2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2) {
                if(getInt(c1) > getInt(c2)){
                    System.out.println("1");
                    winCountPlayer1++;
                }else if(getInt(c1) < getInt(c2)){
                    System.out.println("2");
                    winCountPlayer2++;
                }
            }

        }
        if(winCountPlayer1>winCountPlayer2){
            return winCountPlayer1;
        }else if(winCountPlayer1 < winCountPlayer2){
            return winCountPlayer2;
        }else{
            return 0;
        }

    }

    private static int getInt(char character){
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('A', new Integer (14));
            map.put('K', new Integer (13));
            map.put('Q', new Integer (12));
            map.put('J', new Integer (11));
            map.put('T', new Integer (10));
            map.put('9', new Integer (9));
            map.put('8', new Integer (8));
            map.put('7', new Integer (7));
            map.put('6', new Integer (6));
            map.put('5', new Integer (5));
            map.put('4', new Integer (4));
            map.put('3', new Integer (3));
            map.put('2', new Integer (2));
            Integer i = map.get(character);
            return i.intValue();
    }
}

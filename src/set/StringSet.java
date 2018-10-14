package set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringSet {

    public static final int DEFAULT_SIZE = 5;
    String[] elements = new String[DEFAULT_SIZE];
    int size = 0;

    public boolean isEmpty() {
        return size>0 ? false:true;
    }


    public void add(String input) {
        if(contains(input)){
            elements[size] = input;
            size++;
        }
    }
/* Update method name contains
* don't return multiple statement in method
*  we can extract the method and return 1 for true and -1 for false to help remove method
* */
    private boolean contains(String input) {
        boolean isContains=true;
        for (String element:elements) {
            if(input == element){
                isContains = false;
                break;
            }
        }
        return isContains;
    }

    public void removeFromIndex(int index) {
        elements[index] =  null;
        elements[index] = elements[size];
        size--;
    }

    public void removeFromIndexWithShifting(int index) {
        elements[index] =  null;

//        for (int i = 0; i < elements.length; i++) {
//            if(elements[i] == null){
//                elements[i] =
//            }
//        }
        elements[index] = elements[size];
        size--;
    }

    public void show(){

        ArrayList list = new ArrayList();
        list.remove(3);

        System.out.println("Element Length"+elements.length);
        System.out.println("Element Size"+size);

//        for (String element:elements) {
//            System.out.println("Element "+element.length());
//
//        }
    }
}

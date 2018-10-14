package set;


public class Set {

    int size = 0;

    int elements[] = new int[10];

    public boolean isEmpty() {
      if (size > 0) {
          return false;
      }else{
          return true;
      }
    }

    public void add(int s) {
            if(isUnique(s)){
                elements[size] = s;
                size++;
            }
    }


    private boolean isUnique(int element){
        for (int setElement:elements) {
            if(setElement == element){
                return false;
            }
        }
        return true;
    }

    public void removeFromIndex(int index) {
        elements[index] =  0;
        elements[index] = elements[size];
        size--;
    }

    public void removeFromMatch(int element) {
        for (int i=0; i <elements.length; i++) {
            if(elements[i] == element){
                elements[i] =  0;
                size--;
            }
        }
    }


    public void show(){
        for (int elem:elements) {
            System.out.println("Set elements  "+ elem);
        }
    }

}

package list;

public class MyArrayList {
    public int array[]; //Dolacaq olan obyektimiz;
    private int count; // index
    public int sizeOfArray; //array uzunlugu

    public MyArrayList(){
        array = new int[1]; //ilkin max index 2
        count = 0;
        sizeOfArray = 1;
    }

    //Add process
    public void add(int element){
        if (count == sizeOfArray){
            growSize();
        }
        array[count] = element;
        count++;
    }

    private void growSize(){
        int[] newArray = null;
        if (count==sizeOfArray){
            newArray = new int[sizeOfArray*2];
        }

        for (int i =0; i<sizeOfArray; i++){
            newArray[i] = array[i];
        }

        array = newArray;
        sizeOfArray*=2;
    }

    public void addElementAt(int index, int element){
        if (count == sizeOfArray){
            growSize();
        }
        for (int i = count-1; i >= index; i--){
            array[i+1] = array[i];
        }
        array[index] = element;
        count++;
    }

    //Get element
    public int get(int index){
        return array[index];
    }

    //Remove element
    public void remove(int index){
        if (count>0){
            for (int i = index; i<count-1; i++){
                array[i] = array[i+1];
            }
        }
        array[count-1] = 0;
        count--;
    }

    public static void printArrayList(MyArrayList arrayList){
        System.out.print("[");
        for (int i=0; i<arrayList.sizeOfArray; i++){
            String space;
            System.out.print(arrayList.array[i]);
            if (arrayList.sizeOfArray-1==i){
                space="";
                break;
            }else {
                space = ", ";
            }

            System.out.print(space);
        }
        System.out.println("]");
    }
}

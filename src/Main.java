import list.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);

        System.out.println("Array index of value " + arrayList.get(0));
        //Normally
        printArray(arrayList);

        arrayList.addElementAt(1, 1);
        //Added element
        printArray(arrayList);

        arrayList.remove(0);
        //removed element
        printArray(arrayList);
    }

    public static void printArray(MyArrayList arrayList){
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

import list.MyArrayList;
import list.MyLinkedList;
import map.MyHashMap;
import map.hashMapUtil.Key;
import map.hashMapUtil.Value;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        MyArrayList arrayList = new MyArrayList();
//        arrayList.add(5);
//        arrayList.add(4);
//        arrayList.add(3);
//
//        System.out.println("Array index of value " + arrayList.get(0));
//        //Normally
//        arrayList.printArrayList(arrayList);
//
//        arrayList.addElementAt(1, 1);
//        //Added element
//        arrayList.printArrayList(arrayList);
//
//        arrayList.remove(0);
//        //removed element
//        arrayList.printArrayList(arrayList);

//        MyLinkedList linkedList = new MyLinkedList();
//        linkedList.add(linkedList, 1);
//        linkedList.add(linkedList, 2);
//        linkedList.add(linkedList, 3);
//        linkedList.add(linkedList, 4);
//        linkedList.add(linkedList, 5);
//
//        linkedList.printLinkedList(linkedList);

        MyHashMap hashMap = new MyHashMap();
        hashMap.put(new Key(1), new Value(7));
        hashMap.put(new Key(2), new Value(77));
        hashMap.put(new Key(3), new Value(777));


        System.out.print("[" + hashMap.get(new Key(1)).getValue() + ", ");
        System.out.print(hashMap.get(new Key(2)).getValue() + ", ");
        System.out.println(hashMap.get(new Key(3)).getValue() + "]");

        hashMap.remove(new Key(2));
        System.out.print("[" + hashMap.get(new Key(1)).getValue() + ", ");
        System.out.println(hashMap.get(new Key(3)).getValue() + "]");
    }
}

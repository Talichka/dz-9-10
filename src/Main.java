import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {7, 8, 4, 5};

        Set <Integer> mySet = new HashSet<>();
        mySet.add(7);
       mySet.add(99);
       mySet.add(1);
        System.out.println(mySet.contains(8));
        System.out.println(mySet.contains(99));
        System.out.println(mySet.size());
        System.out.println(mySet);
        System.out.println("------");

        Map <Integer, Integer> myMap = new HashMap<>();
        myMap.put(2, 7);
        myMap.put(0, 99);
        myMap.put(1, 8);
        for(Integer key: myMap.keySet()){
        System.out.println(myMap);
        System.out.println(key);

        System.out.println(myMap.get(key));}
        System.out.println(myMap.size());
//        array [0] = 1;
//        Arrays.sort(array);
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(array.length);
//        System.out.println("----");
//
//        List <int[]> arr = Arrays.asList(array);
//        for(int number: array){
//                System.out.println(number);}
//
//        System.out.println("----");
//        List<Integer> myList = new LinkedList<>();
//               myList.add(0,9);
//        myList.add(0,7);
//        myList.add(0,9);
//        myList.add(1,1);
//        myList.add(1,2);
//        myList.add(1,3);
//        myList.add(2,4);
//        myList.add(3,4);
//        myList.add(4,4);
//        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println("----");
//        for (int i=0; i < myList.size(); i++){
//        System.out.println(myList.get(i));
//        if (i == 0)
//        {myList.remove(i);}}
//        System.out.println("----");
//        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println("----");
//        Iterator<Integer> iter = myList.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());}

    }
}
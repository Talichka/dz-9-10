import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {7, 8, 4, 5};



        array [0] = 1;
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println("----");

        List <int[]> arr = Arrays.asList(array);
        for(int number: array){
                System.out.println(number);}

        System.out.println("----");
        List<Integer> myList = new ArrayList<>();
               myList.add(0,9);
        myList.add(0,7);
        myList.add(0,9);
        myList.add(1,1);
        myList.add(1,2);
        myList.add(1,3);
        myList.add(2,4);
        myList.add(3,4);
        myList.add(4,4);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println("----");
        for (int i=0; i < myList.size(); i++){
        System.out.println(myList.get(i));
        if (i == 0)
        {myList.remove(i);}}
        System.out.println("----");
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println("----");
        Iterator<Integer> iter = myList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());}

    }
}
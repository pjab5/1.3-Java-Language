package Level1.Exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(71, -999, 20, 58, 104, 5555,-2,11)),list2 = new ArrayList<>();
        ListIterator<Integer> list1Iterator = list1.listIterator();
        while (list1Iterator.hasNext()) {
            list2.add(0,list1Iterator.next());
        }
        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);
    }
}
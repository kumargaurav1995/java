import sun.awt.SunHints;

import java.util.*;

public class CollectionIterator {

    public static void main (String[] args){
        Collection values = new ArrayList();
        ((ArrayList) values).add(4);
        ((ArrayList) values).add(5);
        ((ArrayList) values).add(7);
        System.out.println(values);

        Iterator iterator = values.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        List<Integer> value = new ArrayList<>();
        value.add(2);
        value.add(5);
        value.add(1);

        Collections.sort(value);
        Collections.reverse(value);

        for(Integer i : value){
            System.out.println(i);
        }
        Vector<Integer> values1 = new Vector<>();
        values1.add(3);
        values1.add(2);
        values1.add(1);

        for(Integer i : values1){
            System.out.println(i);
        }
    }

}

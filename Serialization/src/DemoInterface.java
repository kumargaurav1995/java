import java.util.Set;
import java.util.TreeSet;

interface Phone {
    void call();
    default void message(){
        System.out.println("sent");
    }
}
class AndroidPhone implements Phone{

    @Override
    public void call() {
        System.out.println("calling");
    }
}
public class DemoInterface {

    public static void main(String[] args){
       Phone p = new AndroidPhone();
       p.call();
       p.message();
        Set<Integer> values = new TreeSet<>();
        values.add(3);
        values.add(3);
        values.add(5);
        values.forEach(integer -> System.out.println(integer));
    }
}

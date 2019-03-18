import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(2,4,5,1,8,4);
        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
        Function<Integer,Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>(){
            int result = 0;

            @Override
            public Integer apply(Integer i, Integer j) {
                result = j + i;
                return result;
            }
        };
        Stream s = values.stream();
        Stream s1 = s.map(f);
        Integer result = (Integer)s1.reduce(0,binaryOperator);
        System.out.println(result);
    }
}

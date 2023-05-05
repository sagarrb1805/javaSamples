package StreamSample;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(35, 28, 22, 25, 18, 32, 15);

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if (t%2 == 0){
                    return true;
                }return false;
            }
            
        };

        Function<Integer, Integer> function = num -> num+5;

        BinaryOperator<Integer> operator = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer t, Integer u) {
                return t+u;
            }
            
        };

        int sum = numList.stream().filter(predicate).map(function).reduce(0, operator);

        // int sum = numList.stream().filter(num -> num%2 == 0).map(num -> num+5).reduce(0, (num1, num2)-> (num1+num2));
        System.out.println(sum);

        numList.stream().forEach(num -> System.out.println(num));
        System.out.println();
        numList.stream().sorted().forEach(num -> System.out.println(num));
        System.out.println();

        Consumer<Integer> consumer = (t)->System.out.println(t);
        numList.stream().sorted().forEach(consumer);

        // List<Integer> numList = Arrays.asList(15, 18, 22, 25, 28, 32, 35);
        // // System.out.println(numList);
        // Stream<Integer> stream = numList.stream();
        // // System.out.println(stream);

        // Stream<Integer> evenStream = stream.filter(num -> num%2 == 0);
        // // List<Integer> evenStreamList = evenStream.collect(Collectors.toList());
        // // for (Integer num : evenStreamList) {
        // //     System.out.println(num);
        // // }
        // Stream<Integer> evenStreamMaped = evenStream.map(num -> num+5);
        // // List<Integer> evenStreamList = evenStreamMaped.collect(Collectors.toList());
        // // for (Integer num : evenStreamList) {
        // //     System.out.println(num);
        // // }

        // int sum = evenStreamMaped.reduce(0, (num1, num2) -> num1+num2);
        // System.out.println(sum);

    }    
}

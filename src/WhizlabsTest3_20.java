import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhizlabsTest3_20 {
    public static void main(String... str) {
        Calculate c1 = i -> i + 1;
        Calculate c2 = i -> Long.valueOf(i);
        Calculate c3 = i -> {
            throw new ArithmeticException();
        }; // It is fine as long as it is UNchecked excpetion. The CHECKED exception would cause of compiler error.

        int aa = 9;
        Long bb = 10l;
        // Long cc = Integer.valueOf("10"); This can NOT have implicit cast
        //  long ff = throw new ArithmeticException();
        long jj = aa;
        long kk = bb;

        List result = List.of(1, 2)
                .parallelStream()
                .collect(ArrayList::new, (x, y) -> x.add(y), (x, y) -> x.addAll(y)); //.collect (Supplier<S> factory , BiConsumer<S,T> accumolator, BiConsumer<S,S> combinter)


        Stream<Integer> stream = Stream.of(1, 3, 5);
        Optional<Optional<Integer>> optional =
                Optional.of(stream.filter(i -> i % 2 == 0).reduce(Integer::sum));
        System.out.println(optional.get());


        List<Integer> integers = List.of(0, 1, 2, 3);
        integers.stream()
                .peek(i -> {
                    if (i % 2 != 0) System.out.print(i);
                })
                .forEach(i -> {
                    if (i % 2 == 0) System.out.print(i);
                });

        BiFunction<Integer, Integer, Integer> func = (final var i, var j) -> i + j;  // this is a valid lambda expression eventhough it has final.
        //BiFunction<Integer,Integer,Integer> func2 = (final  i, final j ) -> i + j; // final of what type. it is wrong !!
        //Function func3 = l-> l.Stream();

        Predicate p1 = (var i) -> (int) i % 2 == 0; // the Predicate implicitely is Predicate<Object> which mean our input parameter much be Object object.
                                                    // We expect i should be Object or we can use var to implicitly point to Object. int or Integer are wrong
        Predicate<? extends Number> p2 = (Integer i) -> (int) i % 2 == 0;




        //Test 3 / Q80
        double resultCal = new WhizlabsTest3_20().cal2(1 , x-> 2.0 *x);

    }

    double cal2(int number, @NotNull Function<Integer,Double> function){ // Note . I need to look at the input generics of Function.

        return function.apply((int) number);

    }
}

interface Calculate {
    long calculate (int i);


}



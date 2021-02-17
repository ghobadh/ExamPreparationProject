import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithStream {

    static public void main (String...cc){
        List<String> mylist=  Stream.of("tiger","cat")
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());
        mylist.stream()
                .forEach(System.out::println);

        IntStream instream = mylist.stream().mapToInt(String::length);
        //instream.forEach(System.out::println);

       // Stream<String> stream = instream.mapToObj(s-> s+"ish");

        IntSummaryStatistics intSummaryStatistics = instream.summaryStatistics();
        System.out.println("Average of tiger and cat is "+ intSummaryStatistics.getAverage());
        //stream.forEach(System.out::println);
       // System.out.println(mylist);

/*
        List<List<String>> listFlatMap = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"),
                Arrays.asList(""));
*/

/*        listFlatMap
                .stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);*/
    }
}

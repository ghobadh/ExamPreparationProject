import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamParctice {

    static public void main (String hh[]){
        List<String> zero = List.of();
        List<String> one = List.of("Gorila");
        List<String> two = List.of("Monkey", "Ape" , "Snale", "Gorila");

        Stream <List<String >> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream())// we 1- elimante empty list 2- combine other list into one stream
                .filter( n-> n.length() >=4 )
                .unordered()
                .parallel()
                .distinct()
                //.skip(1)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())//(c1,c2) -> c1.length()-c2.length())
                .forEachOrdered( x-> System.out.print(x+ " ")); // because we used parallel then using forEach does not show them sorted.
                                                                // you need to use forEachOrdered to take advantage of parallel stream


    }
}

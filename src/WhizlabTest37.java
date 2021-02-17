
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WhizlabTest37 {

    static public void main(String... x){

        List<Integer> list = Arrays.asList(-2,-1,0,1,2);
        Predicate<Integer> postive = i -> {
            System.out.println("-->"+i);
            return i > 0;
        };
        Predicate<Integer> negative = i ->{
            System.out.println(i + "<--");
            return i < 0 ;
        };

        list.stream().filter(postive).allMatch(negative);

        Stream<Integer> st1 = Stream.of(1,3);
        Optional<Integer> op1 = st1.findAny().filter(i-> i%2 == 0); //Optional can have filder(predicate <T>(T x) ) method
        //System.out.println(op1.get());

        Data data = Stream.<Data>empty().findAny()
                    .or(() -> Optional.of(new Data(1)))
                .orElseGet(() -> new Data(2));

        System.out.println("Data is-->" + data.number);


        StringBuffer us = new StringBuffer("US");
        StringBuffer uk = new StringBuffer("UK");
        System.out.println(Stream.of(us,uk).collect(Collectors.joining("-vvv","=bbb","bbb")));
    }
}

class Data {
    int number;
    Data(int number){
        this.number = number;
    }
}
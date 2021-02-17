import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListExample {

    static public void main (String... xx){
        LinkedList<String> ll = new LinkedList<String>();

        ll.offer("aa");
        ll.offer("bb");
        ll.offer("cc");

        System.out.println("peek-->" +ll.peek());
        System.out.println("pop-->"+ ll.pop());
        System.out.println("remove-->"+ ll.remove());


        //HashSet<Number> yy= new HashSet<Integer>(); invalid

        var x33 = Integer.valueOf("11");

        var num = new HashSet<Number>();
        num.add(x33);
        num.add(null);
        num.add(99.99);
        num.add(600L);
        num.add(22);
        // All of them are acceptable.

        Map<String, Double> map = new HashMap<>();
       // map.put("e",2L);  it is double object so long is not acceptable

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);


        var s33 = Stream.generate(()->"meow");
        var match = s33.allMatch(String::isEmpty);// valid and terminate the infinite loop
        //var match = s.noneMatch(String::isEmpty); //both noneMatch and anyMatch do not cause of terminate the infinite stream
        System.out.println(match);

        System.out.println(Stream.iterate(1,x->++x)
                            .limit(5)
                            .map(x -> ""+x)
                            .collect(Collectors.joining()));

        var cats = Stream.of("l","ll","oc","pu").parallel();
        var bears = Stream.of("pa","gr","po").parallel();

        var data = Stream.of(cats,bears).flatMap(s->s).collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")
        ));
        System.out.println("-->" + data.get(false).size() +" "+ data.get(true).size());

    }
    class Danger extends RuntimeException{
        public Danger (String x) {super(x);}
        public Danger (int value) {super((String) null);}
    }

    class MyException extends Danger   {
       // public MyException(){} this one is fails because of the parent default constructor is not avaialble
        public MyException(String x){super(x);}
    }



}



class Mycloseable implements AutoCloseable{

    @Override
    public void close()  {
        System.out.println("LL");
        //throw new FileNotFoundException("opps");
    }

    public void exceptioncaller() {
        try(Mycloseable mycloseable = new Mycloseable()){
            System.out.println("print me please");
        }/*catch (Exception e){
            e.printStackTrace();
        }*/

        System.out.println(List.of("duck","flamingo","pelian")
        .parallelStream().parallel()
        .reduce("",
                (c1,c2)-> c1+c2,
                        (s1,s2) -> s1+ s2 ));

        var v1= (String)null;

    }


}

class myError extends Error{}
class myEx2 extends Exception{}
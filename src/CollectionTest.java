import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class CollectionTest {

    static public void main(String... hh) {
        new CollectionTest().collectMeTest();
    }

    private void collectMeTest() {
        Collection<String> c = new ArrayList<>();
        // Collection<String> c= Arrays.asList("Hassan","Mammad"); <-- Remember if we use asList we cannot modify the Array List anymore.
        Predicate<String> p = s -> s.startsWith("G");
        String s1 = "Gavin";
        c.add("TEST");
        //Predicate<String> p2 = s1::startsWith; //<-- it works but it take the whole word "TEST"
        c.add("Gavin");
        c.forEach(System.out::println);
        c.removeIf(p);
        System.out.println(c);
        c.clear();
        c.add("");
        System.out.println("c is:" + c);
        //c.removeIf(String::isEmpty);
        System.out.println("c is:" + c.removeIf(String::isEmpty));
        System.out.println("c is:" + c.removeIf(String::isEmpty));

        List<String> ll = new ArrayList<>();
        ll.add("hassan");
        // List keeps index so get works fine , unlike Collection<String>
        ll.get(0);

        Map<Integer, String> map = new HashMap<>();
        map = Map.ofEntries(
                Map.entry(1, "A"),
                Map.entry(2, "B")
        );
        map.forEach((k, v) -> System.out.println("key is:" + k + " and value is:" + v));
        //map.replace(1,"CC"); <-- because of ofEntries replace does not work
        //map.remove(1); <-- becasue of Map.ofEntries remove does not work ( it makes the object immutable so it cannot be modified. ) 
        map.forEach((k, v) -> System.out.println("After Remove \nkey is:" + k + " and value is:" + v));

        BiPredicate<String, String> p3 = String::startsWith;
        System.out.println(p3.test("Hello world","Hell"));

        BiPredicate<String, String> p4 = (x,y) ->  x.startsWith(y);
        Consumer<Boolean> cs1 = System.out::println;
        cs1.accept(p4.test("Hello world","He"));


        String sp1 = "Hello world";
        Predicate<String> p5 = sp1::startsWith;
        System.out.println(p5.test("He"));

        BinaryOperator<String> bo1 = String::concat;
        Consumer<String> cs2 = System.out::println;
        cs2.accept(bo1.apply("Hello ","World!"));

        String str1 = null;// "st1 is not null";
        String str2;
        Optional<String> opt1 = Optional.ofNullable(str1);
        String orElse = opt1.orElseGet(() -> "str2 is not null and it is chosen one");

        Supplier <String> sup1 = () -> "John";

        Consumer<String> con3 = x -> System.out.print("consumer is running -->" );
        Consumer<String> con5 = System.out::println;
        Consumer<Boolean> con4 = System.out::println;
        str2 = Optional.ofNullable(str1).orElseGet(sup1);
        //con3.accept("haha");
        opt1.ifPresent(con3.andThen(con5));
        System.out.println(opt1.isPresent());
        System.out.println(opt1.isEmpty());

        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        numbers.stream()
                .sorted(Integer::compareTo).sorted(Comparator.reverseOrder()).forEach(System.out::println);


        Stream<String> s = Stream.of("monkey","bee","ape","cat","bonobo");
        System.out.println("s length is:"+s.count());
       // Optional<String> min = s.min((s11,s22 ) -> s11.length() - s22.length());
      //  min.ifPresent(System.out::println);

/*        Comparator<String> srr= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };*/
        Comparator<String> srr= Comparator.reverseOrder();
                List<String> list = Arrays.asList("H","e","l","l","o");
        //Collections.sort(list, srr);
        list.sort(srr);
        System.out.println(list);
        //BinaryOperator<String> bin1 =
    }

}
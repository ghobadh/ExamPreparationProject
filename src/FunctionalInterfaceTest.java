import java.util.function.Consumer;

public class FunctionalInterfaceTest {
    FunctionalInterfaceTest(){
        IntegerValue iv = s -> s-1 ;
        System.out.println(iv.getMyValue(100));

        PrintMyString pms = System.out::println;
        pms.printme("Hello");

        Consumer<String> cc = System.out::println;
        cc.accept("Consumer");
    }

    public static void main(String... tt){
        new FunctionalInterfaceTest();
    }
}

@FunctionalInterface
interface IntegerValue{
    int getMyValue(int a );
}

@FunctionalInterface
interface  PrintMyString{
    void printme(String a);
}



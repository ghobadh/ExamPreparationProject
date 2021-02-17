import java.lang.annotation.Annotation;
import java.util.function.Predicate;

public class workingString {

    // in String method the beginning index is INCLUSIVE but the ending index is EXCLUSIVE

    static String s;
    public static void main (String...hehe){
        var str ="abc";
        Predicate<String> p1 = str::startsWith;
        Predicate<String> l1 = s -> str.startsWith(s);

        // Remember String is immutable object, so any substring or replace will not change string value , unless you set the resulf to a self reference
        System.out.println(new String("mississippi").substring(3,7));


        System.out.println("repeat(4)--> " + new String("mississippi ").repeat(4));
        //repeat with 0 return empty
        System.out.println("repeat(0)-->" + new String("mississippi").repeat(0));

// although it is NOT intiated , it will show null without any error message and compile successfully

        System.out.println(workingString.s);

/*        MyConcat myConcat = new MyConcat() {
            @Override
            public void process(String s1, String s2) {
                System.out.println(s1 +" " + s2);
            }
        };
    myConcat.process("Hello","World");*/

    MyConcat myConcat1;
        myConcat1 = (s1, s2) -> System.out.println(s1+ "__"+s2);
        myConcat1.process(new String("Hello").intern(),new String("world").intern());
    }

/*    MyCon3 mc3 = new MyCon3() {
        @Override
        public Number add(Number t1, Number t2) {
            return t1.intValue()+t2.intValue();
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return null;
        }
    } ;*/




}


interface MyConcat  {
    void process(String s1, String s2);
}

interface MyCon2 extends FunctionalInterface{
    default <T extends Comparable<T>> int process(T t1, T t2) {
       return t1.compareTo(t2);
    }

}


@FunctionalInterface
interface MyCon3 <T>  {
    <T extends Integer> T add (T t1, T t2);
}









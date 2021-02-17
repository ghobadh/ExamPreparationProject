import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;


// We cannot have var  (a;ll lower case) as a class name .
//public class var { <-- it is wrong
public class VarTest {
    //var tt = "haha"; var cannot be as instavce variable or class variable.


    static float t_rate = 0.06F;
    public static void main(String...haha){
        new VarTest().var("");
        int _1000 = 2000 ;
        int $_1 = 0x3456;

        // please note this is completely fine to we have 2 t_trade, one is static and the other one is local variable. in the line below t_rate is double and not float
        var t_rate = 99.44;

        //WE must intitial VAR variable otherwise it has issue
        //var gg ; <-- because compiler does not know what data type gg has, it fails


        // because it is assgined to a literal it is a valid variable
        var i =0 ;
        System.out.println("test: " + i);

        //var can be an array
        var aVarArray = new int[3];

        //but this is wrong
        //var varArr2 = {"A","B"};



        // it can be a return value of a method
        var methodVar = Person.name;

        //It is ok to assign a null object to LVTI BUT NOT "null" Litteral
        Object nullObj = null;
        var var = nullObj; //in here even VAR is defined as from LVTI --- in here var defined as a variable since it is a keyword
        // var gg = null;  <-- it does not work

        // these way are not working ( var cannot work in compound statements)
        //var j= 0 , i =0
        //var m,n=0 ;

        // cannot initial var array. it is not allowed
        //var myarr = {"A","B"};

        //cannot have array of var
        //var[] myarr2 = new int[2];
        var myarr3 = new int[3];  //<-- this is ok

    int f,v=0;
    int l =9 , m =34;

    //We cannot have var variable as method parameter nor method return type
//
//        public static var theTest(String[] args){
//            return args;
//
//        }
//
//
//        public static String theTest2(var args){
//            return args;
//
//        }


        //there is not issue to use var in for loop or  enhanced for loop
        for(var ff=0;ff<=10 ; ff++){
            //
        }

        for (var varArg : haha){
            //
        }


        // in here kk is int and not short
        short ss = 7;
        var kk = +ss;

        var var2 = new ArrayList<String>(Arrays.asList("one","two","three"));





    }


    //var can be a method name of argument name of the method
    public void var( String var){
         var i = 3;
        String u = var;
        var a = 0 ; var b= 4; //valid
        int c=0 , d = 0 ; // valid
       //var = c=0 , var d= 9; invalid
       // var a = 0 ,  b= 4; invalid
        Consumer<Integer> cc = r -> {};  //valid . because consume it does not need return
        Consumer<String> cc1 = r -> {System.out.println(r);}; //valid it needs semicolon twice
        Consumer<Integer> cc2 = r -> System.out.println(i); //valid . i is effectively final
        Consumer<String> cc3 = System.out::println;
       // Consumer<Integer> cc4 = x -> System.out::println // this is invalid , you are conbining method reference and lambda experssion
        Function<String,Integer>  cc6 = String::length;
        cc1.accept("cc6 is " +cc6.apply("Hello world"));
        Consumer<String> cc4 = (var r) -> {return;} ; //valid
        Consumer<String> cc44 = r -> {}; // valid
        Consumer<String> cc5 = r -> {;}; // valid
        BiFunction<String, String, String> yy = (var f , var g) -> var+u; // valid . u and var  are effectively final
        //BiFunction<String, String, String> yy = (var f ,  g) ->""; invalid
        BiFunction<String, String, String> yy2 = (String f , String g) ->""; // valid
        //BiFunction<String, String, String> yy3 = (String f ,  g) ->""; invalid
        String ss = new String();
        BiPredicate<String,String> bp = String::startsWith;
       // BiPredicate<String,String> bp1 = (ss , bb) -> ss.startsWith(bb); invalid because ss is already defined
        BiPredicate<String,String> bp1 = (aa , bb) -> ss.startsWith(bb); // because local veriable ss is effectively final and it is used and the value is valie
                                                                            // , although it does not make sense





        //var str2 = null; invalid
        var str1 = (String)null; //valid
        System.out.println("(String)null -->"+ str1);
        String str2 = str1;
        System.out.println("str2 is " + str2 + " " + str1);
       // System.out.println(str1.compareTo(str2)); // this has nullpointexception error because you are trying to compare a null object with another null object

        Object o1 = null;
        System.out.println("o1 is " + o1); // calling the object to be printed shows "null" but calling an methoed of it will cause of null point exception at runtime

        Object o2 = new StringBuffer("O2 object");
        System.out.println("o2 is " + o2);



        long l = 1000l;
        l = (long) 999.0;
        System.out.println("l is" + l );


        double dd = 888;
        dd = 777f; //valid

        float ff = 666; //valid
        //ff= 666.0 ; invalid because we are implictly cansting double to float and that is not working



        Set <Rabbit> rabbitSet = new TreeSet<>((r1, r2)-> r1.id - r2.id );// this is valid a TreeSet with comparaTo method
        // remember TreeSet and TreeMap need Comperator implementation otherwise they will have runtime error.
        rabbitSet.add(new Rabbit());



        var myMap = new TreeMap<String, Integer>((t1,t2) -> t1.length()-t2.length());
        myMap.put("hhhh", 4);
        myMap.put("hh",2);

        System.out.println(myMap);

        String str4 = T(new String("tt"));
        System.out.println("str4 is: "+ str4);

        Integer int4 = T(Integer.valueOf(88));// 88 or "88" are fine. valueOf accepts both
        System.out.println("int4 is:" + int4);

        var arraylist1 = methodRabbit(new ArrayList());
        var set1 = methodRabbit(new HashSet() );








    }

    static class Rabbit { int id ;}
    static class BabyRabbit extends Rabbit {}

    public <BabyRabbit extends Collection > BabyRabbit methodRabbit (BabyRabbit r) {// this is totally fine although babayrabitt is not the babyrabbitl class. it is a generic type
                                                                                    // in the method
        return  r;
    }
    // this a compile error because babyrabbit is notthing to do with babyrabbit class. It is a generic type
/*    public <BabyRabbit extends Rabbit> BabyRabbit methodRabbit2 (BabyRabbit b){
        return new BabyRabbit();
    }*/

    // super does not work also
/*    public <BabyRabbit super Rabbit> BabyRabbit methodRabbit3 (BabyRabbit b){
        return new BabyRabbit();
    }*/

    public <T>  T T(T T ){  // This is a valid method
        return T;
    }

}

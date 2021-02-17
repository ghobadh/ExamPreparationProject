public class TestFQC {

    public static void main(String...hehe) throws Exception {
                    final int ii = 10;

                    java.lang.String s = "This is string test for fully qulified name.";
                    System.out.println(s);

                    double d = 'a';
                    int i = 100_00000;
                    byte b = '\u006F';
                    boolean FALSE = false;

                    //String s1 = b + i +d ; It does not work

                    System.out.println(d);
                   // System.out.println(s1);
                    initiatePrimitives();

                    }

    public static void initiatePrimitives(){

        //To a literal

        int i1 = 10 ; //integer
        int i2 = 012 ; //octal
        int i3 = 0xDE2 ; //Hex
        int i4 = 0b00101010; //binary


       // To the same or smaller datatype (primitive or wrapper)
        /*
        To a wrapper class which will automatically do casts (auto un-boxing) as long
        as wrapper's data type size is less than or same as your variable's declared data type
        size

         */

        int i5 = i1; // to another same datatype
        short s1 = 4;
        int i6 = s1;  // to another smaller datatype

        Integer i7 = 10;
        int i8 = i7;





        Integer i9 = (int)s1; // in wrapper class we need explicit casting if the data is not the same.
        // Interger i9 = s1 <-- It will not work. In wrapper unlike primitive you need to explicit cast
        Integer i91 = (int) s1;

        Short s2 = 10;
        int i10 = s2;


        // to cast a variabl or literal ( we need to do explicit casting)
        int i11 = (int) 100L;


        Short s3 = 99;
        // Integer i12 = s3;   <-- it does not work as primitive . It has incompatible type

        /*
        a local var is not initalized with a default value

        I must fully initialize it ( not in condition / switch / while loop  and all conditions are not met ) if you are using the variable

        if you don't used it no compiler error

        Numeric value with decimal point by default is double and without decimal point is int 32.
         */



        byte  mybyte = 'a';
        short myshort = 10;
        char mychar ='r';

       // mybyte = myshort;  <-- it does not work
        myshort = mybyte ;  // <-- the way around ( widening ) is working


        /*
        Short and Char has same width but Char is unsigned only so the conversion  from  is not allowed.
         */
        //myshort = mychar;
        //mychar = myshort;
        Float myfloat = new Float(1234.34f);  //<-- unnecessary boxing !!

        // Java 8 has a support for unsigned int and unsigned long
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE+4);
        String str1 = Integer.toUnsignedString(Integer.MAX_VALUE + 4 );
        System.out.println( Integer.toUnsignedString(Integer.MAX_VALUE + 4 ));

        // Remember Null is not valid for any primitive variable
        // Remember Double and Float are not overflawn since they are appromoixed. Both code shows 3.4028235E38
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MAX_VALUE+3);



        /* Unicode range is U+0000 to U+10FFFF which is called scalar unicode (more than 16 bits)

        Unicode range from U+0000 to U+FFFF  is called Basic Multilingual Plane (BMP) , larger than U+FFFF is Supplementary characters (Java UTF-16).

      */
        int i=2 , k=7;

        System.out.println( i+++k ); //the line reads k= (i++) + k and not k=i + (++k) so the answer is 9 and not 10

        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println(input1+" " +input2 + " " +  result2 + " " + result3); //no matter we used binary operation for input1 and input2 if we do not assign the value will not change.




    }
}

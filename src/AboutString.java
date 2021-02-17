public class AboutString {
    public static void main(String...args){

        String st1 = "Hello";
        String st2 = "Hello";
        String st3 = new String("Hello").intern();
        String st4 = new String("Hello").intern();

        System.out.println("st1 == st2 is " + (st1 == st2));
        System.out.println("st1 == st3 is " + (st1 == st3));
        System.out.println("st3 == st4 is " + (st4 == st3));



        // The word 'null will be printed.
        Object nullObj = null;
        String nullString = nullObj + " is not in hello world";
        System.out.println(nullString);

        System.out.println(new myclass());
        System.out.println(new myclass2());

        int i = 1000;
        String kk = "hello ";
        kk += i + 55;  // 55 is added to 1000 (1055) then it is concatinated to kk (hello 1055)
        System.out.println(kk);

        //but i+= kk is invalid
        kk = "hello ";
        kk = kk + i + 55 ; // this time because kk is concate at the beginning the i will not added to 55 so kk will be ( hello 100055)
        System.out.println(kk);

        kk="hello ";
        System.out.println(kk.compareTo("gello "));

    }
}


class myclass {

}

class myclass2 {
    public String toString(){ return "myclass 2";}

}




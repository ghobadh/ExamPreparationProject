public class PersonTest {
    public static void main(String... haha){

        Person joe = new Person( "Joe", "55");
        Person deb = new Person("deb","85");

        Person gavin = new Person("99");

        Person ann = new Person();

        System.out.println(joe);
        System.out.println(deb);
        System.out.println(" ---- Ann Before");
        System.out.println(ann);

        ann.setAge("21");

        System.out.println(" ---- Ann After");
        System.out.println(ann);

        System.out.println(gavin); // age is not set because age = age in the constructor did not initiate the Person.age instance variable

        int j =0 ;

        //for (int i=0, j=0 ;i< 20 ; i++,j++) <-- this line is compiler error because J is already defined in block so we can NOT redefine it.

       for (int i=j=0 ; i < 20 ; i++,j++){// <-- we initial J with zero then define i and initiate it and this is totally fine
           //int i = 0  <-- This is comiiler error because i already defined in for loop.
           System.out.println(i);
       }

       //i++ <-- compiler error again i is out of scope of for loop so it is invalid
        j++; // <-- J is fine becasue it is defined in the block.
    }




}

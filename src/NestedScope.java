public class NestedScope {
    public static void main(String...k){
        int  i =0;

        class localScope{
            {
                System.out.println("before loop: "+i);

                for (int  i =0 ; i < 10 ; i++){

                    System.out.println( "inside inner class loop for i" + i);
                }


                for ( int i = 10;i > 0  ; i--){
                    // please note I cannot use i of nestedscope class in there and I must define it so this for(i=0 ; .... is wrong unless is defined as 'final'!! and if you change it to final you
                    // cannot use it in the for loop because i-- will not work
                    System.out.println( "inside inner class loop for i" + i);
                }


                for (int j=i; j< 5 ; j++){
                // I cannot initial i in here !!! so this is wrong --> for (int j=i=0 ; .... because i is for Nested scope and not local scope class
                    System.out.println( "inside inner class loop for j" + j);
                }
                System.out.println("outside of for loops" + i);


            }


        }
        System.out.println("outside of the class" + i);
        new localScope();

        //i++; unless it is final which I cannot use i++, If I use i++ line 26 will be an error.
        // in short inner class has access to outter class variables (implied )
        System.out.println("outside of the class and after intializeation of i" + i);

    }
}

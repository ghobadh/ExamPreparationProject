// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {



    public String solution(String S, int K) {

       // final int slen = K;
        BiPredicate<String,String> checkLength = (s1,s2) -> s1.length()+s2.length() > K;
        BiConsumer <String,String> consumer = (s1,s2) -> {
            if (checkLength.test(s1,s2) )
                System.out.println (s1.concat("").concat(s2).toString());
            else
                System.out.println (s1);
        };
        Consumer<String> tt = String::concat;
        Supplier <String> s = () -> new String();
        List<String> alphabetStream = Arrays.asList(S.split("\\s+"));
               // .map((s1,s2) -> {if (s1.length() + s2)})

        var  test = Stream.of (S.split("\\s+")).collect(String::new,consumer);





    return new String("gg");
    }

    public static void main (String...tt){
        Solution s = new Solution();
        int A[] = {1,-2,-3,5};
       // System.out.println(s.solution(A));

    }
}

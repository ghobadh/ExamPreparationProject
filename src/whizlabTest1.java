public class whizlabTest1 {
    static void calculate (Double origin , Double rate , Payback<Double> func){
        double payback = func.apply(origin,rate);
        System.out.println(payback);
    }
    static Payback<Double> payback = new Payback<Double>(){

        @Override
        public Double apply(Double origin, Double rate) {
            return 99.0;
        }
    };
    static public void main(String x[]){
        double origin =1000;
        double rate = 0.1;
         calculate(origin, rate, new Payback<Double>() {
             @Override
             public Double apply(Double origin, Double rate) {
                 return origin * (1+ rate);
             }
         }::apply);

         calculate(origin,rate,payback);
    }



}

interface Payback<T>{
    T apply (T origin, T rate);
}

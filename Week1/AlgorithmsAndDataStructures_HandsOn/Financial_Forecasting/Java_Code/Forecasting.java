public class Forecasting {
    public static double futureValue(double principal, double rate, int years){
        if(years==0){
            return principal;
        }
        return futureValue(principal, rate, years-1)*(1+rate);
    }
    public static void main(String[] args) {
        double fv = futureValue(1000.0, 0.05, 5);
        System.out.printf("Future Value after 5 years: %.2f%n", fv);
    }
}
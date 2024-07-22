
class HelloWorld {
    public static void main(String[] args) {
        float p=1;
        float a;
        for(float i=3;i<=2000000;i=i+2){
            if(i%4==1){
                a=1/i;
                p+=a;
            }
            else if(i%4==3){
                a=1/i;
                p-=a;
            }
            
            
        }
        p=p*4;
        System.out.printf("%f",p);


    //or 

    public class MadhavaSeriesPi {

    public static void main(String[] args) {
        int n = 20; // Number of terms to use in the series
        double pi = calculatePi(n);
        System.out.println("Approximation of pi using " + n + " terms: " + pi);
    }

    public static double calculatePi(int n) {
        double pi = 0.0;
        int sign = 1; // to alternate the sign of each term

        for (int i = 0; i < n; ++i) {
            int denominator = 2 * i + 1; // odd denominators: 1, 3, 5, 7, ...
            pi += sign * 4.0 / denominator; // add or subtract term
            sign = -sign; // alternate the sign for next term
        }

        return pi;
    }
}

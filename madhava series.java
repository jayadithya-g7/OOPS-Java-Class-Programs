
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

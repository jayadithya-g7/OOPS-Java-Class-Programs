import java.util.*;

class Pen{
    String color;
    String type;
    
    public void printinfo(){
        System.out.println("Hello");
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class Main{
    public static void main(String args[]){
        
        Pen pen1 = new Pen();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter choice of color:");
        String a= sc.next();
        
        System.out.print("enter pen type:");
        String b=sc.next();
        
        pen1.color = a;
        pen1.type=b;
        
        System.out.println("fine, let's display the output now");
        
        System.out.println("loading ");
        
        System.out.println("..............");
        
        
        pen1.printinfo();
        
    }
}

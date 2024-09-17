import java.util.*;

class Shape{
    public void area(){
        System.out.println("displays area");

    }
}

class Triangle extends Shape{ //single lvl inheritance
    //here triangle is derived cls
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{ //multi lvl inheritance- where there's another derived cls

    public void area(int l, int h){
        System.err.println(1/2*l*h);
    }


//if multiple derived classes are deiving from same base cls- we call it heirarchial inheritance

class Circle extends Shape{ //heirarchial inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}


//and we have hybrid inheritance
//where we get to see all 3 inheritance
//such as heirarchial, single lvl, multilvl

//so these are 4 types of inheritances in java, in c++, we have extra types, such as multilvl inheritances, but that's handled thru interphases in java


}

public class Main3{
    public static void main(String[] args) {
        
    }
}

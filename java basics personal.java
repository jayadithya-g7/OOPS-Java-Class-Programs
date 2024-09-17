// // // class main{//cls
// // //     public static void main(String args[]){//fn
// // //     //     System.out.println("Hello world!"); //output



// // //     //    //variables and data types
// // //     //     String name = "tony stark";
// // //     //     int age =48;
// // //     //     double price = 25.24;
// // //     //     int a = 25;
// // //     //     int b =10;
// // //     //     int sum=a+b;
// // //     //     b=20;
// // //     //     name="jay";

// // //     //     // System.out.println(sum);

// // //     //     int diff=b-a;
// // //     //     int mul=a*b;
        
// // //     //     System.out.println(diff);
// // //     //     System.err.println(a*b);





// // //     } 
// // // }








// // //taking inputs in java thru scanner class

// // import java.util.*; //package -contains a list of fns, that we'll be using

// // public class Main{
// //     public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in); 
// //         // String name = sc.next(); 
// //         // System.out.println(name+" "+name);
    
// //         //we made a scanner class, where we had a scanner object sc and inside we have a scanner fn next that is used to take inputs
// //         //note enxt fn takes in only one token

// //         //say u pass a sentence=> my name is jay
// //         //next fn returns only - my

// //         //if u need to get entire line, use fn nextLine()

// //         // String name = sc.nextLine();
// //         // System.out.println(name);

        
// //         // //we have a lot of fns inside scanner sc class

// //         //we have nextInt(), to take integer type inputs

// //         // we have nextFloat(),to take float type inputs






// //     }

// // }



// //take 2 variables 'a' and 'b' and print their sum

// import java.util.*;
// class Main{
//     public static void main(String args[]){

//        Scanner sc = new Scanner(System.in); //1st create scanner class, then take inputs a and b, and finally print it

//        int a = sc.nextInt(); //nextInt is used to take integer type inputs

//        int b = sc.nextInt();

//        int sum = a+b;
//        System.out.println(sum);

//     }

// }

// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter your age:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int age=sc.nextInt();

//         if(age>18){
//             System.out.println("Adult");
//         }
//         else{
//             System.out.println("Not adult");
//         }
//     }
// }






// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter the number:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int num=sc.nextInt();

//         if(num%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }







// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter 2 no.s:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         if(a==b){
//             System.out.println("Equal");
//         }
//         else{
//             System.out.println("Not Equal");
//         }
//     }
// }




// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter 2 no.s:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         if(a==b){
//             System.out.println("a is equal to b");
//         }
        
//         else{
//             System.out.println("a is not equal to b");
//             if(a>b){
//                 System.out.println("a is greater than b");
//             }
//             else{
//                 System.out.println("a is smaller than b");
//             }
            
//         }
//     }
// }








//we can use else if statements 


// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter 2 no.s:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         if(a==b){
//             System.out.println("a is equal to b");
//         }
        
//         else if(a>b){
//             System.out.println("a is greater than b");
//         }
//         else if(a<b){
//             System.out.println("a is lesser than b");

//         }
//         else{
//             System.out.println("a and b are non comparabale");
//         }

//     }
// }



// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter your choice:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int button=sc.nextInt();
       

//         if(button==1){
//             System.out.println("Hello");
//         }
        
//         else if(button==2){
//            System.out.println("Namaste");
            
//         }
//         else{
//             System.out.println("Bonjour");
//         }
//     }
// }







//instead of multiple else if stmts, we have switch case





// import java.util.*;
// class Main{
//     public static void main(String args[]){
//         System.out.println("Enter your choice:");
//         Scanner sc = new Scanner(System.in);//create an object for scanner cls
//         int button=sc.nextInt();

//         switch (button){
//             case 1: System.out.println("Hellwo");
//             break;

//             case 2: System.out.println("hio");
//             break;

//             default: System.out.println("end");
            

//         }
        

//     }
// }



// //concept of loops
// import java.util.*;
// class Main{
//     public static void main(String args[]){
        // System.out.println("Enter: ");
        // Scanner sc = new Scanner(System.in);//create an object for scanner cls
        // int a=sc.nextInt();

        // for(int i=0;i<11;i++){
        //     System.out.print(i+" ");

        //     // System.out.println(i);
        // }


//we'll study while loops
        // int i=0;
        // while(i<5){
        //     System.out.println(i);
        //     i++;
        // }




//do while loops - whether condition is true/not, atleast once it executes


// int i=0;
// do { 
//     System.out.println(i);
//     i++;
// } while (i<11);


// int i=12;
// while(i<11){
//     System.out.println("Hellwo");

// }


//do-while executes once 


// int i=12;
// do { 
//     System.out.println("h");
// } while (i<11);


//in do while thing, after while, we get colon


//let's do some problems

//print sum of first n numbers


// System.out.print("enter your choice for n:");
// Scanner sc = new Scanner(System.in);
// int n= sc.nextInt();

// int sum=0;
// for(int i=0;i<n;i++){
//     sum+=i;
// }
// System.out.println(sum);


//factorial

// int fact=1;
// for(int i=1;i<=n;i++){
//     fact*=i;
// }
// System.out.println(fact);




//print the table of a number input by the user


// for(int i=0;i<n;i++){
//     System.out.print(n);
//     System.out.print("*");
//     System.out.print(i);
//     System.out.print("=");
//     System.out.println(n*i);
// }
// System.out.println();




//     }
// }









// import java.util.*;

// public class Functions {

//     public static void printMyName(String name){
//         System.out.println(name);
//         return; //to exit out of the fn
//     }


//     public static void main(String args[]){

//         System.out.print("Enter your name:");

//         Scanner sc = new Scanner(System.in);
//         String name=sc.nextLine();

//         System.out.print("You entered the name:");

//         printMyName(name);

//   }
// }



// import java.util.*;

// public class Functions{

//     public static int sum(int a, int b){
//         return a+b;
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 1st no. x:");
//         int x = sc.nextInt();
//         System.out.print("Enter 2nd no. y: ");
//         int y=sc.nextInt();

//         System.out.print("The sum of x and y is: ");
//         System.out.println(sum(x,y));

//     }

// }







// import java.util.*;

// public class Functions{

//     public static int product(int a, int b){
//         return a*b;
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter 1st no. x:");
//         int x = sc.nextInt();
//         System.out.print("Enter 2nd no. y: ");
//         int y=sc.nextInt();

//         System.out.print("The sum of x and y is: ");
//         System.out.println(product(x,y));

//     }

// }









// import java.util.*;

// public class Functions{

//     public static int fact(int n){
//         if(n==0 || n==1){
//             return 1; //base case set to 1
//         }
//         return n*fact(n-1);
//     }

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter no. x:");
//         int x = sc.nextInt();

//         System.out.println(fact(x));

//     }

// }



//difference b/w fn's and methods is such that, fns are called directly , whereas methods are called with classes/objs

//recursions



// for(int i=5;i>0;i--){
//     sys(i)
// }

// public class Functions{


//     public static void printnum(int n){

//         if(n==0){
//             return;
//         }
//             System.out.println(n);
//             printnum(n-1);


//     }
//     public static void main(String args[]){

//         printnum(5);


//     }
// }

//works on the concept of stack overflow

//importance of base case in recursion is very important



// public class Functions{


//     public static void printnum(int n){

//         if(n==6){
//             return;
//         }
//             System.out.println(n);
//             printnum(n+1);


//     }
//     public static void main(String args[]){

//         printnum(1);


//     }
// }


// public class Functions{
//     public static void printSum(int i, int n, int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return ;
            
//         }
//         sum+=i;
//         printSum(i+1,n,sum);

//     }
// }










//defining an array

// type[]= arrayName = new type[size];

//we use new keyword to get size for a non primtve data type like array

//int[] marks = new int[3]; //for 3 subjects
import java.util.*;
public class Functions{
        public static void main(String args[]){
                // int[] marks = new int[3];
                // marks[0]=23;
                // marks[1]=24;
                // marks[2]=25;

                // System.out.println(marks[0]);
                // System.out.println(marks[1]);
                // System.out.println(marks[2]);

                // for(int i=0; i<3;i++){
                //         System.out.println(marks[i]);
                // }


                // int marks[]={1,2,3};
                // for(int i=0;i<3;i++){
                //         System.out.println(marks[i]);
                // }
                // Scanner sc = new Scanner(System.in);
                // int size = sc.nextInt();

                // int marks[]= new int[size];

                // for(int i=0;i<size;i++){
                //         marks[i]=sc.nextInt();
                //         System.out.println(marks[i]);
                // }
                // //in java automatic initilization with null value[zeroes]

                Scanner sc = new Scanner(System.in);
                int size = sc.nextInt();

                int marks[]= new int[size];

                for(int i=0;i<size;i++){
                        marks[i]=sc.nextInt();
                        
                }
                
                int x =sc.nextInt(); //get the value of x
                //now u have to traverse thru the entire array, to check index of x

                for(int i=0;i<marks.length;i++){
                        if(marks[i]==x){
                                System.out.println("x found at index:"+i);
        
                        }

                }
                //so we performed linear search

                






        }
}

//maruti 800 ku 1st blueprint theva
//obj is every car from maruti factory
//class is the blueprint


//obj is an entity that we can bring into real life thru programming
//we distinguish pens thru their color


class Pen{ //define blueprint/ptys of a pen
    String color;
    String type; //ballpoint;gel

    //note fn's defined in a particular cls are called methods

    public void write(){
        System.out.println("writing");
    }

    public void printcolor(){
        System.out.println(this.color);

    }
    //work of this keyword - whichever class this printfn object, it prints that one
    //this keyword says which obj has called the particular fn in that cls

    public void printtype(){
        System.out.println(this.type);

    }

}


class Student{
    //identify all student pty's first such as name, age, roll no.

    String name;
    int age;

    //now make a fn inside the student class, but the object calling this fn should be declared in main function
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);


    }

    // Student(){//calling the constructor, so that this prints 1st, after which object refers to the previosu cls
    //     System.out.println("Student constructor called");

    // }

    //b]paramtrized constructors
    // Student(String name,int age){//calling the constructor, so that this prints 1st, after which object refers to the previosu cls
    //     this.name = name;
    //     this.age=age;
    //     System.out.println("Student constructor called");

    // }

    Student(){

    }

    Student(Student s2){ //we call it copy constructor, bcoz it copies all info of student and copies it in student 2
        this.name=s2.name;
        this.age=s2.age;
    }

}



public class Main{

    //objects of a partticular cls/blueprint we do it in main fn
    public static void main(String[] args) {
        // Pen pen1 = new Pen(); //pen1 oda type is Pen class
        // pen1.color="blue";
        // pen1.type="gel";

        // pen1.write();


        // Pen pen2= new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen2.write();

        // pen1.printcolor();
        // pen2.printcolor();

        // pen1.printtype();
        // pen2.printtype();

//let's call the obejct in the main function now

    Student s1 = new Student(); //whenever u use new keyword, then there's allocation of memory inside the heap..
    s1.name="jay";
    s1.age=19;

    Student s2=new Student(s1);

    s1.printinfo();

//new keyword allocates memory inside the heap, and as soon as u give the new keyword, objects ku thani allocation happens...
//note that classes are declared outside the main fn and outside the public main cls, and objects are called inside the main fn only

//we make the classes outside, but objects are given inside the main fn only

//now we gave Student(); after new, we say it a special fn named constructor
//in java , a constructor is used to construct an obj

//there are 3 types of constructors
//a] non parametrised constructors, vo constructors where parameters are not given

//note some 3 pty's

//name of constructor is same as name of the class defined previosuly
//constructors have no return type
//for one object, we can the constructor only once 

//in a]non paramtrised constructors
/*
 * eg: don't give any parameters there inside the constructor
 */

    }

}

//java there are no destructors, bcoz there are garbage collectors


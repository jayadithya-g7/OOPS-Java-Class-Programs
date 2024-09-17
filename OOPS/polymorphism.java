//poly morphism - many + false, i.e, one task performed in multiple ways
//type- overloading (compile time polymorphism) and overriding(run time polymorphism)

//we'll see runtime polymorphism at the time of studying inheritance

//fn overloading means, assigning multiple multiple tasks to a fn and keeping all of them in d same name

class Student{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);

    }

    public void printinfo(int age){//same fn name
        System.out.println(age);

    }

    public void printinfo(String name,int age){//same fn name
        System.out.println(name+" "+age);

    }

    //so we made 3 same named fn's under the same cls 
    //in main fn, we give something .printinfo, and based on the no. of parameters ure passing, it automatically decides the fn




}

public class sample{
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name="jay";
        s1.age=25;

        s1.printinfo(s1.age); 

        s1.printinfo(s1.name,s1.age);

        //diff fns with the same name, created in the same cls, we call it overloading

        //we need a differentiating factor, eg: return type, or paramter, or no. of arguments

        //it detects at compile time, if 2 fns are the same
        
    }
}

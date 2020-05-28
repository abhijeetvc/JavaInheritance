public class Demo1 {

    public Demo1(){
        System.out.println("In Demo1 constructor");
    }

    void check1(){
        System.out.println("In Check1 method");
    }
}

class Demo2 extends Demo1{

    void check2(){
        System.out.println("In check2 method");
    }
}

class Demo3 extends Demo2{

    void check3(){
        System.out.println("In check3 method");
    }

    //Method Overriding
    void check2(){
        System.out.println("In check2 method of class Demo3");
    }

    public static void main(String[] args){
        Demo3 d3=new Demo3();
        d3.check3();
        d3.check2();
        d3.check1();
    }
}
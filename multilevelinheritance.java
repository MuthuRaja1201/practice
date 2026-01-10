class A{
    void methodA(){
        System.out.println("From class A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("From class B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("From class C");
    }
}


public class multilevelinheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

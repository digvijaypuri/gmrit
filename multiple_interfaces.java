//WAP to implement multiple interfaces in Java not override
//Interface 1  
interface Interface1 {
    void method1();
}
//Interface 2
interface Interface2 {
    void method2();
}
//Class that implements both interfaces
public class multiple_interfaces implements Interface1, Interface2 {
    // Implementing method1 from Interface1
   //
    public void method1() {
        System.out.println("Method 1 from Interface 1");
    }
    // Implementing method2 from Interface2
    //@Override
    public void method2() {
        System.out.println("Method 2 from Interface 2");
    }
    public static void main(String[] args) {
        // Create an object of the multiple_interfaces class
        multiple_interfaces obj = new multiple_interfaces();
        // Call the methods from both interfaces
        obj.method1();
        obj.method2();
    }
}
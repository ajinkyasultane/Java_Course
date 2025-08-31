public class OOP_1 {
    int a;
    int b;
    public static void main(String[] args)
    {
        Method_Overloaded method = new Method_Overloaded();

        System.out.println(method.add(10,20));
//constructors

        OOP_1 op = new OOP_1(10,20);
        System.out.println(op.a);

    }
    OOP_1(int a , int b)
    {
        this.a = a;
        int c = a + b;
        System.out.println("The value of c is " + c);
        System.out.println("This is Constructor");
    }

}

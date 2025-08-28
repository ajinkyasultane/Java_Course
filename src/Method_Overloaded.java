public class Method_Overloaded {
    public static void main(String[] args)
    {
        System.out.println(add(5,6));
        System.out.println(add(10,20,4));
    }
    static int add(int a , int b)
    {
        return a+b;
    }
    static int add(int b,int c , int d)
    {
        return b+c+d;
    }


}

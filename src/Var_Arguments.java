public class Var_Arguments {
    static int lenth ;
    public static void main(String[] args)
    {
        System.out.println(add(10,4,5,6,34,6));
        System.out.println("The average is "+ average(10,30,4.5,5,76,43,8,2,8 ) + " of a "+lenth);
    }
    static int add(int... numbers)
    {
        int sum = 0;

        for (int num : numbers)
        {
            sum += num;
        }
return sum;
    }
    static double average(double... numbers1)
    {
        lenth = numbers1.length;
        double sum = 0;

        if(numbers1.length == 0)
        {
            System.out.println("0.0");
        }

        for (double numb : numbers1)
        {
            sum += numb;
        }
        return sum /numbers1.length;
    }
  }

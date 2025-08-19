import java.sql.Array;
import java.sql.SQLOutput;

public class Variable {
    public static void main(String args[]) {
        System.out.println("Variable in a Java");



            //Primitive Variable
            //char , int , double , boolean ,


            int a = 10;

            System.out.println(a);

            char aj = 'a';
            System.out.println(aj);

            boolean b = true;

        System.out.println(b);

        double  price = 255.49;

        System.out.println(price);



        //non primitive variable

        String ajinkya = "Ajinkya Sultane";

        System.out.println("The name is "+ ajinkya);


        int[] array = {10, 20,30 ,40,50};

       // int no = array.length;


        for (int i = 0 ; i <= array.length; i++ )
        {
            System.out.println("Element in a Array is = " + array[i]);
        }


        }
    }
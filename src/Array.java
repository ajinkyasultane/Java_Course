import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    {
        String[] fruit = {"Apple", "Papaya", "Pineapple","Banana" , "Watermelon"};
        for(int i = 0 ; i < fruit.length; i++)
     {
         System.out.println(fruit[i]);
     }

        System.out.println("\nThrough for each loop\n");
       //Arrays.fill(fruit,"Dragonfruit");
        Arrays.sort(fruit);

     for (String fruitss : fruit)
     {
         System.out.println(fruitss);
     }
    }


}

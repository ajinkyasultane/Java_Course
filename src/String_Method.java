import java.util.Locale;
import java.util.Scanner;

public class String_Method {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String Name");
       // String name = "Ajinkya Sultane";
        String name = sc.nextLine();


        int length = name.length();
        char letter = name.charAt(5);
        int index = name.indexOf("a");
        int lastindex = name.lastIndexOf("a");
        String replace = name.replace("a","b");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(replace);

      String  name1 = name.toLowerCase(Locale.ROOT);
      String  name2 = name.toUpperCase();
      boolean name3 = name.isEmpty();

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);


      if (name.isEmpty())
      {
          System.out.println("Your String is Empty");
      }
      else
      {
          System.out.println("Your name is "+name);
      }

      if (name.contains(" "))
      {
          System.out.println("Your name contain space");
      }
      else
      {
          System.out.println("your name doesn't contain space");
      }

      if (name.equals("Ajinkya Sultane"))
      {
          System.out.println("Your string match to user input string");
      }
      else
      {
          System.out.println("Your String cannot match ");
      }

      String sub = "ajinkyasultane@gmail.com";
      //String sub = sc.nextLine();
        System.out.println("The substring is "+sub);
       String newsshort = sub.substring(0,sub.indexOf("@"));
       String domain = sub.substring(sub.indexOf("@")+1);

        System.out.println(newsshort);
        System.out.println(domain);

        sc.close();

    }



}

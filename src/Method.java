public class Method {
    public static void main(String[] args)
    {
        String name ="Ajinkya";
        int age = 21;

        birthday(name,age);
        birthday(name,age);


    }
    static  void  birthday(String name, int age)
    {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s ! \n",name);
        System.out.printf("You are %d year old \n\n",age);
    }

}

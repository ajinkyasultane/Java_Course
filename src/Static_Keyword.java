public class Static_Keyword {

    String name ;
   static int numoffriends;
    public static void main(String[] args)
    {

        Static_Keyword stak = new Static_Keyword("Ajinkya");
        Static_Keyword sk = new Static_Keyword("Tejas");


        System.out.println(sk.name);
        System.out.println(stak.numoffriends);
    }
    Static_Keyword(String name )
    {
        this.name = name;
        numoffriends++;
    }


}

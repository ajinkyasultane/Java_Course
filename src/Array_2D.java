public class Array_2D {
    public static void main(String[] args)
    {
        String[] fruits = {"apple" , "Pineapple" , "banana" , "orange"};
        String[] food = {"Bajra" ,"Jawar" , "Tandur" , "Dosa"};
        String[]  vegetable  = {"garlic", "Potato", "Tomato","onion"};

        String[][] eating = {fruits,food , vegetable};

//        for (String[] lunch : eating)
//        {
//            for (String dinner : lunch)
//            {
//                System.out.print(dinner +" ");
//            }
//            System.out.println();
//        }

        for(int i = 0 ; i < eating.length; i++)
        {
            for (int j = 0 ; j < eating[i].length; j++)
            {
                System.out.print(eating[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0 ; i< fruits.length; i++ )
        {
            System.out.println("the element is  " +fruits[i]);
        }

        //project

        char[][] telephone = {{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};

//        for(int i = 0 ; i < telephone.length; i++)
//        {
//            for (int j = 0 ; j < telephone[i].length; j++)
//            {
//                System.out.print(telephone[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(char[] row : telephone)
        {
            for (char column : row)
            {
                System.out.print(column + " ");
            }
            System.out.println();
        }


        }

}

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args)
    {

        String[] question = {"What is the main Function of a router ? " ,
        "WHat is the brain of a Computer",
        "Which method calculate the length of Array",
        "how many keywork in C",
       "Who is the Father of Computer "  };


        String[][] option = { {"1.Storing files" , "2.Encrypting Data" ,"3.Directing Internet Traffic" , "4.Managing Password"},
                {"1.Processor" ,"2.GPU" ,"3.CPU" ,"Keyboard"},
                {"1.Size","2.length","3.toString","4.fill"},
                {"1. 40" , "2. 45" , " 3. 33", "4. 32"},
                {"1. Ajinkya" , "2. Sam Altman" , "3.Charles Babage " , "4.George"}};

        int[] answer = {3,3,2,4,3};
        int score = 0;
        int guess ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Welcome to the Quiz Game! ");
        System.out.println("*************************************");

        for (int i = 0 ; i < question.length; i++)
        {
            System.out.println(question[i]);
            for (String quesans : option[i])
            {
                System.out.print(quesans + "  ");
            }
            System.out.println("\n Enter your guess :");
            guess = scanner.nextInt();

            if (guess == answer[i])
            {
                System.out.println("CORRECT!");
                score = score + 10;
            }
            else {
                System.out.println("WRONG! ");
            }
        }


        System.out.println("Your Final Score is "+score + " out of  " + question.length*10);

        scanner.close();
        }


    }


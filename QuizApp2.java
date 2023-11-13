import java.util.Scanner;
public class QuizApp2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String q1 = sc.nextLine();
        String q2 = sc.nextLine();
        String q3 = sc.nextLine();
        String q4 = sc.nextLine();
        String q5 = sc.nextLine();
        
        int correctAnswer = 0;
        int questions = 5;

        // QUESTION 1

        System.out.println("What is my name?");
        System.out.println("a: John");
        System.out.println("b: Kara");
        System.out.println("c. Rhi");
        System.out.println("d: Ella");
        
        if (q1.equals("b")) {
            System.out.println("Correct !");
            correctAnswer = correctAnswer + 1;
        }
        else {
            System.out.println("Wrong !");
        }

        // QUESTION 2 

        System.out.println("What is my favorite color?");
        System.out.println("a: green");
        System.out.println("b: red");
        System.out.println("c. blue");
        System.out.println("d: pink");
        
        if (q2.equals("a")) {
            System.out.println("Correct !");
            correctAnswer = correctAnswer + 1;
        }
        else {
            System.out.println("Wrong !");
        }

        // QUESTION 3

        System.out.println("How many cats do i have");
        System.out.println("a: 1");
        System.out.println("b: 2");
        System.out.println("c. 3");
        System.out.println("d: 4");
        
        if (q3.equals("c")) {
            System.out.println("Correct !");
            correctAnswer = correctAnswer + 1;
        }
        else {
            System.out.println("Wrong !");
        }

        // QUESTION 4

        System.out.println("How old am i?");
        System.out.println("a: 12");
        System.out.println("b: 16");
        System.out.println("c. 17");
        System.out.println("d: 19");
        
        if (q4.equals("d")) {
            System.out.println("Correct !");
            correctAnswer = correctAnswer + 1;
        }
        else {
            System.out.println("Wrong !");
        }

        //QUESTION 5

        System.out.println("What am i?");
        System.out.println("a: Human");
        System.out.println("b: dog");
        System.out.println("c. cat");
        System.out.println("d: gas");
        
        if (q5.equals("a")) {
            System.out.println("Correct !");
            correctAnswer = correctAnswer + 1;
        }
        else {
            System.out.println("Wrong !");
        }

        // points
         System.out.println(correctAnswer);
    }
}
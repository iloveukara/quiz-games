import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //making a quiz with the use of method, arrays, control structures
        // i cant use method here, but the arrays and control atructures are present

        System.out.println("Answer the quiz about Neon Genesis Evangelion: ");

        String q1 = "1. Who was the pilot of Eva Unit 01?\n" + "a.Asuka\nb.Shinji\nc.Rei\n";
        String q2 = "2. Who was the adult taking care of Shinji?\n" + "a.Asuka\nb.Gendo\nc.Misato\n";
        String q3 = "3. What color is the Eva Unit 02?\n" + "a.Red\nb.Blue\nc.Yellow\n";
        String q4 = "4. What year was the release of NGE?\n" + "a.1994\nb.1995\nc.1996\n";
        String q5 = "5. What were they fighting?\n" + "a.demons\nb.angels\nc.aliens\n";

        String[] prompt = {q1, q2,q3, q4, q5}; 
        String[] answer = {"b", "c", "a", "c", "b"};

        int score = 0;
        for (int x = 0; x < prompt.length; x++) {
            System.out.println(prompt[x]);
            String give = scanner.nextLine();
            if (give.equals(answer[x]) ) {
                score++;
            }
        }

        System.out.println("you got " + score + "/5 !");
    }
}
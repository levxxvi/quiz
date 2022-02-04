/*random # of questions. needs a bank of questions with answers in them, need to
check if you did it right, need to be able to add questions to the bank*/

/*thought: array for user input for questions. check how to make methods again. the "variable" in the numOfQs can be
* taken from array.length. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //picking out x # of questions for the quiz
        //change constant to a variable later
        int numOfQs = (int)(Math.random()*21);
        System.out.println(numOfQs);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Write a question!");
        String question = myObj.nextLine();

        //array for questions
        String[] qs = {

        };

        //idek atp
        /*class Questions<userQ> {
            //asking user for questions (to put into array)
            Scanner myObj = new Scanner(System.in);
            System.out.println("Write a question!");
            String userQ;
            userQ = myObj.nextLine();*/
    }
}



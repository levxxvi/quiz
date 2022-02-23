/*random # of questions. needs a bank of questions with answers in them, need to
check if you did it right, need to be able to add questions to the bank*/

/*thought: array for user input for questions. check how to make methods again. the "variable" in the numOfQs can be
* taken from array.length. */

/*UI. Ask user if they want to make a questions or take a quiz. If they want to make questions, ask them how many
questions they want to make. take that number and store it in a variable for a for loop. In the for loop, ask the
user for questions and answers. If they want to take a quiz, then show them how many questions are in the bank.
Generate a quiz by taking a random amount of questions from the bank */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        //array for questions
        String[] questions = {"What year is it?",
                "Why did the chicken cross the road?",
                "What colour is the lavender shirt?",
                "How many mice does it take to screw a light bulb?",
                "What is the worst letter in the alphabet?"
        };

        String[] answers = {"2022",
                "To go to the idiot's house... Knock Knock.",

        };

        //picking out x # of questions for the quiz
        int numOfQs = (int)(Math.random() * questions.length);
        System.out.println("There are " + questions.length + " questions in the question bank.");
        System.out.println("You will be quizzed " + numOfQs + " questions.");

        for (int i = 0; i < numOfQs; i++){
            int newQ = (int)(Math.random() * questions.length);
            System.out.println(questions[newQ]);
            String userAnswer;
            userAnswer = myObj.nextLine();
            if(userAnswer == answers[newQ]){
                System.out.println("WOW! I was NOT expecting you to get that right!");
            }
        }

        /*Scanner myObj = new Scanner(System.in);
        System.out.println("Select Answer");
        String question = myObj.nextLine();*/

        //array for answers
        /*String[] as1 = {"2022"};*/


        //idek atp
        /*class Questions<userQ> {
            //asking user for questions (to put into array)
            Scanner myObj = new Scanner(System.in);
            System.out.println("Write a question!");
            String userQ;
            userQ = myObj.nextLine();*/
    }
}
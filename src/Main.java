/*random # of questions. needs a bank of questions with answers in them, need to
check if you did it right, need to be able to add questions to the bank*/

/*thought: array for user input for questions. check how to make methods again. the "variable" in the numOfQs can be
* taken from array.length. */

/*UI. Ask user if they want to make a questions or take a quiz. If they want to make questions, ask them how many
questions they want to make. take that number and store it in a variable for a for loop. In the for loop, ask the
user for questions and answers. If they want to take a quiz, then show them how many questions are in the bank.
Generate a quiz by taking a random amount of questions from the bank */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Question> makeQuiz(ArrayList<Question> questions, int size) {
        ArrayList<Question> quiz = new ArrayList<>();
        for (int i = 0; i < size; i++){
            int newQ = (int)(Math.random() * questions.size());
            Question ques = questions.get(newQ);
            while (!questions.contains(ques)) {
                newQ = (int)(Math.random() * questions.size());
                ques = questions.get(newQ);
            }
            quiz.add(ques);
        }
        return quiz;
    }

    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Question> quiz = new ArrayList<>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Lets make a question");
        System.out.println("Write in a question");
        String q = myObj.nextLine();
        System.out.println("What is the answer");
        String a = myObj.nextLine();
        questions.add(new Question(q, a));

        System.out.println("How big of a quiz do you want?");
        int qSize = myObj.nextInt();
        quiz = makeQuiz(questions, qSize);
        runQuiz(quiz);
    }

    private static void runQuiz(ArrayList<Question> quiz) {
        for (Question q : quiz) {
            System.out.println(q.question);
            
            System.out.println(q.answer);
        }
    }
        //array for questions
        /*String[] questions = {"What year is it?",
                "Why did the chicken cross the road?",
                "What colour is the lavender shirt?",
                "How many mice does it take to screw a light bulb?",
                "What is the worst letter in the alphabet?"
        };
        //array for questions
        String[] answers = {"2022",
                "To go to the idiot's house... Knock Knock.",
                "PINK!",
                "Trick Question. Mice don't have good eyesight.",
                "W"
        };
        //mark counter
        int mark = 0;

        //picking out x # of questions for the quiz
        int numOfQs = (int)(Math.random() * questions.length);
        System.out.println("Welcome, dear quiz taker, please be warned that this is an extremely" +
                " stupid quiz, so don't expect to receive fair questions");
        System.out.println("There are " + questions.length + " questions in the question bank.");
        System.out.println("You will be quizzed " + numOfQs + " questions.");

        for (int i = 0; i < numOfQs; i++){
            int newQ = (int)(Math.random() * questions.length);
            int[] usedQ = {};
            if (newQ ){}
            System.out.println(questions[newQ]);
            String userAnswer;
            userAnswer = myObj.nextLine();
            if(userAnswer.equals(answers[newQ]) == true){
                System.out.println("WOW! I was NOT expecting you to get that right!");
                mark++;
            }
            else{
                System.out.println("Unfortunately, that was wrong. The correct answer is \"" + answers[newQ] + "\"");
            }
        }

        System.out.println("That was the end of the quiz! You got " + mark + " out of " + numOfQs);

         */
}
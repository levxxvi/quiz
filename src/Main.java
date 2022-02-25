import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Question> quiz;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Let's make a quiz. How many questions do you want to make?");

        int numQuiz = myObj.nextInt();
        myObj.nextLine();

        for (int i = 0; i < numQuiz; i++){
            System.out.println("Write the question!");
            String q = myObj.nextLine();
            System.out.println("What is the answer?");
            String a = myObj.nextLine();
            questions.add(new Question(q, a));
        }

        System.out.println("There are " + questions.toArray().length + " questions in the quiz bank!");

        System.out.println("How big of a quiz do you want?");
        int qSize = myObj.nextInt();
        while(qSize > questions.toArray().length){
            System.out.println("You don't have that many questions. Please chose a number less " +
                    "than or equal to the amount of questions in the quiz bank. o(-`д´- ｡)");
            System.out.println("How big of a quiz do you want?");
            qSize = myObj.nextInt();
        }

        quiz = makeQuiz(questions, qSize);
        runQuiz(quiz);
    }

    //makeQuiz method
    public static ArrayList<Question> makeQuiz(ArrayList<Question> questions, int size) {
        ArrayList<Question> quiz = new ArrayList<>();

        for (int i = 0; i < size; i++){
            int newQ = (int)(Math.random() * questions.size());
            Question ques = questions.get(newQ);
            while (quiz.contains(ques)) {
                newQ = (int)(Math.random() * questions.size());
                ques = questions.get(newQ);
            }
            quiz.add(ques);
        }
        return quiz;
    }

    //runQuiz method
    private static void runQuiz(ArrayList<Question> quiz) {
        int mark = 0;
        Scanner myObj = new Scanner(System.in);

        for (Question q : quiz) {
            System.out.println(q.question);
            String userAnswer = myObj.nextLine();

            if(userAnswer.equals(q.answer)){
                System.out.println("WOW! Good job getting that correct! (((o(*ﾟ▽ﾟ*)o)))");
                mark++;
            }
            else{
                System.out.println("Unfortunately, that was incorrect. (｡•́︿•̀｡)\n" +
                        "The correct answer is: " + q.answer);
            }
        }
        System.out.println("That was the end of the quiz! You got " + mark + " questions correct!");
    }
}
import java.util.ArrayList;

public class QuizBuilder {
    public static ArrayList<Question> questions = new ArrayList<Question>();
    private ArrayList<Question> quiz;

    QuizBuilder(int numberOfQuestions) {
        generateRandomQuestionList(numberOfQuestions);
        runQuiz();
    }

    private void generateRandomQuestionList(){

    }
}


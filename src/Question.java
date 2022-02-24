public class Question {
    String question;
    String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Question) {
            Question other = (Question) obj;
            if (this.question.equals(other.question)) {
                return true;
            }
        }
        return false;
    }
}

// Question class

public class Question {

    // All the fields
    private String question;
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;
    private String correctAnswer;

    // Constructor method
    public Question(String q, String a1, String a2, String a3, String a4, String correctA) {
        question = q;
        possibleAnswer1 = a1;
        possibleAnswer2 = a2;
        possibleAnswer3 = a3;
        possibleAnswer4 = a4;
        correctAnswer = correctA;
    }

    // return the question text
    public String getQuestion() {
        return question;
    }

    // return the first choice
    public String getPossibleAnswer1() {
        return possibleAnswer1;
    }

    // return the second choice
    public String getPossibleAnswer2() {
        return possibleAnswer2;
    }

    // return the third choice
    public String getPossibleAnswer3() {
        return possibleAnswer3;
    }

    // return the fourth choice
    public String getPossibleAnswer4() {
        return possibleAnswer4;
    }

    // return the correctAnswer
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}

// DriverExam class

public class DriverExam {

    // create two arrays, one initialized to the correct and answers and one for the student answers to be initialized in the constructor
    private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D'};
    private char[] studentsAnswers = new char[12];

    // static method to check whether or not answer is a valid answer
    public static boolean isValidAnswer(char answer){
        if(answer == 'A' || answer == 'B' || answer == 'C' || answer == 'D'){
            return true;
        }
        return false;
    }

    // constructor method, initialize the student answers
    public DriverExam(char[] answers){
        for(int i = 0; i < correctAnswers.length; i++){
            studentsAnswers[i] = answers[i];
        }
    }
    
    // boolean returning method to check if student passed
    public boolean passed(char[] studentsAnswers){
        // intialize count to 0
        int count = 0;

        // loop... if answer is wrong, increase count 
        for(int i = 0; i < correctAnswers.length; i++){
            if(correctAnswers[i] != studentsAnswers[i]){
                count++;
            }
        }

        // if more than three wrong, failed. else, passed
        if(count > 3){
            return false;
        }else {
            return true;
        }
    } 

    // method to count how many correct. Same structure as above method, returns 10 - count (which represents number of questions wrong)
    public int totalCorrect(char[] studentsAnswers){
        int count = 0;
        for(int i = 0; i < correctAnswers.length; i++){
            if(correctAnswers[i] != studentsAnswers[i]){
                count++;
            }
        }
        return 10 - count;
    }

    // method to count how many incorrect. Returns incorrect answer amount
    public int totalIncorrect(char[] studentsAnswers){
        int count = 0;
        for(int i = 0; i < correctAnswers.length; i++){
            if(correctAnswers[i] != studentsAnswers[i]){
                count++;
            }
        }
        return count;
    }

    // Returns an array with the wrong questions
    public int[] questionsMissed(char[] studentsAnswers){
        
        // create an array with size 10, max amount of wrong questions
        int[] wrongQuestions = new int[10];

        // this array will be to assign to the index
        int count = 0;

        // loop through the questions, and if wrong, switch value to array and go thru count
        for(int i = 0; i < correctAnswers.length; i++){
            if(correctAnswers[i] != studentsAnswers[i]){
                wrongQuestions[count] = i;
                count++;
            }
        }

        // make the rest of the values -1 so they'll be skipped in the print statement
        for(; count < correctAnswers.length; count++){
            wrongQuestions[count] = -1;
        }

        // return the array 
        return wrongQuestions;
    }
}

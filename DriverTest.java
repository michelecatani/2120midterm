// import statements

import java.util.Scanner;

// DriverTest class

public class DriverTest {
    // main function
    public static void main(String[] args) {

        // create a new Scanner instance

        Scanner keyboard = new Scanner (System.in);

        // create a new answers array of characters
        
        char[] answers = new char[10];

        // create an instance of DriverExam

        DriverExam driverExam = new DriverExam(answers);

        // Prompt user for input
        System.out.println("Enter your answers to the exam questions.");

        // get input for all 10 answers
        for(int i = 0; i < 10; i++){
            System.out.print("Question " + (i + 1) + ": ");
            
            // use a loop and the static isValidAnswer method to check if it is a valid answer
            while(true){
                char answer = keyboard.next().charAt(0);
                answer = Character.toUpperCase(answer);
                if(DriverExam.isValidAnswer(answer) == true){
                    // if it is, assign it to the answers array
                    answers[i] = answer;
                    break;
                }
                else {
                    // if not, print error
                    System.out.println("ERROR: Valid answers are A, B, C, or D.");
                }
            }
        }
        
        // print out the total number of correct and incorrect answers
        System.out.println("Correct answers: " + driverExam.totalCorrect(answers));
        System.out.println("Incorrect answers: " + driverExam.totalIncorrect(answers));

        // inform user whether they passed or failed
        if(driverExam.passed(answers) == true) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }

        // inform user of the questions that were missed
        System.out.println("You missed the following question:");
        for(int i = 0; i < driverExam.questionsMissed(answers).length; i++){
            // entries if the returned array will be -1 after the answers stop being incorrect, so that's the reason for this check
            if(driverExam.questionsMissed(answers)[i] != -1){
                System.out.print((driverExam.questionsMissed(answers)[i] + 1) + " ");
            }
        }
    }
}

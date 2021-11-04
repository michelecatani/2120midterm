// Import statements

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;

// Declare the class TriviaGame

public class TriviaGame {
    // main function

    public static void main(String[] args) throws Exception {

        // Initialize an Scanner instance
     
        Scanner keyboard = new Scanner(System.in);

        // Set filename to the name of the file

        String filename = "trivia.txt";

        // Create fileReader and bufferedReader pair so we can read from the filename

        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // create an ArrayList of type Question

        ArrayList<Question> questionList = new ArrayList<Question>();

        // Create a loop with the purpose of assigning Questions to the list

        for(int i = 0; i< 10; i++){
            // Read a line for each of the fields of the Question class
            String question = bufferedReader.readLine();
            String answer1 = bufferedReader.readLine();
            String answer2 = bufferedReader.readLine();
            String answer3 = bufferedReader.readLine();
            String answer4 = bufferedReader.readLine();
            String correctAnswer = bufferedReader.readLine();

            // Create a newQuestion with the values read above and add it to the list

            Question newQuestion = new Question(question, answer1, answer2, answer3, answer4, correctAnswer);
            questionList.add(i, newQuestion);
        }

        // Create two instances of Player, 1 and 2

        Player player1 = new Player();
        Player player2 = new Player();

        // create a variable to track which player it is

        int currentPlayer = 1;

        // create a loop to ask the questions and get player input

        for(int i = 0; i < 10; i++){

            // Inform whose turn it is
            System.out.println("Question for player #" + currentPlayer);
            System.out.println("-------------------------");

            // Get the question at the index from the list
            Question question = questionList.get(i);
            
            // Print the question and all of the possible answers
            System.out.println(question.getQuestion());
            System.out.println("1. " + question.getPossibleAnswer1());
            System.out.println("2. " + question.getPossibleAnswer2());
            System.out.println("3. " + question.getPossibleAnswer3());
            System.out.println("4. " + question.getPossibleAnswer4());
            
            // Prompt user for the correct answer
            System.out.print("Enter the number of the correct answer: ");

            // Get the answer and convert to string 
            String selection = String.valueOf(keyboard.next().charAt(0));

            // Check if answer correct
            if(selection.equals(question.getCorrectAnswer())){

                // Inform that it is correct
                System.out.println("Correct!");

                // Increment the points of appropriate player
                if(currentPlayer == 1){
                    player1.incrementPoints();
                } else {
                    player2.incrementPoints();
                }
            } 
            
            // If wrong, let them know
            else {
                System.out.println("Sorry that is incorrect. The correct answer is " + question.getCorrectAnswer() + ".");
            }

            // switch player
            if(currentPlayer == 1){
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }

            // print a line for space
            System.out.println("");
        }

        // print that the game is over
        System.out.println("Game over!");
        System.out.println("------------------");

        // Print both players's points
        System.out.println("Player 1's points: " + player1.getPoints());
        System.out.println("Player 2's points: " + player2.getPoints());

        // Check who won and print what's necessary
        if(player1.getPoints() > player2.getPoints()){
            System.out.println("Player 1 wins!");
        } else if (player1.getPoints() < player2.getPoints()){
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It is a draw!");
        }
    }
}

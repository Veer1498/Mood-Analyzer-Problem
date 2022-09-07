package moodanalyzer;

/**
 * To Check the Mood of the Person by String Entered.
 * Emphasis on - Junit Test Cases - Exception Handling - Custom Exceptions
 *
 * Author @Veer
 */
//Mood Analyzer Class
public class MoodAnalyzer {
    //Welcome Function
    public static void welcome(){
        System.out.println("Welcome to Mood Analyzer");
        System.out.println("========================");
    }
    //Function to Check Mood of a String Entered
    public String moodCheck(String message){
        if(message.contains("SAD")) {
            System.out.println("In SAD Mood");
            return "SAD";
        }
        else{
            System.out.println("In HAPPY Mood");
            return "HAPPY";
        }
    }
}

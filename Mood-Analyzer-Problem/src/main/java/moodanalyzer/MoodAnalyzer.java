package moodanalyzer;

/**
 * To Check the Mood of the Person by String Entered.
 * Emphasis on - Junit Test Cases - Exception Handling - Custom Exceptions
 *
 * Author @Veer
 */
//Mood Analyzer Class
public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Function to Check Mood of a String Entered
    public String moodCheck(){
        if(message.contains("SAD")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}

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

    //Constructor created to pass message as mentioned in UC.
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Function to Check Mood of a String Entered
    public String moodCheck(){
        //Created Try and Catch Blocks to Handle Exceptions if Occurs.
       try{
           if(message.contains("SAD")) {
               return "SAD";
           }
           else {
               return "HAPPY";
           }
       }
       //Don't Know what would be exception, So Took a Normal Exception to Catch, Whatever Exception Occurs.
       catch (Exception exception){
           return "HAPPY";
       }

    }
}

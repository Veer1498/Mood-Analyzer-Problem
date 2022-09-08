package moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * To Check the Mood of the Person by String Entered.
 * Emphasis on - Junit Test Cases - Exception Handling - Custom Exceptions
 * Author @Veer
 *
 * Testing Class of MoodAnalyzerTest
 * Created Object of Mood Analyzer
 * Created a Test Function and Imported Assertions and checking SAD or HAPPY
 */
public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyze = new MoodAnalyzer();

    @Test
    public void if_MessageWasSad_ShouldReturnSad(){

        String message = "SAD";
        String result1 = moodAnalyze.moodCheck(message);
        Assertions.assertEquals("SAD",result1);
    }
    @Test
    public void if_MessageWasHappy_ShouldReturnHappy(){

        String message = "HAPPY";
        String result2 = moodAnalyze.moodCheck(message);
        Assertions.assertEquals("HAPPY",result2);
    }
}

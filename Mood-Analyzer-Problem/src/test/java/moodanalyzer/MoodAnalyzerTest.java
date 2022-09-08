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

    @Test
    public void if_MessageWasSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is SAD message");
        String result1 = moodAnalyze.moodCheck();
        Assertions.assertEquals("SAD",result1);
    }
    @Test
    public void if_MessageWasHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyze = new MoodAnalyzer("This is HAPPY message");
        String result2 = moodAnalyze.moodCheck();
        Assertions.assertEquals("HAPPY",result2);
    }
}

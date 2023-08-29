/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package work;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import work.GiveMeARandomQuote;
import work.Quote;

import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
class GiveMeaRandomQuoteTest{
    @Test void testGiveMeARandomQuote(){
        GiveMeARandomQuote classUnderTest = new GiveMeARandomQuote();
        Quote[] qoutes=classUnderTest.getArr();
        String specialCase="There are no quotes available at the moment.";
        String singleQuote=classUnderTest.kindlyGiveMeARandomQuote();
        System.out.println(singleQuote);
        assertNotNull(singleQuote);
        assertNotEquals(specialCase,singleQuote);
        assertTrue(qoutes.length > 1);

    }

}
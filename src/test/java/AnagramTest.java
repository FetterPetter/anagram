import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {
    @Test
    public void testerAnagram(){
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Eats");
        inputList.add("Seat");
        inputList.add("Teeth");

        Anagram anagramObject = new Anagram(inputList);
        ArrayList<String> result = anagramObject.check("eats");
        System.out.println(result);
        assertTrue(result.contains("seat"));
        assertTrue(result.contains("eats"));
        assertFalse(result.contains("teeth"));
    }


}

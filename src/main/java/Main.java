import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         ArrayList<String> inputList = new ArrayList<>();
         inputList.add("eats");
         inputList.add("seats");
         inputList.add("teeth");

         Anagram anagramObject = new Anagram(inputList);

    }
}

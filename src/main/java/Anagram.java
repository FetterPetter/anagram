import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    private ArrayList<String> inputList;
    private final HashMap<String, ArrayList<String>> sortedMap = new HashMap<>();

    public Anagram(ArrayList<String> inputList) {
        this.inputList = inputList;
        sortAlphabetical();

    }

    private static String sortWordAlphabetically(String ord) {
        String lowerCaseOrd = ord.toLowerCase();
        char[] alphabeticalWord = lowerCaseOrd.toCharArray();
        Arrays.sort(alphabeticalWord);
        return new String(alphabeticalWord);
    }


    private void sortAlphabetical() {
        for (String ord : inputList) {
            String sortedOrd = sortWordAlphabetically(ord);


            if (sortedMap.containsKey(sortedOrd)) {
                sortedMap.get(sortedOrd).add(ord.toLowerCase());
                //System.out.println(sortedMap.get(sortedOrd));
            } else {
                ArrayList<String> newAnagramList = new ArrayList<>();
                newAnagramList.add(ord.toLowerCase());
                sortedMap.put(sortedOrd, newAnagramList);
            }

        }


    }

    public void setInputList(ArrayList<String> inputList) {
        this.inputList = inputList;
    }

    public ArrayList<String> check(String inputWord) {
        String sortedOrd =sortWordAlphabetically(inputWord);
        return sortedMap.get(sortedOrd);

    }
}

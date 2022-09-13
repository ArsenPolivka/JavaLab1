import java.util.Scanner;

public class StringTask {
    public void Task() {

        String words = "Hello, World, theme, gain, garden, fffgdd";
        String[] wordList = words.split(",");

        for (var word: wordList) {
            word = word.strip();
            word = word.replace("g", "th");
            System.out.println(word);
        }

    }
}

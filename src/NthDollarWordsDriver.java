import java.util.Scanner;

public class NthDollarWordsDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your target word value? ");
        int value = scanner.nextInt();
        String[] words = FileHelper.getWords();
        int count = 0;
        FileHelper.emptyFile(value);
        for (String word : words) {
            NthDollarWord hdw = new NthDollarWord(word, value);
            if (hdw.isHundredDollarWord()) {
                FileHelper.addWord(word, value);
                count++;
            }
        }
        System.out.printf("%1$s words with a value of $%2$d were found, outputted to %2$d%3$s\n", count, value, FileHelper.OUTPUT_FILE);
    }
}

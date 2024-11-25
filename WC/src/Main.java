import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        System.out.println(WC.countLineBufferedReader(fileName));
        System.out.println(WC.countWords(fileName));
    }
}
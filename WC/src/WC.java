import java.io.*;


public class WC {
    public static long countLineBufferedReader(String fileName) {
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    public static long countWords(String fileName) throws IOException {
        String line;
        long wordCount = 0L;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            while ((line = bufferedReader.readLine()) != null) {
                String words[] = line.split("\\s+");
                wordCount += words.length;
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return wordCount;
    }
}

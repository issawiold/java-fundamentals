package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Library {
    public static void main(String[] args) {
    }

    public static void javaScriptLinter(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            Pattern pattern1 = Pattern.compile("\\bif\\b", Pattern.CASE_INSENSITIVE);
            Pattern pattern2 = Pattern.compile("\\belse\\b", Pattern.CASE_INSENSITIVE);
            Pattern pattern3 = Pattern.compile("\\}", Pattern.CASE_INSENSITIVE);
            Pattern pattern4 = Pattern.compile("\\{", Pattern.CASE_INSENSITIVE);
            Pattern pattern5 = Pattern.compile(";$");

            while ((line = reader.readLine()) != null) {
                counter += 1;
                Matcher matcher1 = pattern1.matcher(line);
                Matcher matcher2 = pattern2.matcher(line);
                Matcher matcher3 = pattern3.matcher(line);
                Matcher matcher4 = pattern4.matcher(line);
                if (!(matcher1.find() || matcher2.find() || matcher3.find() || matcher4.find())) {
                    Matcher matcher5 = pattern5.matcher(line);
                    if (!(matcher5.find())) {
                        System.out.println("Line " + counter + ": Missing semicolon.");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






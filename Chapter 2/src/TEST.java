import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class TEST {
    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }catch (IOException e) {
            return defaultVal;
        }
    }
}



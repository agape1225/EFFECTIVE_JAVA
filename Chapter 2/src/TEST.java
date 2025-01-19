import java.io.*;

public class TEST {
    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path));
                FileInputStream is = new FileInputStream("/Users/limjun-young/test.txt");
        ){
            return br.readLine();
        }catch (IOException e) {
            return defaultVal;
        }
    }
}



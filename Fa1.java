import java.io.IOException;
import java.io.FileInputStream;
public class Fa1 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Наталья\\Desktop\\Java.txt");
        byte[] str = new byte[file.available()];
        file.read(str);
        String text = new String(str);
        int n = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'r') {
                n++;
            }
        }
        if (n == 0) {
            System.out.println("Файл не содержит 'r'.");
        }
        else {
            System.out.println(n);
        }
    }
}

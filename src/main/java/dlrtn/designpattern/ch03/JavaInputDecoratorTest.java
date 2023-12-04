package dlrtn.designpattern.ch03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class JavaInputDecoratorTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\JooIcksoo\\IdeaProjects\\design-pattern\\src\\main\\java\\dlrtn\\designpattern\\ch03\\test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

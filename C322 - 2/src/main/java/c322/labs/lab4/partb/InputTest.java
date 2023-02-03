package c322.labs.lab4.partb;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;
        try {
            in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\Zach\\Documents\\currC322\\C322-2\\C322 - 2\\src\\main\\java\\c322\\labs\\lab4\\partb\\test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) { in.close(); }
        }
        System.out.println();
        try (InputStream in2 =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     new FileInputStream( "C:\\Users\\Zach\\Documents\\currC322\\C322-2\\C322 - 2\\src\\main\\java\\c322\\labs\\lab4\\partb\test.txt"))))
        {
            while((c = in2.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End of file");
    }
}

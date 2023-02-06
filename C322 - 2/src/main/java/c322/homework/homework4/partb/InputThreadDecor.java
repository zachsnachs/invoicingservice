package c322.homework.homework4.partb;
import java.io.*;
public class InputThreadDecor extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected InputThreadDecor(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return 0;
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);

        return result;
    }
}

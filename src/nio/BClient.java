package nio;

import java.io.IOException;

/**
 * @author keith
 */
public class BClient {

    public static void main(String[] args)
            throws IOException {
        new NioClient().start("BClient");
    }

}

package nio;

import java.io.IOException;

/**
 * @author keith
 */
public class CClient {

    public static void main(String[] args)
            throws IOException {
        new NioClient().start("CClient");
    }

}

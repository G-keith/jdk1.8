package nio;

import java.io.IOException;

/**
 * @author keith
 */
public class AClient {

    public static void main(String[] args)
            throws IOException {
        new NioClient().start("AClient");
    }

}

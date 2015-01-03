package JettyServer;

import org.mortbay.jetty.Server;

/**
 * Created by kot on 1/2/2015.
 */
public class Runner {
    public static void main(String[] args) {
        Server server = new Server(8080);
        server.addHandler(new Handler());
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

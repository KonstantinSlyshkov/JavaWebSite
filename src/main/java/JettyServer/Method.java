package JettyServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by kot on 1/2/2015.
 */
public class Method {
    public static void htmlSearcher(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        String url = httpServletRequest.getRequestURI();
        FileReader file = null;
        try {
            file = new FileReader(url.substring(1).toLowerCase());
            PrintWriter out = null;
            BufferedReader read = new BufferedReader(file);
            String tmp = "";
            out = httpServletResponse.getWriter();
            while ((tmp = read.readLine()) != null) {
                out.println(tmp);
            }
            read.close();
        } catch (FileNotFoundException e) {
            httpServletResponse.sendError(410, "no such file");
        }
    }
}

package JettyServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kot on 1/2/2015.
 */
public class Method {
    public static void htmlSearcher(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        String url = httpServletRequest.getRequestURI();
        FileReader file = null;
        try {
            file = new FileReader("C:\\Users\\kot\\IdeaProjects\\JavaCode\\" + url);
            PrintWriter out = null;
            try {
                BufferedReader read = new BufferedReader(file);
                String tmp = "";
                out = httpServletResponse.getWriter();
                while ((tmp = read.readLine()) != null) {
                    out.println(tmp);
                }
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            try {
                httpServletResponse.sendError(410, "no such file");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}

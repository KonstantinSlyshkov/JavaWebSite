package JettyServer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kot on 1/2/2015.
 */
public class Method {
    public static void htmlSearcher(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        String url = httpServletRequest.getRequestURI();
        FileReader file = null;
        try {
            //fixme У меня нет такого пути, у меня вообще не работает :(
            file = new FileReader("C:\\Users\\kot\\IdeaProjects\\JavaCode\\" + url);
            PrintWriter out = null;
            //fixme не делай трай внутри трая, сделай два кетча
            try {
                BufferedReader read = new BufferedReader(file);
                String tmp = "";
                out = httpServletResponse.getWriter();
                while ((tmp = read.readLine()) != null) {
                    out.println(tmp);
                }
                read.close();
            } catch (IOException e) {
                // этот IOException нет смысла перехватывать(читай ниже)
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            try {
                httpServletResponse.sendError(410, "no such file");
            } catch (IOException e1) {
                //fixme IOException пробрасывается методом handle у AbstractMethod его нет смысла обрабатывать
                e1.printStackTrace();
            }
        }
    }
}

package JettyServer;

import org.mortbay.jetty.Request;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by kot on 1/2/2015.
 */
public class Handler extends AbstractHandler {
    @Override
    public void handle(String s, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, int i) throws IOException, ServletException {

        httpServletResponse.setContentType("text/html;charset=utf-8");
        Method.htmlSearcher(httpServletRequest, httpServletResponse);
        Request base_request = (Request)httpServletRequest;
        base_request.setHandled(true);
    }


}

package filters;


import javax.servlet.*;
import java.io.IOException;

public class InitFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html; charset=UTF-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}

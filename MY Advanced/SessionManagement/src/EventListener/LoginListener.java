package EventListener;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class LoginListener implements HttpSessionListener {

	ServletContext ctx=null;
	static int total=0;
	static int count=0;
	
	public void sessionCreated(HttpSessionEvent se) 
    { 
        total++;
        count++;
        
        ctx=se.getSession().getServletContext();
        ctx.setAttribute("totalUsers", total);
        ctx.setAttribute("countUsers", count);
        
       
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         HttpSession session=se.getSession();
         session.invalidate();
    }
	
}

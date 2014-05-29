package controller;


import java.io.IOException;
import ModProsesNama.Main;

import abs.backend.java.lib.types.ABSString;
import abs.backend.java.lib.types.ABSRef;
import abs.backend.java.observing.SystemObserver;
import abs.backend.java.scheduling.DefaultTaskScheduler;
import abs.backend.java.scheduling.GlobalScheduler;
import abs.backend.java.scheduling.GlobalSchedulingStrategy;
import abs.backend.java.scheduling.ScheduableTasksFilter;
import abs.backend.java.scheduling.ScheduableTasksFilterDefault;
import abs.backend.java.scheduling.ScheduleAction;
import abs.backend.java.scheduling.SimpleTaskScheduler;
import abs.backend.java.scheduling.TaskScheduler;
import abs.backend.java.scheduling.TaskSchedulerFactory;
import abs.backend.java.scheduling.TaskSchedulingStrategy;
import abs.backend.java.scheduling.TotalSchedulingStrategy;
import abs.backend.java.scheduling.UsesRandomSeed;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import abs.backend.java.lib.runtime.COG;
import abs.backend.java.lib.runtime.ABSRuntime;
import abs.backend.java.lib.runtime.ABSObject;
import abs.backend.java.lib.runtime.ABSMainCall;
import java.lang.Thread;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{	    

		     UserBean user = new UserBean();
		     user.setUserName(request.getParameter("un"));
		     user.setPassword(request.getParameter("pw"));
		     
		     
		     testAbs();
		     //user = UserDAO.login(user);
		     
		     user.setValid(true);  		    
		     if (user.isValid())
		     {
			        
		          HttpSession session = request.getSession(true);	    
		          session.setAttribute("currentSessionUser",user); 
		          response.sendRedirect("userLogged.jsp"); //logged-in page      		
		     }
			        
		     else 
		          response.sendRedirect("invalidLogin.jsp"); //error page 
		} 
				
				
		catch (Throwable theException) 	    
		{
		     System.out.println(theException); 
		}
	}
	public static void testAbs() throws Exception
	{
		ABSRuntime runtime = new ABSRuntime();
	     COG cog = runtime.createCOG(Main.class);
	     Main m = new Main(cog);
		 runtime.start(Main.class);
		 while(m.hasil=="")
		 {
			 Thread.yield();
		 }
		 System.out.println("");
		 System.out.println(m.hasil);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	

}

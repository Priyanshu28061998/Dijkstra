package webapp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/solve")
public class solve extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
	
		int n=Integer.parseInt(request.getParameter("name"));
		int m=Integer.parseInt(request.getParameter("m"));
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			ArrayList<Integer> temp=new ArrayList<Integer>();
			arr.add(temp);
		}
		String str[]=request.getParameterValues("edges").toString().trim().split(" ");
		for(String x:str)
		{
			System.out.println(x);
		}
		for(int i=0;i<str.length;i=i+2)
		{
			int x=Integer.parseInt(str[i]);
			int y=Integer.parseInt(str[i+1]);
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		
		request.setAttribute("ans","rukja");
	}

	
}

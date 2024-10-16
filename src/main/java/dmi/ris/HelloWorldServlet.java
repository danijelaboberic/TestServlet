package dmi.ris;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dmi.ris.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // kod kada koristimo samo servlet bez jsp
		
		/*String name = req.getParameter("name");
        String s = req.getParameter("surname");

		StringBuilder sb =  new StringBuilder();
        sb.append("<h1>");
        sb.append("Hello World ");
        sb.append(name);
        sb.append(" ");
        sb.append(s);

        sb.append("</h1>");
	    resp.getWriter().write(sb.toString());*/
		
		List<Student> students = new ArrayList<Student>();
		Student s1= new Student("Marko","Markovic");
		Student s2= new Student("Ana","Peric");
		Student s3= new Student("Zarko","Zikic");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		req.setAttribute("korisnici", students);
		req.getRequestDispatcher("/students.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}

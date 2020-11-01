package sldevcode.registrationform.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sldevcode.registrationform.dao.StudentDao;
import sldevcode.registrationform.model.Student;

@WebServlet("/register")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentDao studentDao = new StudentDao();

	public StudentServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/StudentRegister.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String studentID = request.getParameter("studentID");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String year = request.getParameter("year");
		String GPA = request.getParameter("GPA");
		String contact = request.getParameter("contact");

		Student student = new Student();
		student.setStudentID(studentID);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setUserName(userName);
		student.setPassword(password);
		student.setYear(year);
		student.setGPA(GPA);;
		student.setContact(contact);

		try {
			studentDao.registerStudent(student);

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/StudentDetails.jsp");
		dispatcher.forward(request, response);
	}

}

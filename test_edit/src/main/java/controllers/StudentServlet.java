package controllers;

import model.bean.Class;
import model.bean.Student;
import model.service.IStudentService;
import model.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"", "/students"})
public class StudentServlet extends HttpServlet {
    IStudentService studentService = new StudentServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "edit":
                editStudent(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {

            default:
                showList(request, response);
                break;
        }
    }


    //doGet
    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Student> studentList = studentService.findAllStudent();
        List<Class> classList = studentService.findAllClass();

        request.setAttribute("students", studentList);
        request.setAttribute("classlist", classList);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("receive1"));
        String name = request.getParameter("receive2");
        int age = Integer.parseInt(request.getParameter("receive3"));

    }
}

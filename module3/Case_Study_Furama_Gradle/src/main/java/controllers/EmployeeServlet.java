package controllers;

import model.bean.employee.*;
import model.service.IEmployeeService;
import model.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    IEmployeeService employeeService = new EmployeeServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createEmployee(request,response);
                break;
            case "edit":
                editEmployee(request,response);
                break;
            case "delete":
                deleteEmployee(request,response);
                break;
            case "search":
                searchName(request,response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreate(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            case "show":
                showInfo(request,response);
                break;
            default:
                showListEmployee(request,response);
                break;
        }
    }




    //doPost
    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("position"));
        int idEducation = Integer.parseInt(request.getParameter("education"));
        int idDivision = Integer.parseInt(request.getParameter("division"));
        String userName = request.getParameter("userName");
        Employee employee = new Employee(name,date,idCard,salary,phone,email,address,idPosition,idEducation,idDivision,userName);
        check = employeeService.addNewEmployee(employee);
        if (check){
            request.setAttribute("message","Create success");
        }
        try {
            request.getRequestDispatcher("/view/employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String idCard = request.getParameter("idCard");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idPosition = Integer.parseInt(request.getParameter("position"));
        int idEducation = Integer.parseInt(request.getParameter("education"));
        int idDivision = Integer.parseInt(request.getParameter("division"));
        String userName = request.getParameter("userName");
        Employee employee = new Employee(name,date,idCard,salary,phone,email,address,idPosition,idEducation,idDivision,userName);
        check = employeeService.editEmployee(id,employee);
        if (check){
            request.setAttribute("message","Edit success");
        }
        try {
            request.getRequestDispatcher("/view/employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("employeeId"));
        employeeService.deleteEmployee(id);
        try {
            response.sendRedirect("/employees");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void searchName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("searchName");
        List<Employee> employeeList = employeeService.searchByName(name);
        List<EducationDegree> educationDegreeList = employeeService.findAllEducation();
        List<Position> positionList = employeeService.findAllPosition();
        request.setAttribute("employees",employeeList);
        request.setAttribute("educations",educationDegreeList);
        request.setAttribute("positions",positionList);
        try {
            request.getRequestDispatcher("/view/employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //doGet
    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.findAllEmployee();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducation();
        List<Position> positionList = employeeService.findAllPosition();
        request.setAttribute("employees",employeeList);
        request.setAttribute("educations",educationDegreeList);
        request.setAttribute("positions",positionList);
        try {
            request.getRequestDispatcher("/view/employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducation();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> users = employeeService.findAllUser();
        request.setAttribute("positions",positionList);
        request.setAttribute("educations",educationDegreeList);
        request.setAttribute("divisions",divisionList);
        request.setAttribute("users",users);
        try {
            request.getRequestDispatcher("view/employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);
        request.setAttribute("employees",employee);
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducation();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> users = employeeService.findAllUser();
        request.setAttribute("positions",positionList);
        request.setAttribute("educations",educationDegreeList);
        request.setAttribute("divisions",divisionList);
        request.setAttribute("users",users);
        try {
            request.getRequestDispatcher("/view/employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showInfo(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findById(id);
        request.setAttribute("employees",employee);
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducation();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> users = employeeService.findAllUser();
        request.setAttribute("positions",positionList);
        request.setAttribute("educations",educationDegreeList);
        request.setAttribute("divisions",divisionList);
        request.setAttribute("users",users);
        try {
            request.getRequestDispatcher("/view/employee/show.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

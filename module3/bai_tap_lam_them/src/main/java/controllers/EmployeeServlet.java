package controllers;

import model.bean.Employee;
import model.service.IEmployeeService;
import model.service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",urlPatterns = {"","/employees"})
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
                searchEmployee(request,response);
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
            default:
                showList(request,response);
                break;
        }
    }


    //doPost
    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String birthday = request.getParameter("date");
        Employee employee = new Employee(code,name,birthday);

        List<String> errList = employeeService.insertEmployee(employee);
        int checkFull = 0;
        for (String string  : errList){
            if ("".equals(string)){
                checkFull++;
            }
        }
        if (checkFull == 3){
            request.setAttribute("message","Create success");
        }else {
            request.setAttribute("message","Create fail");
        }
        request.setAttribute("errList",errList);
        request.setAttribute("employee",employee);
        try {
            request.getRequestDispatcher("/view/employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String birthday = request.getParameter("date");
        Employee employee = new Employee(code,name,birthday);

        List<String> errList = employeeService.updateEmployee(code,employee);
        int checkFull = 0;
        for (String string : errList){
            if ("".equals(string)){
                checkFull++;
            }
        }
        if (checkFull == 2){
            request.setAttribute("message","Update success");
        }else {
            request.setAttribute("message","Update fail");
        }
        request.setAttribute("employee",employee);
        request.setAttribute("errList",errList);
        try {
            request.getRequestDispatcher("/view/employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("employeeCode");
        employeeService.deleteEmployee(code);
        try {
            response.sendRedirect("/employees");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("searchName");
        List<Employee> employeeList = employeeService.searchByName(name);
        request.setAttribute("employees",employeeList);
        try {
            request.getRequestDispatcher("/view/employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //doGet
    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.findAll();
        request.setAttribute("employees",employeeList);
        try {
            request.getRequestDispatcher("view/employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect("/view/employee/create.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        String code = request.getParameter("code");
        Employee employee = employeeService.findByCode(code);
        request.setAttribute("employee",employee);
        try {
            request.getRequestDispatcher("/view/employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

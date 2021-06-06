package controllers;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Service;
import model.repository.ContractRepository;
import model.service.IContractService;
import model.service.impl.ContractServiceImpl;
import model.service.impl.CustomerServiceImpl;
import model.service.impl.EmployeeServiceImpl;
import model.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contracts")
public class ContractServlet extends HttpServlet {
    IContractService contractService = new ContractServiceImpl();
//    ContractRepository contractRepository = new ContractRepository();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    ServiceImpl serviceimpl = new ServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createContract(request, response);
                break;
            case "delete":
                deleteContract(request, response);
                break;
            case "edit":
                editContract(request,response);
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showFormCreate(request, response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
        }
    }

    //doPost
    private void createContract(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int customerId = Integer.parseInt(request.getParameter("customer"));
        int employeeId = Integer.parseInt(request.getParameter("employee"));
        int serviceId = Integer.parseInt(request.getParameter("service"));
        Contract contract = new Contract(startDate, endDate, deposit, employeeId, customerId, serviceId);
        check = contractService.insertContract(contract);
        if (check) {
            request.setAttribute("message", "create success");
        }else {
            request.setAttribute("message", "create fail");
        }
        List<Customer> customerList = customerService.findAll();
        List<Employee> employeeList = employeeService.findAllEmployee();
        List<Service> serviceList = serviceimpl.findAll();
        request.setAttribute("customers", customerList);
        request.setAttribute("employees", employeeList);
        request.setAttribute("services", serviceList);
        try {
            request.getRequestDispatcher("/view/contract/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteContract(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("contractId"));
         contractService.deleteContract(id);
        try {
            response.sendRedirect("/customerUsingServices");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editContract(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");
        double deposit = Double.parseDouble(request.getParameter("deposit"));
        int customerId = Integer.parseInt(request.getParameter("customer"));
        int employeeId = Integer.parseInt(request.getParameter("employee"));
        int serviceId = Integer.parseInt(request.getParameter("service"));
        Contract contract = new Contract(startDate, endDate, deposit, employeeId, customerId, serviceId);
        check = contractService.updateContract(contractId,contract);
        if (check) {
            request.setAttribute("message", "create success");
        }else {
            request.setAttribute("message", "create fail");
        }
        List<Customer> customerList = customerService.findAll();
        List<Employee> employeeList = employeeService.findAllEmployee();
        List<Service> serviceList = serviceimpl.findAll();
        request.setAttribute("customers", customerList);
        request.setAttribute("employees", employeeList);
        request.setAttribute("services", serviceList);
        try {
            request.getRequestDispatcher("/view/contract/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //doGet
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        List<Employee> employeeList = employeeService.findAllEmployee();
        List<Service> serviceList = serviceimpl.findAll();
        request.setAttribute("customers", customerList);
        request.setAttribute("employees", employeeList);
        request.setAttribute("services", serviceList);
        try {
            request.getRequestDispatcher("/view/contract/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int contractId = Integer.parseInt(request.getParameter("id"));
        Contract contract = contractService.findById(contractId);
        List<Customer> customerList = customerService.findAll();
        List<Employee> employeeList = employeeService.findAllEmployee();
        List<Service> serviceList = serviceimpl.findAll();
        request.setAttribute("contract",contract);
        request.setAttribute("customers", customerList);
        request.setAttribute("employees", employeeList);
        request.setAttribute("services", serviceList);
        try {
            request.getRequestDispatcher("/view/contract/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

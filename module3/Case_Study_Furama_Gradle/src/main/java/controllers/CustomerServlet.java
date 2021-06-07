package controllers;

import model.bean.customer.Customer;
import model.service.ICustomerService;
import model.service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    ICustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "search":
                showSearch(request,response);
                break;
            default:
                break;
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
        if (action==null){
            action="";
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
                showListCustomer(request,response);
                break;
        }
    }




    //doPost
    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String customerCode = request.getParameter("code");
        if (customerCode == null){
            customerCode = "";
        }
        String name = request.getParameter("name");
        if (name == null){
            name = "";
        }
        int typeCustomer = Integer.parseInt(request.getParameter("type"));
        String date = request.getParameter("date");
        if (date == null){
            date = "";
        }
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        if (email == null){
            email = "";
        }
        String idCard = request.getParameter("idCard");
        if (idCard == null){
            idCard = "";
        }
        String phone = request.getParameter("phone");
        if (phone == null){
            phone = "";
        }
        String address = request.getParameter("address");
        if (address == null){
            address = "";
        }
        Customer customer = new Customer(customerCode,name,typeCustomer,date,gender,idCard,
                phone,email,address);
        try{
            List<String> errList = customerService.insertInto(customer);
            int checkFull = 0;
            boolean check = false;
            String msgCreate = null;
            for (String string : errList){
                if (string.equals("")){
                    checkFull++;
                }
            }
            if (checkFull == 7){
                check = true;
            }
            if (check){
                msgCreate = "Create Success";
            }else {
                msgCreate = "Create Fail";
                request.setAttribute("customer",customer);
            }
            request.setAttribute("message",msgCreate);
            for (int i = 0;i<errList.size();i++){
                request.setAttribute("err"+(i+1),errList.get(i));
            }
            List<String[]> stringList = customerService.findTypeOfCustomer();
            request.setAttribute("list",stringList);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            request.getRequestDispatcher("/view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("customerId"));
        customerService.delete(id);
        try {
            response.sendRedirect("/customers");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        int id = Integer.parseInt(request.getParameter("id"));
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        int typeCustomer = Integer.parseInt(request.getParameter("type"));
        String date = request.getParameter("date");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Customer customer = new Customer(id,code,name,typeCustomer,date,gender,idCard,phone,
                email,address);
        check = customerService.updateById(id,customer);
        if (check){
            request.setAttribute("message","Edit success");
        }
        Customer customers =  customerService.findById(id);
        request.setAttribute("customer",customers);
        List<String[]> stringList = customerService.findTypeOfCustomer();
        request.setAttribute("list",stringList);
        String[] listGenders = {"Male","Female","Other"};
        request.setAttribute("listGender",listGenders);
        try {
            request.getRequestDispatcher("/view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //doGet
    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        request.setAttribute("customers",customerList);
        try {
            request.getRequestDispatcher("/view/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<String[]> stringList = customerService.findTypeOfCustomer();
        request.setAttribute("list",stringList);
        try {
            request.getRequestDispatcher("/view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer =  customerService.findById(id);
        request.setAttribute("customer",customer);
        List<String[]> stringList = customerService.findTypeOfCustomer();
        request.setAttribute("list",stringList);
        String[] listGenders = {"Male","Female","Other"};
        request.setAttribute("listGender",listGenders);
        try {
            request.getRequestDispatcher("/view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showInfo(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        request.setAttribute("customer",customer);
        try {
            request.getRequestDispatcher("/view/customer/show.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showSearch(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("searchName");
        List<Customer> customerList = customerService.searchByName(name);
        request.setAttribute("customers",customerList);
        try {
            request.getRequestDispatcher("/view/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

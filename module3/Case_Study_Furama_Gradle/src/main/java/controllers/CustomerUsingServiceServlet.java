package controllers;

import model.bean.customerUsingService.AttachService;
import model.bean.customerUsingService.CustomerUsingService;
import model.service.impl.CustomerUsingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerUsingServiceServlet",urlPatterns = "/customerUsingServices")
public class CustomerUsingServiceServlet extends HttpServlet {
    CustomerUsingServiceImpl customerUsingServiceImpl = new CustomerUsingServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            default:
                showList(request,response);
                break;
        }
    }

    //doGet
    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerUsingService> lists = customerUsingServiceImpl.findAll();
        List<AttachService> attachServiceList = customerUsingServiceImpl.findAllAttachService();
        request.setAttribute("attachs",attachServiceList);
        request.setAttribute("lists", lists);
        try {
            request.getRequestDispatcher("/view/customer/customerUsingService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package controllers;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.service.IService;
import model.service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    IService serviceImpl = new ServiceImpl();
    List<ServiceType> serviceTypeList = serviceImpl.findAllServiceType();
    List<RentType> rentTypeList = serviceImpl.fillAllRentType();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            default:
                showListService(request,response);
                break;
        }
    }



    //doGet
    private void showListService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = serviceImpl.findAll();
        request.setAttribute("services",serviceList);
        request.setAttribute("serviceTypes",serviceTypeList);
        request.setAttribute("rentTypes",rentTypeList);
        try {
            request.getRequestDispatcher("/view/service/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/service/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

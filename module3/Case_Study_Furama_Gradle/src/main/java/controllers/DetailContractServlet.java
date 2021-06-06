package controllers;

import model.bean.contractDetail.AttachService;
import model.bean.contractDetail.ContractDetail;
import model.service.impl.ContractDetailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DetailContractServlet",urlPatterns = "/details")
public class DetailContractServlet extends HttpServlet {
    ContractDetailServiceImpl contractDetailService = new ContractDetailServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createContractDetail(request,response);
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
        }
    }
    //doGet
    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<AttachService> attachServiceList = contractDetailService.fillAllAttachService();
        List<Integer> listIdContract = contractDetailService.fillAllIdContract();
        request.setAttribute("attachLists",attachServiceList);
        request.setAttribute("idLists",listIdContract);
        try {
            request.getRequestDispatcher("/view/contractDetail/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //doPost
    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) {
        boolean check = false;
        int idContract = Integer.parseInt(request.getParameter("idContract"));
        int idAttachService = Integer.parseInt(request.getParameter("idAttachService"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ContractDetail contractDetail = new ContractDetail(idContract,idAttachService,quantity);
        check = contractDetailService.insertIntoContractDetail(contractDetail);
        if (check){
            request.setAttribute("message","Create Success");
        }else {
            request.setAttribute("message","Create Fail");
        }
        try {
            request.getRequestDispatcher("/view/contractDetail/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

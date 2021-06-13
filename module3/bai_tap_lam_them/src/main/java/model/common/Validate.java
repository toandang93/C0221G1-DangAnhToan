package model.common;

import model.bean.Employee;
import model.repository.EmployeeRepository;

public class Validate {
    public static final String EMPLOYEE_CODE = "^(KH-)[0-9]{4}$";
    public static final String NAME = "[a-zA-Z\\s]+";
    public static final String DAY_YYYY_MM_DD = "^(19[0-9]{2}|20[0-9]{2})-[01][0-9]-[0123][0-9]$";
    static EmployeeRepository employeeRepository = new EmployeeRepository();

    public static String checkEmployeeCode(String code){
        boolean check = code.matches(EMPLOYEE_CODE);
        String checkCode = "";
        if ("".equals(code)){
            checkCode = "Please input employe code";
        }else if (!check){
            checkCode = "Employee Code is form NV-XXX (X is number from 0-9)";
        }
        Employee checkNull = employeeRepository.findByCode(code);
        if (checkNull!= null){
            checkCode = "Employee code is already exist";
        }
        return checkCode;
    }
    public static String checkName(String name){
        boolean check = name.matches(NAME);
        String checkName = "";
        if ("".equals(name)){
            checkName = "Please input name";
        }else if (!check){
            checkName = "name invalid";
        }
        return checkName;
    }
    public static String checkDate(String date){
        boolean check = date.matches(DAY_YYYY_MM_DD);
        String checkDate = "";
        if ("".equals(date)){
            checkDate = "Please input date";
        }else if (!check){
            checkDate = "date and time format in the format DD / MM / YYYY";
        }
        return checkDate;
    }
}

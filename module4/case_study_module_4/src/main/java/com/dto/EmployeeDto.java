package com.dto;

import com.model.entity.employee.Division;
import com.model.entity.employee.Education;
import com.model.entity.employee.Position;
import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class EmployeeDto implements Validator {
    private Long id;
    @NotBlank
    private String employeeName;
    @NotBlank
    private String employeeBirthday;
    @NotBlank
    private String employeeIdCard;
    @NotBlank
    private String employeeSalary;
    @NotBlank
    private String employeePhone;
    @Email
    private String employeeEmail;
    private String employeeAddress;
    @NotBlank
    private String username;
    private Position position;
    private Division division;
    private Education education;
    private boolean flag = true;

    public EmployeeDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        EmployeeDto employeeDto = (EmployeeDto) target;

        if (!employeeDto.getEmployeePhone().matches("^(090|091)[0-9]{7}$")) {
            errors.rejectValue("employeePhone", "employee.validPhone", "Employee phone format 091xxxxxxx or 090xxxxxxx");
        }
        if (!employeeDto.getEmployeeIdCard().matches("^[0-9]{9,10}$")) {
            errors.rejectValue("employeeIdCard", "employee.validIdCard", "Employee id card format XXXXXXXXX or XXXXXXXXXXXX ");
        }
        if (!employeeDto.getEmployeeSalary().matches("^[0-9]+$")) {
            errors.rejectValue("employeeSalary", "employee.validSalary", "Employee salary format number");
        } else if (Integer.parseInt(employeeDto.getEmployeeSalary()) < 0) {
            errors.rejectValue("employeeSalary", "employee.validSalary", "Employee salary great 0");
        }
    }
}

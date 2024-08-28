package com.example.employeemanagement.employee_management.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.employee_management.Model.Employee;
import com.example.employeemanagement.employee_management.Service.EmpService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class EmpController {
  

    //Dependency Injection
    @Autowired
    EmpService empService;
   
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return empService.readEmployee();
    }
    
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        return empService.createEmployee(employee);
        
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(empService.deleteEmployee(id))
            return "Deleted Successfully";
        else return "Not Found";
    }
    
    @PutMapping("employees/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        
        if(empService.updateEmployee(id, employee))
            return "Updated Successfully";
        else return "Not Found";
    }
}

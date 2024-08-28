package com.example.employeemanagement.employee_management.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

import com.example.employeemanagement.employee_management.Entity.EmployeeEntity;
import com.example.employeemanagement.employee_management.Model.Employee;
import com.example.employeemanagement.employee_management.Repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService {
   
   @Autowired
    EmployeeRepository employeeRepository;

   // List<Employee> employees = new ArrayList<>();

   @Override
    public String createEmployee(Employee employee) {
      EmployeeEntity employeeEnitity = new EmployeeEntity();
      BeanUtils.copyProperties(employee, employeeEnitity);
      
      employeeRepository.save(employeeEnitity);
      //employees.add(employee);
      return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployee() {
      List<EmployeeEntity> employeesList = employeeRepository.findAll();
      List<Employee> employees = new ArrayList<>();

      for (EmployeeEntity employeeEntity : employeesList) {
         Employee emp = new Employee();
         // employees.add(employeeEntity);
         emp.setName(employeeEntity.getName());
         emp.setEmail(employeeEntity.getEmail());
         emp.setPhone(employeeEntity.getPhone());
         emp.setId(employeeEntity.getId());

         employees.add(emp);
      }
      return employees;
    }
    
    @Override
    public boolean deleteEmployee(Long id) {
      EmployeeEntity emp = employeeRepository.findById(id).get();
      employeeRepository.delete(emp);
       return true;
     }

    @Override
    public boolean updateEmployee(Long id, Employee employee) {
      EmployeeEntity existngEmployee = employeeRepository.findById(id).get();

      existngEmployee.setEmail(employee.getEmail());
      existngEmployee.setName(employee.getName());
      existngEmployee.setPhone(employee.getPhone());
      
      employeeRepository.save(existngEmployee); 

      return true;
    } 
}
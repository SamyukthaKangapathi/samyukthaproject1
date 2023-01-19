package com.employee.springboot.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class EmsService {

private List<Employee> employees= new ArrayList<>(Arrays.asList(new Employee("raju","109","hr","7685940327","raju@gmail.com","chennai")));	

          /////Return EmployeeList
         public List<Employee> getEmpList()
         {
        	 return employees;
         }
}





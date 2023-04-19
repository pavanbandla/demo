package com.datastreams.basicApplication.Controller;
import com.datastreams.basicApplication.Entity.Employee;
import com.datastreams.basicApplication.Service.ServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("employee")
public class EmployeeData {
    @Autowired
    private ServiceInterface serviceInterface;


    @PostMapping
    public Employee saveEmployee( @RequestBody Employee employee){
        return serviceInterface.saveEmployee(employee);
    }
    @GetMapping()
    public List<Employee> fetchData(){
        log.info("we are in controller, fetchData method");
        return serviceInterface.fetchEmployee();

    }
}

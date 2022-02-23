package com.obed.springrestapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/employees",method = RequestMethod.GET)
    public String getEmployees() {
        return "List of employees";
    }

    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Fetching employee details for the " + id;
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id) {
        return "Deleting the employee details for employee with id " + id;
    }

}

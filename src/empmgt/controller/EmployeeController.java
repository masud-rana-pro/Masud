/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empmgt.controller;
import empmgt.model.Employee;
import empmgt.service.EmployeeService;

/**
 *
 * @author Masud Rana
 */
public class EmployeeController {
    public Employee create (Employee e){
        EmployeeService es = new EmployeeService();
        Employee emp = es.create(e);
        return emp;
    }
}

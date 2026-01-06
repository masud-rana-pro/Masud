/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06.calasstask;

import java.util.Map;

/**
 *
 * @author Masud Rana
 */
public class Main {
    public static void main(String[] args) {
        EmployeeChild epployee = new EmployeeChild();
        
        Map<Integer, Employee> m = epployee.showMap();
        
        m.forEach((id, emp) -> {
            System.out.println(
                "ID: " + id +
                ", Name: " + emp.getName() +
                ", Salary: " + emp.getSalary() +
                ", Age: " + emp.getAge()
            );
        });
    }
}

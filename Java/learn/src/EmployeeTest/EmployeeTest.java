package EmployeeTest;
import java.time.*;

class Employee{
    private static int nextId = 1000;
    private final int id;
    final private String name;
    private double salary;
    final private LocalDate hireDay;

    //constructor
    public Employee(String name, double s, int year, int month, int day){
        id = nextId;
        nextId++;
        this.name = name; //if the name is same we use this. to meaning the variable in this object
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100; //the amount of salary add to employee's salary
        salary += raise;
    }
}

public class EmployeeTest {

    public static void main(String[] args){
        //create 3 new staff objects with an array
        Employee[] staffs = new Employee[3];
        staffs[0]= new Employee("Carl",24000,2024,6,1);
        staffs[1] = new Employee("Tom", 22000, 2021, 4,20);
        staffs[2] = new Employee("Tommy", 21000, 2023, 6,10);

        //print out all Employees before raise salary
        for(Employee e:staffs){
            System.out.println("id: " + e.getId() + " name: " + e.getName() +" salary: " + e.getSalary());
        }
        System.out.println(" ");
        for(Employee e:staffs){
            e.raiseSalary(5);
        }

        //print out all Employees after raise salary
        for(Employee e:staffs){
            System.out.println("name: " + e.getName() +" salary: " + e.getSalary());
        }
    }
}

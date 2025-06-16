package StaticTest;

class Employee
{
    //static variable
    private static int nextID = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s){
        name = n;
        salary = s;
        id = advanceId();
    }

    public static int advanceId(){
        int temp = nextID; //obtain next available id
        nextID++;
        return temp;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public static void main(String[] args) { //unit test
        var e = new Employee("Harry",50000);
        System.out.println(e.getName()+ " " + e.getSalary());
    }

}

public class StaticTest {
}

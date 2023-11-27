package Lessons;

public class Employee {
    int id;
    String name;
    int age;
    int salary;

    public Employee(int i, String ivanov, int i1, int i2) {
    id=i;
    name=ivanov;
    age=i1;
    salary=i2;
    }

    int nadva(){
        salary *=2;
        return salary;
    }
}

class emptest{
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Ivanov", 33, 100);
        emp1.nadva();
    }
}
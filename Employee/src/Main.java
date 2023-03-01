import java.util.Scanner;
public class Main {

    public void main(String[] args) {
        Employee[] employees = new Employee[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            String Id = input.next();
            String Name = input.next();
            int Age = input.nextInt();
            char Gender = input.next().charAt(0);
            float Salary = input.nextFloat();
            employees[i] = new Employee(Id, Name, Age, Gender, Salary);
        }

        //System.out.println(employees.equals());
    }
}



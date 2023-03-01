import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Employee {
    private String Id;
    private String Name;
    private int Age;
    private char Gender;
    private float Salary;

    Employee() {
    }

    Employee(String Id, String Name, int Age, char Gender, float salary) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Salary = Salary;

    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public char getGender() {
        return Gender;
    }

    public float getSalary() {
        return Salary;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public String toString(String Id, String Name, int Age, char Gender, float Salary) {
        return (Id + "" + Name + "" + Age + "" + Gender + "" + Salary);
    }



    public boolean equals(Employee e) {
        if (e.getId().equals(this.getId())
                && e.getName().equals(this.getName())
                && e.getAge() == this.getAge()
                && e.getSalary() == this.getSalary()
                && e.getGender() == this.getGender()) {
            return true;
        }
        else
            return false;
 }



}

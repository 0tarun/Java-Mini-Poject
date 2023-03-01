import java.util.*;

public class Main {
    public static void main(String[] args) {
       Car car=new Car("wwwwx5","toyta",2053);

        System.out.println(car.getmodel() +" "+car.getcompany()+ " "+car.getyear());
        car.setmodel("tarun");
        System.out.println(car.getmodel());
        System.out.println(car.getcompany());
        System.out.println(car.getyear());
        car.colar();

    }
}
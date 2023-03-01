import java.util.Scanner;
class IceCreams {
    static IceCream[] icecreams = new IceCream[3];
public static void searchbycompany(String company){
for(int i=0;i<icecreams.length;i++){

    if(icecreams[i].getIcecreasmcompany().equals(company)){

        System.out.println(icecreams[i].getIcecreasmprice());
    }
}

}


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);


        for (int i = 0; i < icecreams.length; i++) {
            System.out.println("Ice cream");
            String type = input.next();
            String company = input.next();
            double price = input.nextDouble();
            icecreams[i] = new IceCream(type, company, price);
        }

       // IceCream i=new IceCream("vanilla","polo",6);
      //  IceCream i1=new IceCream("malaise","arbor",6);
      //  System.out.println(i.equals(i1));

     String company= input.next();
        searchbycompany(company);
    }
}


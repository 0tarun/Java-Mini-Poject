import java.util.Scanner;

public class Main {
    static  Book b[]=new Book[3];
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an input: ");
        char input=sc.next().charAt(0);

        if(input=='a')
        {
            for(int i=0;i<3;i++)
            {
                String bookName=sc.nextLine();
                sc.nextLine();
                int bookPrice= sc.nextInt();

                b[i]= new Book(bookName,bookPrice);
            }

        }
        input=sc.next().charAt(0);

        if(input=='p')
        {
            for(int j=0;j<3;j++)
                b[j].print();
        }


        else if(input=='q')
        {
            System.exit(0);
        }



        else
            System.out.println("Please Choose a valid option");
    }
}
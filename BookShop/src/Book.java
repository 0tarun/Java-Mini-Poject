public class Book {
    String name;
    int price;

    Book(String name,int price){
        this.name=name;
        this.price=price;
    }

    void print(){
        System.out.println("Book Name  : "+name);
        System.out.println("Book Price : "+price);
    }
}

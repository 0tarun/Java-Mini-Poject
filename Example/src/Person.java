public class Person {
  private   String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       name ="allo";
    }

    public String tostring(){
        return this.name+"\n"+this.age+"\n";
    }
}

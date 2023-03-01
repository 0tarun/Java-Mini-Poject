public class Car {

   private String model;
    private String company;
    private int year;


        Car(String model, String company, int year) {
        this.model = model;
        this.company = company;
        this.year = year;
    }


    public String getmodel(){
      return model;
    }
    public String getcompany(){
        return company;
    }
    public int getyear(){
        return year;
    }

    public void setmodel(String model){
    this.model=model;

    }
    public void setcompany(String company){
     this.company=company;

    }
    public void setyear(int year){
     this.year=year;

    }
    void colar(){
        System.out.println(model+"this is red colar");

    }
}

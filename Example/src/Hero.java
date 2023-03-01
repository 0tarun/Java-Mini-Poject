public class Hero extends Person{
    String power;

    Hero(String name,int age,String power){
      super(name,age);
      this.power=power;

    }

    @Override
    public String tostring() {
        return super.tostring()+this.power+"\n";
    }
}

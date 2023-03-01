public class IceCream {
    private String icecreasmtype;
    private String icecreasmcompany;
    private double icecreasmprice;

    public IceCream(String icecreamtype, String icecreasmcompany, double icecreasmprice) {
        this.icecreasmtype =icecreamtype;
        this.icecreasmcompany = icecreasmcompany;
        this.icecreasmprice =icecreasmprice;

    }

    public String getIcecreasmtype() {

        return icecreasmtype;
    }

    public String getIcecreasmcompany() {

        return icecreasmcompany;
    }

    public double getIcecreasmprice() {
        return icecreasmprice;
    }

    public void setIcecreasmtype(String icecreasmtype) {
        this.icecreasmtype = icecreasmtype;
    }

    public void setIcecreasmcompany(String icecreasmcompany) {
        this.icecreasmcompany = icecreasmcompany;

    }
    public void setIcecreasmprice(double icecreasmprice) {
        this.icecreasmprice = icecreasmprice;
    }
    public String toString (){
        return "type==="+icecreasmtype+"  company==="+icecreasmcompany+"   price==="+icecreasmprice+"";
    }


    public boolean equals(IceCream obj) {
       if(obj.getIcecreasmprice()==this.icecreasmprice)
           return true;
       else
           return false;
    }
}

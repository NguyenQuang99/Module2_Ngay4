package PT_bac2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {

    }
    public double getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta () {
        return (this.b *this.b) -4 *this.a*this.c;
    }
    public String getRoot() {
        if(this.delta() < 0) {
            return "Phuong trinh vo nghiem";
        } else if(this.delta() == 0) {
            return "Phuong trinh co nghiem kep x1=x2" +(-this.b)/(2 *this.a);

        } else {
            return "Phuong trinh co 2 nghiem phan biet x1="  +((-this.b -Math.sqrt(delta())) / (2*this.a))
                    + " , x2 =" + ((-this.b +Math.sqrt(delta())) / (2*this.a));
        }
    }
}

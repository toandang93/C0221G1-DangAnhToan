package bai_4_class_object.thuc_hanh_xay_dung_lop_QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2)-4*this.a*this.c;
    }
    public double getRoot1(){
        if(this.getDiscriminant()>=0){
            return (-b + Math.sqrt(this.getDiscriminant()))/(2*a);
        }else {
            return 0;
        }
    }
    public double getRoot2(){
        if(this.getDiscriminant()>=0){
            return (-b - Math.sqrt(this.getDiscriminant()))/(2*a);
        }else {
            return 0;
        }
    }
}

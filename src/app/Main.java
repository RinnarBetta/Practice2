package app;

public class Main {
    private static final double CONV_K=1.60934;
    public static void main(String[] args) {
        System.out.println("Converter App.");
        double miles=7;
        double km = convmilesTokm(miles);
        System.out.println("Resul is " + km + " kilomiters");
    }

    private static double convmilesTokm(double miles){
        return miles*CONV_K;
    }



}
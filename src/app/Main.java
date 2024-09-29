package app;

public class Main {
    private static final double CONV_K=1.60934;
    public static void main(String[] args) {
        System.out.println("Converter App.");
        double miles=7;
        double km = convmilesTokm(miles);
        System.out.println("Resul is " + km + "km");
        double kilomiters=3;
        double mi = convkmTomiles(kilomiters);
        System.out.println("Resul is " + mi + " miles");
    }

    private static double convmilesTokm(double miles){
        return miles*CONV_K;
    }
    private static double convkmTomiles(double kilomiters){
        return kilomiters/CONV_K;
    }


}
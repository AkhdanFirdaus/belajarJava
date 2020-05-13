public class Konversi {
    public static void main(String[] args) {
        int a = 20;
        String konversi1 = String.valueOf(a);
        int konversi2 = Integer.parseInt(konversi1);
        float konversi3 = Float.valueOf(konversi2);
        double konversi4 = Double.valueOf(konversi3);
        String konversi5 = String.valueOf(konversi4);

        System.out.println(konversi5);
    }
}
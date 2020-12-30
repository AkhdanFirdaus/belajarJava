package percabangan.link4;

class ClassifyPerson {
    public static void main(String[] args) {
        int age = 35;
        char gender = 'F';

        if (age > 35) {
            if (gender == 'M') {
                System.out.println("Man");
            } else {
                System.out.println("Woman");
            }
        } else {
            if (gender == 'M') {
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }
        }
    }
}
class GreatestNumber {
    public static void main(String[] args) {
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;

        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n2;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }

        System.out.println("Largest number is " + largestNumber);
    }
}
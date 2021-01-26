public class Operator_Challenge {
    public static void main(String[] args) {

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;

        double calc = (firstVariable + secondVariable) * 100;
        double remainder = calc % 41.00d;

        boolean hasRemainder = (remainder == 0) ? true : false;

        System.out.println(remainder);
        System.out.println(hasRemainder);

        if(!hasRemainder) {
            System.out.println("Got some remainder!");
        }



    }

}

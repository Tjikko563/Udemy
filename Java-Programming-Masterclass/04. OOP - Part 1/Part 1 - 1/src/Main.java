public class Main {
    public static void main(String[] args) {
        /*Car porsche = new Car();
        Car lada = new Car();

        porsche.setModel("Panamera");
        System.out.println(porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());


        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        /*BankAccount davesAccount = new BankAccount(45, 2500.55, "Davie Jones",
                "d.jones@gmail.com", 3155317);
        davesAccount.depositFunds(3600);
        davesAccount.withdrawFunds(999);*/

        /*VipCustomer john = new VipCustomer();
        System.out.println("Customer name: " + john.getCustomerName() + "\n" +
                "Customer credit limit: " + john.getCustomerCreditLimit() + "\n" +
                "Customer email: " + john.getCustomerEmail());

        System.out.println();

        VipCustomer dan = new VipCustomer("Daniel", 2500);
        System.out.println("Customer name: " + dan.getCustomerName() + "\n" +
                "Customer credit limit: " + dan.getCustomerCreditLimit() + "\n" +
                "Customer email: " + dan.getCustomerEmail());

        System.out.println();

        VipCustomer ryan = new VipCustomer("Ryan", 5000, "ryan@ryan.com");
        System.out.println("Customer name: " + ryan.getCustomerName() + "\n" +
                "Customer credit limit: " + ryan.getCustomerCreditLimit() + "\n" +
                "Customer email: " + ryan.getCustomerEmail());*/


        /*Wall wall = new Wall(-2, -2);
        System.out.println("area= " + wall.getArea());

        //wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());*/

        /*Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());*/

        /*Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());*/

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}

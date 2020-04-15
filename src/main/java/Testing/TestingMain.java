package Testing;

import com.kodilla.kodillacalculatortest.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(55, 1);
        if (resultAdd != 56) {
            System.out.println("Error!");
        } else {
            System.out.println("Ok");
        }

        int resultSubstract = calculator.substract(44, 4);
        if (resultSubstract != 40) {
            System.out.println("Error");
        } else {
            System.out.println("Ok");
        }
    }
}

package ATB15xTests_11th_Jan;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        //Write a Java program to convert a double value into an int using explicit type casting and print both values.
        double Digit = 45.67;
        System.out.println("Double Value in Digit is " + Digit);
        double NewDigit = (int)Digit;
        System.out.println("Type casted value is " +NewDigit);
    }
}

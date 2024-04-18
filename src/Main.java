public class Main {
    public static void main(String[] args) {
        float earthWeightCHISALE = 81f;
        float marsWeightCHISALE;

        float MARS_GRAVITY_PERCENTAGE = 0.38f;
        marsWeightCHISALE = earthWeightCHISALE * MARS_GRAVITY_PERCENTAGE;

        System.out.println("81 kgs on Earth is " + marsWeightCHISALE + " kgs on Mars");

        double marsWeightDoubleCHISALE;

        marsWeightDoubleCHISALE = marsWeightCHISALE;

        System.out.println("Kilograms on Mars after converting to double " + marsWeightDoubleCHISALE);

        System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f\n", marsWeightDoubleCHISALE);

        int marsWeightIntCHISALE = (int) marsWeightDoubleCHISALE;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightIntCHISALE);

        char masrWeightInChar = (char) marsWeightIntCHISALE;
        System.out.println("The ASCII table equivalent of masrWeigthInInt is: " + (int) masrWeightInChar);

        char operationChar = 'a';
        int operationResult = masrWeightInChar * 9 + 2;
        System.out.println("An example of a mathematical operation on th char type: " + operationResult);
    }

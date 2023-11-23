// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lab02.hooo();
    }
    static class Lab02{
        static void hooo(){
            AirPurifier af_1 = new AirPurifier("K20");
            AirPurifier af_2 = new AirPurifier("Pro","O90");
            AirPurifier af_3 = new AirPurifier("HaTa" ,"P88");

            System.out.println(AirPurifier.modelCount);

            System.out.println(af_1.model);
            System.out.println(af_3.model);

            af_1.turnOn();

            System.out.println(af_1.power + " " + af_2.power);

            af_1.turnOff();

            System.out.println(af_1.power + " " + af_2.power);

            System.out.println(AirPurifier.mostPopularModel());
        }

    }


}
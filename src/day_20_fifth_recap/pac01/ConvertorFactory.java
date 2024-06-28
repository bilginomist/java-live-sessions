package day_20_fifth_recap.pac01;

public class ConvertorFactory {


    public static void main(String[] args) {

        Convertor convertor1=new Convertor();

        convertor1.convertCelciusToFahrenheit(10);

        convertor1.convertKMtoMPH(16.09344);

        convertor1.convertMPHtoKM(10);

    }
}

package day_20_fifth_recap.pac01;

public class Convertor {

    public  double input;

    public double output;

    public void convertMPHtoKM(double mph){

        input=mph;

        double km=mph*1.609344;

        output=km;

        System.out.println(mph + " MPH = " + km +" KM");


    }

    public void convertKMtoMPH(double km){

        input=km;

        double mph=km/1.609344;

        output=mph;

        System.out.println(km + " KM = " + mph +" MPH");


    }

    public void convertCelciusToFahrenheit(double celcius){

        input=celcius;


        double fahrenheit=celcius*9/5+32;

        output=fahrenheit;

        System.out.println(celcius + " Celcius = " + fahrenheit + " Fahrenheit" );

    }


    public void convertFahrenheitToCelcius(double fahrenheit){

        input=fahrenheit;

        double celcius=(fahrenheit-32)*5/9;

        output=celcius;

        System.out.println(fahrenheit + " Fahrenheit = " + celcius + " Celcius" );

    }



    public void convertTLToDollar(double tl){

        //1 TL = 33 dollar


    }


}

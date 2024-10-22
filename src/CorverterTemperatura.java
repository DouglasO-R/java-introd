public class CorverterTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 9.39;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        int temperaturaEmFahrenheitSemCasasDecimais = (int) temperaturaEmFahrenheit;


        System.out.println("A temperatura em Fahrenheit com casas decimais e: " + temperaturaEmFahrenheit);
        System.out.println("A temperatura em Fahrenheit sem casas decimais e: " + temperaturaEmFahrenheitSemCasasDecimais);

    }
}

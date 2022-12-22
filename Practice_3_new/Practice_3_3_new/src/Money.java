import java.text.NumberFormat;
import java.util.Locale;

public class Money {
    public static void main(String[] args) {
        double number = 123.4567;
//определяем локализацию
        Locale locFR = new Locale("fr");
        Locale locRU = new Locale("ru", "RU");
        Locale locJA = new Locale("ja", "JA");
        Locale.setDefault(Locale.CHINA);
//определяем форматировщик 1
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println("Число в японской локали: " + numberFormat1.format(number*0.43));
//определяем форматировщик 2
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Число в китайской локали: " + numberFormat2.format(number/9));
//определяем форматировщик 3
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));
//определяем форматировщик 4
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number/60));
//определяем форматировщик 5
        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();

//определяем форматировщик 6
        NumberFormat numberFormat6 = NumberFormat.getCurrencyInstance(locRU);
        System.out.println("Число в российской локали: " + numberFormat6.format(number));
    }
}
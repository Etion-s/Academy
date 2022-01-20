package jan20;

import java.text.DecimalFormat;

public class Decimal_Example {
    public static void main(String[] args) {
        double num = 123456.345;

        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(df.format(num));
    }
}

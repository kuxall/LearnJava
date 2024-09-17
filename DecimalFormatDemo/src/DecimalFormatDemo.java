import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args){
        DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");

        double d = 12.3456789;
        System.out.println("Pattern 00.000");
        System.out.println(pattern00dot000.format(d));

        System.out.println("Pattern 0.00");
        System.out.println(pattern0dot00.format(d));

        double e = 25.8;
        System.out.println("Pattern 0.00%");
        System.out.println("$" + pattern00dot000.format(e));

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.println("Pattern 0.00%");
        System.out.println(df.format(0.986));

        DecimalFormat df2 = new DecimalFormat("#0.###E0");
        DecimalFormat df3 = new DecimalFormat("00.###E0");

        System.out.println("Pattern #0.###E0");
        System.out.println(df2.format(123.4567));

        System.out.println("Pattern 00.###E0");
        System.out.println(df3.format(123.4567));
    }
}
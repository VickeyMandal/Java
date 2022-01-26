package Question.Examly;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

public class que1 {

    //20000
    //40000
    //15000
    //25000

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.##");
            // double d = sc.nextDouble();
            // int dd = sc.nextInt();
            // System.out.println(d);
            // double rr = (33/7)*100;
            // rr = Math.round((rr*100.00)/100.00);


            // System.out.println(rr);
            // String s = df.format(d);
            // System.out.println(s);


            double d = 0.2 * 100;
        BigDecimal bd=new BigDecimal(d).setScale(2,RoundingMode.HALF_DOWN);
        System.out.println("Double upto 2 decimal places: "+bd.doubleValue());
            //double f = nextDouble();
            //double dr = 
    }
    
}

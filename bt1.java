package bt1;

import java.text.DecimalFormat;
import java.util.Scanner;
 
public class GPTB1 {

    public static void main(String args[]) 
    {
        int aNumber, bNumber;
        double n;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhap so b: ");
        bNumber = scanner.nextInt();
        System.out.println("PT co dang la: " + aNumber + "x +" + bNumber + "= 0.");
        if (aNumber ==0)
        {
            if (bNumber ==0)
            {
                System.out.println("PT co vo so nghiem roi nha");
            }
            else
            {
                System.out.println("PT nay vo nghiem roi nha");
            }
        }
        else
            {
                    n = (double) - bNumber / aNumber;
                    System.out.println("PT nay co nghiem x = " + decimalFormat.format(n)+ ".");
            }
        }
    }

package bt2;
import java.util.Scanner;
 
public class GPTB2
{
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.printf("a = ");
        float a = scanner.nextFloat();
        System.out.printf("b = ");
        float b = scanner.nextFloat();
        System.out.printf("c = ");
        float c = scanner.nextFloat();
    }
    public static void GPTB2(float a, float b, float c) 
    {
        if (a == 0) 
        {
            if (b == 0) 
            {
                System.out.println("Phương trình VN");
            }
            else 
            {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) 
        {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có hai nghiệm: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) 
        {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        }
        else 
        {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

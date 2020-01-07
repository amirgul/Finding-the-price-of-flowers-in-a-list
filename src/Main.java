import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        String[] flowers = new String[5];
        int index= 0;
        System.out.println("Enter names for 5 flowers");
        for(int i = 0; i<flowers.length; i++)
        {
            System.out.println("Enter name for flower number: " +(i+1));
            flowers[i] = keyboard.nextLine();
        }

        double[] cost = new double[5];
        System.out.println("Enter price for 5 flowers");
        for(int i = 0; i<cost.length; i++)
        {
            System.out.println("Enter cost of each flower number: " + (i+1));
            cost[i] = keyboard.nextDouble();
        }

        System.out.println("Enter name of the flower you want to purchase");
        String name = keyboard.next();
        System.out.println("Enter quantity for that");
        int quantity = keyboard.nextInt();
        for(int i = 0; i<flowers.length; i++)
        {
            if (name.equalsIgnoreCase(flowers[i]))
            {
                 index = i;
            }

        }
        System.out.println("The cost of one flower: " + cost[index]);
        System.out.println("The cost of total with quantity: " + quantity +"cost*quantity: "+ cost[index]*quantity);




    }
}

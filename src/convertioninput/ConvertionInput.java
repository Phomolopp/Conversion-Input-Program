package convertioninput;
import java.util.Scanner;

public class ConvertionInput
{
    public static void main(String[] args) 
    {
            Scanner input = new Scanner(System.in);
            boolean status = true;
            while(status)
            {
                System.out.print("Enter unit you want to convert from (feet/Pounds/Fahrenheit ):");
                String convertFrom = input.nextLine();

                System.out.print("Enter unit you want to convert to :(Meters/Kgs/Celsius ):");
                String convertTo = input.nextLine();


                System.out.print("Enter Quantity to be convert :");
                double Quantity = input.nextDouble();
                input.nextLine();
                System.out.println("\n=================================================================================");
                if(convertFrom.equalsIgnoreCase("feet") && convertTo.equalsIgnoreCase("Meters"))
                {
                    System.out.println("Quantity :["+Quantity+"] \nStatus :Feet to Meters \nAnswer :"+FeetToMeters(Quantity));
                }
                else if(convertFrom.equalsIgnoreCase("pounds") && convertTo.equalsIgnoreCase("Kgs"))
                {
                    System.out.println("Quantity :["+Quantity+"] \nStatus :Pounds to Kgs \nAnswer :"+PoundsToKgs(Quantity));
                }
                else if(convertFrom.equalsIgnoreCase("fahrenheit") && convertTo.equalsIgnoreCase("Celsius"))
                {
                    System.out.println("Quantity :["+Quantity+"] \nStatus :fahrenheit to Celsius \nAnswer :"+FahrenheitToCelsius(Quantity));
                }
                else
                {
                    System.out.println("For now, your program should convert the following:\n" +
                                        "\n" +
                                        "a. From Feet to Meters\n" +
                                        "\n" +
                                        "b. From Pounds to Kgs\n" +
                                        "\n" +
                                        "c. From Fahrenheit to Celsius ");
                }
                System.out.println("=================================================================================\n");
                System.out.println("Restart Program? (Y/N) :");
                String restart = input.nextLine();
                if(restart.equalsIgnoreCase("n"))
                {
                    status = false;
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>THANK YOU<<<<<<<<<<<<<<<<<<<");
            
    }
    public static double FeetToMeters(double Quantity)
    {
        return Quantity*0.305;
    }
    public static double PoundsToKgs(double Quantity)
    {
        return Quantity*0.454;
    }
    public static double FahrenheitToCelsius(double Quantity)
    {
        return (Quantity-32)*(5/9);
    }
}

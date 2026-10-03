import java.util.Scanner;
public class WaterBill1B{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Water consumption in litres:");
        double consumption = sc.nextDouble();
        double bill;
        if(consumption<=500)
        {
            bill=100;
            System.out.println("Water bill="+bill);
        }
        else{
            bill=200;
            System.out.println("Water bill="+bill);
        }
        sc.close();
    }  
   
}
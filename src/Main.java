import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your buying price per share:");
    double buyingPrice=scan.nextDouble();
    double closingPrice=0.1;
    int day=1;

    while(true){
        System.out.println("Enter closing price for day"+day+"(any negative value to leave: )");

        closingPrice=scan.nextDouble();

        if(closingPrice<0.0)break;

        double earnings=closingPrice-buyingPrice;

        if (earnings>0){
            System.out.println("After day "+day+" You earned "+earnings+" per share");
        }
        else if(earnings<0){
            System.out.println("After day "+day+" You lost "+(-earnings)+" per share");
        }
        else{
            System.out.println("After day "+day+" You have no earning per share");
        }
        day+=1;


    }
    scan.close();


    }
}
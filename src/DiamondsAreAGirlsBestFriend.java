import java.util.Scanner;
public class DiamondsAreAGirlsBestFriend {
    private static final Scanner keyboard = new Scanner(System.in);

    //===========================================================================
    public static void main(String[] args) {
//-------Create variables
        String name = "";
        int carats = 0;
        double value, newValue = 0;
        int currentDiamond = 0;
        int newDiamond = 0;

//---Get info from user
        System.out.print("Enter the name of the girl : ");
        CurrentDiamond diamond = new CurrentDiamond() ;
        name = keyboard.next();
        diamond.createGirl(name);
        System.out.println(name + " has no best friend");
        System.out.print("Enter carats and value\t: ");
        carats = keyboard.nextInt();
        value = keyboard.nextDouble();
        diamond.caratsAndItsValue(carats, value);
        diamond.printGirlDiamondInfo();
        newDiamond = carats;

//---Start diamond getting loop
        while(newDiamond > 0 && value > 0){
        if(currentDiamond < newDiamond){
            System.out.println("Woohoo, the girl took the diamond");
            currentDiamond = newDiamond;
        }
        if( currentDiamond > newDiamond){
            System.out.println("Aaargh, the diamond was rejected ");
        }
        System.out.print("Enter carats and value\t: ");
        newDiamond = keyboard.nextInt();
        newValue = keyboard.nextDouble();
        diamond.getMoreExpensiveDiamond(newDiamond, newValue);
            diamond.printGirlDiamondInfo();
        }
    }

}
public class CurrentDiamond <TheType extends Comparable<TheType>> {
    // Scanner keyboard =  new Scanner(System.in);
    private String name = "";
    private TheType carats;
    private TheType value;

    public String createGirl(String girlName) {
//---Store name of the girl
        name = girlName;
        return name;
    }

    public TheType caratsAndItsValue(TheType girlCarats, TheType girlDiamondValue){
       carats = girlCarats;
       value = girlDiamondValue;

        return carats;
    }

   public TheType getMoreExpensiveDiamond(TheType diamondCarats, TheType diamondValue) {
       TheType maxValCarats;
       maxValCarats = carats;
       if (diamondCarats.compareTo(maxValCarats) > 0) {
           carats = diamondCarats;
            value = diamondValue;
       }
       return  carats;
   }

    public void printGirlDiamondInfo( ){
        System.out.println(name + " has a diamond, " + carats + " carats, worth " + value );
    }
    }



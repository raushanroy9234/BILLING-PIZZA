

public class Pizza {
    
    private final int basePrice;
    private final int toppingPrice;
    private final int cheesePrice = 80;
    private final int bagPrice = 20;

    private boolean isVeg = false ;
    private  int total;

    public boolean isCheeseAdded = false;
    public boolean isToppingAdded = false;
    public boolean isTakeAwayAdded = false;

    Pizza(boolean isVeg){

        this.isVeg = isVeg;

        if(isVeg){
            basePrice = 300;
            toppingPrice = 70;
            total = 300;
        }
        else{
            basePrice = 400;
            toppingPrice = 120;
            total = 400;
        }

    }

    public void extraCheese(){
       if(!isCheeseAdded){
         total = total + cheesePrice;
         isCheeseAdded = true;
       }
    }

    public void extraTopping(){
        if(!isToppingAdded){
            total = total + toppingPrice;
            isToppingAdded = true;
        }
    }

    public void TakeAway() {
        if (!isTakeAwayAdded) {
            total = total + bagPrice;
            isTakeAwayAdded = true;
        }
    }

    public String generateBill(){
        String bill =  "Base Price of Pizza ::: "+basePrice+"\n";

        if(isCheeseAdded){
            bill = bill + "Extra cheese Added ::: "+cheesePrice+"\n";
        }
        if(isToppingAdded){
            bill = bill + "Extra topping Added ::: "+toppingPrice+"\n";
        }

        if(isTakeAwayAdded){
            bill = bill + "polybag is Added ::: "+bagPrice+"\n";
        }

        bill = bill + "Total Price ::: "+total;
        return bill;
    }

   

}

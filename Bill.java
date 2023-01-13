

public class Bill {
    
    public static void main(String[] args) {
    

       Pizza p1 = new Pizza(false);
       p1.extraCheese();
       p1.extraTopping();
       p1.TakeAway();
       System.out.println(p1.generateBill());

       System.out.println();
       DeluxPizza p2 = new DeluxPizza(true);
       p2.TakeAway();
       System.out.println(p2.generateBill());
    }
}

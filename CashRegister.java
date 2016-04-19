/**
   A cash register totals up sales and computes change due.
*/
   public class CashRegister
   {
      private double purchase;
      private double payment;
   /**
      Constructs a cash register with no money in it.
   */
      public CashRegister()
      {
         purchase = 0;
         payment = 0;
      }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
      public void recordPurchase(double amount)
      {
         double total = purchase + amount;
         purchase = total;
      }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
      public void enterPayment(double amount)
      {
         payment = amount;
      }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
      public double giveChange()
      {   
         double change = payment - purchase;
         purchase = 0;
         payment = 0;
         return change;
      }

      public void calculateChange() {
         double change = payment - purchase;
         System.out.println("change: ");
         System.out.println(change);
         int poundCoins = 0;
         int fiftyPence = 0;
         int twentyPence = 0;
         int tenPence = 0;
         int fivePence = 0;
         int twoPence = 0;
         int onePence = 0;
         while(change >= 1) {
            change --;
            poundCoins ++;
         }
         while(change >= 0.5){
            change = change - 0.5;
            fiftyPence ++;
         }
         while(change >= 0.2){
            change = change - 0.2;
            twentyPence ++;
         }
         while(change >= 0.1){
            change = change - 0.1;
            tenPence ++;
         }
         while(change >= 0.05){
            change = change - 0.05;
            fivePence ++;
         }
         change = Math.round(100 * change) / 100d;
         while(change >= 0.02){
            change = change - 0.02;
            twoPence ++;
         }
         while(change >= 0.01){
            change = change - 0.01;
            onePence ++;
         }
         System.out.println("Change to be given: ");
         System.out.println("£1 coins: " + poundCoins);
         System.out.println("50p coins: " + fiftyPence);
         System.out.println("20p coins: "+twentyPence);
         System.out.println("10p coins: "+tenPence);
         System.out.println("5p coins: "+fivePence);
         System.out.println("2p coins: "+twoPence);
         System.out.println("1p coins: "+onePence);
      }

   }

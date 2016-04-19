public class test {
  public static void main(String[] args) {
    CashRegister register2 = new CashRegister();
    System.out.println(register2);      
    System.out.println(register2.giveChange());
  } 
}


// public class CashRegisterTest
// {
//    public static void main(String[] args)
//    {
//       CashRegister register = new CashRegister();
//       register.recordPurchase(13.50);
//       register.recordPurchase(2.25);
//       register.enterPayment(20);
//       double change = register.giveChange();
//       System.out.println(change);      
//    }
// }

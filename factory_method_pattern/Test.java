package factory_method_pattern;

import factory_method_pattern.factory.*;
public class Test {
   public static void main(String[] args) {
       Client c1 = new Client(new SMSFactory());
       Client c2 = new Client(new EmailFactory());
       Client c3 = new Client(new PushFactory());
       c1.geNotification().sendMessage("hi");
       c2.geNotification().sendMessage("hi");
       c3.geNotification().sendMessage("hi");
 } 
}

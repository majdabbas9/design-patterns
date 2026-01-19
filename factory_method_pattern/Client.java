package factory_method_pattern;

import factory_method_pattern.factory.NotificationFactory;
import factory_method_pattern.product.Notification;

public class Client {
   private final  Notification notification;
   public Client(NotificationFactory vf){
    this.notification = vf.createNotification();
   }
   public Notification geNotification(){
    return this.notification;
   }
}

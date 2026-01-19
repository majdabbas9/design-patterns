package factory_method_pattern.factory;
import factory_method_pattern.product.*;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }  
}

package factory_method_pattern.product;

public class SMSNotification implements Notification {
    @Override
    public void sendMessage(String msg){
        System.out.println("by sms " + msg);
    }
    
}

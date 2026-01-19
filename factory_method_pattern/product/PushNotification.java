package factory_method_pattern.product; 
public class PushNotification implements Notification {
    @Override
    public void sendMessage(String msg){
        System.out.println("by Push " + msg);
    }
}

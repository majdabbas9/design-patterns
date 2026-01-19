package factory_method_pattern.product; 
public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String msg){
        System.out.println("by Email " +msg);
    }
}

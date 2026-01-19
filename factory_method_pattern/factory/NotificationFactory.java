package factory_method_pattern.factory;

import factory_method_pattern.product.Notification;

public interface  NotificationFactory {
    public Notification createNotification();
}

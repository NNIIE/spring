package hello.core2.order;

public interface OrderService {

    Order createOrder(long memberId, String itemName, int itemPrice);
}

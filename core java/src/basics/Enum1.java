package basics;

import java.util.ArrayList;

enum OrderStatus{ PENDING, CANCELLED, SHIPPED , DELIVERED};

public class Enum1 {
    public static void main(String[] args){
        OrderStatus status = OrderStatus.CANCELLED;
        System.out.println(status.name());

        switch(status){
            case PENDING:
                System.out.println("Order is pending");
                break;
            case CANCELLED:
                System.out.println("OUFF ORDER GET CANCELED");
                break;
            case SHIPPED:
                System.out.println("Congrat order get shipped");
                break;
            default:
                System.out.println("Order is Delevered");
                break;
        }

        System.out.println();
        for(OrderStatus order: OrderStatus.values()){
            System.out.println(order);
            System.out.println(order.name());
            System.out.println(order.ordinal());
            System.out.println();
        }
    }
}

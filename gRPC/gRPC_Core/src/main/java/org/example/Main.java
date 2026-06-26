package org.example;

import com.google.protobuf.InvalidProtocolBufferException;
import org.example.dto.Order;
import org.example.dto.Orders;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) throws InvalidProtocolBufferException {
            byte[] bytes = sender();

            System.out.print("\nBites : ");
            for(byte b : bytes) {
                System.out.print(b);
            }
            System.out.println(" \n");

            receiver(bytes);

        }

        private static void receiver(byte[] bytes) throws InvalidProtocolBufferException {
            Orders orders = Orders.parseFrom(bytes);
            for (Order o :orders.getOrderList()){
                System.out.println("receiver : "+ o);
            }
        }

        private static byte[] sender() {
            Order order = Order.getDefaultInstance();
            Order order1 = Order.newBuilder()
                    .setName("mobile")
                    .setBrand("Samsung")
                    .setPrice("10")
                    .build();

            Orders orders = Orders.newBuilder().addOrder(order).addOrder(order1).build();
            return orders.toByteArray();
        }
}
package org.example.grpc_server.server;

import io.grpc.stub.StreamObserver;
import org.example.grpc_server.dto.*;

import java.util.ArrayList;
import java.util.List;

@net.devh.boot.grpc.server.service.GrpcService
public class GrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    public static final List<Order> orders = new ArrayList<>();
    private static long id = 1;

    @Override
    public void getAllOrders(Empty request, StreamObserver<Orders> responseObserver) {
        Orders ordersResponse = Orders.newBuilder().addAllOrder(orders).build();
        responseObserver.onNext(ordersResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void createOrders(CreateOrderRequest request, StreamObserver<Order> responseObserver) {
        Order order = Order.newBuilder()
                .setId(String.valueOf(id++))
                .setBrand(request.getBrand())
                .setName(request.getName())
                .setPrice(request.getPrice())
                .build();
        orders.add(order);
        responseObserver.onNext(order);
        responseObserver.onCompleted();
    }

    @Override
    public void getOrders(GetOrderRequest request, StreamObserver<Order> responseObserver) {
        Order order = orders.stream()
                .filter(o -> o.getId().equals(request.getId()))
                .findFirst()
                .orElse(null);
        if (order != null) {
            responseObserver.onNext(order);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void serverSideStreamingOrders(Empty request, StreamObserver<Order> responseObserver) {
        for (Order order : orders) {
            responseObserver.onNext(order);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Order> clientSideStreamingOrders(StreamObserver<Empty> responseObserver) {
        return new StreamObserver<Order>() {
            @Override
            public void onNext(Order order) {
                orders.add(order);
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(Empty.newBuilder().build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<CreateOrderRequest> bidirectionalStreamingOrders(StreamObserver<Order> responseObserver) {
        return new StreamObserver<CreateOrderRequest>() {
            @Override
            public void onNext(CreateOrderRequest request) {
                Order order = Order.newBuilder()
                        .setId(String.valueOf(id++))
                        .setBrand(request.getBrand())
                        .setName(request.getName())
                        .setPrice(request.getPrice())
                        .build();
                orders.add(order);
                responseObserver.onNext(order);
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}

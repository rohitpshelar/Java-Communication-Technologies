package org.example.grpc_server.dto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: order.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.GetOrderRequest,
      org.example.grpc_server.dto.Order> getGetOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrders",
      requestType = org.example.grpc_server.dto.GetOrderRequest.class,
      responseType = org.example.grpc_server.dto.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.GetOrderRequest,
      org.example.grpc_server.dto.Order> getGetOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.GetOrderRequest, org.example.grpc_server.dto.Order> getGetOrdersMethod;
    if ((getGetOrdersMethod = OrderServiceGrpc.getGetOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrdersMethod = OrderServiceGrpc.getGetOrdersMethod) == null) {
          OrderServiceGrpc.getGetOrdersMethod = getGetOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.GetOrderRequest, org.example.grpc_server.dto.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("getOrders"))
              .build();
        }
      }
    }
    return getGetOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest,
      org.example.grpc_server.dto.Order> getCreateOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOrders",
      requestType = org.example.grpc_server.dto.CreateOrderRequest.class,
      responseType = org.example.grpc_server.dto.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest,
      org.example.grpc_server.dto.Order> getCreateOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest, org.example.grpc_server.dto.Order> getCreateOrdersMethod;
    if ((getCreateOrdersMethod = OrderServiceGrpc.getCreateOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getCreateOrdersMethod = OrderServiceGrpc.getCreateOrdersMethod) == null) {
          OrderServiceGrpc.getCreateOrdersMethod = getCreateOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.CreateOrderRequest, org.example.grpc_server.dto.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("createOrders"))
              .build();
        }
      }
    }
    return getCreateOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty,
      org.example.grpc_server.dto.Orders> getGetAllOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllOrders",
      requestType = org.example.grpc_server.dto.Empty.class,
      responseType = org.example.grpc_server.dto.Orders.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty,
      org.example.grpc_server.dto.Orders> getGetAllOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty, org.example.grpc_server.dto.Orders> getGetAllOrdersMethod;
    if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetAllOrdersMethod = OrderServiceGrpc.getGetAllOrdersMethod) == null) {
          OrderServiceGrpc.getGetAllOrdersMethod = getGetAllOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.Empty, org.example.grpc_server.dto.Orders>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Orders.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("getAllOrders"))
              .build();
        }
      }
    }
    return getGetAllOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty,
      org.example.grpc_server.dto.Order> getServerSideStreamingOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverSideStreamingOrders",
      requestType = org.example.grpc_server.dto.Empty.class,
      responseType = org.example.grpc_server.dto.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty,
      org.example.grpc_server.dto.Order> getServerSideStreamingOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.Empty, org.example.grpc_server.dto.Order> getServerSideStreamingOrdersMethod;
    if ((getServerSideStreamingOrdersMethod = OrderServiceGrpc.getServerSideStreamingOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getServerSideStreamingOrdersMethod = OrderServiceGrpc.getServerSideStreamingOrdersMethod) == null) {
          OrderServiceGrpc.getServerSideStreamingOrdersMethod = getServerSideStreamingOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.Empty, org.example.grpc_server.dto.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverSideStreamingOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("serverSideStreamingOrders"))
              .build();
        }
      }
    }
    return getServerSideStreamingOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.Order,
      org.example.grpc_server.dto.Empty> getClientSideStreamingOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientSideStreamingOrders",
      requestType = org.example.grpc_server.dto.Order.class,
      responseType = org.example.grpc_server.dto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.Order,
      org.example.grpc_server.dto.Empty> getClientSideStreamingOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.Order, org.example.grpc_server.dto.Empty> getClientSideStreamingOrdersMethod;
    if ((getClientSideStreamingOrdersMethod = OrderServiceGrpc.getClientSideStreamingOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getClientSideStreamingOrdersMethod = OrderServiceGrpc.getClientSideStreamingOrdersMethod) == null) {
          OrderServiceGrpc.getClientSideStreamingOrdersMethod = getClientSideStreamingOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.Order, org.example.grpc_server.dto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientSideStreamingOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Order.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("clientSideStreamingOrders"))
              .build();
        }
      }
    }
    return getClientSideStreamingOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest,
      org.example.grpc_server.dto.Order> getBidirectionalStreamingOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bidirectionalStreamingOrders",
      requestType = org.example.grpc_server.dto.CreateOrderRequest.class,
      responseType = org.example.grpc_server.dto.Order.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest,
      org.example.grpc_server.dto.Order> getBidirectionalStreamingOrdersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc_server.dto.CreateOrderRequest, org.example.grpc_server.dto.Order> getBidirectionalStreamingOrdersMethod;
    if ((getBidirectionalStreamingOrdersMethod = OrderServiceGrpc.getBidirectionalStreamingOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getBidirectionalStreamingOrdersMethod = OrderServiceGrpc.getBidirectionalStreamingOrdersMethod) == null) {
          OrderServiceGrpc.getBidirectionalStreamingOrdersMethod = getBidirectionalStreamingOrdersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc_server.dto.CreateOrderRequest, org.example.grpc_server.dto.Order>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bidirectionalStreamingOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc_server.dto.Order.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("bidirectionalStreamingOrders"))
              .build();
        }
      }
    }
    return getBidirectionalStreamingOrdersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *CRUD Operations
     * </pre>
     */
    public void getOrders(org.example.grpc_server.dto.GetOrderRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrdersMethod(), responseObserver);
    }

    /**
     */
    public void createOrders(org.example.grpc_server.dto.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrdersMethod(), responseObserver);
    }

    /**
     */
    public void getAllOrders(org.example.grpc_server.dto.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Orders> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllOrdersMethod(), responseObserver);
    }

    /**
     * <pre>
     *Stream Operations
     * </pre>
     */
    public void serverSideStreamingOrders(org.example.grpc_server.dto.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerSideStreamingOrdersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> clientSideStreamingOrders(
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Empty> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientSideStreamingOrdersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc_server.dto.CreateOrderRequest> bidirectionalStreamingOrders(
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamingOrdersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc_server.dto.GetOrderRequest,
                org.example.grpc_server.dto.Order>(
                  this, METHODID_GET_ORDERS)))
          .addMethod(
            getCreateOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc_server.dto.CreateOrderRequest,
                org.example.grpc_server.dto.Order>(
                  this, METHODID_CREATE_ORDERS)))
          .addMethod(
            getGetAllOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc_server.dto.Empty,
                org.example.grpc_server.dto.Orders>(
                  this, METHODID_GET_ALL_ORDERS)))
          .addMethod(
            getServerSideStreamingOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.example.grpc_server.dto.Empty,
                org.example.grpc_server.dto.Order>(
                  this, METHODID_SERVER_SIDE_STREAMING_ORDERS)))
          .addMethod(
            getClientSideStreamingOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.example.grpc_server.dto.Order,
                org.example.grpc_server.dto.Empty>(
                  this, METHODID_CLIENT_SIDE_STREAMING_ORDERS)))
          .addMethod(
            getBidirectionalStreamingOrdersMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.example.grpc_server.dto.CreateOrderRequest,
                org.example.grpc_server.dto.Order>(
                  this, METHODID_BIDIRECTIONAL_STREAMING_ORDERS)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD Operations
     * </pre>
     */
    public void getOrders(org.example.grpc_server.dto.GetOrderRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrders(org.example.grpc_server.dto.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllOrders(org.example.grpc_server.dto.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Orders> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Stream Operations
     * </pre>
     */
    public void serverSideStreamingOrders(org.example.grpc_server.dto.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamingOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> clientSideStreamingOrders(
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Empty> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamingOrdersMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.grpc_server.dto.CreateOrderRequest> bidirectionalStreamingOrders(
        io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingOrdersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD Operations
     * </pre>
     */
    public org.example.grpc_server.dto.Order getOrders(org.example.grpc_server.dto.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc_server.dto.Order createOrders(org.example.grpc_server.dto.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc_server.dto.Orders getAllOrders(org.example.grpc_server.dto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllOrdersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Stream Operations
     * </pre>
     */
    public java.util.Iterator<org.example.grpc_server.dto.Order> serverSideStreamingOrders(
        org.example.grpc_server.dto.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerSideStreamingOrdersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD Operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc_server.dto.Order> getOrders(
        org.example.grpc_server.dto.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc_server.dto.Order> createOrders(
        org.example.grpc_server.dto.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc_server.dto.Orders> getAllOrders(
        org.example.grpc_server.dto.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllOrdersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDERS = 0;
  private static final int METHODID_CREATE_ORDERS = 1;
  private static final int METHODID_GET_ALL_ORDERS = 2;
  private static final int METHODID_SERVER_SIDE_STREAMING_ORDERS = 3;
  private static final int METHODID_CLIENT_SIDE_STREAMING_ORDERS = 4;
  private static final int METHODID_BIDIRECTIONAL_STREAMING_ORDERS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDERS:
          serviceImpl.getOrders((org.example.grpc_server.dto.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order>) responseObserver);
          break;
        case METHODID_CREATE_ORDERS:
          serviceImpl.createOrders((org.example.grpc_server.dto.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order>) responseObserver);
          break;
        case METHODID_GET_ALL_ORDERS:
          serviceImpl.getAllOrders((org.example.grpc_server.dto.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Orders>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAMING_ORDERS:
          serviceImpl.serverSideStreamingOrders((org.example.grpc_server.dto.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAMING_ORDERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamingOrders(
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Empty>) responseObserver);
        case METHODID_BIDIRECTIONAL_STREAMING_ORDERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreamingOrders(
              (io.grpc.stub.StreamObserver<org.example.grpc_server.dto.Order>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc_server.dto.OrderOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getGetOrdersMethod())
              .addMethod(getCreateOrdersMethod())
              .addMethod(getGetAllOrdersMethod())
              .addMethod(getServerSideStreamingOrdersMethod())
              .addMethod(getClientSideStreamingOrdersMethod())
              .addMethod(getBidirectionalStreamingOrdersMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package ma.enset.registrationservice.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CarService.proto")
public final class CarGrpcServiceGrpc {

  private CarGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "CarGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> getGetCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCar",
      requestType = ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest.class,
      responseType = ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> getGetCarMethod() {
    io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest, ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> getGetCarMethod;
    if ((getGetCarMethod = CarGrpcServiceGrpc.getGetCarMethod) == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        if ((getGetCarMethod = CarGrpcServiceGrpc.getGetCarMethod) == null) {
          CarGrpcServiceGrpc.getGetCarMethod = getGetCarMethod = 
              io.grpc.MethodDescriptor.<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest, ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarGrpcService", "getCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarGrpcServiceMethodDescriptorSupplier("getCar"))
                  .build();
          }
        }
     }
     return getGetCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> getGetListCarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListCars",
      requestType = ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest.class,
      responseType = ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> getGetListCarsMethod() {
    io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest, ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> getGetListCarsMethod;
    if ((getGetListCarsMethod = CarGrpcServiceGrpc.getGetListCarsMethod) == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        if ((getGetListCarsMethod = CarGrpcServiceGrpc.getGetListCarsMethod) == null) {
          CarGrpcServiceGrpc.getGetListCarsMethod = getGetListCarsMethod = 
              io.grpc.MethodDescriptor.<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest, ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarGrpcService", "getListCars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarGrpcServiceMethodDescriptorSupplier("getListCars"))
                  .build();
          }
        }
     }
     return getGetListCarsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> getSaveCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCar",
      requestType = ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest.class,
      responseType = ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest,
      ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> getSaveCarMethod() {
    io.grpc.MethodDescriptor<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest, ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> getSaveCarMethod;
    if ((getSaveCarMethod = CarGrpcServiceGrpc.getSaveCarMethod) == null) {
      synchronized (CarGrpcServiceGrpc.class) {
        if ((getSaveCarMethod = CarGrpcServiceGrpc.getSaveCarMethod) == null) {
          CarGrpcServiceGrpc.getSaveCarMethod = getSaveCarMethod = 
              io.grpc.MethodDescriptor.<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest, ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CarGrpcService", "saveCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CarGrpcServiceMethodDescriptorSupplier("saveCar"))
                  .build();
          }
        }
     }
     return getSaveCarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new CarGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CarGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CarGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CarGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCar(ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCarMethod(), responseObserver);
    }

    /**
     */
    public void getListCars(ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListCarsMethod(), responseObserver);
    }

    /**
     */
    public void saveCar(ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest,
                ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse>(
                  this, METHODID_GET_CAR)))
          .addMethod(
            getGetListCarsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest,
                ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse>(
                  this, METHODID_GET_LIST_CARS)))
          .addMethod(
            getSaveCarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest,
                ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse>(
                  this, METHODID_SAVE_CAR)))
          .build();
    }
  }

  /**
   */
  public static final class CarGrpcServiceStub extends io.grpc.stub.AbstractStub<CarGrpcServiceStub> {
    private CarGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCar(ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListCars(ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListCarsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCar(ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest request,
        io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<CarGrpcServiceBlockingStub> {
    private CarGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse getCar(ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse getListCars(ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListCarsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse saveCar(ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCarMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<CarGrpcServiceFutureStub> {
    private CarGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CarGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CarGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse> getCar(
        ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse> getListCars(
        ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListCarsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse> saveCar(
        ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAR = 0;
  private static final int METHODID_GET_LIST_CARS = 1;
  private static final int METHODID_SAVE_CAR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAR:
          serviceImpl.getCar((ma.enset.registrationservice.web.grpc.stub.CarService.GetCarRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetCarResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_CARS:
          serviceImpl.getListCars((ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.GetAllCarsResponse>) responseObserver);
          break;
        case METHODID_SAVE_CAR:
          serviceImpl.saveCar((ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.registrationservice.web.grpc.stub.CarService.SaveCarResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.registrationservice.web.grpc.stub.CarService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarGrpcService");
    }
  }

  private static final class CarGrpcServiceFileDescriptorSupplier
      extends CarGrpcServiceBaseDescriptorSupplier {
    CarGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class CarGrpcServiceMethodDescriptorSupplier
      extends CarGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetCarMethod())
              .addMethod(getGetListCarsMethod())
              .addMethod(getSaveCarMethod())
              .build();
        }
      }
    }
    return result;
  }
}

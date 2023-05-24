package ma.enset.radarsimulationapp.stub;

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
    comments = "Source: ViolationService.proto")
public final class ViolationGrpcServiceGrpc {

  private ViolationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ViolationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> getGetViolationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getViolation",
      requestType = ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest.class,
      responseType = ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> getGetViolationMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> getGetViolationMethod;
    if ((getGetViolationMethod = ViolationGrpcServiceGrpc.getGetViolationMethod) == null) {
      synchronized (ViolationGrpcServiceGrpc.class) {
        if ((getGetViolationMethod = ViolationGrpcServiceGrpc.getGetViolationMethod) == null) {
          ViolationGrpcServiceGrpc.getGetViolationMethod = getGetViolationMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ViolationGrpcService", "getViolation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ViolationGrpcServiceMethodDescriptorSupplier("getViolation"))
                  .build();
          }
        }
     }
     return getGetViolationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> getGetListViolationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListViolations",
      requestType = ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest.class,
      responseType = ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> getGetListViolationsMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest, ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> getGetListViolationsMethod;
    if ((getGetListViolationsMethod = ViolationGrpcServiceGrpc.getGetListViolationsMethod) == null) {
      synchronized (ViolationGrpcServiceGrpc.class) {
        if ((getGetListViolationsMethod = ViolationGrpcServiceGrpc.getGetListViolationsMethod) == null) {
          ViolationGrpcServiceGrpc.getGetListViolationsMethod = getGetListViolationsMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest, ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ViolationGrpcService", "getListViolations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ViolationGrpcServiceMethodDescriptorSupplier("getListViolations"))
                  .build();
          }
        }
     }
     return getGetListViolationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> getSaveViolationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveViolation",
      requestType = ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest.class,
      responseType = ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> getSaveViolationMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> getSaveViolationMethod;
    if ((getSaveViolationMethod = ViolationGrpcServiceGrpc.getSaveViolationMethod) == null) {
      synchronized (ViolationGrpcServiceGrpc.class) {
        if ((getSaveViolationMethod = ViolationGrpcServiceGrpc.getSaveViolationMethod) == null) {
          ViolationGrpcServiceGrpc.getSaveViolationMethod = getSaveViolationMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ViolationGrpcService", "saveViolation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ViolationGrpcServiceMethodDescriptorSupplier("saveViolation"))
                  .build();
          }
        }
     }
     return getSaveViolationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> getGenerateViolationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateViolation",
      requestType = ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest.class,
      responseType = ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest,
      ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> getGenerateViolationMethod() {
    io.grpc.MethodDescriptor<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> getGenerateViolationMethod;
    if ((getGenerateViolationMethod = ViolationGrpcServiceGrpc.getGenerateViolationMethod) == null) {
      synchronized (ViolationGrpcServiceGrpc.class) {
        if ((getGenerateViolationMethod = ViolationGrpcServiceGrpc.getGenerateViolationMethod) == null) {
          ViolationGrpcServiceGrpc.getGenerateViolationMethod = getGenerateViolationMethod = 
              io.grpc.MethodDescriptor.<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest, ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ViolationGrpcService", "generateViolation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ViolationGrpcServiceMethodDescriptorSupplier("generateViolation"))
                  .build();
          }
        }
     }
     return getGenerateViolationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ViolationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ViolationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ViolationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ViolationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ViolationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ViolationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ViolationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getViolation(ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetViolationMethod(), responseObserver);
    }

    /**
     */
    public void getListViolations(ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListViolationsMethod(), responseObserver);
    }

    /**
     */
    public void saveViolation(ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveViolationMethod(), responseObserver);
    }

    /**
     */
    public void generateViolation(ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateViolationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetViolationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest,
                ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse>(
                  this, METHODID_GET_VIOLATION)))
          .addMethod(
            getGetListViolationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest,
                ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse>(
                  this, METHODID_GET_LIST_VIOLATIONS)))
          .addMethod(
            getSaveViolationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest,
                ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse>(
                  this, METHODID_SAVE_VIOLATION)))
          .addMethod(
            getGenerateViolationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest,
                ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse>(
                  this, METHODID_GENERATE_VIOLATION)))
          .build();
    }
  }

  /**
   */
  public static final class ViolationGrpcServiceStub extends io.grpc.stub.AbstractStub<ViolationGrpcServiceStub> {
    private ViolationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ViolationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViolationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ViolationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getViolation(ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetViolationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListViolations(ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListViolationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveViolation(ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveViolationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateViolation(ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest request,
        io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateViolationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ViolationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ViolationGrpcServiceBlockingStub> {
    private ViolationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ViolationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViolationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ViolationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse getViolation(ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetViolationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse getListViolations(ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListViolationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse saveViolation(ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveViolationMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse generateViolation(ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateViolationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ViolationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ViolationGrpcServiceFutureStub> {
    private ViolationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ViolationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ViolationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ViolationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse> getViolation(
        ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetViolationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse> getListViolations(
        ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListViolationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse> saveViolation(
        ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveViolationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse> generateViolation(
        ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateViolationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VIOLATION = 0;
  private static final int METHODID_GET_LIST_VIOLATIONS = 1;
  private static final int METHODID_SAVE_VIOLATION = 2;
  private static final int METHODID_GENERATE_VIOLATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ViolationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ViolationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VIOLATION:
          serviceImpl.getViolation((ma.enset.radarsimulationapp.stub.ViolationService.GetViolationRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetViolationResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_VIOLATIONS:
          serviceImpl.getListViolations((ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.GetAllViolationsResponse>) responseObserver);
          break;
        case METHODID_SAVE_VIOLATION:
          serviceImpl.saveViolation((ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.SaveViolationResponse>) responseObserver);
          break;
        case METHODID_GENERATE_VIOLATION:
          serviceImpl.generateViolation((ma.enset.radarsimulationapp.stub.ViolationService.generateViolationRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.radarsimulationapp.stub.ViolationService.generateViolationResponse>) responseObserver);
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

  private static abstract class ViolationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ViolationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.radarsimulationapp.stub.ViolationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ViolationGrpcService");
    }
  }

  private static final class ViolationGrpcServiceFileDescriptorSupplier
      extends ViolationGrpcServiceBaseDescriptorSupplier {
    ViolationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ViolationGrpcServiceMethodDescriptorSupplier
      extends ViolationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ViolationGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ViolationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ViolationGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetViolationMethod())
              .addMethod(getGetListViolationsMethod())
              .addMethod(getSaveViolationMethod())
              .addMethod(getGenerateViolationMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package zermia.proto;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: ProtoRuntime.proto")
public class ZermiaServicesGrpc {

  private ZermiaServicesGrpc() {}

  public static final String SERVICE_NAME = "ZermiaServices";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<zermia.proto.ProtoRuntime.ConnectionRequest,
      zermia.proto.ProtoRuntime.ConnectionReply> METHOD_FIRST_CONNECTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ZermiaServices", "FirstConnection"),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.ConnectionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<zermia.proto.ProtoRuntime.Log,
      zermia.proto.ProtoRuntime.ConnectionReply> METHOD_LOGGING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ZermiaServices", "Logging"),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.Log.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<zermia.proto.ProtoRuntime.StatusQuestion,
      zermia.proto.ProtoRuntime.ConnectionReply> METHOD_SYNC_POINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ZermiaServices", "SyncPoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.StatusQuestion.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(zermia.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZermiaServicesStub newStub(io.grpc.Channel channel) {
    return new ZermiaServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZermiaServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ZermiaServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ZermiaServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ZermiaServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class ZermiaServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void firstConnection(zermia.proto.ProtoRuntime.ConnectionRequest request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIRST_CONNECTION, responseObserver);
    }

    /**
     */
    public void logging(zermia.proto.ProtoRuntime.Log request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGGING, responseObserver);
    }

    /**
     */
    public void syncPoint(zermia.proto.ProtoRuntime.StatusQuestion request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SYNC_POINT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIRST_CONNECTION,
            asyncUnaryCall(
              new MethodHandlers<
                zermia.proto.ProtoRuntime.ConnectionRequest,
                zermia.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_FIRST_CONNECTION)))
          .addMethod(
            METHOD_LOGGING,
            asyncUnaryCall(
              new MethodHandlers<
                zermia.proto.ProtoRuntime.Log,
                zermia.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_LOGGING)))
          .addMethod(
            METHOD_SYNC_POINT,
            asyncUnaryCall(
              new MethodHandlers<
                zermia.proto.ProtoRuntime.StatusQuestion,
                zermia.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_SYNC_POINT)))
          .build();
    }
  }

  /**
   */
  public static final class ZermiaServicesStub extends io.grpc.stub.AbstractStub<ZermiaServicesStub> {
    private ZermiaServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZermiaServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZermiaServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZermiaServicesStub(channel, callOptions);
    }

    /**
     */
    public void firstConnection(zermia.proto.ProtoRuntime.ConnectionRequest request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIRST_CONNECTION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logging(zermia.proto.ProtoRuntime.Log request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGGING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncPoint(zermia.proto.ProtoRuntime.StatusQuestion request,
        io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SYNC_POINT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ZermiaServicesBlockingStub extends io.grpc.stub.AbstractStub<ZermiaServicesBlockingStub> {
    private ZermiaServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZermiaServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZermiaServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZermiaServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public zermia.proto.ProtoRuntime.ConnectionReply firstConnection(zermia.proto.ProtoRuntime.ConnectionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIRST_CONNECTION, getCallOptions(), request);
    }

    /**
     */
    public zermia.proto.ProtoRuntime.ConnectionReply logging(zermia.proto.ProtoRuntime.Log request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGGING, getCallOptions(), request);
    }

    /**
     */
    public zermia.proto.ProtoRuntime.ConnectionReply syncPoint(zermia.proto.ProtoRuntime.StatusQuestion request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SYNC_POINT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ZermiaServicesFutureStub extends io.grpc.stub.AbstractStub<ZermiaServicesFutureStub> {
    private ZermiaServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ZermiaServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZermiaServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ZermiaServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zermia.proto.ProtoRuntime.ConnectionReply> firstConnection(
        zermia.proto.ProtoRuntime.ConnectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIRST_CONNECTION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zermia.proto.ProtoRuntime.ConnectionReply> logging(
        zermia.proto.ProtoRuntime.Log request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGGING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<zermia.proto.ProtoRuntime.ConnectionReply> syncPoint(
        zermia.proto.ProtoRuntime.StatusQuestion request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SYNC_POINT, getCallOptions()), request);
    }
  }

  private static final int METHODID_FIRST_CONNECTION = 0;
  private static final int METHODID_LOGGING = 1;
  private static final int METHODID_SYNC_POINT = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ZermiaServicesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ZermiaServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIRST_CONNECTION:
          serviceImpl.firstConnection((zermia.proto.ProtoRuntime.ConnectionRequest) request,
              (io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply>) responseObserver);
          break;
        case METHODID_LOGGING:
          serviceImpl.logging((zermia.proto.ProtoRuntime.Log) request,
              (io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply>) responseObserver);
          break;
        case METHODID_SYNC_POINT:
          serviceImpl.syncPoint((zermia.proto.ProtoRuntime.StatusQuestion) request,
              (io.grpc.stub.StreamObserver<zermia.proto.ProtoRuntime.ConnectionReply>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_FIRST_CONNECTION,
        METHOD_LOGGING,
        METHOD_SYNC_POINT);
  }

}

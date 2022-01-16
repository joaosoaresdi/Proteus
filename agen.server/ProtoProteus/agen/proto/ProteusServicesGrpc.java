package agen.proto;

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
public class ProteusServicesGrpc {

  private ProteusServicesGrpc() {}

  public static final String SERVICE_NAME = "ProteusServices";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agen.proto.ProtoRuntime.ConnectionRequest,
      agen.proto.ProtoRuntime.ConnectionReply> METHOD_FIRST_CONNECTION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProteusServices", "FirstConnection"),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.ConnectionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agen.proto.ProtoRuntime.Log,
      agen.proto.ProtoRuntime.ConnectionReply> METHOD_LOGGING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProteusServices", "Logging"),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.Log.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<agen.proto.ProtoRuntime.StatusQuestion,
      agen.proto.ProtoRuntime.ConnectionReply> METHOD_SYNC_POINT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "ProteusServices", "SyncPoint"),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.StatusQuestion.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(agen.proto.ProtoRuntime.ConnectionReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProteusServicesStub newStub(io.grpc.Channel channel) {
    return new ProteusServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProteusServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProteusServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ProteusServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProteusServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class ProteusServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void firstConnection(agen.proto.ProtoRuntime.ConnectionRequest request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIRST_CONNECTION, responseObserver);
    }

    /**
     */
    public void logging(agen.proto.ProtoRuntime.Log request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGGING, responseObserver);
    }

    /**
     */
    public void syncPoint(agen.proto.ProtoRuntime.StatusQuestion request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SYNC_POINT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FIRST_CONNECTION,
            asyncUnaryCall(
              new MethodHandlers<
                agen.proto.ProtoRuntime.ConnectionRequest,
                agen.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_FIRST_CONNECTION)))
          .addMethod(
            METHOD_LOGGING,
            asyncUnaryCall(
              new MethodHandlers<
                agen.proto.ProtoRuntime.Log,
                agen.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_LOGGING)))
          .addMethod(
            METHOD_SYNC_POINT,
            asyncUnaryCall(
              new MethodHandlers<
                agen.proto.ProtoRuntime.StatusQuestion,
                agen.proto.ProtoRuntime.ConnectionReply>(
                  this, METHODID_SYNC_POINT)))
          .build();
    }
  }

  /**
   */
  public static final class ProteusServicesStub extends io.grpc.stub.AbstractStub<ProteusServicesStub> {
    private ProteusServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProteusServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProteusServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProteusServicesStub(channel, callOptions);
    }

    /**
     */
    public void firstConnection(agen.proto.ProtoRuntime.ConnectionRequest request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIRST_CONNECTION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logging(agen.proto.ProtoRuntime.Log request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGGING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncPoint(agen.proto.ProtoRuntime.StatusQuestion request,
        io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SYNC_POINT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProteusServicesBlockingStub extends io.grpc.stub.AbstractStub<ProteusServicesBlockingStub> {
    private ProteusServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProteusServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProteusServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProteusServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public agen.proto.ProtoRuntime.ConnectionReply firstConnection(agen.proto.ProtoRuntime.ConnectionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIRST_CONNECTION, getCallOptions(), request);
    }

    /**
     */
    public agen.proto.ProtoRuntime.ConnectionReply logging(agen.proto.ProtoRuntime.Log request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGGING, getCallOptions(), request);
    }

    /**
     */
    public agen.proto.ProtoRuntime.ConnectionReply syncPoint(agen.proto.ProtoRuntime.StatusQuestion request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SYNC_POINT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProteusServicesFutureStub extends io.grpc.stub.AbstractStub<ProteusServicesFutureStub> {
    private ProteusServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProteusServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProteusServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProteusServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agen.proto.ProtoRuntime.ConnectionReply> firstConnection(
        agen.proto.ProtoRuntime.ConnectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIRST_CONNECTION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agen.proto.ProtoRuntime.ConnectionReply> logging(
        agen.proto.ProtoRuntime.Log request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGGING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<agen.proto.ProtoRuntime.ConnectionReply> syncPoint(
        agen.proto.ProtoRuntime.StatusQuestion request) {
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
    private final ProteusServicesImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ProteusServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIRST_CONNECTION:
          serviceImpl.firstConnection((agen.proto.ProtoRuntime.ConnectionRequest) request,
              (io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply>) responseObserver);
          break;
        case METHODID_LOGGING:
          serviceImpl.logging((agen.proto.ProtoRuntime.Log) request,
              (io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply>) responseObserver);
          break;
        case METHODID_SYNC_POINT:
          serviceImpl.syncPoint((agen.proto.ProtoRuntime.StatusQuestion) request,
              (io.grpc.stub.StreamObserver<agen.proto.ProtoRuntime.ConnectionReply>) responseObserver);
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

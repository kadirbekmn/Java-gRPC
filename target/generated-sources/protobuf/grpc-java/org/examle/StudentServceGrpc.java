package org.examle;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Order.proto")
public final class StudentServceGrpc {

  private StudentServceGrpc() {}

  public static final String SERVICE_NAME = "StudentServce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = org.examle.StudentRequest.class,
      responseType = org.examle.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getGetStudentMethod() {
    io.grpc.MethodDescriptor<org.examle.StudentRequest, org.examle.StudentResponse> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServceGrpc.class) {
        if ((getGetStudentMethod = StudentServceGrpc.getGetStudentMethod) == null) {
          StudentServceGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<org.examle.StudentRequest, org.examle.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServceMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getServerSideStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerSideStreaming",
      requestType = org.examle.StudentRequest.class,
      responseType = org.examle.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getServerSideStreamingMethod() {
    io.grpc.MethodDescriptor<org.examle.StudentRequest, org.examle.StudentResponse> getServerSideStreamingMethod;
    if ((getServerSideStreamingMethod = StudentServceGrpc.getServerSideStreamingMethod) == null) {
      synchronized (StudentServceGrpc.class) {
        if ((getServerSideStreamingMethod = StudentServceGrpc.getServerSideStreamingMethod) == null) {
          StudentServceGrpc.getServerSideStreamingMethod = getServerSideStreamingMethod =
              io.grpc.MethodDescriptor.<org.examle.StudentRequest, org.examle.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerSideStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServceMethodDescriptorSupplier("ServerSideStreaming"))
              .build();
        }
      }
    }
    return getServerSideStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getClientSideStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientSideStreaming",
      requestType = org.examle.StudentRequest.class,
      responseType = org.examle.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getClientSideStreamingMethod() {
    io.grpc.MethodDescriptor<org.examle.StudentRequest, org.examle.StudentResponse> getClientSideStreamingMethod;
    if ((getClientSideStreamingMethod = StudentServceGrpc.getClientSideStreamingMethod) == null) {
      synchronized (StudentServceGrpc.class) {
        if ((getClientSideStreamingMethod = StudentServceGrpc.getClientSideStreamingMethod) == null) {
          StudentServceGrpc.getClientSideStreamingMethod = getClientSideStreamingMethod =
              io.grpc.MethodDescriptor.<org.examle.StudentRequest, org.examle.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientSideStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServceMethodDescriptorSupplier("ClientSideStreaming"))
              .build();
        }
      }
    }
    return getClientSideStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiDirectionalStreaming",
      requestType = org.examle.StudentRequest.class,
      responseType = org.examle.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.examle.StudentRequest,
      org.examle.StudentResponse> getBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<org.examle.StudentRequest, org.examle.StudentResponse> getBiDirectionalStreamingMethod;
    if ((getBiDirectionalStreamingMethod = StudentServceGrpc.getBiDirectionalStreamingMethod) == null) {
      synchronized (StudentServceGrpc.class) {
        if ((getBiDirectionalStreamingMethod = StudentServceGrpc.getBiDirectionalStreamingMethod) == null) {
          StudentServceGrpc.getBiDirectionalStreamingMethod = getBiDirectionalStreamingMethod =
              io.grpc.MethodDescriptor.<org.examle.StudentRequest, org.examle.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiDirectionalStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.examle.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServceMethodDescriptorSupplier("BiDirectionalStreaming"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServceStub>() {
        @java.lang.Override
        public StudentServceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServceStub(channel, callOptions);
        }
      };
    return StudentServceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServceBlockingStub>() {
        @java.lang.Override
        public StudentServceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServceBlockingStub(channel, callOptions);
        }
      };
    return StudentServceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServceFutureStub>() {
        @java.lang.Override
        public StudentServceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServceFutureStub(channel, callOptions);
        }
      };
    return StudentServceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StudentServceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStudent(org.examle.StudentRequest request,
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    public void serverSideStreaming(org.examle.StudentRequest request,
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerSideStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> clientSideStreaming(
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientSideStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> biDirectionalStreaming(
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBiDirectionalStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStudentMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.examle.StudentRequest,
                org.examle.StudentResponse>(
                  this, METHODID_GET_STUDENT)))
          .addMethod(
            getServerSideStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                org.examle.StudentRequest,
                org.examle.StudentResponse>(
                  this, METHODID_SERVER_SIDE_STREAMING)))
          .addMethod(
            getClientSideStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                org.examle.StudentRequest,
                org.examle.StudentResponse>(
                  this, METHODID_CLIENT_SIDE_STREAMING)))
          .addMethod(
            getBiDirectionalStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                org.examle.StudentRequest,
                org.examle.StudentResponse>(
                  this, METHODID_BI_DIRECTIONAL_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServceStub extends io.grpc.stub.AbstractAsyncStub<StudentServceStub> {
    private StudentServceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServceStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(org.examle.StudentRequest request,
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverSideStreaming(org.examle.StudentRequest request,
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> clientSideStreaming(
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.examle.StudentRequest> biDirectionalStreaming(
        io.grpc.stub.StreamObserver<org.examle.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StudentServceBlockingStub> {
    private StudentServceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.examle.StudentResponse> getStudent(
        org.examle.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.examle.StudentResponse> serverSideStreaming(
        org.examle.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerSideStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServceFutureStub extends io.grpc.stub.AbstractFutureStub<StudentServceFutureStub> {
    private StudentServceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_STUDENT = 0;
  private static final int METHODID_SERVER_SIDE_STREAMING = 1;
  private static final int METHODID_CLIENT_SIDE_STREAMING = 2;
  private static final int METHODID_BI_DIRECTIONAL_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((org.examle.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.examle.StudentResponse>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAMING:
          serviceImpl.serverSideStreaming((org.examle.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.examle.StudentResponse>) responseObserver);
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
        case METHODID_CLIENT_SIDE_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreaming(
              (io.grpc.stub.StreamObserver<org.examle.StudentResponse>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStreaming(
              (io.grpc.stub.StreamObserver<org.examle.StudentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.examle.Order.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentServce");
    }
  }

  private static final class StudentServceFileDescriptorSupplier
      extends StudentServceBaseDescriptorSupplier {
    StudentServceFileDescriptorSupplier() {}
  }

  private static final class StudentServceMethodDescriptorSupplier
      extends StudentServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServceFileDescriptorSupplier())
              .addMethod(getGetStudentMethod())
              .addMethod(getServerSideStreamingMethod())
              .addMethod(getClientSideStreamingMethod())
              .addMethod(getBiDirectionalStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}

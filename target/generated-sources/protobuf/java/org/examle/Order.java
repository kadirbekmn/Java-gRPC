// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package org.examle;

public final class Order {
  private Order() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StudentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Order.proto\"\034\n\016StudentRequest\022\n\n\002id\030\001 " +
      "\001(\005\",\n\017StudentResponse\022\014\n\004name\030\001 \001(\t\022\013\n\003" +
      "age\030\002 \001(\0052\203\002\n\rStudentServce\0223\n\nGetStuden" +
      "t\022\017.StudentRequest\032\020.StudentResponse\"\0000\001" +
      "\022<\n\023ServerSideStreaming\022\017.StudentRequest" +
      "\032\020.StudentResponse\"\0000\001\022<\n\023ClientSideStre" +
      "aming\022\017.StudentRequest\032\020.StudentResponse" +
      "\"\000(\001\022A\n\026BiDirectionalStreaming\022\017.Student" +
      "Request\032\020.StudentResponse\"\000(\0010\001B\016\n\norg.e" +
      "xamleP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

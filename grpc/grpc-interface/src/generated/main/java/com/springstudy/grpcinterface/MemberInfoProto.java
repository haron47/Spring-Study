// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: member-info.proto

// Protobuf Java Version: 3.25.1
package com.springstudy.grpcinterface;

public final class MemberInfoProto {
  private MemberInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemberInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemberInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemberInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemberInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021member-info.proto\"\037\n\021MemberInfoRequest" +
      "\022\n\n\002id\030\001 \001(\003\"]\n\022MemberInfoResponse\022\n\n\002id" +
      "\030\001 \001(\003\022\r\n\005email\030\002 \001(\t\022\026\n\016identification\030" +
      "\003 \001(\t\022\024\n\014phone_number\030\004 \001(\t2K\n\rMemberSer" +
      "vice\022:\n\rGetMemberInfo\022\022.MemberInfoReques" +
      "t\032\023.MemberInfoResponse\"\000B2\n\035com.springst" +
      "udy.grpcinterfaceB\017MemberInfoProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MemberInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MemberInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemberInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_MemberInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MemberInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemberInfoResponse_descriptor,
        new java.lang.String[] { "Id", "Email", "Identification", "PhoneNumber", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

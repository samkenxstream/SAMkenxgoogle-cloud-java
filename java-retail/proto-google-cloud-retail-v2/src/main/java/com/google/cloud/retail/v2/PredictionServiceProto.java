/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/retail/v2/prediction_service.proto

package com.google.cloud.retail.v2;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/retail/v2/prediction_serv"
          + "ice.proto\022\026google.cloud.retail.v2\032\034googl"
          + "e/api/annotations.proto\032\027google/api/clie"
          + "nt.proto\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\'google/clo"
          + "ud/retail/v2/user_event.proto\032\034google/pr"
          + "otobuf/struct.proto\"\264\003\n\016PredictRequest\022\026"
          + "\n\tplacement\030\001 \001(\tB\003\340A\002\022:\n\nuser_event\030\002 \001"
          + "(\0132!.google.cloud.retail.v2.UserEventB\003\340"
          + "A\002\022\021\n\tpage_size\030\003 \001(\005\022\026\n\npage_token\030\004 \001("
          + "\tB\002\030\001\022\016\n\006filter\030\005 \001(\t\022\025\n\rvalidate_only\030\006"
          + " \001(\010\022B\n\006params\030\007 \003(\01322.google.cloud.reta"
          + "il.v2.PredictRequest.ParamsEntry\022B\n\006labe"
          + "ls\030\010 \003(\01322.google.cloud.retail.v2.Predic"
          + "tRequest.LabelsEntry\032E\n\013ParamsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.google.protobu"
          + "f.Value:\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\347\002\n\017PredictResponse\022I"
          + "\n\007results\030\001 \003(\01328.google.cloud.retail.v2"
          + ".PredictResponse.PredictionResult\022\031\n\021att"
          + "ribution_token\030\002 \001(\t\022\023\n\013missing_ids\030\003 \003("
          + "\t\022\025\n\rvalidate_only\030\004 \001(\010\032\301\001\n\020PredictionR"
          + "esult\022\n\n\002id\030\001 \001(\t\022X\n\010metadata\030\002 \003(\0132F.go"
          + "ogle.cloud.retail.v2.PredictResponse.Pre"
          + "dictionResult.MetadataEntry\032G\n\rMetadataE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.googl"
          + "e.protobuf.Value:\0028\0012\341\002\n\021PredictionServi"
          + "ce\022\200\002\n\007Predict\022&.google.cloud.retail.v2."
          + "PredictRequest\032\'.google.cloud.retail.v2."
          + "PredictResponse\"\243\001\202\323\344\223\002\234\001\"F/v2/{placemen"
          + "t=projects/*/locations/*/catalogs/*/plac"
          + "ements/*}:predict:\001*ZO\"J/v2/{placement=p"
          + "rojects/*/locations/*/catalogs/*/serving"
          + "Configs/*}:predict:\001*\032I\312A\025retail.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\301\001\n\032com.google.cloud.re"
          + "tail.v2B\026PredictionServiceProtoP\001Z2cloud"
          + ".google.com/go/retail/apiv2/retailpb;ret"
          + "ailpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail.V2\312"
          + "\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::Cloud"
          + "::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.UserEventProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictRequest_descriptor,
            new java.lang.String[] {
              "Placement",
              "UserEvent",
              "PageSize",
              "PageToken",
              "Filter",
              "ValidateOnly",
              "Params",
              "Labels",
            });
    internal_static_google_cloud_retail_v2_PredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_retail_v2_PredictRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_PredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_PredictRequest_LabelsEntry_descriptor =
        internal_static_google_cloud_retail_v2_PredictRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_PredictRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictResponse_descriptor,
            new java.lang.String[] {
              "Results", "AttributionToken", "MissingIds", "ValidateOnly",
            });
    internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_descriptor =
        internal_static_google_cloud_retail_v2_PredictResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "Metadata",
            });
    internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_MetadataEntry_descriptor =
        internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_PredictResponse_PredictionResult_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.UserEventProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

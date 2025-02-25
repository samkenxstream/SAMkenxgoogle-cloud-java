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
// source: google/cloud/aiplatform/v1/endpoint_service.proto

package com.google.cloud.aiplatform.v1;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListEndpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListEndpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UndeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UndeployModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/endpoint_se"
          + "rvice.proto\022\032google.cloud.aiplatform.v1\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032)goog"
          + "le/cloud/aiplatform/v1/endpoint.proto\032*g"
          + "oogle/cloud/aiplatform/v1/operation.prot"
          + "o\032#google/longrunning/operations.proto\032\033"
          + "google/protobuf/empty.proto\032 google/prot"
          + "obuf/field_mask.proto\"\251\001\n\025CreateEndpoint"
          + "Request\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locatio"
          + "ns.googleapis.com/Location\022;\n\010endpoint\030\002"
          + " \001(\0132$.google.cloud.aiplatform.v1.Endpoi"
          + "ntB\003\340A\002\022\030\n\013endpoint_id\030\004 \001(\tB\003\340A\005\"q\n\037Cre"
          + "ateEndpointOperationMetadata\022N\n\020generic_"
          + "metadata\030\001 \001(\01324.google.cloud.aiplatform"
          + ".v1.GenericOperationMetadata\"N\n\022GetEndpo"
          + "intRequest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplat"
          + "form.googleapis.com/Endpoint\"\335\001\n\024ListEnd"
          + "pointsRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022\023\n\006filt"
          + "er\030\002 \001(\tB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n"
          + "\npage_token\030\004 \001(\tB\003\340A\001\0222\n\tread_mask\030\005 \001("
          + "\0132\032.google.protobuf.FieldMaskB\003\340A\001\022\020\n\010or"
          + "der_by\030\006 \001(\t\"i\n\025ListEndpointsResponse\0227\n"
          + "\tendpoints\030\001 \003(\0132$.google.cloud.aiplatfo"
          + "rm.v1.Endpoint\022\027\n\017next_page_token\030\002 \001(\t\""
          + "\212\001\n\025UpdateEndpointRequest\022;\n\010endpoint\030\001 "
          + "\001(\0132$.google.cloud.aiplatform.v1.Endpoin"
          + "tB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google.pro"
          + "tobuf.FieldMaskB\003\340A\002\"Q\n\025DeleteEndpointRe"
          + "quest\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform."
          + "googleapis.com/Endpoint\"\250\002\n\022DeployModelR"
          + "equest\022<\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"aiplat"
          + "form.googleapis.com/Endpoint\022F\n\016deployed"
          + "_model\030\002 \001(\0132).google.cloud.aiplatform.v"
          + "1.DeployedModelB\003\340A\002\022W\n\rtraffic_split\030\003 "
          + "\003(\0132@.google.cloud.aiplatform.v1.DeployM"
          + "odelRequest.TrafficSplitEntry\0323\n\021Traffic"
          + "SplitEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\002"
          + "8\001\"X\n\023DeployModelResponse\022A\n\016deployed_mo"
          + "del\030\001 \001(\0132).google.cloud.aiplatform.v1.D"
          + "eployedModel\"n\n\034DeployModelOperationMeta"
          + "data\022N\n\020generic_metadata\030\001 \001(\01324.google."
          + "cloud.aiplatform.v1.GenericOperationMeta"
          + "data\"\204\002\n\024UndeployModelRequest\022<\n\010endpoin"
          + "t\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis.c"
          + "om/Endpoint\022\036\n\021deployed_model_id\030\002 \001(\tB\003"
          + "\340A\002\022Y\n\rtraffic_split\030\003 \003(\0132B.google.clou"
          + "d.aiplatform.v1.UndeployModelRequest.Tra"
          + "fficSplitEntry\0323\n\021TrafficSplitEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\"\027\n\025UndeployM"
          + "odelResponse\"p\n\036UndeployModelOperationMe"
          + "tadata\022N\n\020generic_metadata\030\001 \001(\01324.googl"
          + "e.cloud.aiplatform.v1.GenericOperationMe"
          + "tadata2\200\r\n\017EndpointService\022\202\002\n\016CreateEnd"
          + "point\0221.google.cloud.aiplatform.v1.Creat"
          + "eEndpointRequest\032\035.google.longrunning.Op"
          + "eration\"\235\001\202\323\344\223\0029\"-/v1/{parent=projects/*"
          + "/locations/*}/endpoints:\010endpoint\332A\017pare"
          + "nt,endpoint\332A\033parent,endpoint,endpoint_i"
          + "d\312A+\n\010Endpoint\022\037CreateEndpointOperationM"
          + "etadata\022\241\001\n\013GetEndpoint\022..google.cloud.a"
          + "iplatform.v1.GetEndpointRequest\032$.google"
          + ".cloud.aiplatform.v1.Endpoint\"<\202\323\344\223\002/\022-/"
          + "v1/{name=projects/*/locations/*/endpoint"
          + "s/*}\332A\004name\022\264\001\n\rListEndpoints\0220.google.c"
          + "loud.aiplatform.v1.ListEndpointsRequest\032"
          + "1.google.cloud.aiplatform.v1.ListEndpoin"
          + "tsResponse\">\202\323\344\223\002/\022-/v1/{parent=projects"
          + "/*/locations/*}/endpoints\332A\006parent\022\312\001\n\016U"
          + "pdateEndpoint\0221.google.cloud.aiplatform."
          + "v1.UpdateEndpointRequest\032$.google.cloud."
          + "aiplatform.v1.Endpoint\"_\202\323\344\223\002B26/v1/{end"
          + "point.name=projects/*/locations/*/endpoi"
          + "nts/*}:\010endpoint\332A\024endpoint,update_mask\022"
          + "\323\001\n\016DeleteEndpoint\0221.google.cloud.aiplat"
          + "form.v1.DeleteEndpointRequest\032\035.google.l"
          + "ongrunning.Operation\"o\202\323\344\223\002/*-/v1/{name="
          + "projects/*/locations/*/endpoints/*}\332A\004na"
          + "me\312A0\n\025google.protobuf.Empty\022\027DeleteOper"
          + "ationMetadata\022\205\002\n\013DeployModel\022..google.c"
          + "loud.aiplatform.v1.DeployModelRequest\032\035."
          + "google.longrunning.Operation\"\246\001\202\323\344\223\002B\"=/"
          + "v1/{endpoint=projects/*/locations/*/endp"
          + "oints/*}:deployModel:\001*\332A%endpoint,deplo"
          + "yed_model,traffic_split\312A3\n\023DeployModelR"
          + "esponse\022\034DeployModelOperationMetadata\022\222\002"
          + "\n\rUndeployModel\0220.google.cloud.aiplatfor"
          + "m.v1.UndeployModelRequest\032\035.google.longr"
          + "unning.Operation\"\257\001\202\323\344\223\002D\"?/v1/{endpoint"
          + "=projects/*/locations/*/endpoints/*}:und"
          + "eployModel:\001*\332A(endpoint,deployed_model_"
          + "id,traffic_split\312A7\n\025UndeployModelRespon"
          + "se\022\036UndeployModelOperationMetadata\032M\312A\031a"
          + "iplatform.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\322\001\n\036co"
          + "m.google.cloud.aiplatform.v1B\024EndpointSe"
          + "rviceProtoP\001Z>cloud.google.com/go/aiplat"
          + "form/apiv1/aiplatformpb;aiplatformpb\252\002\032G"
          + "oogle.Cloud.AIPlatform.V1\312\002\032Google\\Cloud"
          + "\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatfo"
          + "rm::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Endpoint", "EndpointId",
            });
    internal_static_google_cloud_aiplatform_v1_CreateEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListEndpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListEndpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListEndpointsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask", "OrderBy",
            });
    internal_static_google_cloud_aiplatform_v1_ListEndpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListEndpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListEndpointsResponse_descriptor,
            new java.lang.String[] {
              "Endpoints", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_DeleteEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_DeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1_DeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_DeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_DeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_DeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_aiplatform_v1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModelId", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UndeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_UndeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_UndeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UndeployModelResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UndeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

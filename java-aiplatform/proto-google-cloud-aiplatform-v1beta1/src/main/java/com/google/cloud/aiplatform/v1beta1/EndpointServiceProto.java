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
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/endpoi"
          + "nt_service.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032.google/cloud/aiplatform/v1beta1/en"
          + "dpoint.proto\032/google/cloud/aiplatform/v1"
          + "beta1/operation.proto\032#google/longrunnin"
          + "g/operations.proto\032\033google/protobuf/empt"
          + "y.proto\032 google/protobuf/field_mask.prot"
          + "o\"\256\001\n\025CreateEndpointRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022@\n\010endpoint\030\002 \001(\0132).google.cloud."
          + "aiplatform.v1beta1.EndpointB\003\340A\002\022\030\n\013endp"
          + "oint_id\030\004 \001(\tB\003\340A\005\"v\n\037CreateEndpointOper"
          + "ationMetadata\022S\n\020generic_metadata\030\001 \001(\0132"
          + "9.google.cloud.aiplatform.v1beta1.Generi"
          + "cOperationMetadata\"N\n\022GetEndpointRequest"
          + "\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googl"
          + "eapis.com/Endpoint\"\313\001\n\024ListEndpointsRequ"
          + "est\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.g"
          + "oogleapis.com/Location\022\023\n\006filter\030\002 \001(\tB\003"
          + "\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\npage_toke"
          + "n\030\004 \001(\tB\003\340A\001\0222\n\tread_mask\030\005 \001(\0132\032.google"
          + ".protobuf.FieldMaskB\003\340A\001\"n\n\025ListEndpoint"
          + "sResponse\022<\n\tendpoints\030\001 \003(\0132).google.cl"
          + "oud.aiplatform.v1beta1.Endpoint\022\027\n\017next_"
          + "page_token\030\002 \001(\t\"\217\001\n\025UpdateEndpointReque"
          + "st\022@\n\010endpoint\030\001 \001(\0132).google.cloud.aipl"
          + "atform.v1beta1.EndpointB\003\340A\002\0224\n\013update_m"
          + "ask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340"
          + "A\002\"Q\n\025DeleteEndpointRequest\0228\n\004name\030\001 \001("
          + "\tB*\340A\002\372A$\n\"aiplatform.googleapis.com/End"
          + "point\"\262\002\n\022DeployModelRequest\022<\n\010endpoint"
          + "\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis.co"
          + "m/Endpoint\022K\n\016deployed_model\030\002 \001(\0132..goo"
          + "gle.cloud.aiplatform.v1beta1.DeployedMod"
          + "elB\003\340A\002\022\\\n\rtraffic_split\030\003 \003(\0132E.google."
          + "cloud.aiplatform.v1beta1.DeployModelRequ"
          + "est.TrafficSplitEntry\0323\n\021TrafficSplitEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\"]\n\023De"
          + "ployModelResponse\022F\n\016deployed_model\030\001 \001("
          + "\0132..google.cloud.aiplatform.v1beta1.Depl"
          + "oyedModel\"s\n\034DeployModelOperationMetadat"
          + "a\022S\n\020generic_metadata\030\001 \001(\01329.google.clo"
          + "ud.aiplatform.v1beta1.GenericOperationMe"
          + "tadata\"\211\002\n\024UndeployModelRequest\022<\n\010endpo"
          + "int\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis"
          + ".com/Endpoint\022\036\n\021deployed_model_id\030\002 \001(\t"
          + "B\003\340A\002\022^\n\rtraffic_split\030\003 \003(\0132G.google.cl"
          + "oud.aiplatform.v1beta1.UndeployModelRequ"
          + "est.TrafficSplitEntry\0323\n\021TrafficSplitEnt"
          + "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\"\027\n\025Un"
          + "deployModelResponse\"u\n\036UndeployModelOper"
          + "ationMetadata\022S\n\020generic_metadata\030\001 \001(\0132"
          + "9.google.cloud.aiplatform.v1beta1.Generi"
          + "cOperationMetadata2\325\r\n\017EndpointService\022\214"
          + "\002\n\016CreateEndpoint\0226.google.cloud.aiplatf"
          + "orm.v1beta1.CreateEndpointRequest\032\035.goog"
          + "le.longrunning.Operation\"\242\001\202\323\344\223\002>\"2/v1be"
          + "ta1/{parent=projects/*/locations/*}/endp"
          + "oints:\010endpoint\332A\017parent,endpoint\332A\033pare"
          + "nt,endpoint,endpoint_id\312A+\n\010Endpoint\022\037Cr"
          + "eateEndpointOperationMetadata\022\260\001\n\013GetEnd"
          + "point\0223.google.cloud.aiplatform.v1beta1."
          + "GetEndpointRequest\032).google.cloud.aiplat"
          + "form.v1beta1.Endpoint\"A\202\323\344\223\0024\0222/v1beta1/"
          + "{name=projects/*/locations/*/endpoints/*"
          + "}\332A\004name\022\303\001\n\rListEndpoints\0225.google.clou"
          + "d.aiplatform.v1beta1.ListEndpointsReques"
          + "t\0326.google.cloud.aiplatform.v1beta1.List"
          + "EndpointsResponse\"C\202\323\344\223\0024\0222/v1beta1/{par"
          + "ent=projects/*/locations/*}/endpoints\332A\006"
          + "parent\022\331\001\n\016UpdateEndpoint\0226.google.cloud"
          + ".aiplatform.v1beta1.UpdateEndpointReques"
          + "t\032).google.cloud.aiplatform.v1beta1.Endp"
          + "oint\"d\202\323\344\223\002G2;/v1beta1/{endpoint.name=pr"
          + "ojects/*/locations/*/endpoints/*}:\010endpo"
          + "int\332A\024endpoint,update_mask\022\335\001\n\016DeleteEnd"
          + "point\0226.google.cloud.aiplatform.v1beta1."
          + "DeleteEndpointRequest\032\035.google.longrunni"
          + "ng.Operation\"t\202\323\344\223\0024*2/v1beta1/{name=pro"
          + "jects/*/locations/*/endpoints/*}\332A\004name\312"
          + "A0\n\025google.protobuf.Empty\022\027DeleteOperati"
          + "onMetadata\022\217\002\n\013DeployModel\0223.google.clou"
          + "d.aiplatform.v1beta1.DeployModelRequest\032"
          + "\035.google.longrunning.Operation\"\253\001\202\323\344\223\002G\""
          + "B/v1beta1/{endpoint=projects/*/locations"
          + "/*/endpoints/*}:deployModel:\001*\332A%endpoin"
          + "t,deployed_model,traffic_split\312A3\n\023Deplo"
          + "yModelResponse\022\034DeployModelOperationMeta"
          + "data\022\234\002\n\rUndeployModel\0225.google.cloud.ai"
          + "platform.v1beta1.UndeployModelRequest\032\035."
          + "google.longrunning.Operation\"\264\001\202\323\344\223\002I\"D/"
          + "v1beta1/{endpoint=projects/*/locations/*"
          + "/endpoints/*}:undeployModel:\001*\332A(endpoin"
          + "t,deployed_model_id,traffic_split\312A7\n\025Un"
          + "deployModelResponse\022\036UndeployModelOperat"
          + "ionMetadata\032M\312A\031aiplatform.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\353\001\n#com.google.cloud.aiplatfo"
          + "rm.v1beta1B\024EndpointServiceProtoP\001ZCclou"
          + "d.google.com/go/aiplatform/apiv1beta1/ai"
          + "platformpb;aiplatformpb\252\002\037Google.Cloud.A"
          + "IPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatf"
          + "orm\\V1beta1\352\002\"Google::Cloud::AIPlatform:"
          + ":V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Endpoint", "EndpointId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListEndpointsResponse_descriptor,
            new java.lang.String[] {
              "Endpoints", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModelId", "TrafficSplit",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UndeployModelOperationMetadata_descriptor,
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
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

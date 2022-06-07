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
// source: google/cloud/retail/v2beta/serving_config_service.proto

package com.google.cloud.retail.v2beta;

public final class ServingConfigServiceProto {
  private ServingConfigServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_AddControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RemoveControlRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/retail/v2beta/serving_con"
          + "fig_service.proto\022\032google.cloud.retail.v"
          + "2beta\032\034google/api/annotations.proto\032\027goo"
          + "gle/api/client.proto\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032/google/cloud/retail/v2beta/serving_con"
          + "fig.proto\032\033google/protobuf/empty.proto\032 "
          + "google/protobuf/field_mask.proto\"\273\001\n\032Cre"
          + "ateServingConfigRequest\0225\n\006parent\030\001 \001(\tB"
          + "%\340A\002\372A\037\n\035retail.googleapis.com/Catalog\022F"
          + "\n\016serving_config\030\002 \001(\0132).google.cloud.re"
          + "tail.v2beta.ServingConfigB\003\340A\002\022\036\n\021servin"
          + "g_config_id\030\003 \001(\tB\003\340A\002\"\225\001\n\032UpdateServing"
          + "ConfigRequest\022F\n\016serving_config\030\001 \001(\0132)."
          + "google.cloud.retail.v2beta.ServingConfig"
          + "B\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.prot"
          + "obuf.FieldMask\"W\n\032DeleteServingConfigReq"
          + "uest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#retail.googl"
          + "eapis.com/ServingConfig\"T\n\027GetServingCon"
          + "figRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#retail"
          + ".googleapis.com/ServingConfig\"\203\001\n\031ListSe"
          + "rvingConfigsRequest\0225\n\006parent\030\001 \001(\tB%\340A\002"
          + "\372A\037\n\035retail.googleapis.com/Catalog\022\026\n\tpa"
          + "ge_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003"
          + "\340A\001\"y\n\032ListServingConfigsResponse\022B\n\017ser"
          + "ving_configs\030\001 \003(\0132).google.cloud.retail"
          + ".v2beta.ServingConfig\022\027\n\017next_page_token"
          + "\030\002 \001(\t\"q\n\021AddControlRequest\022C\n\016serving_c"
          + "onfig\030\001 \001(\tB+\340A\002\372A%\n#retail.googleapis.c"
          + "om/ServingConfig\022\027\n\ncontrol_id\030\002 \001(\tB\003\340A"
          + "\002\"t\n\024RemoveControlRequest\022C\n\016serving_con"
          + "fig\030\001 \001(\tB+\340A\002\372A%\n#retail.googleapis.com"
          + "/ServingConfig\022\027\n\ncontrol_id\030\002 \001(\tB\003\340A\0022"
          + "\203\r\n\024ServingConfigService\022\376\001\n\023CreateServi"
          + "ngConfig\0226.google.cloud.retail.v2beta.Cr"
          + "eateServingConfigRequest\032).google.cloud."
          + "retail.v2beta.ServingConfig\"\203\001\202\323\344\223\002S\"A/v"
          + "2beta/{parent=projects/*/locations/*/cat"
          + "alogs/*}/servingConfigs:\016serving_config\332"
          + "A\'parent,serving_config,serving_config_i"
          + "d\022\267\001\n\023DeleteServingConfig\0226.google.cloud"
          + ".retail.v2beta.DeleteServingConfigReques"
          + "t\032\026.google.protobuf.Empty\"P\202\323\344\223\002C*A/v2be"
          + "ta/{name=projects/*/locations/*/catalogs"
          + "/*/servingConfigs/*}\332A\004name\022\200\002\n\023UpdateSe"
          + "rvingConfig\0226.google.cloud.retail.v2beta"
          + ".UpdateServingConfigRequest\032).google.clo"
          + "ud.retail.v2beta.ServingConfig\"\205\001\202\323\344\223\002b2"
          + "P/v2beta/{serving_config.name=projects/*"
          + "/locations/*/catalogs/*/servingConfigs/*"
          + "}:\016serving_config\332A\032serving_config,updat"
          + "e_mask\022\304\001\n\020GetServingConfig\0223.google.clo"
          + "ud.retail.v2beta.GetServingConfigRequest"
          + "\032).google.cloud.retail.v2beta.ServingCon"
          + "fig\"P\202\323\344\223\002C\022A/v2beta/{name=projects/*/lo"
          + "cations/*/catalogs/*/servingConfigs/*}\332A"
          + "\004name\022\327\001\n\022ListServingConfigs\0225.google.cl"
          + "oud.retail.v2beta.ListServingConfigsRequ"
          + "est\0326.google.cloud.retail.v2beta.ListSer"
          + "vingConfigsResponse\"R\202\323\344\223\002C\022A/v2beta/{pa"
          + "rent=projects/*/locations/*/catalogs/*}/"
          + "servingConfigs\332A\006parent\022\332\001\n\nAddControl\022-"
          + ".google.cloud.retail.v2beta.AddControlRe"
          + "quest\032).google.cloud.retail.v2beta.Servi"
          + "ngConfig\"r\202\323\344\223\002[\"V/v2beta/{serving_confi"
          + "g=projects/*/locations/*/catalogs/*/serv"
          + "ingConfigs/*}:addControl:\001*\332A\016serving_co"
          + "nfig\022\343\001\n\rRemoveControl\0220.google.cloud.re"
          + "tail.v2beta.RemoveControlRequest\032).googl"
          + "e.cloud.retail.v2beta.ServingConfig\"u\202\323\344"
          + "\223\002^\"Y/v2beta/{serving_config=projects/*/"
          + "locations/*/catalogs/*/servingConfigs/*}"
          + ":removeControl:\001*\332A\016serving_config\032I\312A\025r"
          + "etail.googleapis.com\322A.https://www.googl"
          + "eapis.com/auth/cloud-platformB\342\001\n\036com.go"
          + "ogle.cloud.retail.v2betaB\031ServingConfigS"
          + "erviceProtoP\001Z@google.golang.org/genprot"
          + "o/googleapis/cloud/retail/v2beta;retail\242"
          + "\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002\032"
          + "Google\\Cloud\\Retail\\V2beta\352\002\035Google::Clo"
          + "ud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ServingConfigProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CreateServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ServingConfig", "ServingConfigId",
            });
    internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_UpdateServingConfigRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_DeleteServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_GetServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ListServingConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ListServingConfigsResponse_descriptor,
            new java.lang.String[] {
              "ServingConfigs", "NextPageToken",
            });
    internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2beta_AddControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_AddControlRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "ControlId",
            });
    internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2beta_RemoveControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RemoveControlRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "ControlId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ServingConfigProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

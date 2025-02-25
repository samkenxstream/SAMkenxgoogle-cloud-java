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
// source: google/cloud/aiplatform/v1beta1/index_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class IndexServiceProto {
  private IndexServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_RecordError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1beta1/index_"
          + "service.proto\022\037google.cloud.aiplatform.v"
          + "1beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032+google/cloud/aiplatform/v1beta1/index"
          + ".proto\032/google/cloud/aiplatform/v1beta1/"
          + "operation.proto\032#google/longrunning/oper"
          + "ations.proto\032\033google/protobuf/empty.prot"
          + "o\032 google/protobuf/field_mask.proto\"\213\001\n\022"
          + "CreateIndexRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372"
          + "A#\n!locations.googleapis.com/Location\022:\n"
          + "\005index\030\002 \001(\0132&.google.cloud.aiplatform.v"
          + "1beta1.IndexB\003\340A\002\"\360\001\n\034CreateIndexOperati"
          + "onMetadata\022S\n\020generic_metadata\030\001 \001(\01329.g"
          + "oogle.cloud.aiplatform.v1beta1.GenericOp"
          + "erationMetadata\022{\n*nearest_neighbor_sear"
          + "ch_operation_metadata\030\002 \001(\0132G.google.clo"
          + "ud.aiplatform.v1beta1.NearestNeighborSea"
          + "rchOperationMetadata\"H\n\017GetIndexRequest\022"
          + "5\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.google"
          + "apis.com/Index\"\265\001\n\022ListIndexesRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googlea"
          + "pis.com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage"
          + "_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022-\n\tread_"
          + "mask\030\005 \001(\0132\032.google.protobuf.FieldMask\"g"
          + "\n\023ListIndexesResponse\0227\n\007indexes\030\001 \003(\0132&"
          + ".google.cloud.aiplatform.v1beta1.Index\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"\201\001\n\022UpdateIndexR"
          + "equest\022:\n\005index\030\001 \001(\0132&.google.cloud.aip"
          + "latform.v1beta1.IndexB\003\340A\002\022/\n\013update_mas"
          + "k\030\002 \001(\0132\032.google.protobuf.FieldMask\"\360\001\n\034"
          + "UpdateIndexOperationMetadata\022S\n\020generic_"
          + "metadata\030\001 \001(\01329.google.cloud.aiplatform"
          + ".v1beta1.GenericOperationMetadata\022{\n*nea"
          + "rest_neighbor_search_operation_metadata\030"
          + "\002 \001(\0132G.google.cloud.aiplatform.v1beta1."
          + "NearestNeighborSearchOperationMetadata\"K"
          + "\n\022DeleteIndexRequest\0225\n\004name\030\001 \001(\tB\'\340A\002\372"
          + "A!\n\037aiplatform.googleapis.com/Index\"\226\001\n\027"
          + "UpsertDatapointsRequest\0226\n\005index\030\001 \001(\tB\'"
          + "\340A\002\372A!\n\037aiplatform.googleapis.com/Index\022"
          + "C\n\ndatapoints\030\002 \003(\0132/.google.cloud.aipla"
          + "tform.v1beta1.IndexDatapoint\"\032\n\030UpsertDa"
          + "tapointsResponse\"h\n\027RemoveDatapointsRequ"
          + "est\0226\n\005index\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.g"
          + "oogleapis.com/Index\022\025\n\rdatapoint_ids\030\002 \003"
          + "(\t\"\032\n\030RemoveDatapointsResponse\"\331\006\n&Neare"
          + "stNeighborSearchOperationMetadata\022\200\001\n\030co"
          + "ntent_validation_stats\030\001 \003(\0132^.google.cl"
          + "oud.aiplatform.v1beta1.NearestNeighborSe"
          + "archOperationMetadata.ContentValidationS"
          + "tats\022\030\n\020data_bytes_count\030\002 \001(\003\032\267\003\n\013Recor"
          + "dError\022w\n\nerror_type\030\001 \001(\0162c.google.clou"
          + "d.aiplatform.v1beta1.NearestNeighborSear"
          + "chOperationMetadata.RecordError.RecordEr"
          + "rorType\022\025\n\rerror_message\030\002 \001(\t\022\026\n\016source"
          + "_gcs_uri\030\003 \001(\t\022\024\n\014embedding_id\030\004 \001(\t\022\022\n\n"
          + "raw_record\030\005 \001(\t\"\325\001\n\017RecordErrorType\022\032\n\026"
          + "ERROR_TYPE_UNSPECIFIED\020\000\022\016\n\nEMPTY_LINE\020\001"
          + "\022\027\n\023INVALID_JSON_SYNTAX\020\002\022\026\n\022INVALID_CSV"
          + "_SYNTAX\020\003\022\027\n\023INVALID_AVRO_SYNTAX\020\004\022\030\n\024IN"
          + "VALID_EMBEDDING_ID\020\005\022\033\n\027EMBEDDING_SIZE_M"
          + "ISMATCH\020\006\022\025\n\021NAMESPACE_MISSING\020\007\032\327\001\n\026Con"
          + "tentValidationStats\022\026\n\016source_gcs_uri\030\001 "
          + "\001(\t\022\032\n\022valid_record_count\030\002 \001(\003\022\034\n\024inval"
          + "id_record_count\030\003 \001(\003\022k\n\016partial_errors\030"
          + "\004 \003(\0132S.google.cloud.aiplatform.v1beta1."
          + "NearestNeighborSearchOperationMetadata.R"
          + "ecordError2\221\014\n\014IndexService\022\331\001\n\013CreateIn"
          + "dex\0223.google.cloud.aiplatform.v1beta1.Cr"
          + "eateIndexRequest\032\035.google.longrunning.Op"
          + "eration\"v\202\323\344\223\0029\"0/v1beta1/{parent=projec"
          + "ts/*/locations/*}/indexes:\005index\332A\014paren"
          + "t,index\312A%\n\005Index\022\034CreateIndexOperationM"
          + "etadata\022\245\001\n\010GetIndex\0220.google.cloud.aipl"
          + "atform.v1beta1.GetIndexRequest\032&.google."
          + "cloud.aiplatform.v1beta1.Index\"?\202\323\344\223\0022\0220"
          + "/v1beta1/{name=projects/*/locations/*/in"
          + "dexes/*}\332A\004name\022\273\001\n\013ListIndexes\0223.google"
          + ".cloud.aiplatform.v1beta1.ListIndexesReq"
          + "uest\0324.google.cloud.aiplatform.v1beta1.L"
          + "istIndexesResponse\"A\202\323\344\223\0022\0220/v1beta1/{pa"
          + "rent=projects/*/locations/*}/indexes\332A\006p"
          + "arent\022\345\001\n\013UpdateIndex\0223.google.cloud.aip"
          + "latform.v1beta1.UpdateIndexRequest\032\035.goo"
          + "gle.longrunning.Operation\"\201\001\202\323\344\223\002?26/v1b"
          + "eta1/{index.name=projects/*/locations/*/"
          + "indexes/*}:\005index\332A\021index,update_mask\312A%"
          + "\n\005Index\022\034UpdateIndexOperationMetadata\022\325\001"
          + "\n\013DeleteIndex\0223.google.cloud.aiplatform."
          + "v1beta1.DeleteIndexRequest\032\035.google.long"
          + "running.Operation\"r\202\323\344\223\0022*0/v1beta1/{nam"
          + "e=projects/*/locations/*/indexes/*}\332A\004na"
          + "me\312A0\n\025google.protobuf.Empty\022\027DeleteOper"
          + "ationMetadata\022\326\001\n\020UpsertDatapoints\0228.goo"
          + "gle.cloud.aiplatform.v1beta1.UpsertDatap"
          + "ointsRequest\0329.google.cloud.aiplatform.v"
          + "1beta1.UpsertDatapointsResponse\"M\202\323\344\223\002G\""
          + "B/v1beta1/{index=projects/*/locations/*/"
          + "indexes/*}:upsertDatapoints:\001*\022\326\001\n\020Remov"
          + "eDatapoints\0228.google.cloud.aiplatform.v1"
          + "beta1.RemoveDatapointsRequest\0329.google.c"
          + "loud.aiplatform.v1beta1.RemoveDatapoints"
          + "Response\"M\202\323\344\223\002G\"B/v1beta1/{index=projec"
          + "ts/*/locations/*/indexes/*}:removeDatapo"
          + "ints:\001*\032M\312A\031aiplatform.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\350\001\n#com.google.cloud.aiplatform.v"
          + "1beta1B\021IndexServiceProtoP\001ZCcloud.googl"
          + "e.com/go/aiplatform/apiv1beta1/aiplatfor"
          + "mpb;aiplatformpb\252\002\037Google.Cloud.AIPlatfo"
          + "rm.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1b"
          + "eta1\352\002\"Google::Cloud::AIPlatform::V1beta"
          + "1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateIndexRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Index",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListIndexesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListIndexesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListIndexesResponse_descriptor,
            new java.lang.String[] {
              "Indexes", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexRequest_descriptor,
            new java.lang.String[] {
              "Index", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "Datapoints",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpsertDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "DatapointIds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RemoveDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_descriptor,
            new java.lang.String[] {
              "ContentValidationStats", "DataBytesCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_RecordError_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_RecordError_descriptor,
            new java.lang.String[] {
              "ErrorType", "ErrorMessage", "SourceGcsUri", "EmbeddingId", "RawRecord",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor,
            new java.lang.String[] {
              "SourceGcsUri", "ValidRecordCount", "InvalidRecordCount", "PartialErrors",
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
    com.google.cloud.aiplatform.v1beta1.IndexProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

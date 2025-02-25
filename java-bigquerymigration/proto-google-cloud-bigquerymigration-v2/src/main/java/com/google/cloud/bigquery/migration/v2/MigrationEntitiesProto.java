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
// source: google/cloud/bigquery/migration/v2/migration_entities.proto

package com.google.cloud.bigquery.migration.v2;

public final class MigrationEntitiesProto {
  private MigrationEntitiesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_TasksEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_TasksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_MigrationTask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_MigrationTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_bigquery_migration_v2_MigrationSubtask_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_migration_v2_MigrationSubtask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/bigquery/migration/v2/mig"
          + "ration_entities.proto\022\"google.cloud.bigq"
          + "uery.migration.v2\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032@g"
          + "oogle/cloud/bigquery/migration/v2/migrat"
          + "ion_error_details.proto\032:google/cloud/bi"
          + "gquery/migration/v2/migration_metrics.pr"
          + "oto\032;google/cloud/bigquery/migration/v2/"
          + "translation_config.proto\032\037google/protobu"
          + "f/timestamp.proto\032\036google/rpc/error_deta"
          + "ils.proto\"\363\004\n\021MigrationWorkflow\022\024\n\004name\030"
          + "\001 \001(\tB\006\340A\003\340A\005\022\024\n\014display_name\030\006 \001(\t\022O\n\005t"
          + "asks\030\002 \003(\0132@.google.cloud.bigquery.migra"
          + "tion.v2.MigrationWorkflow.TasksEntry\022O\n\005"
          + "state\030\003 \001(\0162;.google.cloud.bigquery.migr"
          + "ation.v2.MigrationWorkflow.StateB\003\340A\003\022/\n"
          + "\013create_time\030\004 \001(\0132\032.google.protobuf.Tim"
          + "estamp\0224\n\020last_update_time\030\005 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\032_\n\nTasksEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022@\n\005value\030\002 \001(\01321.google.cloud.bi"
          + "gquery.migration.v2.MigrationTask:\0028\001\"Q\n"
          + "\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n\005DRAFT\020\001"
          + "\022\013\n\007RUNNING\020\002\022\n\n\006PAUSED\020\003\022\r\n\tCOMPLETED\020\004"
          + ":u\352Ar\n2bigquerymigration.googleapis.com/"
          + "MigrationWorkflow\022<projects/{project}/lo"
          + "cations/{location}/workflows/{workflow}\""
          + "\203\004\n\rMigrationTask\022b\n\032translation_config_"
          + "details\030\016 \001(\0132<.google.cloud.bigquery.mi"
          + "gration.v2.TranslationConfigDetailsH\000\022\022\n"
          + "\002id\030\001 \001(\tB\006\340A\003\340A\005\022\014\n\004type\030\002 \001(\t\022K\n\005state"
          + "\030\004 \001(\01627.google.cloud.bigquery.migration"
          + ".v2.MigrationTask.StateB\003\340A\003\0224\n\020processi"
          + "ng_error\030\005 \001(\0132\025.google.rpc.ErrorInfoB\003\340"
          + "A\003\022/\n\013create_time\030\006 \001(\0132\032.google.protobu"
          + "f.Timestamp\0224\n\020last_update_time\030\007 \001(\0132\032."
          + "google.protobuf.Timestamp\"r\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\021\n\rORCHES"
          + "TRATING\020\002\022\013\n\007RUNNING\020\003\022\n\n\006PAUSED\020\004\022\r\n\tSU"
          + "CCEEDED\020\005\022\n\n\006FAILED\020\006B\016\n\014task_details\"\364\005"
          + "\n\020MigrationSubtask\022\024\n\004name\030\001 \001(\tB\006\340A\003\340A\005"
          + "\022\017\n\007task_id\030\002 \001(\t\022\014\n\004type\030\003 \001(\t\022N\n\005state"
          + "\030\005 \001(\0162:.google.cloud.bigquery.migration"
          + ".v2.MigrationSubtask.StateB\003\340A\003\0224\n\020proce"
          + "ssing_error\030\006 \001(\0132\025.google.rpc.ErrorInfo"
          + "B\003\340A\003\022\\\n\026resource_error_details\030\014 \003(\01327."
          + "google.cloud.bigquery.migration.v2.Resou"
          + "rceErrorDetailB\003\340A\003\022\034\n\024resource_error_co"
          + "unt\030\r \001(\005\022/\n\013create_time\030\007 \001(\0132\032.google."
          + "protobuf.Timestamp\0224\n\020last_update_time\030\010"
          + " \001(\0132\032.google.protobuf.Timestamp\022?\n\007metr"
          + "ics\030\013 \003(\0132..google.cloud.bigquery.migrat"
          + "ion.v2.TimeSeries\"v\n\005State\022\025\n\021STATE_UNSP"
          + "ECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSU"
          + "CCEEDED\020\003\022\n\n\006FAILED\020\004\022\n\n\006PAUSED\020\005\022\026\n\022PEN"
          + "DING_DEPENDENCY\020\006:\210\001\352A\204\001\n1bigquerymigrat"
          + "ion.googleapis.com/MigrationSubtask\022Opro"
          + "jects/{project}/locations/{location}/wor"
          + "kflows/{workflow}/subtasks/{subtask}B\322\001\n"
          + "&com.google.cloud.bigquery.migration.v2B"
          + "\026MigrationEntitiesProtoP\001ZDcloud.google."
          + "com/go/bigquery/migration/apiv2/migratio"
          + "npb;migrationpb\252\002\"Google.Cloud.BigQuery."
          + "Migration.V2\312\002\"Google\\Cloud\\BigQuery\\Mig"
          + "ration\\V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2.MigrationErrorDetailsProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2.MigrationMetricsProto.getDescriptor(),
              com.google.cloud.bigquery.migration.v2.TranslationConfigProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.ErrorDetailsProto.getDescriptor(),
            });
    internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Tasks", "State", "CreateTime", "LastUpdateTime",
            });
    internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_TasksEntry_descriptor =
        internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_TasksEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_MigrationWorkflow_TasksEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_bigquery_migration_v2_MigrationTask_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_migration_v2_MigrationTask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_MigrationTask_descriptor,
            new java.lang.String[] {
              "TranslationConfigDetails",
              "Id",
              "Type",
              "State",
              "ProcessingError",
              "CreateTime",
              "LastUpdateTime",
              "TaskDetails",
            });
    internal_static_google_cloud_bigquery_migration_v2_MigrationSubtask_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_migration_v2_MigrationSubtask_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_bigquery_migration_v2_MigrationSubtask_descriptor,
            new java.lang.String[] {
              "Name",
              "TaskId",
              "Type",
              "State",
              "ProcessingError",
              "ResourceErrorDetails",
              "ResourceErrorCount",
              "CreateTime",
              "LastUpdateTime",
              "Metrics",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2.MigrationErrorDetailsProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2.MigrationMetricsProto.getDescriptor();
    com.google.cloud.bigquery.migration.v2.TranslationConfigProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.ErrorDetailsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

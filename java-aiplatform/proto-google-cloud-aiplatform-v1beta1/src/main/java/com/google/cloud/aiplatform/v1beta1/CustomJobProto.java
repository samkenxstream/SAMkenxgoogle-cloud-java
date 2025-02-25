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
// source: google/cloud/aiplatform/v1beta1/custom_job.proto

package com.google.cloud.aiplatform.v1beta1;

public final class CustomJobProto {
  private CustomJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_WebAccessUrisEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJob_WebAccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Scheduling_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1beta1/custom"
          + "_job.proto\022\037google.cloud.aiplatform.v1be"
          + "ta1\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\0325google/cloud/ai"
          + "platform/v1beta1/encryption_spec.proto\032-"
          + "google/cloud/aiplatform/v1beta1/env_var."
          + "proto\032(google/cloud/aiplatform/v1beta1/i"
          + "o.proto\032/google/cloud/aiplatform/v1beta1"
          + "/job_state.proto\0327google/cloud/aiplatfor"
          + "m/v1beta1/machine_resources.proto\032\036googl"
          + "e/protobuf/duration.proto\032\037google/protob"
          + "uf/timestamp.proto\032\027google/rpc/status.pr"
          + "oto\"\372\006\n\tCustomJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014"
          + "display_name\030\002 \001(\tB\003\340A\002\022E\n\010job_spec\030\004 \001("
          + "\0132..google.cloud.aiplatform.v1beta1.Cust"
          + "omJobSpecB\003\340A\002\022=\n\005state\030\005 \001(\0162).google.c"
          + "loud.aiplatform.v1beta1.JobStateB\003\340A\003\0224\n"
          + "\013create_time\030\006 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\0223\n\nstart_time\030\007 \001(\0132\032.google"
          + ".protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013u"
          + "pdate_time\030\t \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022&\n\005error\030\n \001(\0132\022.google.rpc.St"
          + "atusB\003\340A\003\022F\n\006labels\030\013 \003(\01326.google.cloud"
          + ".aiplatform.v1beta1.CustomJob.LabelsEntr"
          + "y\022H\n\017encryption_spec\030\014 \001(\0132/.google.clou"
          + "d.aiplatform.v1beta1.EncryptionSpec\022[\n\017w"
          + "eb_access_uris\030\020 \003(\0132=.google.cloud.aipl"
          + "atform.v1beta1.CustomJob.WebAccessUrisEn"
          + "tryB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\001\0324\n\022WebAccessUrisEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:i\352Af\n#aipl"
          + "atform.googleapis.com/CustomJob\022?project"
          + "s/{project}/locations/{location}/customJ"
          + "obs/{custom_job}\"\356\003\n\rCustomJobSpec\022O\n\021wo"
          + "rker_pool_specs\030\001 \003(\0132/.google.cloud.aip"
          + "latform.v1beta1.WorkerPoolSpecB\003\340A\002\022?\n\ns"
          + "cheduling\030\003 \001(\0132+.google.cloud.aiplatfor"
          + "m.v1beta1.Scheduling\022\027\n\017service_account\030"
          + "\004 \001(\t\0227\n\007network\030\005 \001(\tB&\340A\001\372A \n\036compute."
          + "googleapis.com/Network\022\037\n\022reserved_ip_ra"
          + "nges\030\r \003(\tB\003\340A\001\022N\n\025base_output_directory"
          + "\030\006 \001(\0132/.google.cloud.aiplatform.v1beta1"
          + ".GcsDestination\022B\n\013tensorboard\030\007 \001(\tB-\340A"
          + "\001\372A\'\n%aiplatform.googleapis.com/Tensorbo"
          + "ard\022\036\n\021enable_web_access\030\n \001(\010B\003\340A\001\022$\n\027e"
          + "nable_dashboard_access\030\020 \001(\010B\003\340A\001\"\237\003\n\016Wo"
          + "rkerPoolSpec\022H\n\016container_spec\030\006 \001(\0132..g"
          + "oogle.cloud.aiplatform.v1beta1.Container"
          + "SpecH\000\022Q\n\023python_package_spec\030\007 \001(\01322.go"
          + "ogle.cloud.aiplatform.v1beta1.PythonPack"
          + "ageSpecH\000\022J\n\014machine_spec\030\001 \001(\0132,.google"
          + ".cloud.aiplatform.v1beta1.MachineSpecB\006\340"
          + "A\001\340A\005\022\032\n\rreplica_count\030\002 \001(\003B\003\340A\001\022B\n\nnfs"
          + "_mounts\030\004 \003(\0132).google.cloud.aiplatform."
          + "v1beta1.NfsMountB\003\340A\001\022<\n\tdisk_spec\030\005 \001(\013"
          + "2).google.cloud.aiplatform.v1beta1.DiskS"
          + "pecB\006\n\004task\"|\n\rContainerSpec\022\026\n\timage_ur"
          + "i\030\001 \001(\tB\003\340A\002\022\017\n\007command\030\002 \003(\t\022\014\n\004args\030\003 "
          + "\003(\t\0224\n\003env\030\004 \003(\0132\'.google.cloud.aiplatfo"
          + "rm.v1beta1.EnvVar\"\257\001\n\021PythonPackageSpec\022"
          + "\037\n\022executor_image_uri\030\001 \001(\tB\003\340A\002\022\031\n\014pack"
          + "age_uris\030\002 \003(\tB\003\340A\002\022\032\n\rpython_module\030\003 \001"
          + "(\tB\003\340A\002\022\014\n\004args\030\004 \003(\t\0224\n\003env\030\005 \003(\0132\'.goo"
          + "gle.cloud.aiplatform.v1beta1.EnvVar\"_\n\nS"
          + "cheduling\022*\n\007timeout\030\001 \001(\0132\031.google.prot"
          + "obuf.Duration\022%\n\035restart_job_on_worker_r"
          + "estart\030\003 \001(\010B\345\001\n#com.google.cloud.aiplat"
          + "form.v1beta1B\016CustomJobProtoP\001ZCcloud.go"
          + "ogle.com/go/aiplatform/apiv1beta1/aiplat"
          + "formpb;aiplatformpb\252\002\037Google.Cloud.AIPla"
          + "tform.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\"
          + "V1beta1\352\002\"Google::Cloud::AIPlatform::V1b"
          + "eta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "JobSpec",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
              "WebAccessUris",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CustomJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_WebAccessUrisEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_CustomJob_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJob_WebAccessUrisEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CustomJob_WebAccessUrisEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CustomJobSpec_descriptor,
            new java.lang.String[] {
              "WorkerPoolSpecs",
              "Scheduling",
              "ServiceAccount",
              "Network",
              "ReservedIpRanges",
              "BaseOutputDirectory",
              "Tensorboard",
              "EnableWebAccess",
              "EnableDashboardAccess",
            });
    internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_WorkerPoolSpec_descriptor,
            new java.lang.String[] {
              "ContainerSpec",
              "PythonPackageSpec",
              "MachineSpec",
              "ReplicaCount",
              "NfsMounts",
              "DiskSpec",
              "Task",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri", "Command", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PythonPackageSpec_descriptor,
            new java.lang.String[] {
              "ExecutorImageUri", "PackageUris", "PythonModule", "Args", "Env",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_Scheduling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Scheduling_descriptor,
            new java.lang.String[] {
              "Timeout", "RestartJobOnWorkerRestart",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

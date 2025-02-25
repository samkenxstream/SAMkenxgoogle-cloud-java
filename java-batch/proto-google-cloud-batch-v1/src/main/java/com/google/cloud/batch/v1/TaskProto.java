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
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_ComputeResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_StatusEvent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_StatusEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_TaskExecution_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskExecution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_TaskStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Runnable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Runnable_Container_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Container_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Runnable_Script_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Script_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Runnable_Barrier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_TaskSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_LifecyclePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n google/cloud/batch/v1/task.proto\022\025goog"
          + "le.cloud.batch.v1\032\031google/api/resource.p"
          + "roto\032\"google/cloud/batch/v1/volume.proto"
          + "\032\036google/protobuf/duration.proto\032\037google"
          + "/protobuf/timestamp.proto\"O\n\017ComputeReso"
          + "urce\022\021\n\tcpu_milli\030\001 \001(\003\022\022\n\nmemory_mib\030\002 "
          + "\001(\003\022\025\n\rboot_disk_mib\030\004 \001(\003\"\333\001\n\013StatusEve"
          + "nt\022\014\n\004type\030\003 \001(\t\022\023\n\013description\030\001 \001(\t\022.\n"
          + "\nevent_time\030\002 \001(\0132\032.google.protobuf.Time"
          + "stamp\022<\n\016task_execution\030\004 \001(\0132$.google.c"
          + "loud.batch.v1.TaskExecution\022;\n\ntask_stat"
          + "e\030\005 \001(\0162\'.google.cloud.batch.v1.TaskStat"
          + "us.State\"\"\n\rTaskExecution\022\021\n\texit_code\030\001"
          + " \001(\005\"\342\001\n\nTaskStatus\0226\n\005state\030\001 \001(\0162\'.goo"
          + "gle.cloud.batch.v1.TaskStatus.State\0229\n\rs"
          + "tatus_events\030\002 \003(\0132\".google.cloud.batch."
          + "v1.StatusEvent\"a\n\005State\022\025\n\021STATE_UNSPECI"
          + "FIED\020\000\022\013\n\007PENDING\020\001\022\014\n\010ASSIGNED\020\002\022\013\n\007RUN"
          + "NING\020\003\022\n\n\006FAILED\020\004\022\r\n\tSUCCEEDED\020\005\"\362\004\n\010Ru"
          + "nnable\022>\n\tcontainer\030\001 \001(\0132).google.cloud"
          + ".batch.v1.Runnable.ContainerH\000\0228\n\006script"
          + "\030\002 \001(\0132&.google.cloud.batch.v1.Runnable."
          + "ScriptH\000\022:\n\007barrier\030\006 \001(\0132\'.google.cloud"
          + ".batch.v1.Runnable.BarrierH\000\022\032\n\022ignore_e"
          + "xit_status\030\003 \001(\010\022\022\n\nbackground\030\004 \001(\010\022\022\n\n"
          + "always_run\030\005 \001(\010\0227\n\013environment\030\007 \001(\0132\"."
          + "google.cloud.batch.v1.Environment\022*\n\007tim"
          + "eout\030\010 \001(\0132\031.google.protobuf.Duration\032\252\001"
          + "\n\tContainer\022\021\n\timage_uri\030\001 \001(\t\022\020\n\010comman"
          + "ds\030\002 \003(\t\022\022\n\nentrypoint\030\003 \001(\t\022\017\n\007volumes\030"
          + "\007 \003(\t\022\017\n\007options\030\010 \001(\t\022\036\n\026block_external"
          + "_network\030\t \001(\010\022\020\n\010username\030\n \001(\t\022\020\n\010pass"
          + "word\030\013 \001(\t\0323\n\006Script\022\016\n\004path\030\001 \001(\tH\000\022\016\n\004"
          + "text\030\002 \001(\tH\000B\t\n\007command\032\027\n\007Barrier\022\014\n\004na"
          + "me\030\001 \001(\tB\014\n\nexecutable\"\375\003\n\010TaskSpec\0222\n\tr"
          + "unnables\030\010 \003(\0132\037.google.cloud.batch.v1.R"
          + "unnable\022@\n\020compute_resource\030\003 \001(\0132&.goog"
          + "le.cloud.batch.v1.ComputeResource\0223\n\020max"
          + "_run_duration\030\004 \001(\0132\031.google.protobuf.Du"
          + "ration\022\027\n\017max_retry_count\030\005 \001(\005\022B\n\022lifec"
          + "ycle_policies\030\t \003(\0132&.google.cloud.batch"
          + ".v1.LifecyclePolicy\022K\n\014environments\030\006 \003("
          + "\01321.google.cloud.batch.v1.TaskSpec.Envir"
          + "onmentsEntryB\002\030\001\022.\n\007volumes\030\007 \003(\0132\035.goog"
          + "le.cloud.batch.v1.Volume\0227\n\013environment\030"
          + "\n \001(\0132\".google.cloud.batch.v1.Environmen"
          + "t\0323\n\021EnvironmentsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001\"\212\002\n\017LifecyclePolicy\022=\n\006ac"
          + "tion\030\001 \001(\0162-.google.cloud.batch.v1.Lifec"
          + "yclePolicy.Action\022P\n\020action_condition\030\002 "
          + "\001(\01326.google.cloud.batch.v1.LifecyclePol"
          + "icy.ActionCondition\032%\n\017ActionCondition\022\022"
          + "\n\nexit_codes\030\001 \003(\005\"?\n\006Action\022\026\n\022ACTION_U"
          + "NSPECIFIED\020\000\022\016\n\nRETRY_TASK\020\001\022\r\n\tFAIL_TAS"
          + "K\020\002\"\300\001\n\004Task\022\014\n\004name\030\001 \001(\t\0221\n\006status\030\002 \001"
          + "(\0132!.google.cloud.batch.v1.TaskStatus:w\352"
          + "At\n\031batch.googleapis.com/Task\022Wprojects/"
          + "{project}/locations/{location}/jobs/{job"
          + "}/taskGroups/{task_group}/tasks/{task}\"\217"
          + "\003\n\013Environment\022D\n\tvariables\030\001 \003(\01321.goog"
          + "le.cloud.batch.v1.Environment.VariablesE"
          + "ntry\022Q\n\020secret_variables\030\002 \003(\01327.google."
          + "cloud.batch.v1.Environment.SecretVariabl"
          + "esEntry\022I\n\023encrypted_variables\030\003 \001(\0132,.g"
          + "oogle.cloud.batch.v1.Environment.KMSEnvM"
          + "ap\0322\n\tKMSEnvMap\022\020\n\010key_name\030\001 \001(\t\022\023\n\013cip"
          + "her_text\030\002 \001(\t\0320\n\016VariablesEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0326\n\024SecretVariab"
          + "lesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "B\252\001\n\031com.google.cloud.batch.v1B\tTaskProt"
          + "oP\001Z/cloud.google.com/go/batch/apiv1/bat"
          + "chpb;batchpb\242\002\003GCB\252\002\025Google.Cloud.Batch."
          + "V1\312\002\025Google\\Cloud\\Batch\\V1\352\002\030Google::Clo"
          + "ud::Batch::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1.VolumeProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1_ComputeResource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1_ComputeResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_ComputeResource_descriptor,
            new java.lang.String[] {
              "CpuMilli", "MemoryMib", "BootDiskMib",
            });
    internal_static_google_cloud_batch_v1_StatusEvent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1_StatusEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_StatusEvent_descriptor,
            new java.lang.String[] {
              "Type", "Description", "EventTime", "TaskExecution", "TaskState",
            });
    internal_static_google_cloud_batch_v1_TaskExecution_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1_TaskExecution_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_TaskExecution_descriptor,
            new java.lang.String[] {
              "ExitCode",
            });
    internal_static_google_cloud_batch_v1_TaskStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1_TaskStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_TaskStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents",
            });
    internal_static_google_cloud_batch_v1_Runnable_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1_Runnable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Runnable_descriptor,
            new java.lang.String[] {
              "Container",
              "Script",
              "Barrier",
              "IgnoreExitStatus",
              "Background",
              "AlwaysRun",
              "Environment",
              "Timeout",
              "Executable",
            });
    internal_static_google_cloud_batch_v1_Runnable_Container_descriptor =
        internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_Runnable_Container_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Runnable_Container_descriptor,
            new java.lang.String[] {
              "ImageUri",
              "Commands",
              "Entrypoint",
              "Volumes",
              "Options",
              "BlockExternalNetwork",
              "Username",
              "Password",
            });
    internal_static_google_cloud_batch_v1_Runnable_Script_descriptor =
        internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_Runnable_Script_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Runnable_Script_descriptor,
            new java.lang.String[] {
              "Path", "Text", "Command",
            });
    internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor =
        internal_static_google_cloud_batch_v1_Runnable_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_Runnable_Barrier_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Runnable_Barrier_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1_TaskSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1_TaskSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_TaskSpec_descriptor,
            new java.lang.String[] {
              "Runnables",
              "ComputeResource",
              "MaxRunDuration",
              "MaxRetryCount",
              "LifecyclePolicies",
              "Environments",
              "Volumes",
              "Environment",
            });
    internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor =
        internal_static_google_cloud_batch_v1_TaskSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_TaskSpec_EnvironmentsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1_LifecyclePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor,
            new java.lang.String[] {
              "Action", "ActionCondition",
            });
    internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor =
        internal_static_google_cloud_batch_v1_LifecyclePolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_LifecyclePolicy_ActionCondition_descriptor,
            new java.lang.String[] {
              "ExitCodes",
            });
    internal_static_google_cloud_batch_v1_Task_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Task_descriptor,
            new java.lang.String[] {
              "Name", "Status",
            });
    internal_static_google_cloud_batch_v1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Environment_descriptor,
            new java.lang.String[] {
              "Variables", "SecretVariables", "EncryptedVariables",
            });
    internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor =
        internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Environment_KMSEnvMap_descriptor,
            new java.lang.String[] {
              "KeyName", "CipherText",
            });
    internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1_Environment_VariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor =
        internal_static_google_cloud_batch_v1_Environment_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_Environment_SecretVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1.VolumeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

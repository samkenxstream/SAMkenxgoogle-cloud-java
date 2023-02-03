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
// source: google/cloud/securitycenter/settings/v1beta1/billing_settings.proto

package com.google.cloud.securitycenter.settings.v1beta1;

public final class BillingSettingsProto {
  private BillingSettingsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/cloud/securitycenter/settings/v"
          + "1beta1/billing_settings.proto\022,google.cl"
          + "oud.securitycenter.settings.v1beta1\032\037goo"
          + "gle/api/field_behavior.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"\250\002\n\017BillingSetting"
          + "s\022T\n\014billing_tier\030\001 \001(\01629.google.cloud.s"
          + "ecuritycenter.settings.v1beta1.BillingTi"
          + "erB\003\340A\003\022T\n\014billing_type\030\002 \001(\01629.google.c"
          + "loud.securitycenter.settings.v1beta1.Bil"
          + "lingTypeB\003\340A\003\0223\n\nstart_time\030\003 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\0224\n\013expire_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "*F\n\013BillingTier\022\034\n\030BILLING_TIER_UNSPECIF"
          + "IED\020\000\022\014\n\010STANDARD\020\001\022\013\n\007PREMIUM\020\002*`\n\013Bill"
          + "ingType\022\034\n\030BILLING_TYPE_UNSPECIFIED\020\000\022\020\n"
          + "\014SUBSCRIPTION\020\001\022\026\n\022TRIAL_SUBSCRIPTION\020\002\022"
          + "\t\n\005ALPHA\020\003B\254\002\n0com.google.cloud.security"
          + "center.settings.v1beta1B\024BillingSettings"
          + "ProtoP\001ZLcloud.google.com/go/securitycen"
          + "ter/settings/apiv1beta1/settingspb;setti"
          + "ngspb\370\001\001\252\002,Google.Cloud.SecurityCenter.S"
          + "ettings.V1Beta1\312\002,Google\\Cloud\\SecurityC"
          + "enter\\Settings\\V1beta1\352\0020Google::Cloud::"
          + "SecurityCenter::Settings::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_settings_v1beta1_BillingSettings_descriptor,
            new java.lang.String[] {
              "BillingTier", "BillingType", "StartTime", "ExpireTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

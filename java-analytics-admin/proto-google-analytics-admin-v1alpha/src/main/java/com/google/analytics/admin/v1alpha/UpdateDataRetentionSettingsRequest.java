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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for UpdateDataRetentionSettings RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest}
 */
public final class UpdateDataRetentionSettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest)
    UpdateDataRetentionSettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateDataRetentionSettingsRequest.newBuilder() to construct.
  private UpdateDataRetentionSettingsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDataRetentionSettingsRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDataRetentionSettingsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateDataRetentionSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateDataRetentionSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest.class,
            com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest.Builder.class);
  }

  public static final int DATA_RETENTION_SETTINGS_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.DataRetentionSettings dataRetentionSettings_;
  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   * The `name` field is used to identify the settings to be updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataRetentionSettings field is set.
   */
  @java.lang.Override
  public boolean hasDataRetentionSettings() {
    return dataRetentionSettings_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   * The `name` field is used to identify the settings to be updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataRetentionSettings.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DataRetentionSettings getDataRetentionSettings() {
    return dataRetentionSettings_ == null
        ? com.google.analytics.admin.v1alpha.DataRetentionSettings.getDefaultInstance()
        : dataRetentionSettings_;
  }
  /**
   *
   *
   * <pre>
   * Required. The settings to update.
   * The `name` field is used to identify the settings to be updated.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.DataRetentionSettingsOrBuilder
      getDataRetentionSettingsOrBuilder() {
    return dataRetentionSettings_ == null
        ? com.google.analytics.admin.v1alpha.DataRetentionSettings.getDefaultInstance()
        : dataRetentionSettings_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Field names must be in snake
   * case (e.g., "field_to_update"). Omitted fields will not be updated. To
   * replace the entire entity, use one path with the string "*" to match all
   * fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (dataRetentionSettings_ != null) {
      output.writeMessage(1, getDataRetentionSettings());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataRetentionSettings_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataRetentionSettings());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest other =
        (com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest) obj;

    if (hasDataRetentionSettings() != other.hasDataRetentionSettings()) return false;
    if (hasDataRetentionSettings()) {
      if (!getDataRetentionSettings().equals(other.getDataRetentionSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDataRetentionSettings()) {
      hash = (37 * hash) + DATA_RETENTION_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getDataRetentionSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for UpdateDataRetentionSettings RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest)
      com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateDataRetentionSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateDataRetentionSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest.class,
              com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest.Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataRetentionSettings_ = null;
      if (dataRetentionSettingsBuilder_ != null) {
        dataRetentionSettingsBuilder_.dispose();
        dataRetentionSettingsBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateDataRetentionSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest build() {
      com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest buildPartial() {
      com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest result =
          new com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataRetentionSettings_ =
            dataRetentionSettingsBuilder_ == null
                ? dataRetentionSettings_
                : dataRetentionSettingsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
              .getDefaultInstance()) return this;
      if (other.hasDataRetentionSettings()) {
        mergeDataRetentionSettings(other.getDataRetentionSettings());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getDataRetentionSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.analytics.admin.v1alpha.DataRetentionSettings dataRetentionSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DataRetentionSettings,
            com.google.analytics.admin.v1alpha.DataRetentionSettings.Builder,
            com.google.analytics.admin.v1alpha.DataRetentionSettingsOrBuilder>
        dataRetentionSettingsBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataRetentionSettings field is set.
     */
    public boolean hasDataRetentionSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataRetentionSettings.
     */
    public com.google.analytics.admin.v1alpha.DataRetentionSettings getDataRetentionSettings() {
      if (dataRetentionSettingsBuilder_ == null) {
        return dataRetentionSettings_ == null
            ? com.google.analytics.admin.v1alpha.DataRetentionSettings.getDefaultInstance()
            : dataRetentionSettings_;
      } else {
        return dataRetentionSettingsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataRetentionSettings(
        com.google.analytics.admin.v1alpha.DataRetentionSettings value) {
      if (dataRetentionSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataRetentionSettings_ = value;
      } else {
        dataRetentionSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataRetentionSettings(
        com.google.analytics.admin.v1alpha.DataRetentionSettings.Builder builderForValue) {
      if (dataRetentionSettingsBuilder_ == null) {
        dataRetentionSettings_ = builderForValue.build();
      } else {
        dataRetentionSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataRetentionSettings(
        com.google.analytics.admin.v1alpha.DataRetentionSettings value) {
      if (dataRetentionSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataRetentionSettings_ != null
            && dataRetentionSettings_
                != com.google.analytics.admin.v1alpha.DataRetentionSettings.getDefaultInstance()) {
          getDataRetentionSettingsBuilder().mergeFrom(value);
        } else {
          dataRetentionSettings_ = value;
        }
      } else {
        dataRetentionSettingsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataRetentionSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataRetentionSettings_ = null;
      if (dataRetentionSettingsBuilder_ != null) {
        dataRetentionSettingsBuilder_.dispose();
        dataRetentionSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DataRetentionSettings.Builder
        getDataRetentionSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataRetentionSettingsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.DataRetentionSettingsOrBuilder
        getDataRetentionSettingsOrBuilder() {
      if (dataRetentionSettingsBuilder_ != null) {
        return dataRetentionSettingsBuilder_.getMessageOrBuilder();
      } else {
        return dataRetentionSettings_ == null
            ? com.google.analytics.admin.v1alpha.DataRetentionSettings.getDefaultInstance()
            : dataRetentionSettings_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The settings to update.
     * The `name` field is used to identify the settings to be updated.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.DataRetentionSettings data_retention_settings = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.DataRetentionSettings,
            com.google.analytics.admin.v1alpha.DataRetentionSettings.Builder,
            com.google.analytics.admin.v1alpha.DataRetentionSettingsOrBuilder>
        getDataRetentionSettingsFieldBuilder() {
      if (dataRetentionSettingsBuilder_ == null) {
        dataRetentionSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.DataRetentionSettings,
                com.google.analytics.admin.v1alpha.DataRetentionSettings.Builder,
                com.google.analytics.admin.v1alpha.DataRetentionSettingsOrBuilder>(
                getDataRetentionSettings(), getParentForChildren(), isClean());
        dataRetentionSettings_ = null;
      }
      return dataRetentionSettingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The list of fields to be updated. Field names must be in snake
     * case (e.g., "field_to_update"). Omitted fields will not be updated. To
     * replace the entire entity, use one path with the string "*" to match all
     * fields.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest)
  private static final com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest();
  }

  public static com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataRetentionSettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDataRetentionSettingsRequest>() {
        @java.lang.Override
        public UpdateDataRetentionSettingsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateDataRetentionSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataRetentionSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UpdateDataRetentionSettingsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

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
 * Request message for CreateConversionEvent RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateConversionEventRequest}
 */
public final class CreateConversionEventRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateConversionEventRequest)
    CreateConversionEventRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateConversionEventRequest.newBuilder() to construct.
  private CreateConversionEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateConversionEventRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateConversionEventRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateConversionEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateConversionEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateConversionEventRequest.class,
            com.google.analytics.admin.v1alpha.CreateConversionEventRequest.Builder.class);
  }

  public static final int CONVERSION_EVENT_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.ConversionEvent conversionEvent_;
  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversionEvent field is set.
   */
  @java.lang.Override
  public boolean hasConversionEvent() {
    return conversionEvent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversionEvent.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ConversionEvent getConversionEvent() {
    return conversionEvent_ == null
        ? com.google.analytics.admin.v1alpha.ConversionEvent.getDefaultInstance()
        : conversionEvent_;
  }
  /**
   *
   *
   * <pre>
   * Required. The conversion event to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ConversionEventOrBuilder getConversionEventOrBuilder() {
    return conversionEvent_ == null
        ? com.google.analytics.admin.v1alpha.ConversionEvent.getDefaultInstance()
        : conversionEvent_;
  }

  public static final int PARENT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent property where this conversion
   * event will be created. Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent property where this conversion
   * event will be created. Format: properties/123
   * </pre>
   *
   * <code>
   * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (conversionEvent_ != null) {
      output.writeMessage(1, getConversionEvent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conversionEvent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getConversionEvent());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parent_);
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateConversionEventRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateConversionEventRequest other =
        (com.google.analytics.admin.v1alpha.CreateConversionEventRequest) obj;

    if (hasConversionEvent() != other.hasConversionEvent()) return false;
    if (hasConversionEvent()) {
      if (!getConversionEvent().equals(other.getConversionEvent())) return false;
    }
    if (!getParent().equals(other.getParent())) return false;
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
    if (hasConversionEvent()) {
      hash = (37 * hash) + CONVERSION_EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getConversionEvent().hashCode();
    }
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateConversionEventRequest prototype) {
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
   * Request message for CreateConversionEvent RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateConversionEventRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateConversionEventRequest)
      com.google.analytics.admin.v1alpha.CreateConversionEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateConversionEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateConversionEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateConversionEventRequest.class,
              com.google.analytics.admin.v1alpha.CreateConversionEventRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateConversionEventRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conversionEvent_ = null;
      if (conversionEventBuilder_ != null) {
        conversionEventBuilder_.dispose();
        conversionEventBuilder_ = null;
      }
      parent_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateConversionEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateConversionEventRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateConversionEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateConversionEventRequest build() {
      com.google.analytics.admin.v1alpha.CreateConversionEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateConversionEventRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateConversionEventRequest result =
          new com.google.analytics.admin.v1alpha.CreateConversionEventRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.CreateConversionEventRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversionEvent_ =
            conversionEventBuilder_ == null ? conversionEvent_ : conversionEventBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parent_ = parent_;
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateConversionEventRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateConversionEventRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.CreateConversionEventRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateConversionEventRequest.getDefaultInstance())
        return this;
      if (other.hasConversionEvent()) {
        mergeConversionEvent(other.getConversionEvent());
      }
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                input.readMessage(getConversionEventFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                parent_ = input.readStringRequireUtf8();
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

    private com.google.analytics.admin.v1alpha.ConversionEvent conversionEvent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ConversionEvent,
            com.google.analytics.admin.v1alpha.ConversionEvent.Builder,
            com.google.analytics.admin.v1alpha.ConversionEventOrBuilder>
        conversionEventBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversionEvent field is set.
     */
    public boolean hasConversionEvent() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversionEvent.
     */
    public com.google.analytics.admin.v1alpha.ConversionEvent getConversionEvent() {
      if (conversionEventBuilder_ == null) {
        return conversionEvent_ == null
            ? com.google.analytics.admin.v1alpha.ConversionEvent.getDefaultInstance()
            : conversionEvent_;
      } else {
        return conversionEventBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversionEvent(com.google.analytics.admin.v1alpha.ConversionEvent value) {
      if (conversionEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionEvent_ = value;
      } else {
        conversionEventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversionEvent(
        com.google.analytics.admin.v1alpha.ConversionEvent.Builder builderForValue) {
      if (conversionEventBuilder_ == null) {
        conversionEvent_ = builderForValue.build();
      } else {
        conversionEventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversionEvent(com.google.analytics.admin.v1alpha.ConversionEvent value) {
      if (conversionEventBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && conversionEvent_ != null
            && conversionEvent_
                != com.google.analytics.admin.v1alpha.ConversionEvent.getDefaultInstance()) {
          getConversionEventBuilder().mergeFrom(value);
        } else {
          conversionEvent_ = value;
        }
      } else {
        conversionEventBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversionEvent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      conversionEvent_ = null;
      if (conversionEventBuilder_ != null) {
        conversionEventBuilder_.dispose();
        conversionEventBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ConversionEvent.Builder getConversionEventBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getConversionEventFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ConversionEventOrBuilder
        getConversionEventOrBuilder() {
      if (conversionEventBuilder_ != null) {
        return conversionEventBuilder_.getMessageOrBuilder();
      } else {
        return conversionEvent_ == null
            ? com.google.analytics.admin.v1alpha.ConversionEvent.getDefaultInstance()
            : conversionEvent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversion event to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.ConversionEvent conversion_event = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ConversionEvent,
            com.google.analytics.admin.v1alpha.ConversionEvent.Builder,
            com.google.analytics.admin.v1alpha.ConversionEventOrBuilder>
        getConversionEventFieldBuilder() {
      if (conversionEventBuilder_ == null) {
        conversionEventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.ConversionEvent,
                com.google.analytics.admin.v1alpha.ConversionEvent.Builder,
                com.google.analytics.admin.v1alpha.ConversionEventOrBuilder>(
                getConversionEvent(), getParentForChildren(), isClean());
        conversionEvent_ = null;
      }
      return conversionEventBuilder_;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent property where this conversion
     * event will be created. Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent property where this conversion
     * event will be created. Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent property where this conversion
     * event will be created. Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent property where this conversion
     * event will be created. Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent property where this conversion
     * event will be created. Format: properties/123
     * </pre>
     *
     * <code>
     * string parent = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateConversionEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateConversionEventRequest)
  private static final com.google.analytics.admin.v1alpha.CreateConversionEventRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateConversionEventRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateConversionEventRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateConversionEventRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateConversionEventRequest>() {
        @java.lang.Override
        public CreateConversionEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateConversionEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateConversionEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateConversionEventRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

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
// source: google/cloud/run/v2/vendor_settings.proto

package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * Settings for revision-level scaling settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.RevisionScaling}
 */
public final class RevisionScaling extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.RevisionScaling)
    RevisionScalingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RevisionScaling.newBuilder() to construct.
  private RevisionScaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RevisionScaling() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RevisionScaling();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.VendorSettingsProto
        .internal_static_google_cloud_run_v2_RevisionScaling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.VendorSettingsProto
        .internal_static_google_cloud_run_v2_RevisionScaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.RevisionScaling.class,
            com.google.cloud.run.v2.RevisionScaling.Builder.class);
  }

  public static final int MIN_INSTANCE_COUNT_FIELD_NUMBER = 1;
  private int minInstanceCount_ = 0;
  /**
   *
   *
   * <pre>
   * Minimum number of serving instances that this resource should have.
   * </pre>
   *
   * <code>int32 min_instance_count = 1;</code>
   *
   * @return The minInstanceCount.
   */
  @java.lang.Override
  public int getMinInstanceCount() {
    return minInstanceCount_;
  }

  public static final int MAX_INSTANCE_COUNT_FIELD_NUMBER = 2;
  private int maxInstanceCount_ = 0;
  /**
   *
   *
   * <pre>
   * Maximum number of serving instances that this resource should have.
   * </pre>
   *
   * <code>int32 max_instance_count = 2;</code>
   *
   * @return The maxInstanceCount.
   */
  @java.lang.Override
  public int getMaxInstanceCount() {
    return maxInstanceCount_;
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
    if (minInstanceCount_ != 0) {
      output.writeInt32(1, minInstanceCount_);
    }
    if (maxInstanceCount_ != 0) {
      output.writeInt32(2, maxInstanceCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minInstanceCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, minInstanceCount_);
    }
    if (maxInstanceCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxInstanceCount_);
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
    if (!(obj instanceof com.google.cloud.run.v2.RevisionScaling)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.RevisionScaling other = (com.google.cloud.run.v2.RevisionScaling) obj;

    if (getMinInstanceCount() != other.getMinInstanceCount()) return false;
    if (getMaxInstanceCount() != other.getMaxInstanceCount()) return false;
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
    hash = (37 * hash) + MIN_INSTANCE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMinInstanceCount();
    hash = (37 * hash) + MAX_INSTANCE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInstanceCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScaling parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.RevisionScaling prototype) {
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
   * Settings for revision-level scaling settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.RevisionScaling}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.RevisionScaling)
      com.google.cloud.run.v2.RevisionScalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.VendorSettingsProto
          .internal_static_google_cloud_run_v2_RevisionScaling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.VendorSettingsProto
          .internal_static_google_cloud_run_v2_RevisionScaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.RevisionScaling.class,
              com.google.cloud.run.v2.RevisionScaling.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.RevisionScaling.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minInstanceCount_ = 0;
      maxInstanceCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.VendorSettingsProto
          .internal_static_google_cloud_run_v2_RevisionScaling_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScaling getDefaultInstanceForType() {
      return com.google.cloud.run.v2.RevisionScaling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScaling build() {
      com.google.cloud.run.v2.RevisionScaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScaling buildPartial() {
      com.google.cloud.run.v2.RevisionScaling result =
          new com.google.cloud.run.v2.RevisionScaling(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.RevisionScaling result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minInstanceCount_ = minInstanceCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxInstanceCount_ = maxInstanceCount_;
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
      if (other instanceof com.google.cloud.run.v2.RevisionScaling) {
        return mergeFrom((com.google.cloud.run.v2.RevisionScaling) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.RevisionScaling other) {
      if (other == com.google.cloud.run.v2.RevisionScaling.getDefaultInstance()) return this;
      if (other.getMinInstanceCount() != 0) {
        setMinInstanceCount(other.getMinInstanceCount());
      }
      if (other.getMaxInstanceCount() != 0) {
        setMaxInstanceCount(other.getMaxInstanceCount());
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
            case 8:
              {
                minInstanceCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                maxInstanceCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int minInstanceCount_;
    /**
     *
     *
     * <pre>
     * Minimum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 min_instance_count = 1;</code>
     *
     * @return The minInstanceCount.
     */
    @java.lang.Override
    public int getMinInstanceCount() {
      return minInstanceCount_;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 min_instance_count = 1;</code>
     *
     * @param value The minInstanceCount to set.
     * @return This builder for chaining.
     */
    public Builder setMinInstanceCount(int value) {

      minInstanceCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 min_instance_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinInstanceCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minInstanceCount_ = 0;
      onChanged();
      return this;
    }

    private int maxInstanceCount_;
    /**
     *
     *
     * <pre>
     * Maximum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 max_instance_count = 2;</code>
     *
     * @return The maxInstanceCount.
     */
    @java.lang.Override
    public int getMaxInstanceCount() {
      return maxInstanceCount_;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 max_instance_count = 2;</code>
     *
     * @param value The maxInstanceCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxInstanceCount(int value) {

      maxInstanceCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of serving instances that this resource should have.
     * </pre>
     *
     * <code>int32 max_instance_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxInstanceCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxInstanceCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.RevisionScaling)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.RevisionScaling)
  private static final com.google.cloud.run.v2.RevisionScaling DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.RevisionScaling();
  }

  public static com.google.cloud.run.v2.RevisionScaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevisionScaling> PARSER =
      new com.google.protobuf.AbstractParser<RevisionScaling>() {
        @java.lang.Override
        public RevisionScaling parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevisionScaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevisionScaling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.RevisionScaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

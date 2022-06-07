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
// source: google/cloud/retail/v2alpha/import_config.proto

package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * The input config source for completion data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.CompletionDataInputConfig}
 */
public final class CompletionDataInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.CompletionDataInputConfig)
    CompletionDataInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CompletionDataInputConfig.newBuilder() to construct.
  private CompletionDataInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CompletionDataInputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CompletionDataInputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CompletionDataInputConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              com.google.cloud.retail.v2alpha.BigQuerySource.Builder subBuilder = null;
              if (sourceCase_ == 1) {
                subBuilder = ((com.google.cloud.retail.v2alpha.BigQuerySource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.retail.v2alpha.BigQuerySource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.retail.v2alpha.BigQuerySource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 1;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.ImportConfigProto
        .internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.ImportConfigProto
        .internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.CompletionDataInputConfig.class,
            com.google.cloud.retail.v2alpha.CompletionDataInputConfig.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BIG_QUERY_SOURCE(1),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return BIG_QUERY_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int BIG_QUERY_SOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigQuerySource field is set.
   */
  @java.lang.Override
  public boolean hasBigQuerySource() {
    return sourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigQuerySource.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.BigQuerySource getBigQuerySource() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.retail.v2alpha.BigQuerySource) source_;
    }
    return com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Required. BigQuery input source.
   * Add the IAM permission "BigQuery Data Viewer" for
   * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
   * using this feature otherwise an error is thrown.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.retail.v2alpha.BigQuerySource) source_;
    }
    return com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.retail.v2alpha.BigQuerySource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.retail.v2alpha.BigQuerySource) source_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.retail.v2alpha.CompletionDataInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.CompletionDataInputConfig other =
        (com.google.cloud.retail.v2alpha.CompletionDataInputConfig) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getBigQuerySource().equals(other.getBigQuerySource())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + BIG_QUERY_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getBigQuerySource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig parseFrom(
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
      com.google.cloud.retail.v2alpha.CompletionDataInputConfig prototype) {
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
   * The input config source for completion data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.CompletionDataInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.CompletionDataInputConfig)
      com.google.cloud.retail.v2alpha.CompletionDataInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.CompletionDataInputConfig.class,
              com.google.cloud.retail.v2alpha.CompletionDataInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.CompletionDataInputConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.ImportConfigProto
          .internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDataInputConfig getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.CompletionDataInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDataInputConfig build() {
      com.google.cloud.retail.v2alpha.CompletionDataInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.CompletionDataInputConfig buildPartial() {
      com.google.cloud.retail.v2alpha.CompletionDataInputConfig result =
          new com.google.cloud.retail.v2alpha.CompletionDataInputConfig(this);
      if (sourceCase_ == 1) {
        if (bigQuerySourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = bigQuerySourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.retail.v2alpha.CompletionDataInputConfig) {
        return mergeFrom((com.google.cloud.retail.v2alpha.CompletionDataInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.CompletionDataInputConfig other) {
      if (other == com.google.cloud.retail.v2alpha.CompletionDataInputConfig.getDefaultInstance())
        return this;
      switch (other.getSourceCase()) {
        case BIG_QUERY_SOURCE:
          {
            mergeBigQuerySource(other.getBigQuerySource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.retail.v2alpha.CompletionDataInputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.retail.v2alpha.CompletionDataInputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2alpha.BigQuerySource,
            com.google.cloud.retail.v2alpha.BigQuerySource.Builder,
            com.google.cloud.retail.v2alpha.BigQuerySourceOrBuilder>
        bigQuerySourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the bigQuerySource field is set.
     */
    @java.lang.Override
    public boolean hasBigQuerySource() {
      return sourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bigQuerySource.
     */
    @java.lang.Override
    public com.google.cloud.retail.v2alpha.BigQuerySource getBigQuerySource() {
      if (bigQuerySourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.retail.v2alpha.BigQuerySource) source_;
        }
        return com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return bigQuerySourceBuilder_.getMessage();
        }
        return com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigQuerySource(com.google.cloud.retail.v2alpha.BigQuerySource value) {
      if (bigQuerySourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        bigQuerySourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigQuerySource(
        com.google.cloud.retail.v2alpha.BigQuerySource.Builder builderForValue) {
      if (bigQuerySourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        bigQuerySourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBigQuerySource(com.google.cloud.retail.v2alpha.BigQuerySource value) {
      if (bigQuerySourceBuilder_ == null) {
        if (sourceCase_ == 1
            && source_ != com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance()) {
          source_ =
              com.google.cloud.retail.v2alpha.BigQuerySource.newBuilder(
                      (com.google.cloud.retail.v2alpha.BigQuerySource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          bigQuerySourceBuilder_.mergeFrom(value);
        } else {
          bigQuerySourceBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBigQuerySource() {
      if (bigQuerySourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        bigQuerySourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.retail.v2alpha.BigQuerySource.Builder getBigQuerySourceBuilder() {
      return getBigQuerySourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.retail.v2alpha.BigQuerySourceOrBuilder getBigQuerySourceOrBuilder() {
      if ((sourceCase_ == 1) && (bigQuerySourceBuilder_ != null)) {
        return bigQuerySourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.retail.v2alpha.BigQuerySource) source_;
        }
        return com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. BigQuery input source.
     * Add the IAM permission "BigQuery Data Viewer" for
     * cloud-retail-customer-data-access&#64;system.gserviceaccount.com before
     * using this feature otherwise an error is thrown.
     * </pre>
     *
     * <code>
     * .google.cloud.retail.v2alpha.BigQuerySource big_query_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.retail.v2alpha.BigQuerySource,
            com.google.cloud.retail.v2alpha.BigQuerySource.Builder,
            com.google.cloud.retail.v2alpha.BigQuerySourceOrBuilder>
        getBigQuerySourceFieldBuilder() {
      if (bigQuerySourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.retail.v2alpha.BigQuerySource.getDefaultInstance();
        }
        bigQuerySourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.retail.v2alpha.BigQuerySource,
                com.google.cloud.retail.v2alpha.BigQuerySource.Builder,
                com.google.cloud.retail.v2alpha.BigQuerySourceOrBuilder>(
                (com.google.cloud.retail.v2alpha.BigQuerySource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      ;
      return bigQuerySourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.CompletionDataInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.CompletionDataInputConfig)
  private static final com.google.cloud.retail.v2alpha.CompletionDataInputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.CompletionDataInputConfig();
  }

  public static com.google.cloud.retail.v2alpha.CompletionDataInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompletionDataInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<CompletionDataInputConfig>() {
        @java.lang.Override
        public CompletionDataInputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CompletionDataInputConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CompletionDataInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompletionDataInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.CompletionDataInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

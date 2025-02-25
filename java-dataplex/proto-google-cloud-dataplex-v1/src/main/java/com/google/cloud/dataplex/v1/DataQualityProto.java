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
// source: google/cloud/dataplex/v1/data_quality.proto

package com.google.cloud.dataplex.v1;

public final class DataQualityProto {
  private DataQualityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dataplex/v1/data_quality."
          + "proto\022\030google.cloud.dataplex.v1\032\037google/"
          + "api/field_behavior.proto\032)google/cloud/d"
          + "ataplex/v1/processing.proto\"K\n\017DataQuali"
          + "tySpec\0228\n\005rules\030\001 \003(\0132).google.cloud.dat"
          + "aplex.v1.DataQualityRule\"\375\001\n\021DataQuality"
          + "Result\022\016\n\006passed\030\005 \001(\010\022H\n\ndimensions\030\002 \003"
          + "(\01324.google.cloud.dataplex.v1.DataQualit"
          + "yDimensionResult\022>\n\005rules\030\003 \003(\0132/.google"
          + ".cloud.dataplex.v1.DataQualityRuleResult"
          + "\022\021\n\trow_count\030\004 \001(\003\022;\n\014scanned_data\030\007 \001("
          + "\0132%.google.cloud.dataplex.v1.ScannedData"
          + "\"\323\001\n\025DataQualityRuleResult\0227\n\004rule\030\001 \001(\013"
          + "2).google.cloud.dataplex.v1.DataQualityR"
          + "ule\022\016\n\006passed\030\007 \001(\010\022\027\n\017evaluated_count\030\t"
          + " \001(\003\022\024\n\014passed_count\030\010 \001(\003\022\022\n\nnull_count"
          + "\030\005 \001(\003\022\022\n\npass_ratio\030\006 \001(\001\022\032\n\022failing_ro"
          + "ws_query\030\n \001(\t\",\n\032DataQualityDimensionRe"
          + "sult\022\016\n\006passed\030\003 \001(\010\"\232\014\n\017DataQualityRule"
          + "\022W\n\021range_expectation\030\001 \001(\0132:.google.clo"
          + "ud.dataplex.v1.DataQualityRule.RangeExpe"
          + "ctationH\000\022\\\n\024non_null_expectation\030\002 \001(\0132"
          + "<.google.cloud.dataplex.v1.DataQualityRu"
          + "le.NonNullExpectationH\000\022S\n\017set_expectati"
          + "on\030\003 \001(\01328.google.cloud.dataplex.v1.Data"
          + "QualityRule.SetExpectationH\000\022W\n\021regex_ex"
          + "pectation\030\004 \001(\0132:.google.cloud.dataplex."
          + "v1.DataQualityRule.RegexExpectationH\000\022a\n"
          + "\026uniqueness_expectation\030d \001(\0132?.google.c"
          + "loud.dataplex.v1.DataQualityRule.Uniquen"
          + "essExpectationH\000\022j\n\033statistic_range_expe"
          + "ctation\030e \001(\0132C.google.cloud.dataplex.v1"
          + ".DataQualityRule.StatisticRangeExpectati"
          + "onH\000\022g\n\031row_condition_expectation\030\310\001 \001(\013"
          + "2A.google.cloud.dataplex.v1.DataQualityR"
          + "ule.RowConditionExpectationH\000\022k\n\033table_c"
          + "ondition_expectation\030\311\001 \001(\0132C.google.clo"
          + "ud.dataplex.v1.DataQualityRule.TableCond"
          + "itionExpectationH\000\022\024\n\006column\030\364\003 \001(\tB\003\340A\001"
          + "\022\031\n\013ignore_null\030\365\003 \001(\010B\003\340A\001\022\027\n\tdimension"
          + "\030\366\003 \001(\tB\003\340A\002\022\027\n\tthreshold\030\367\003 \001(\001B\003\340A\001\032\204\001"
          + "\n\020RangeExpectation\022\026\n\tmin_value\030\001 \001(\tB\003\340"
          + "A\001\022\026\n\tmax_value\030\002 \001(\tB\003\340A\001\022\037\n\022strict_min"
          + "_enabled\030\003 \001(\010B\003\340A\001\022\037\n\022strict_max_enable"
          + "d\030\004 \001(\010B\003\340A\001\032\024\n\022NonNullExpectation\032 \n\016Se"
          + "tExpectation\022\016\n\006values\030\001 \003(\t\032!\n\020RegexExp"
          + "ectation\022\r\n\005regex\030\001 \001(\t\032\027\n\025UniquenessExp"
          + "ectation\032\251\002\n\031StatisticRangeExpectation\022f"
          + "\n\tstatistic\030\001 \001(\0162S.google.cloud.dataple"
          + "x.v1.DataQualityRule.StatisticRangeExpec"
          + "tation.ColumnStatistic\022\021\n\tmin_value\030\002 \001("
          + "\t\022\021\n\tmax_value\030\003 \001(\t\022\032\n\022strict_min_enabl"
          + "ed\030\004 \001(\010\022\032\n\022strict_max_enabled\030\005 \001(\010\"F\n\017"
          + "ColumnStatistic\022\027\n\023STATISTIC_UNDEFINED\020\000"
          + "\022\010\n\004MEAN\020\001\022\007\n\003MIN\020\002\022\007\n\003MAX\020\003\0321\n\027RowCondi"
          + "tionExpectation\022\026\n\016sql_expression\030\001 \001(\t\032"
          + "3\n\031TableConditionExpectation\022\026\n\016sql_expr"
          + "ession\030\001 \001(\tB\013\n\trule_typeBl\n\034com.google."
          + "cloud.dataplex.v1B\020DataQualityProtoP\001Z8c"
          + "loud.google.com/go/dataplex/apiv1/datapl"
          + "expb;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataQualitySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualitySpec_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataQualityResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityResult_descriptor,
            new java.lang.String[] {
              "Passed", "Dimensions", "Rules", "RowCount", "ScannedData",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRuleResult_descriptor,
            new java.lang.String[] {
              "Rule",
              "Passed",
              "EvaluatedCount",
              "PassedCount",
              "NullCount",
              "PassRatio",
              "FailingRowsQuery",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityDimensionResult_descriptor,
            new java.lang.String[] {
              "Passed",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor,
            new java.lang.String[] {
              "RangeExpectation",
              "NonNullExpectation",
              "SetExpectation",
              "RegexExpectation",
              "UniquenessExpectation",
              "StatisticRangeExpectation",
              "RowConditionExpectation",
              "TableConditionExpectation",
              "Column",
              "IgnoreNull",
              "Dimension",
              "Threshold",
              "RuleType",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RangeExpectation_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "StrictMinEnabled", "StrictMaxEnabled",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_NonNullExpectation_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_SetExpectation_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RegexExpectation_descriptor,
            new java.lang.String[] {
              "Regex",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_UniquenessExpectation_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(5);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_StatisticRangeExpectation_descriptor,
            new java.lang.String[] {
              "Statistic", "MinValue", "MaxValue", "StrictMinEnabled", "StrictMaxEnabled",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(6);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_RowConditionExpectation_descriptor,
            new java.lang.String[] {
              "SqlExpression",
            });
    internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor =
        internal_static_google_cloud_dataplex_v1_DataQualityRule_descriptor.getNestedTypes().get(7);
    internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataQualityRule_TableConditionExpectation_descriptor,
            new java.lang.String[] {
              "SqlExpression",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

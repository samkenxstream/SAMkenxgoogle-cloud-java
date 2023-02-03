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
// source: google/cloud/texttospeech/v1beta1/cloud_tts.proto

package com.google.cloud.texttospeech.v1beta1;

public final class TextToSpeechProto {
  private TextToSpeechProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_texttospeech_v1beta1_Timepoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/texttospeech/v1beta1/clou"
          + "d_tts.proto\022!google.cloud.texttospeech.v"
          + "1beta1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\"/\n\021ListVoicesRequest\022\032\n\rlanguage_code\030"
          + "\001 \001(\tB\003\340A\001\"N\n\022ListVoicesResponse\0228\n\006voic"
          + "es\030\001 \003(\0132(.google.cloud.texttospeech.v1b"
          + "eta1.Voice\"\231\001\n\005Voice\022\026\n\016language_codes\030\001"
          + " \003(\t\022\014\n\004name\030\002 \001(\t\022G\n\013ssml_gender\030\003 \001(\0162"
          + "2.google.cloud.texttospeech.v1beta1.Ssml"
          + "VoiceGender\022!\n\031natural_sample_rate_hertz"
          + "\030\004 \001(\005\"\240\003\n\027SynthesizeSpeechRequest\022E\n\005in"
          + "put\030\001 \001(\01321.google.cloud.texttospeech.v1"
          + "beta1.SynthesisInputB\003\340A\002\022K\n\005voice\030\002 \001(\013"
          + "27.google.cloud.texttospeech.v1beta1.Voi"
          + "ceSelectionParamsB\003\340A\002\022I\n\014audio_config\030\003"
          + " \001(\0132..google.cloud.texttospeech.v1beta1"
          + ".AudioConfigB\003\340A\002\022f\n\024enable_time_pointin"
          + "g\030\004 \003(\0162H.google.cloud.texttospeech.v1be"
          + "ta1.SynthesizeSpeechRequest.TimepointTyp"
          + "e\">\n\rTimepointType\022\036\n\032TIMEPOINT_TYPE_UNS"
          + "PECIFIED\020\000\022\r\n\tSSML_MARK\020\001\"@\n\016SynthesisIn"
          + "put\022\016\n\004text\030\001 \001(\tH\000\022\016\n\004ssml\030\002 \001(\tH\000B\016\n\014i"
          + "nput_source\"\325\001\n\024VoiceSelectionParams\022\032\n\r"
          + "language_code\030\001 \001(\tB\003\340A\002\022\014\n\004name\030\002 \001(\t\022G"
          + "\n\013ssml_gender\030\003 \001(\01622.google.cloud.textt"
          + "ospeech.v1beta1.SsmlVoiceGender\022J\n\014custo"
          + "m_voice\030\004 \001(\01324.google.cloud.texttospeec"
          + "h.v1beta1.CustomVoiceParams\"\366\001\n\013AudioCon"
          + "fig\022M\n\016audio_encoding\030\001 \001(\01620.google.clo"
          + "ud.texttospeech.v1beta1.AudioEncodingB\003\340"
          + "A\002\022\035\n\rspeaking_rate\030\002 \001(\001B\006\340A\004\340A\001\022\025\n\005pit"
          + "ch\030\003 \001(\001B\006\340A\004\340A\001\022\036\n\016volume_gain_db\030\004 \001(\001"
          + "B\006\340A\004\340A\001\022\036\n\021sample_rate_hertz\030\005 \001(\005B\003\340A\001"
          + "\022\"\n\022effects_profile_id\030\006 \003(\tB\006\340A\004\340A\001\"\364\001\n"
          + "\021CustomVoiceParams\0222\n\005model\030\001 \001(\tB#\340A\002\372A"
          + "\035\n\033automl.googleapis.com/Model\022_\n\016report"
          + "ed_usage\030\003 \001(\0162B.google.cloud.texttospee"
          + "ch.v1beta1.CustomVoiceParams.ReportedUsa"
          + "geB\003\340A\001\"J\n\rReportedUsage\022\036\n\032REPORTED_USA"
          + "GE_UNSPECIFIED\020\000\022\014\n\010REALTIME\020\001\022\013\n\007OFFLIN"
          + "E\020\002\"\271\001\n\030SynthesizeSpeechResponse\022\025\n\raudi"
          + "o_content\030\001 \001(\014\022@\n\ntimepoints\030\002 \003(\0132,.go"
          + "ogle.cloud.texttospeech.v1beta1.Timepoin"
          + "t\022D\n\014audio_config\030\004 \001(\0132..google.cloud.t"
          + "exttospeech.v1beta1.AudioConfig\"4\n\tTimep"
          + "oint\022\021\n\tmark_name\030\004 \001(\t\022\024\n\014time_seconds\030"
          + "\003 \001(\001*W\n\017SsmlVoiceGender\022!\n\035SSML_VOICE_G"
          + "ENDER_UNSPECIFIED\020\000\022\010\n\004MALE\020\001\022\n\n\006FEMALE\020"
          + "\002\022\013\n\007NEUTRAL\020\003*z\n\rAudioEncoding\022\036\n\032AUDIO"
          + "_ENCODING_UNSPECIFIED\020\000\022\014\n\010LINEAR16\020\001\022\007\n"
          + "\003MP3\020\002\022\017\n\013MP3_64_KBPS\020\004\022\014\n\010OGG_OPUS\020\003\022\t\n"
          + "\005MULAW\020\005\022\010\n\004ALAW\020\0062\322\003\n\014TextToSpeech\022\242\001\n\n"
          + "ListVoices\0224.google.cloud.texttospeech.v"
          + "1beta1.ListVoicesRequest\0325.google.cloud."
          + "texttospeech.v1beta1.ListVoicesResponse\""
          + "\'\202\323\344\223\002\021\022\017/v1beta1/voices\332A\rlanguage_code"
          + "\022\313\001\n\020SynthesizeSpeech\022:.google.cloud.tex"
          + "ttospeech.v1beta1.SynthesizeSpeechReques"
          + "t\032;.google.cloud.texttospeech.v1beta1.Sy"
          + "nthesizeSpeechResponse\">\202\323\344\223\002\035\"\030/v1beta1"
          + "/text:synthesize:\001*\332A\030input,voice,audio_"
          + "config\032O\312A\033texttospeech.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\321\002\n%com.google.cloud.texttospeec"
          + "h.v1beta1B\021TextToSpeechProtoP\001ZIcloud.go"
          + "ogle.com/go/texttospeech/apiv1beta1/text"
          + "tospeechpb;texttospeechpb\370\001\001\252\002!Google.Cl"
          + "oud.TextToSpeech.V1Beta1\312\002!Google\\Cloud\\"
          + "TextToSpeech\\V1beta1\352\002$Google::Cloud::Te"
          + "xtToSpeech::V1beta1\352AU\n\033automl.googleapi"
          + "s.com/Model\0226projects/{project}/location"
          + "s/{location}/models/{model}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_ListVoicesRequest_descriptor,
            new java.lang.String[] {
              "LanguageCode",
            });
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_ListVoicesResponse_descriptor,
            new java.lang.String[] {
              "Voices",
            });
    internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_texttospeech_v1beta1_Voice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_Voice_descriptor,
            new java.lang.String[] {
              "LanguageCodes", "Name", "SsmlGender", "NaturalSampleRateHertz",
            });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechRequest_descriptor,
            new java.lang.String[] {
              "Input", "Voice", "AudioConfig", "EnableTimePointing",
            });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesisInput_descriptor,
            new java.lang.String[] {
              "Text", "Ssml", "InputSource",
            });
    internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "LanguageCode", "Name", "SsmlGender", "CustomVoice",
            });
    internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_AudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SpeakingRate",
              "Pitch",
              "VolumeGainDb",
              "SampleRateHertz",
              "EffectsProfileId",
            });
    internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_CustomVoiceParams_descriptor,
            new java.lang.String[] {
              "Model", "ReportedUsage",
            });
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_SynthesizeSpeechResponse_descriptor,
            new java.lang.String[] {
              "AudioContent", "Timepoints", "AudioConfig",
            });
    internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_texttospeech_v1beta1_Timepoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_texttospeech_v1beta1_Timepoint_descriptor,
            new java.lang.String[] {
              "MarkName", "TimeSeconds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

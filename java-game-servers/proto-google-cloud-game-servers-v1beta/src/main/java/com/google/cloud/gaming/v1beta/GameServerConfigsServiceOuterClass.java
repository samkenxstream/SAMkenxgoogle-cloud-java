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
// source: google/cloud/gaming/v1beta/game_server_configs_service.proto

package com.google.cloud.gaming.v1beta;

public final class GameServerConfigsServiceOuterClass {
  private GameServerConfigsServiceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/gaming/v1beta/game_server"
          + "_configs_service.proto\022\032google.cloud.gam"
          + "ing.v1beta\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\0324google/cloud/"
          + "gaming/v1beta/game_server_configs.proto\032"
          + "#google/longrunning/operations.proto2\304\010\n"
          + "\030GameServerConfigsService\022\346\001\n\025ListGameSe"
          + "rverConfigs\0228.google.cloud.gaming.v1beta"
          + ".ListGameServerConfigsRequest\0329.google.c"
          + "loud.gaming.v1beta.ListGameServerConfigs"
          + "Response\"X\202\323\344\223\002I\022G/v1beta/{parent=projec"
          + "ts/*/locations/*/gameServerDeployments/*"
          + "}/configs\332A\006parent\022\323\001\n\023GetGameServerConf"
          + "ig\0226.google.cloud.gaming.v1beta.GetGameS"
          + "erverConfigRequest\032,.google.cloud.gaming"
          + ".v1beta.GameServerConfig\"V\202\323\344\223\002I\022G/v1bet"
          + "a/{name=projects/*/locations/*/gameServe"
          + "rDeployments/*/configs/*}\332A\004name\022\234\002\n\026Cre"
          + "ateGameServerConfig\0229.google.cloud.gamin"
          + "g.v1beta.CreateGameServerConfigRequest\032\035"
          + ".google.longrunning.Operation\"\247\001\202\323\344\223\002]\"G"
          + "/v1beta/{parent=projects/*/locations/*/g"
          + "ameServerDeployments/*}/configs:\022game_se"
          + "rver_config\332A\031parent,game_server_config\312"
          + "A%\n\020GameServerConfig\022\021OperationMetadata\022"
          + "\370\001\n\026DeleteGameServerConfig\0229.google.clou"
          + "d.gaming.v1beta.DeleteGameServerConfigRe"
          + "quest\032\035.google.longrunning.Operation\"\203\001\202"
          + "\323\344\223\002I*G/v1beta/{name=projects/*/location"
          + "s/*/gameServerDeployments/*/configs/*}\332A"
          + "\004name\312A*\n\025google.protobuf.Empty\022\021Operati"
          + "onMetadata\032O\312A\033gameservices.googleapis.c"
          + "om\322A.https://www.googleapis.com/auth/clo"
          + "ud-platformBw\n\036com.google.cloud.gaming.v"
          + "1betaP\001Z6cloud.google.com/go/gaming/apiv"
          + "1beta/gamingpb;gamingpb\312\002\032Google\\Cloud\\G"
          + "aming\\V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.gaming.v1beta.GameServerConfigs.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.gaming.v1beta.GameServerConfigs.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

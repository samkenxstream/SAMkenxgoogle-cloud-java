/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gaming.v1.samples;

// [START gameservices_v1_generated_GameServerDeploymentsService_UpdateGameServerDeploymentRollout_sync]
import com.google.cloud.gaming.v1.GameServerDeployment;
import com.google.cloud.gaming.v1.GameServerDeploymentRollout;
import com.google.cloud.gaming.v1.GameServerDeploymentsServiceClient;
import com.google.cloud.gaming.v1.UpdateGameServerDeploymentRolloutRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateGameServerDeploymentRollout {

  public static void main(String[] args) throws Exception {
    syncUpdateGameServerDeploymentRollout();
  }

  public static void syncUpdateGameServerDeploymentRollout() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GameServerDeploymentsServiceClient gameServerDeploymentsServiceClient =
        GameServerDeploymentsServiceClient.create()) {
      UpdateGameServerDeploymentRolloutRequest request =
          UpdateGameServerDeploymentRolloutRequest.newBuilder()
              .setRollout(GameServerDeploymentRollout.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      GameServerDeployment response =
          gameServerDeploymentsServiceClient.updateGameServerDeploymentRolloutAsync(request).get();
    }
  }
}
// [END gameservices_v1_generated_GameServerDeploymentsService_UpdateGameServerDeploymentRollout_sync]

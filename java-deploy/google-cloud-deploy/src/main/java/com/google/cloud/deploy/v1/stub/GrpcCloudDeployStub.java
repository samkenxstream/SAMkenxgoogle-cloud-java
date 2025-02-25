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

package com.google.cloud.deploy.v1.stub;

import static com.google.cloud.deploy.v1.CloudDeployClient.ListDeliveryPipelinesPagedResponse;
import static com.google.cloud.deploy.v1.CloudDeployClient.ListJobRunsPagedResponse;
import static com.google.cloud.deploy.v1.CloudDeployClient.ListLocationsPagedResponse;
import static com.google.cloud.deploy.v1.CloudDeployClient.ListReleasesPagedResponse;
import static com.google.cloud.deploy.v1.CloudDeployClient.ListRolloutsPagedResponse;
import static com.google.cloud.deploy.v1.CloudDeployClient.ListTargetsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.deploy.v1.AbandonReleaseRequest;
import com.google.cloud.deploy.v1.AbandonReleaseResponse;
import com.google.cloud.deploy.v1.AdvanceRolloutRequest;
import com.google.cloud.deploy.v1.AdvanceRolloutResponse;
import com.google.cloud.deploy.v1.ApproveRolloutRequest;
import com.google.cloud.deploy.v1.ApproveRolloutResponse;
import com.google.cloud.deploy.v1.CancelRolloutRequest;
import com.google.cloud.deploy.v1.CancelRolloutResponse;
import com.google.cloud.deploy.v1.Config;
import com.google.cloud.deploy.v1.CreateDeliveryPipelineRequest;
import com.google.cloud.deploy.v1.CreateReleaseRequest;
import com.google.cloud.deploy.v1.CreateRolloutRequest;
import com.google.cloud.deploy.v1.CreateTargetRequest;
import com.google.cloud.deploy.v1.DeleteDeliveryPipelineRequest;
import com.google.cloud.deploy.v1.DeleteTargetRequest;
import com.google.cloud.deploy.v1.DeliveryPipeline;
import com.google.cloud.deploy.v1.GetConfigRequest;
import com.google.cloud.deploy.v1.GetDeliveryPipelineRequest;
import com.google.cloud.deploy.v1.GetJobRunRequest;
import com.google.cloud.deploy.v1.GetReleaseRequest;
import com.google.cloud.deploy.v1.GetRolloutRequest;
import com.google.cloud.deploy.v1.GetTargetRequest;
import com.google.cloud.deploy.v1.IgnoreJobRequest;
import com.google.cloud.deploy.v1.IgnoreJobResponse;
import com.google.cloud.deploy.v1.JobRun;
import com.google.cloud.deploy.v1.ListDeliveryPipelinesRequest;
import com.google.cloud.deploy.v1.ListDeliveryPipelinesResponse;
import com.google.cloud.deploy.v1.ListJobRunsRequest;
import com.google.cloud.deploy.v1.ListJobRunsResponse;
import com.google.cloud.deploy.v1.ListReleasesRequest;
import com.google.cloud.deploy.v1.ListReleasesResponse;
import com.google.cloud.deploy.v1.ListRolloutsRequest;
import com.google.cloud.deploy.v1.ListRolloutsResponse;
import com.google.cloud.deploy.v1.ListTargetsRequest;
import com.google.cloud.deploy.v1.ListTargetsResponse;
import com.google.cloud.deploy.v1.OperationMetadata;
import com.google.cloud.deploy.v1.Release;
import com.google.cloud.deploy.v1.RetryJobRequest;
import com.google.cloud.deploy.v1.RetryJobResponse;
import com.google.cloud.deploy.v1.Rollout;
import com.google.cloud.deploy.v1.Target;
import com.google.cloud.deploy.v1.TerminateJobRunRequest;
import com.google.cloud.deploy.v1.TerminateJobRunResponse;
import com.google.cloud.deploy.v1.UpdateDeliveryPipelineRequest;
import com.google.cloud.deploy.v1.UpdateTargetRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.ImmutableMap;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the CloudDeploy service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcCloudDeployStub extends CloudDeployStub {
  private static final MethodDescriptor<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>
      listDeliveryPipelinesMethodDescriptor =
          MethodDescriptor.<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ListDeliveryPipelines")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListDeliveryPipelinesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListDeliveryPipelinesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetDeliveryPipelineRequest, DeliveryPipeline>
      getDeliveryPipelineMethodDescriptor =
          MethodDescriptor.<GetDeliveryPipelineRequest, DeliveryPipeline>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetDeliveryPipeline")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDeliveryPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(DeliveryPipeline.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateDeliveryPipelineRequest, Operation>
      createDeliveryPipelineMethodDescriptor =
          MethodDescriptor.<CreateDeliveryPipelineRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/CreateDeliveryPipeline")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateDeliveryPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateDeliveryPipelineRequest, Operation>
      updateDeliveryPipelineMethodDescriptor =
          MethodDescriptor.<UpdateDeliveryPipelineRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/UpdateDeliveryPipeline")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateDeliveryPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteDeliveryPipelineRequest, Operation>
      deleteDeliveryPipelineMethodDescriptor =
          MethodDescriptor.<DeleteDeliveryPipelineRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/DeleteDeliveryPipeline")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteDeliveryPipelineRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListTargetsRequest, ListTargetsResponse>
      listTargetsMethodDescriptor =
          MethodDescriptor.<ListTargetsRequest, ListTargetsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ListTargets")
              .setRequestMarshaller(ProtoUtils.marshaller(ListTargetsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListTargetsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetTargetRequest, Target> getTargetMethodDescriptor =
      MethodDescriptor.<GetTargetRequest, Target>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetTarget")
          .setRequestMarshaller(ProtoUtils.marshaller(GetTargetRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Target.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateTargetRequest, Operation>
      createTargetMethodDescriptor =
          MethodDescriptor.<CreateTargetRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/CreateTarget")
              .setRequestMarshaller(ProtoUtils.marshaller(CreateTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateTargetRequest, Operation>
      updateTargetMethodDescriptor =
          MethodDescriptor.<UpdateTargetRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/UpdateTarget")
              .setRequestMarshaller(ProtoUtils.marshaller(UpdateTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteTargetRequest, Operation>
      deleteTargetMethodDescriptor =
          MethodDescriptor.<DeleteTargetRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/DeleteTarget")
              .setRequestMarshaller(ProtoUtils.marshaller(DeleteTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListReleasesRequest, ListReleasesResponse>
      listReleasesMethodDescriptor =
          MethodDescriptor.<ListReleasesRequest, ListReleasesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ListReleases")
              .setRequestMarshaller(ProtoUtils.marshaller(ListReleasesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListReleasesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetReleaseRequest, Release> getReleaseMethodDescriptor =
      MethodDescriptor.<GetReleaseRequest, Release>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetRelease")
          .setRequestMarshaller(ProtoUtils.marshaller(GetReleaseRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Release.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateReleaseRequest, Operation>
      createReleaseMethodDescriptor =
          MethodDescriptor.<CreateReleaseRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/CreateRelease")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AbandonReleaseRequest, AbandonReleaseResponse>
      abandonReleaseMethodDescriptor =
          MethodDescriptor.<AbandonReleaseRequest, AbandonReleaseResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/AbandonRelease")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AbandonReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AbandonReleaseResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ApproveRolloutRequest, ApproveRolloutResponse>
      approveRolloutMethodDescriptor =
          MethodDescriptor.<ApproveRolloutRequest, ApproveRolloutResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ApproveRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ApproveRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ApproveRolloutResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AdvanceRolloutRequest, AdvanceRolloutResponse>
      advanceRolloutMethodDescriptor =
          MethodDescriptor.<AdvanceRolloutRequest, AdvanceRolloutResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/AdvanceRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AdvanceRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AdvanceRolloutResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CancelRolloutRequest, CancelRolloutResponse>
      cancelRolloutMethodDescriptor =
          MethodDescriptor.<CancelRolloutRequest, CancelRolloutResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/CancelRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CancelRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(CancelRolloutResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListRolloutsRequest, ListRolloutsResponse>
      listRolloutsMethodDescriptor =
          MethodDescriptor.<ListRolloutsRequest, ListRolloutsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ListRollouts")
              .setRequestMarshaller(ProtoUtils.marshaller(ListRolloutsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListRolloutsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetRolloutRequest, Rollout> getRolloutMethodDescriptor =
      MethodDescriptor.<GetRolloutRequest, Rollout>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetRollout")
          .setRequestMarshaller(ProtoUtils.marshaller(GetRolloutRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Rollout.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateRolloutRequest, Operation>
      createRolloutMethodDescriptor =
          MethodDescriptor.<CreateRolloutRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/CreateRollout")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateRolloutRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<IgnoreJobRequest, IgnoreJobResponse>
      ignoreJobMethodDescriptor =
          MethodDescriptor.<IgnoreJobRequest, IgnoreJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/IgnoreJob")
              .setRequestMarshaller(ProtoUtils.marshaller(IgnoreJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(IgnoreJobResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<RetryJobRequest, RetryJobResponse>
      retryJobMethodDescriptor =
          MethodDescriptor.<RetryJobRequest, RetryJobResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/RetryJob")
              .setRequestMarshaller(ProtoUtils.marshaller(RetryJobRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(RetryJobResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListJobRunsRequest, ListJobRunsResponse>
      listJobRunsMethodDescriptor =
          MethodDescriptor.<ListJobRunsRequest, ListJobRunsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/ListJobRuns")
              .setRequestMarshaller(ProtoUtils.marshaller(ListJobRunsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListJobRunsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetJobRunRequest, JobRun> getJobRunMethodDescriptor =
      MethodDescriptor.<GetJobRunRequest, JobRun>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetJobRun")
          .setRequestMarshaller(ProtoUtils.marshaller(GetJobRunRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(JobRun.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TerminateJobRunRequest, TerminateJobRunResponse>
      terminateJobRunMethodDescriptor =
          MethodDescriptor.<TerminateJobRunRequest, TerminateJobRunResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/TerminateJobRun")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TerminateJobRunRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TerminateJobRunResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetConfigRequest, Config> getConfigMethodDescriptor =
      MethodDescriptor.<GetConfigRequest, Config>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.deploy.v1.CloudDeploy/GetConfig")
          .setRequestMarshaller(ProtoUtils.marshaller(GetConfigRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Config.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<SetIamPolicyRequest, Policy> setIamPolicyMethodDescriptor =
      MethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/SetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<GetIamPolicyRequest, Policy> getIamPolicyMethodDescriptor =
      MethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/GetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          MethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.iam.v1.IAMPolicy/TestIamPermissions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>
      listDeliveryPipelinesCallable;
  private final UnaryCallable<ListDeliveryPipelinesRequest, ListDeliveryPipelinesPagedResponse>
      listDeliveryPipelinesPagedCallable;
  private final UnaryCallable<GetDeliveryPipelineRequest, DeliveryPipeline>
      getDeliveryPipelineCallable;
  private final UnaryCallable<CreateDeliveryPipelineRequest, Operation>
      createDeliveryPipelineCallable;
  private final OperationCallable<
          CreateDeliveryPipelineRequest, DeliveryPipeline, OperationMetadata>
      createDeliveryPipelineOperationCallable;
  private final UnaryCallable<UpdateDeliveryPipelineRequest, Operation>
      updateDeliveryPipelineCallable;
  private final OperationCallable<
          UpdateDeliveryPipelineRequest, DeliveryPipeline, OperationMetadata>
      updateDeliveryPipelineOperationCallable;
  private final UnaryCallable<DeleteDeliveryPipelineRequest, Operation>
      deleteDeliveryPipelineCallable;
  private final OperationCallable<DeleteDeliveryPipelineRequest, Empty, OperationMetadata>
      deleteDeliveryPipelineOperationCallable;
  private final UnaryCallable<ListTargetsRequest, ListTargetsResponse> listTargetsCallable;
  private final UnaryCallable<ListTargetsRequest, ListTargetsPagedResponse>
      listTargetsPagedCallable;
  private final UnaryCallable<GetTargetRequest, Target> getTargetCallable;
  private final UnaryCallable<CreateTargetRequest, Operation> createTargetCallable;
  private final OperationCallable<CreateTargetRequest, Target, OperationMetadata>
      createTargetOperationCallable;
  private final UnaryCallable<UpdateTargetRequest, Operation> updateTargetCallable;
  private final OperationCallable<UpdateTargetRequest, Target, OperationMetadata>
      updateTargetOperationCallable;
  private final UnaryCallable<DeleteTargetRequest, Operation> deleteTargetCallable;
  private final OperationCallable<DeleteTargetRequest, Empty, OperationMetadata>
      deleteTargetOperationCallable;
  private final UnaryCallable<ListReleasesRequest, ListReleasesResponse> listReleasesCallable;
  private final UnaryCallable<ListReleasesRequest, ListReleasesPagedResponse>
      listReleasesPagedCallable;
  private final UnaryCallable<GetReleaseRequest, Release> getReleaseCallable;
  private final UnaryCallable<CreateReleaseRequest, Operation> createReleaseCallable;
  private final OperationCallable<CreateReleaseRequest, Release, OperationMetadata>
      createReleaseOperationCallable;
  private final UnaryCallable<AbandonReleaseRequest, AbandonReleaseResponse> abandonReleaseCallable;
  private final UnaryCallable<ApproveRolloutRequest, ApproveRolloutResponse> approveRolloutCallable;
  private final UnaryCallable<AdvanceRolloutRequest, AdvanceRolloutResponse> advanceRolloutCallable;
  private final UnaryCallable<CancelRolloutRequest, CancelRolloutResponse> cancelRolloutCallable;
  private final UnaryCallable<ListRolloutsRequest, ListRolloutsResponse> listRolloutsCallable;
  private final UnaryCallable<ListRolloutsRequest, ListRolloutsPagedResponse>
      listRolloutsPagedCallable;
  private final UnaryCallable<GetRolloutRequest, Rollout> getRolloutCallable;
  private final UnaryCallable<CreateRolloutRequest, Operation> createRolloutCallable;
  private final OperationCallable<CreateRolloutRequest, Rollout, OperationMetadata>
      createRolloutOperationCallable;
  private final UnaryCallable<IgnoreJobRequest, IgnoreJobResponse> ignoreJobCallable;
  private final UnaryCallable<RetryJobRequest, RetryJobResponse> retryJobCallable;
  private final UnaryCallable<ListJobRunsRequest, ListJobRunsResponse> listJobRunsCallable;
  private final UnaryCallable<ListJobRunsRequest, ListJobRunsPagedResponse>
      listJobRunsPagedCallable;
  private final UnaryCallable<GetJobRunRequest, JobRun> getJobRunCallable;
  private final UnaryCallable<TerminateJobRunRequest, TerminateJobRunResponse>
      terminateJobRunCallable;
  private final UnaryCallable<GetConfigRequest, Config> getConfigCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcCloudDeployStub create(CloudDeployStubSettings settings)
      throws IOException {
    return new GrpcCloudDeployStub(settings, ClientContext.create(settings));
  }

  public static final GrpcCloudDeployStub create(ClientContext clientContext) throws IOException {
    return new GrpcCloudDeployStub(CloudDeployStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcCloudDeployStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcCloudDeployStub(
        CloudDeployStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcCloudDeployStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCloudDeployStub(CloudDeployStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcCloudDeployCallableFactory());
  }

  /**
   * Constructs an instance of GrpcCloudDeployStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcCloudDeployStub(
      CloudDeployStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>
        listDeliveryPipelinesTransportSettings =
            GrpcCallSettings
                .<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>newBuilder()
                .setMethodDescriptor(listDeliveryPipelinesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetDeliveryPipelineRequest, DeliveryPipeline>
        getDeliveryPipelineTransportSettings =
            GrpcCallSettings.<GetDeliveryPipelineRequest, DeliveryPipeline>newBuilder()
                .setMethodDescriptor(getDeliveryPipelineMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateDeliveryPipelineRequest, Operation>
        createDeliveryPipelineTransportSettings =
            GrpcCallSettings.<CreateDeliveryPipelineRequest, Operation>newBuilder()
                .setMethodDescriptor(createDeliveryPipelineMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateDeliveryPipelineRequest, Operation>
        updateDeliveryPipelineTransportSettings =
            GrpcCallSettings.<UpdateDeliveryPipelineRequest, Operation>newBuilder()
                .setMethodDescriptor(updateDeliveryPipelineMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "delivery_pipeline.name",
                          String.valueOf(request.getDeliveryPipeline().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteDeliveryPipelineRequest, Operation>
        deleteDeliveryPipelineTransportSettings =
            GrpcCallSettings.<DeleteDeliveryPipelineRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteDeliveryPipelineMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListTargetsRequest, ListTargetsResponse> listTargetsTransportSettings =
        GrpcCallSettings.<ListTargetsRequest, ListTargetsResponse>newBuilder()
            .setMethodDescriptor(listTargetsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetTargetRequest, Target> getTargetTransportSettings =
        GrpcCallSettings.<GetTargetRequest, Target>newBuilder()
            .setMethodDescriptor(getTargetMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<CreateTargetRequest, Operation> createTargetTransportSettings =
        GrpcCallSettings.<CreateTargetRequest, Operation>newBuilder()
            .setMethodDescriptor(createTargetMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateTargetRequest, Operation> updateTargetTransportSettings =
        GrpcCallSettings.<UpdateTargetRequest, Operation>newBuilder()
            .setMethodDescriptor(updateTargetMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("target.name", String.valueOf(request.getTarget().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<DeleteTargetRequest, Operation> deleteTargetTransportSettings =
        GrpcCallSettings.<DeleteTargetRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteTargetMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListReleasesRequest, ListReleasesResponse> listReleasesTransportSettings =
        GrpcCallSettings.<ListReleasesRequest, ListReleasesResponse>newBuilder()
            .setMethodDescriptor(listReleasesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetReleaseRequest, Release> getReleaseTransportSettings =
        GrpcCallSettings.<GetReleaseRequest, Release>newBuilder()
            .setMethodDescriptor(getReleaseMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<CreateReleaseRequest, Operation> createReleaseTransportSettings =
        GrpcCallSettings.<CreateReleaseRequest, Operation>newBuilder()
            .setMethodDescriptor(createReleaseMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<AbandonReleaseRequest, AbandonReleaseResponse>
        abandonReleaseTransportSettings =
            GrpcCallSettings.<AbandonReleaseRequest, AbandonReleaseResponse>newBuilder()
                .setMethodDescriptor(abandonReleaseMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ApproveRolloutRequest, ApproveRolloutResponse>
        approveRolloutTransportSettings =
            GrpcCallSettings.<ApproveRolloutRequest, ApproveRolloutResponse>newBuilder()
                .setMethodDescriptor(approveRolloutMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<AdvanceRolloutRequest, AdvanceRolloutResponse>
        advanceRolloutTransportSettings =
            GrpcCallSettings.<AdvanceRolloutRequest, AdvanceRolloutResponse>newBuilder()
                .setMethodDescriptor(advanceRolloutMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CancelRolloutRequest, CancelRolloutResponse> cancelRolloutTransportSettings =
        GrpcCallSettings.<CancelRolloutRequest, CancelRolloutResponse>newBuilder()
            .setMethodDescriptor(cancelRolloutMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListRolloutsRequest, ListRolloutsResponse> listRolloutsTransportSettings =
        GrpcCallSettings.<ListRolloutsRequest, ListRolloutsResponse>newBuilder()
            .setMethodDescriptor(listRolloutsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetRolloutRequest, Rollout> getRolloutTransportSettings =
        GrpcCallSettings.<GetRolloutRequest, Rollout>newBuilder()
            .setMethodDescriptor(getRolloutMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<CreateRolloutRequest, Operation> createRolloutTransportSettings =
        GrpcCallSettings.<CreateRolloutRequest, Operation>newBuilder()
            .setMethodDescriptor(createRolloutMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<IgnoreJobRequest, IgnoreJobResponse> ignoreJobTransportSettings =
        GrpcCallSettings.<IgnoreJobRequest, IgnoreJobResponse>newBuilder()
            .setMethodDescriptor(ignoreJobMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("rollout", String.valueOf(request.getRollout()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<RetryJobRequest, RetryJobResponse> retryJobTransportSettings =
        GrpcCallSettings.<RetryJobRequest, RetryJobResponse>newBuilder()
            .setMethodDescriptor(retryJobMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("rollout", String.valueOf(request.getRollout()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListJobRunsRequest, ListJobRunsResponse> listJobRunsTransportSettings =
        GrpcCallSettings.<ListJobRunsRequest, ListJobRunsResponse>newBuilder()
            .setMethodDescriptor(listJobRunsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetJobRunRequest, JobRun> getJobRunTransportSettings =
        GrpcCallSettings.<GetJobRunRequest, JobRun>newBuilder()
            .setMethodDescriptor(getJobRunMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<TerminateJobRunRequest, TerminateJobRunResponse>
        terminateJobRunTransportSettings =
            GrpcCallSettings.<TerminateJobRunRequest, TerminateJobRunResponse>newBuilder()
                .setMethodDescriptor(terminateJobRunMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetConfigRequest, Config> getConfigTransportSettings =
        GrpcCallSettings.<GetConfigRequest, Config>newBuilder()
            .setMethodDescriptor(getConfigMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        GrpcCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("resource", String.valueOf(request.getResource()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        GrpcCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("resource", String.valueOf(request.getResource()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            GrpcCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource", String.valueOf(request.getResource()));
                      return params.build();
                    })
                .build();

    this.listDeliveryPipelinesCallable =
        callableFactory.createUnaryCallable(
            listDeliveryPipelinesTransportSettings,
            settings.listDeliveryPipelinesSettings(),
            clientContext);
    this.listDeliveryPipelinesPagedCallable =
        callableFactory.createPagedCallable(
            listDeliveryPipelinesTransportSettings,
            settings.listDeliveryPipelinesSettings(),
            clientContext);
    this.getDeliveryPipelineCallable =
        callableFactory.createUnaryCallable(
            getDeliveryPipelineTransportSettings,
            settings.getDeliveryPipelineSettings(),
            clientContext);
    this.createDeliveryPipelineCallable =
        callableFactory.createUnaryCallable(
            createDeliveryPipelineTransportSettings,
            settings.createDeliveryPipelineSettings(),
            clientContext);
    this.createDeliveryPipelineOperationCallable =
        callableFactory.createOperationCallable(
            createDeliveryPipelineTransportSettings,
            settings.createDeliveryPipelineOperationSettings(),
            clientContext,
            operationsStub);
    this.updateDeliveryPipelineCallable =
        callableFactory.createUnaryCallable(
            updateDeliveryPipelineTransportSettings,
            settings.updateDeliveryPipelineSettings(),
            clientContext);
    this.updateDeliveryPipelineOperationCallable =
        callableFactory.createOperationCallable(
            updateDeliveryPipelineTransportSettings,
            settings.updateDeliveryPipelineOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteDeliveryPipelineCallable =
        callableFactory.createUnaryCallable(
            deleteDeliveryPipelineTransportSettings,
            settings.deleteDeliveryPipelineSettings(),
            clientContext);
    this.deleteDeliveryPipelineOperationCallable =
        callableFactory.createOperationCallable(
            deleteDeliveryPipelineTransportSettings,
            settings.deleteDeliveryPipelineOperationSettings(),
            clientContext,
            operationsStub);
    this.listTargetsCallable =
        callableFactory.createUnaryCallable(
            listTargetsTransportSettings, settings.listTargetsSettings(), clientContext);
    this.listTargetsPagedCallable =
        callableFactory.createPagedCallable(
            listTargetsTransportSettings, settings.listTargetsSettings(), clientContext);
    this.getTargetCallable =
        callableFactory.createUnaryCallable(
            getTargetTransportSettings, settings.getTargetSettings(), clientContext);
    this.createTargetCallable =
        callableFactory.createUnaryCallable(
            createTargetTransportSettings, settings.createTargetSettings(), clientContext);
    this.createTargetOperationCallable =
        callableFactory.createOperationCallable(
            createTargetTransportSettings,
            settings.createTargetOperationSettings(),
            clientContext,
            operationsStub);
    this.updateTargetCallable =
        callableFactory.createUnaryCallable(
            updateTargetTransportSettings, settings.updateTargetSettings(), clientContext);
    this.updateTargetOperationCallable =
        callableFactory.createOperationCallable(
            updateTargetTransportSettings,
            settings.updateTargetOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteTargetCallable =
        callableFactory.createUnaryCallable(
            deleteTargetTransportSettings, settings.deleteTargetSettings(), clientContext);
    this.deleteTargetOperationCallable =
        callableFactory.createOperationCallable(
            deleteTargetTransportSettings,
            settings.deleteTargetOperationSettings(),
            clientContext,
            operationsStub);
    this.listReleasesCallable =
        callableFactory.createUnaryCallable(
            listReleasesTransportSettings, settings.listReleasesSettings(), clientContext);
    this.listReleasesPagedCallable =
        callableFactory.createPagedCallable(
            listReleasesTransportSettings, settings.listReleasesSettings(), clientContext);
    this.getReleaseCallable =
        callableFactory.createUnaryCallable(
            getReleaseTransportSettings, settings.getReleaseSettings(), clientContext);
    this.createReleaseCallable =
        callableFactory.createUnaryCallable(
            createReleaseTransportSettings, settings.createReleaseSettings(), clientContext);
    this.createReleaseOperationCallable =
        callableFactory.createOperationCallable(
            createReleaseTransportSettings,
            settings.createReleaseOperationSettings(),
            clientContext,
            operationsStub);
    this.abandonReleaseCallable =
        callableFactory.createUnaryCallable(
            abandonReleaseTransportSettings, settings.abandonReleaseSettings(), clientContext);
    this.approveRolloutCallable =
        callableFactory.createUnaryCallable(
            approveRolloutTransportSettings, settings.approveRolloutSettings(), clientContext);
    this.advanceRolloutCallable =
        callableFactory.createUnaryCallable(
            advanceRolloutTransportSettings, settings.advanceRolloutSettings(), clientContext);
    this.cancelRolloutCallable =
        callableFactory.createUnaryCallable(
            cancelRolloutTransportSettings, settings.cancelRolloutSettings(), clientContext);
    this.listRolloutsCallable =
        callableFactory.createUnaryCallable(
            listRolloutsTransportSettings, settings.listRolloutsSettings(), clientContext);
    this.listRolloutsPagedCallable =
        callableFactory.createPagedCallable(
            listRolloutsTransportSettings, settings.listRolloutsSettings(), clientContext);
    this.getRolloutCallable =
        callableFactory.createUnaryCallable(
            getRolloutTransportSettings, settings.getRolloutSettings(), clientContext);
    this.createRolloutCallable =
        callableFactory.createUnaryCallable(
            createRolloutTransportSettings, settings.createRolloutSettings(), clientContext);
    this.createRolloutOperationCallable =
        callableFactory.createOperationCallable(
            createRolloutTransportSettings,
            settings.createRolloutOperationSettings(),
            clientContext,
            operationsStub);
    this.ignoreJobCallable =
        callableFactory.createUnaryCallable(
            ignoreJobTransportSettings, settings.ignoreJobSettings(), clientContext);
    this.retryJobCallable =
        callableFactory.createUnaryCallable(
            retryJobTransportSettings, settings.retryJobSettings(), clientContext);
    this.listJobRunsCallable =
        callableFactory.createUnaryCallable(
            listJobRunsTransportSettings, settings.listJobRunsSettings(), clientContext);
    this.listJobRunsPagedCallable =
        callableFactory.createPagedCallable(
            listJobRunsTransportSettings, settings.listJobRunsSettings(), clientContext);
    this.getJobRunCallable =
        callableFactory.createUnaryCallable(
            getJobRunTransportSettings, settings.getJobRunSettings(), clientContext);
    this.terminateJobRunCallable =
        callableFactory.createUnaryCallable(
            terminateJobRunTransportSettings, settings.terminateJobRunSettings(), clientContext);
    this.getConfigCallable =
        callableFactory.createUnaryCallable(
            getConfigTransportSettings, settings.getConfigSettings(), clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<ListDeliveryPipelinesRequest, ListDeliveryPipelinesResponse>
      listDeliveryPipelinesCallable() {
    return listDeliveryPipelinesCallable;
  }

  @Override
  public UnaryCallable<ListDeliveryPipelinesRequest, ListDeliveryPipelinesPagedResponse>
      listDeliveryPipelinesPagedCallable() {
    return listDeliveryPipelinesPagedCallable;
  }

  @Override
  public UnaryCallable<GetDeliveryPipelineRequest, DeliveryPipeline> getDeliveryPipelineCallable() {
    return getDeliveryPipelineCallable;
  }

  @Override
  public UnaryCallable<CreateDeliveryPipelineRequest, Operation> createDeliveryPipelineCallable() {
    return createDeliveryPipelineCallable;
  }

  @Override
  public OperationCallable<CreateDeliveryPipelineRequest, DeliveryPipeline, OperationMetadata>
      createDeliveryPipelineOperationCallable() {
    return createDeliveryPipelineOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateDeliveryPipelineRequest, Operation> updateDeliveryPipelineCallable() {
    return updateDeliveryPipelineCallable;
  }

  @Override
  public OperationCallable<UpdateDeliveryPipelineRequest, DeliveryPipeline, OperationMetadata>
      updateDeliveryPipelineOperationCallable() {
    return updateDeliveryPipelineOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteDeliveryPipelineRequest, Operation> deleteDeliveryPipelineCallable() {
    return deleteDeliveryPipelineCallable;
  }

  @Override
  public OperationCallable<DeleteDeliveryPipelineRequest, Empty, OperationMetadata>
      deleteDeliveryPipelineOperationCallable() {
    return deleteDeliveryPipelineOperationCallable;
  }

  @Override
  public UnaryCallable<ListTargetsRequest, ListTargetsResponse> listTargetsCallable() {
    return listTargetsCallable;
  }

  @Override
  public UnaryCallable<ListTargetsRequest, ListTargetsPagedResponse> listTargetsPagedCallable() {
    return listTargetsPagedCallable;
  }

  @Override
  public UnaryCallable<GetTargetRequest, Target> getTargetCallable() {
    return getTargetCallable;
  }

  @Override
  public UnaryCallable<CreateTargetRequest, Operation> createTargetCallable() {
    return createTargetCallable;
  }

  @Override
  public OperationCallable<CreateTargetRequest, Target, OperationMetadata>
      createTargetOperationCallable() {
    return createTargetOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateTargetRequest, Operation> updateTargetCallable() {
    return updateTargetCallable;
  }

  @Override
  public OperationCallable<UpdateTargetRequest, Target, OperationMetadata>
      updateTargetOperationCallable() {
    return updateTargetOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteTargetRequest, Operation> deleteTargetCallable() {
    return deleteTargetCallable;
  }

  @Override
  public OperationCallable<DeleteTargetRequest, Empty, OperationMetadata>
      deleteTargetOperationCallable() {
    return deleteTargetOperationCallable;
  }

  @Override
  public UnaryCallable<ListReleasesRequest, ListReleasesResponse> listReleasesCallable() {
    return listReleasesCallable;
  }

  @Override
  public UnaryCallable<ListReleasesRequest, ListReleasesPagedResponse> listReleasesPagedCallable() {
    return listReleasesPagedCallable;
  }

  @Override
  public UnaryCallable<GetReleaseRequest, Release> getReleaseCallable() {
    return getReleaseCallable;
  }

  @Override
  public UnaryCallable<CreateReleaseRequest, Operation> createReleaseCallable() {
    return createReleaseCallable;
  }

  @Override
  public OperationCallable<CreateReleaseRequest, Release, OperationMetadata>
      createReleaseOperationCallable() {
    return createReleaseOperationCallable;
  }

  @Override
  public UnaryCallable<AbandonReleaseRequest, AbandonReleaseResponse> abandonReleaseCallable() {
    return abandonReleaseCallable;
  }

  @Override
  public UnaryCallable<ApproveRolloutRequest, ApproveRolloutResponse> approveRolloutCallable() {
    return approveRolloutCallable;
  }

  @Override
  public UnaryCallable<AdvanceRolloutRequest, AdvanceRolloutResponse> advanceRolloutCallable() {
    return advanceRolloutCallable;
  }

  @Override
  public UnaryCallable<CancelRolloutRequest, CancelRolloutResponse> cancelRolloutCallable() {
    return cancelRolloutCallable;
  }

  @Override
  public UnaryCallable<ListRolloutsRequest, ListRolloutsResponse> listRolloutsCallable() {
    return listRolloutsCallable;
  }

  @Override
  public UnaryCallable<ListRolloutsRequest, ListRolloutsPagedResponse> listRolloutsPagedCallable() {
    return listRolloutsPagedCallable;
  }

  @Override
  public UnaryCallable<GetRolloutRequest, Rollout> getRolloutCallable() {
    return getRolloutCallable;
  }

  @Override
  public UnaryCallable<CreateRolloutRequest, Operation> createRolloutCallable() {
    return createRolloutCallable;
  }

  @Override
  public OperationCallable<CreateRolloutRequest, Rollout, OperationMetadata>
      createRolloutOperationCallable() {
    return createRolloutOperationCallable;
  }

  @Override
  public UnaryCallable<IgnoreJobRequest, IgnoreJobResponse> ignoreJobCallable() {
    return ignoreJobCallable;
  }

  @Override
  public UnaryCallable<RetryJobRequest, RetryJobResponse> retryJobCallable() {
    return retryJobCallable;
  }

  @Override
  public UnaryCallable<ListJobRunsRequest, ListJobRunsResponse> listJobRunsCallable() {
    return listJobRunsCallable;
  }

  @Override
  public UnaryCallable<ListJobRunsRequest, ListJobRunsPagedResponse> listJobRunsPagedCallable() {
    return listJobRunsPagedCallable;
  }

  @Override
  public UnaryCallable<GetJobRunRequest, JobRun> getJobRunCallable() {
    return getJobRunCallable;
  }

  @Override
  public UnaryCallable<TerminateJobRunRequest, TerminateJobRunResponse> terminateJobRunCallable() {
    return terminateJobRunCallable;
  }

  @Override
  public UnaryCallable<GetConfigRequest, Config> getConfigCallable() {
    return getConfigCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}

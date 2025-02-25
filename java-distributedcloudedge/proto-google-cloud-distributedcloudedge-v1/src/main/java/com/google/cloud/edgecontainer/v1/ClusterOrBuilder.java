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
// source: google/cloud/edgecontainer/v1/resources.proto

package com.google.cloud.edgecontainer.v1;

public interface ClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.Cluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the cluster.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the cluster.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the cluster was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Fleet fleet = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the fleet field is set.
   */
  boolean hasFleet();
  /**
   *
   *
   * <pre>
   * Optional. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Fleet fleet = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fleet.
   */
  com.google.cloud.edgecontainer.v1.Fleet getFleet();
  /**
   *
   *
   * <pre>
   * Optional. Fleet configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Fleet fleet = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.FleetOrBuilder getFleetOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterNetworking networking = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the networking field is set.
   */
  boolean hasNetworking();
  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterNetworking networking = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The networking.
   */
  com.google.cloud.edgecontainer.v1.ClusterNetworking getNetworking();
  /**
   *
   *
   * <pre>
   * Required. Cluster-wide networking configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.ClusterNetworking networking = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.ClusterNetworkingOrBuilder getNetworkingOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Immutable. RBAC policy that will be applied and managed by GEC.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Authorization authorization = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the authorization field is set.
   */
  boolean hasAuthorization();
  /**
   *
   *
   * <pre>
   * Required. Immutable. RBAC policy that will be applied and managed by GEC.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Authorization authorization = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The authorization.
   */
  com.google.cloud.edgecontainer.v1.Authorization getAuthorization();
  /**
   *
   *
   * <pre>
   * Required. Immutable. RBAC policy that will be applied and managed by GEC.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.Authorization authorization = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.AuthorizationOrBuilder getAuthorizationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The default maximum number of pods per node used if a maximum value is not
   * specified explicitly for a node pool in this cluster. If unspecified, the
   * Kubernetes default value will be used.
   * </pre>
   *
   * <code>int32 default_max_pods_per_node = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The defaultMaxPodsPerNode.
   */
  int getDefaultMaxPodsPerNode();

  /**
   *
   *
   * <pre>
   * Output only. The IP address of the Kubernetes API server.
   * </pre>
   *
   * <code>string endpoint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Output only. The IP address of the Kubernetes API server.
   * </pre>
   *
   * <code>string endpoint = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded public certificate of the cluster's CA.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterCaCertificate.
   */
  java.lang.String getClusterCaCertificate();
  /**
   *
   *
   * <pre>
   * Output only. The PEM-encoded public certificate of the cluster's CA.
   * </pre>
   *
   * <code>string cluster_ca_certificate = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for clusterCaCertificate.
   */
  com.google.protobuf.ByteString getClusterCaCertificateBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cluster-wide maintenance policy configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.MaintenancePolicy maintenance_policy = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maintenancePolicy field is set.
   */
  boolean hasMaintenancePolicy();
  /**
   *
   *
   * <pre>
   * Optional. Cluster-wide maintenance policy configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.MaintenancePolicy maintenance_policy = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maintenancePolicy.
   */
  com.google.cloud.edgecontainer.v1.MaintenancePolicy getMaintenancePolicy();
  /**
   *
   *
   * <pre>
   * Optional. Cluster-wide maintenance policy configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.edgecontainer.v1.MaintenancePolicy maintenance_policy = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.MaintenancePolicyOrBuilder getMaintenancePolicyOrBuilder();
}

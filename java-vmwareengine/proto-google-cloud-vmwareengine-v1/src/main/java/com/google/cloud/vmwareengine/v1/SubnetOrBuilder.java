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
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

package com.google.cloud.vmwareengine.v1;

public interface SubnetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.Subnet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of this subnet.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud/subnets/my-subnet`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of this subnet.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-west1-a/privateClouds/my-cloud/subnets/my-subnet`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The IP address range of the subnet in CIDR format '10.0.0.0/24'.
   * </pre>
   *
   * <code>string ip_cidr_range = 7;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The IP address range of the subnet in CIDR format '10.0.0.0/24'.
   * </pre>
   *
   * <code>string ip_cidr_range = 7;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * The IP address of the gateway of this subnet.
   * Must fall within the IP prefix defined above.
   * </pre>
   *
   * <code>string gateway_ip = 8;</code>
   *
   * @return The gatewayIp.
   */
  java.lang.String getGatewayIp();
  /**
   *
   *
   * <pre>
   * The IP address of the gateway of this subnet.
   * Must fall within the IP prefix defined above.
   * </pre>
   *
   * <code>string gateway_ip = 8;</code>
   *
   * @return The bytes for gatewayIp.
   */
  com.google.protobuf.ByteString getGatewayIpBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of the subnet. For example "management" or "userDefined".
   * </pre>
   *
   * <code>string type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Output only. The type of the subnet. For example "management" or "userDefined".
   * </pre>
   *
   * <code>string type = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.Subnet.State state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.Subnet.State state = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.vmwareengine.v1.Subnet.State getState();
}

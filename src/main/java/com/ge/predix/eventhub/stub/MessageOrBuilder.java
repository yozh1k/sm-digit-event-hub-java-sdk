// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventHub.proto

package com.ge.predix.eventhub.stub;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:predix.eventhub.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Message ID - UUID
   * </pre>
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1;</code>
   *
   * <pre>
   * Message ID - UUID
   * </pre>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional bytes body = 2;</code>
   *
   * <pre>
   * Payload from the Producer. there is also "Any" type, but its still under development
   * </pre>
   */
  com.google.protobuf.ByteString getBody();

  /**
   * <code>optional string zone_id = 3;</code>
   */
  java.lang.String getZoneId();
  /**
   * <code>optional string zone_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getZoneIdBytes();

  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   *
   * <pre>
   * Some general attributes, could potentially be used for tagging and others
   * </pre>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTags();

  /**
   * <code>optional bytes key = 5;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>optional string topic = 6;</code>
   */
  java.lang.String getTopic();
  /**
   * <code>optional string topic = 6;</code>
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>optional int32 partition = 7;</code>
   */
  int getPartition();

  /**
   * <code>optional int64 offset = 8;</code>
   */
  long getOffset();

  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  com.ge.predix.eventhub.stub.Timestamp getTimestamp();
  /**
   * <code>optional .predix.eventhub.Timestamp timestamp = 9;</code>
   */
  com.ge.predix.eventhub.stub.TimestampOrBuilder getTimestampOrBuilder();
}

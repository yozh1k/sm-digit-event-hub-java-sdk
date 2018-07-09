// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventHub.proto

package com.ge.predix.eventhub.stub;

/**
 * Protobuf type {@code predix.eventhub.SubscriptionRequest}
 */
public  final class SubscriptionRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:predix.eventhub.SubscriptionRequest)
    SubscriptionRequestOrBuilder {
  // Use SubscriptionRequest.newBuilder() to construct.
  private SubscriptionRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SubscriptionRequest() {
    zoneId_ = "";
    subscriber_ = "";
    instanceId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubscriptionRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            zoneId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            subscriber_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceId_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_SubscriptionRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_SubscriptionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ge.predix.eventhub.stub.SubscriptionRequest.class, com.ge.predix.eventhub.stub.SubscriptionRequest.Builder.class);
  }

  public static final int ZONE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object zoneId_;
  /**
   * <code>optional string zone_id = 1;</code>
   *
   * <pre>
   * zone name, this will be the user's zone
   * </pre>
   */
  public java.lang.String getZoneId() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zoneId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string zone_id = 1;</code>
   *
   * <pre>
   * zone name, this will be the user's zone
   * </pre>
   */
  public com.google.protobuf.ByteString
      getZoneIdBytes() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zoneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object subscriber_;
  /**
   * <code>optional string subscriber = 2;</code>
   *
   * <pre>
   * subscriber name, this will be utilized to parallelize processing
   * </pre>
   */
  public java.lang.String getSubscriber() {
    java.lang.Object ref = subscriber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriber_ = s;
      return s;
    }
  }
  /**
   * <code>optional string subscriber = 2;</code>
   *
   * <pre>
   * subscriber name, this will be utilized to parallelize processing
   * </pre>
   */
  public com.google.protobuf.ByteString
      getSubscriberBytes() {
    java.lang.Object ref = subscriber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTANCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object instanceId_;
  /**
   * <code>optional string instance_id = 3;</code>
   *
   * <pre>
   * particular instance of the subscriber
   * </pre>
   */
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string instance_id = 3;</code>
   *
   * <pre>
   * particular instance of the subscriber
   * </pre>
   */
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getZoneIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, zoneId_);
    }
    if (!getSubscriberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, subscriber_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, instanceId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getZoneIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, zoneId_);
    }
    if (!getSubscriberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, subscriber_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, instanceId_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.SubscriptionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ge.predix.eventhub.stub.SubscriptionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code predix.eventhub.SubscriptionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:predix.eventhub.SubscriptionRequest)
      com.ge.predix.eventhub.stub.SubscriptionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_SubscriptionRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_SubscriptionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ge.predix.eventhub.stub.SubscriptionRequest.class, com.ge.predix.eventhub.stub.SubscriptionRequest.Builder.class);
    }

    // Construct using com.ge.predix.eventhub.stub.SubscriptionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      zoneId_ = "";

      subscriber_ = "";

      instanceId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_SubscriptionRequest_descriptor;
    }

    public com.ge.predix.eventhub.stub.SubscriptionRequest getDefaultInstanceForType() {
      return com.ge.predix.eventhub.stub.SubscriptionRequest.getDefaultInstance();
    }

    public com.ge.predix.eventhub.stub.SubscriptionRequest build() {
      com.ge.predix.eventhub.stub.SubscriptionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ge.predix.eventhub.stub.SubscriptionRequest buildPartial() {
      com.ge.predix.eventhub.stub.SubscriptionRequest result = new com.ge.predix.eventhub.stub.SubscriptionRequest(this);
      result.zoneId_ = zoneId_;
      result.subscriber_ = subscriber_;
      result.instanceId_ = instanceId_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ge.predix.eventhub.stub.SubscriptionRequest) {
        return mergeFrom((com.ge.predix.eventhub.stub.SubscriptionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ge.predix.eventhub.stub.SubscriptionRequest other) {
      if (other == com.ge.predix.eventhub.stub.SubscriptionRequest.getDefaultInstance()) return this;
      if (!other.getZoneId().isEmpty()) {
        zoneId_ = other.zoneId_;
        onChanged();
      }
      if (!other.getSubscriber().isEmpty()) {
        subscriber_ = other.subscriber_;
        onChanged();
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ge.predix.eventhub.stub.SubscriptionRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ge.predix.eventhub.stub.SubscriptionRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object zoneId_ = "";
    /**
     * <code>optional string zone_id = 1;</code>
     *
     * <pre>
     * zone name, this will be the user's zone
     * </pre>
     */
    public java.lang.String getZoneId() {
      java.lang.Object ref = zoneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zoneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string zone_id = 1;</code>
     *
     * <pre>
     * zone name, this will be the user's zone
     * </pre>
     */
    public com.google.protobuf.ByteString
        getZoneIdBytes() {
      java.lang.Object ref = zoneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string zone_id = 1;</code>
     *
     * <pre>
     * zone name, this will be the user's zone
     * </pre>
     */
    public Builder setZoneId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zoneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string zone_id = 1;</code>
     *
     * <pre>
     * zone name, this will be the user's zone
     * </pre>
     */
    public Builder clearZoneId() {
      
      zoneId_ = getDefaultInstance().getZoneId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string zone_id = 1;</code>
     *
     * <pre>
     * zone name, this will be the user's zone
     * </pre>
     */
    public Builder setZoneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zoneId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subscriber_ = "";
    /**
     * <code>optional string subscriber = 2;</code>
     *
     * <pre>
     * subscriber name, this will be utilized to parallelize processing
     * </pre>
     */
    public java.lang.String getSubscriber() {
      java.lang.Object ref = subscriber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string subscriber = 2;</code>
     *
     * <pre>
     * subscriber name, this will be utilized to parallelize processing
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSubscriberBytes() {
      java.lang.Object ref = subscriber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string subscriber = 2;</code>
     *
     * <pre>
     * subscriber name, this will be utilized to parallelize processing
     * </pre>
     */
    public Builder setSubscriber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscriber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string subscriber = 2;</code>
     *
     * <pre>
     * subscriber name, this will be utilized to parallelize processing
     * </pre>
     */
    public Builder clearSubscriber() {
      
      subscriber_ = getDefaultInstance().getSubscriber();
      onChanged();
      return this;
    }
    /**
     * <code>optional string subscriber = 2;</code>
     *
     * <pre>
     * subscriber name, this will be utilized to parallelize processing
     * </pre>
     */
    public Builder setSubscriberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscriber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instanceId_ = "";
    /**
     * <code>optional string instance_id = 3;</code>
     *
     * <pre>
     * particular instance of the subscriber
     * </pre>
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string instance_id = 3;</code>
     *
     * <pre>
     * particular instance of the subscriber
     * </pre>
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string instance_id = 3;</code>
     *
     * <pre>
     * particular instance of the subscriber
     * </pre>
     */
    public Builder setInstanceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string instance_id = 3;</code>
     *
     * <pre>
     * particular instance of the subscriber
     * </pre>
     */
    public Builder clearInstanceId() {
      
      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string instance_id = 3;</code>
     *
     * <pre>
     * particular instance of the subscriber
     * </pre>
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceId_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:predix.eventhub.SubscriptionRequest)
  }

  // @@protoc_insertion_point(class_scope:predix.eventhub.SubscriptionRequest)
  private static final com.ge.predix.eventhub.stub.SubscriptionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ge.predix.eventhub.stub.SubscriptionRequest();
  }

  public static com.ge.predix.eventhub.stub.SubscriptionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscriptionRequest>
      PARSER = new com.google.protobuf.AbstractParser<SubscriptionRequest>() {
    public SubscriptionRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new SubscriptionRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<SubscriptionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscriptionRequest> getParserForType() {
    return PARSER;
  }

  public com.ge.predix.eventhub.stub.SubscriptionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


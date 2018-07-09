// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EventHub.proto

package com.ge.predix.eventhub.stub;

/**
 * Protobuf type {@code predix.eventhub.Messages}
 */
public  final class Messages extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:predix.eventhub.Messages)
    MessagesOrBuilder {
  // Use Messages.newBuilder() to construct.
  private Messages(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Messages() {
    msg_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Messages(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              msg_ = new java.util.ArrayList<com.ge.predix.eventhub.stub.Message>();
              mutable_bitField0_ |= 0x00000001;
            }
            msg_.add(input.readMessage(com.ge.predix.eventhub.stub.Message.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        msg_ = java.util.Collections.unmodifiableList(msg_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Messages_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Messages_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ge.predix.eventhub.stub.Messages.class, com.ge.predix.eventhub.stub.Messages.Builder.class);
  }

  public static final int MSG_FIELD_NUMBER = 1;
  private java.util.List<com.ge.predix.eventhub.stub.Message> msg_;
  /**
   * <code>repeated .predix.eventhub.Message msg = 1;</code>
   */
  public java.util.List<com.ge.predix.eventhub.stub.Message> getMsgList() {
    return msg_;
  }
  /**
   * <code>repeated .predix.eventhub.Message msg = 1;</code>
   */
  public java.util.List<? extends com.ge.predix.eventhub.stub.MessageOrBuilder> 
      getMsgOrBuilderList() {
    return msg_;
  }
  /**
   * <code>repeated .predix.eventhub.Message msg = 1;</code>
   */
  public int getMsgCount() {
    return msg_.size();
  }
  /**
   * <code>repeated .predix.eventhub.Message msg = 1;</code>
   */
  public com.ge.predix.eventhub.stub.Message getMsg(int index) {
    return msg_.get(index);
  }
  /**
   * <code>repeated .predix.eventhub.Message msg = 1;</code>
   */
  public com.ge.predix.eventhub.stub.MessageOrBuilder getMsgOrBuilder(
      int index) {
    return msg_.get(index);
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
    for (int i = 0; i < msg_.size(); i++) {
      output.writeMessage(1, msg_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < msg_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, msg_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Messages parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Messages parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.ge.predix.eventhub.stub.Messages parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ge.predix.eventhub.stub.Messages prototype) {
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
   * Protobuf type {@code predix.eventhub.Messages}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:predix.eventhub.Messages)
      com.ge.predix.eventhub.stub.MessagesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Messages_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Messages_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ge.predix.eventhub.stub.Messages.class, com.ge.predix.eventhub.stub.Messages.Builder.class);
    }

    // Construct using com.ge.predix.eventhub.stub.Messages.newBuilder()
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
        getMsgFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (msgBuilder_ == null) {
        msg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        msgBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ge.predix.eventhub.stub.EventHubService.internal_static_predix_eventhub_Messages_descriptor;
    }

    public com.ge.predix.eventhub.stub.Messages getDefaultInstanceForType() {
      return com.ge.predix.eventhub.stub.Messages.getDefaultInstance();
    }

    public com.ge.predix.eventhub.stub.Messages build() {
      com.ge.predix.eventhub.stub.Messages result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.ge.predix.eventhub.stub.Messages buildPartial() {
      com.ge.predix.eventhub.stub.Messages result = new com.ge.predix.eventhub.stub.Messages(this);
      int from_bitField0_ = bitField0_;
      if (msgBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          msg_ = java.util.Collections.unmodifiableList(msg_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.msg_ = msg_;
      } else {
        result.msg_ = msgBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ge.predix.eventhub.stub.Messages) {
        return mergeFrom((com.ge.predix.eventhub.stub.Messages)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ge.predix.eventhub.stub.Messages other) {
      if (other == com.ge.predix.eventhub.stub.Messages.getDefaultInstance()) return this;
      if (msgBuilder_ == null) {
        if (!other.msg_.isEmpty()) {
          if (msg_.isEmpty()) {
            msg_ = other.msg_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMsgIsMutable();
            msg_.addAll(other.msg_);
          }
          onChanged();
        }
      } else {
        if (!other.msg_.isEmpty()) {
          if (msgBuilder_.isEmpty()) {
            msgBuilder_.dispose();
            msgBuilder_ = null;
            msg_ = other.msg_;
            bitField0_ = (bitField0_ & ~0x00000001);
            msgBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getMsgFieldBuilder() : null;
          } else {
            msgBuilder_.addAllMessages(other.msg_);
          }
        }
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
      com.ge.predix.eventhub.stub.Messages parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ge.predix.eventhub.stub.Messages) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.ge.predix.eventhub.stub.Message> msg_ =
      java.util.Collections.emptyList();
    private void ensureMsgIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        msg_ = new java.util.ArrayList<com.ge.predix.eventhub.stub.Message>(msg_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.ge.predix.eventhub.stub.Message, com.ge.predix.eventhub.stub.Message.Builder, com.ge.predix.eventhub.stub.MessageOrBuilder> msgBuilder_;

    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public java.util.List<com.ge.predix.eventhub.stub.Message> getMsgList() {
      if (msgBuilder_ == null) {
        return java.util.Collections.unmodifiableList(msg_);
      } else {
        return msgBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public int getMsgCount() {
      if (msgBuilder_ == null) {
        return msg_.size();
      } else {
        return msgBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public com.ge.predix.eventhub.stub.Message getMsg(int index) {
      if (msgBuilder_ == null) {
        return msg_.get(index);
      } else {
        return msgBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder setMsg(
        int index, com.ge.predix.eventhub.stub.Message value) {
      if (msgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMsgIsMutable();
        msg_.set(index, value);
        onChanged();
      } else {
        msgBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder setMsg(
        int index, com.ge.predix.eventhub.stub.Message.Builder builderForValue) {
      if (msgBuilder_ == null) {
        ensureMsgIsMutable();
        msg_.set(index, builderForValue.build());
        onChanged();
      } else {
        msgBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder addMsg(com.ge.predix.eventhub.stub.Message value) {
      if (msgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMsgIsMutable();
        msg_.add(value);
        onChanged();
      } else {
        msgBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder addMsg(
        int index, com.ge.predix.eventhub.stub.Message value) {
      if (msgBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMsgIsMutable();
        msg_.add(index, value);
        onChanged();
      } else {
        msgBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder addMsg(
        com.ge.predix.eventhub.stub.Message.Builder builderForValue) {
      if (msgBuilder_ == null) {
        ensureMsgIsMutable();
        msg_.add(builderForValue.build());
        onChanged();
      } else {
        msgBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder addMsg(
        int index, com.ge.predix.eventhub.stub.Message.Builder builderForValue) {
      if (msgBuilder_ == null) {
        ensureMsgIsMutable();
        msg_.add(index, builderForValue.build());
        onChanged();
      } else {
        msgBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder addAllMsg(
        java.lang.Iterable<? extends com.ge.predix.eventhub.stub.Message> values) {
      if (msgBuilder_ == null) {
        ensureMsgIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, msg_);
        onChanged();
      } else {
        msgBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder clearMsg() {
      if (msgBuilder_ == null) {
        msg_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        msgBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public Builder removeMsg(int index) {
      if (msgBuilder_ == null) {
        ensureMsgIsMutable();
        msg_.remove(index);
        onChanged();
      } else {
        msgBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public com.ge.predix.eventhub.stub.Message.Builder getMsgBuilder(
        int index) {
      return getMsgFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public com.ge.predix.eventhub.stub.MessageOrBuilder getMsgOrBuilder(
        int index) {
      if (msgBuilder_ == null) {
        return msg_.get(index);  } else {
        return msgBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public java.util.List<? extends com.ge.predix.eventhub.stub.MessageOrBuilder> 
         getMsgOrBuilderList() {
      if (msgBuilder_ != null) {
        return msgBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(msg_);
      }
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public com.ge.predix.eventhub.stub.Message.Builder addMsgBuilder() {
      return getMsgFieldBuilder().addBuilder(
          com.ge.predix.eventhub.stub.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public com.ge.predix.eventhub.stub.Message.Builder addMsgBuilder(
        int index) {
      return getMsgFieldBuilder().addBuilder(
          index, com.ge.predix.eventhub.stub.Message.getDefaultInstance());
    }
    /**
     * <code>repeated .predix.eventhub.Message msg = 1;</code>
     */
    public java.util.List<com.ge.predix.eventhub.stub.Message.Builder> 
         getMsgBuilderList() {
      return getMsgFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.ge.predix.eventhub.stub.Message, com.ge.predix.eventhub.stub.Message.Builder, com.ge.predix.eventhub.stub.MessageOrBuilder> 
        getMsgFieldBuilder() {
      if (msgBuilder_ == null) {
        msgBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.ge.predix.eventhub.stub.Message, com.ge.predix.eventhub.stub.Message.Builder, com.ge.predix.eventhub.stub.MessageOrBuilder>(
                msg_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        msg_ = null;
      }
      return msgBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:predix.eventhub.Messages)
  }

  // @@protoc_insertion_point(class_scope:predix.eventhub.Messages)
  private static final com.ge.predix.eventhub.stub.Messages DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ge.predix.eventhub.stub.Messages();
  }

  public static com.ge.predix.eventhub.stub.Messages getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Messages>
      PARSER = new com.google.protobuf.AbstractParser<Messages>() {
    public Messages parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Messages(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<Messages> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Messages> getParserForType() {
    return PARSER;
  }

  public com.ge.predix.eventhub.stub.Messages getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class SetLineupNameScRspOuterClass {
  /**
   * Protobuf type {@code SetLineupNameScRsp}
   */
  public static final class SetLineupNameScRsp extends ProtoMessage<SetLineupNameScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 index = 8;</code>
     */
    private int index;

    /**
     * <code>optional string name = 6;</code>
     */
    private final Utf8String name = Utf8String.newEmptyInstance();

    private SetLineupNameScRsp() {
    }

    /**
     * @return a new empty instance of {@code SetLineupNameScRsp}
     */
    public static SetLineupNameScRsp newInstance() {
      return new SetLineupNameScRsp();
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public SetLineupNameScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public SetLineupNameScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 index = 8;</code>
     * @return whether the index field is set
     */
    public boolean hasIndex() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 index = 8;</code>
     * @return this
     */
    public SetLineupNameScRsp clearIndex() {
      bitField0_ &= ~0x00000002;
      index = 0;
      return this;
    }

    /**
     * <code>optional uint32 index = 8;</code>
     * @return the index
     */
    public int getIndex() {
      return index;
    }

    /**
     * <code>optional uint32 index = 8;</code>
     * @param value the index to set
     * @return this
     */
    public SetLineupNameScRsp setIndex(final int value) {
      bitField0_ |= 0x00000002;
      index = value;
      return this;
    }

    /**
     * <code>optional string name = 6;</code>
     * @return whether the name field is set
     */
    public boolean hasName() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional string name = 6;</code>
     * @return this
     */
    public SetLineupNameScRsp clearName() {
      bitField0_ &= ~0x00000004;
      name.clear();
      return this;
    }

    /**
     * <code>optional string name = 6;</code>
     * @return the name
     */
    public String getName() {
      return name.getString();
    }

    /**
     * <code>optional string name = 6;</code>
     * @return internal {@code Utf8String} representation of name for reading
     */
    public Utf8String getNameBytes() {
      return this.name;
    }

    /**
     * <code>optional string name = 6;</code>
     * @return internal {@code Utf8String} representation of name for modifications
     */
    public Utf8String getMutableNameBytes() {
      bitField0_ |= 0x00000004;
      return this.name;
    }

    /**
     * <code>optional string name = 6;</code>
     * @param value the name to set
     * @return this
     */
    public SetLineupNameScRsp setName(final CharSequence value) {
      bitField0_ |= 0x00000004;
      name.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string name = 6;</code>
     * @param value the name to set
     * @return this
     */
    public SetLineupNameScRsp setName(final Utf8String value) {
      bitField0_ |= 0x00000004;
      name.copyFrom(value);
      return this;
    }

    @Override
    public SetLineupNameScRsp copyFrom(final SetLineupNameScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        index = other.index;
        name.copyFrom(other.name);
      }
      return this;
    }

    @Override
    public SetLineupNameScRsp mergeFrom(final SetLineupNameScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasIndex()) {
        setIndex(other.index);
      }
      if (other.hasName()) {
        getMutableNameBytes().copyFrom(other.name);
      }
      return this;
    }

    @Override
    public SetLineupNameScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      index = 0;
      name.clear();
      return this;
    }

    @Override
    public SetLineupNameScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      name.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SetLineupNameScRsp)) {
        return false;
      }
      SetLineupNameScRsp other = (SetLineupNameScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasIndex() || index == other.index)
        && (!hasName() || name.equals(other.name));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 50);
        output.writeStringNoTag(name);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(name);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SetLineupNameScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // index
            index = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // name
            input.readString(name);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.index, index);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.name, name);
      }
      output.endObject();
    }

    @Override
    public SetLineupNameScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 100346066: {
            if (input.isAtField(FieldNames.index)) {
              if (!input.trySkipNullValue()) {
                index = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3373707: {
            if (input.isAtField(FieldNames.name)) {
              if (!input.trySkipNullValue()) {
                input.readString(name);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SetLineupNameScRsp clone() {
      return new SetLineupNameScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SetLineupNameScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SetLineupNameScRsp(), data).checkInitialized();
    }

    public static SetLineupNameScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetLineupNameScRsp(), input).checkInitialized();
    }

    public static SetLineupNameScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SetLineupNameScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating SetLineupNameScRsp messages
     */
    public static MessageFactory<SetLineupNameScRsp> getFactory() {
      return SetLineupNameScRspFactory.INSTANCE;
    }

    private enum SetLineupNameScRspFactory implements MessageFactory<SetLineupNameScRsp> {
      INSTANCE;

      @Override
      public SetLineupNameScRsp create() {
        return SetLineupNameScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName index = FieldName.forField("index");

      static final FieldName name = FieldName.forField("name");
    }
  }
}

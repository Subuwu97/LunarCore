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
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueTalentOuterClass {
  /**
   * Protobuf type {@code RogueTalent}
   */
  public static final class RogueTalent extends ProtoMessage<RogueTalent> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 talent_id = 12;</code>
     */
    private int talentId;

    /**
     * <code>optional .RogueTalentStatus status = 15;</code>
     */
    private int status;

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     */
    private final RepeatedMessage<RogueUnlockProgressOuterClass.RogueUnlockProgress> unlockProgressList = RepeatedMessage.newEmptyInstance(RogueUnlockProgressOuterClass.RogueUnlockProgress.getFactory());

    private RogueTalent() {
    }

    /**
     * @return a new empty instance of {@code RogueTalent}
     */
    public static RogueTalent newInstance() {
      return new RogueTalent();
    }

    /**
     * <code>optional uint32 talent_id = 12;</code>
     * @return whether the talentId field is set
     */
    public boolean hasTalentId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 talent_id = 12;</code>
     * @return this
     */
    public RogueTalent clearTalentId() {
      bitField0_ &= ~0x00000001;
      talentId = 0;
      return this;
    }

    /**
     * <code>optional uint32 talent_id = 12;</code>
     * @return the talentId
     */
    public int getTalentId() {
      return talentId;
    }

    /**
     * <code>optional uint32 talent_id = 12;</code>
     * @param value the talentId to set
     * @return this
     */
    public RogueTalent setTalentId(final int value) {
      bitField0_ |= 0x00000001;
      talentId = value;
      return this;
    }

    /**
     * <code>optional .RogueTalentStatus status = 15;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .RogueTalentStatus status = 15;</code>
     * @return this
     */
    public RogueTalent clearStatus() {
      bitField0_ &= ~0x00000002;
      status = 0;
      return this;
    }

    /**
     * <code>optional .RogueTalentStatus status = 15;</code>
     * @return the status
     */
    public RogueTalentStatusOuterClass.RogueTalentStatus getStatus() {
      return RogueTalentStatusOuterClass.RogueTalentStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link RogueTalent#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link RogueTalentStatusOuterClass.RogueTalentStatus}. Setting an invalid value
     * can cause {@link RogueTalent#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public RogueTalent setStatusValue(final int value) {
      bitField0_ |= 0x00000002;
      status = value;
      return this;
    }

    /**
     * <code>optional .RogueTalentStatus status = 15;</code>
     * @param value the status to set
     * @return this
     */
    public RogueTalent setStatus(final RogueTalentStatusOuterClass.RogueTalentStatus value) {
      bitField0_ |= 0x00000002;
      status = value.getNumber();
      return this;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     * @return whether the unlockProgressList field is set
     */
    public boolean hasUnlockProgressList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     * @return this
     */
    public RogueTalent clearUnlockProgressList() {
      bitField0_ &= ~0x00000004;
      unlockProgressList.clear();
      return this;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockProgressList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<RogueUnlockProgressOuterClass.RogueUnlockProgress> getUnlockProgressList(
        ) {
      return unlockProgressList;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<RogueUnlockProgressOuterClass.RogueUnlockProgress> getMutableUnlockProgressList(
        ) {
      bitField0_ |= 0x00000004;
      return unlockProgressList;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     * @param value the unlockProgressList to add
     * @return this
     */
    public RogueTalent addUnlockProgressList(
        final RogueUnlockProgressOuterClass.RogueUnlockProgress value) {
      bitField0_ |= 0x00000004;
      unlockProgressList.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueUnlockProgress unlock_progress_list = 13;</code>
     * @param values the unlockProgressList to add
     * @return this
     */
    public RogueTalent addAllUnlockProgressList(
        final RogueUnlockProgressOuterClass.RogueUnlockProgress... values) {
      bitField0_ |= 0x00000004;
      unlockProgressList.addAll(values);
      return this;
    }

    @Override
    public RogueTalent copyFrom(final RogueTalent other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        talentId = other.talentId;
        status = other.status;
        unlockProgressList.copyFrom(other.unlockProgressList);
      }
      return this;
    }

    @Override
    public RogueTalent mergeFrom(final RogueTalent other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTalentId()) {
        setTalentId(other.talentId);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      if (other.hasUnlockProgressList()) {
        getMutableUnlockProgressList().addAll(other.unlockProgressList);
      }
      return this;
    }

    @Override
    public RogueTalent clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      talentId = 0;
      status = 0;
      unlockProgressList.clear();
      return this;
    }

    @Override
    public RogueTalent clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockProgressList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueTalent)) {
        return false;
      }
      RogueTalent other = (RogueTalent) o;
      return bitField0_ == other.bitField0_
        && (!hasTalentId() || talentId == other.talentId)
        && (!hasStatus() || status == other.status)
        && (!hasUnlockProgressList() || unlockProgressList.equals(other.unlockProgressList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(talentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeEnumNoTag(status);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < unlockProgressList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(unlockProgressList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(talentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * unlockProgressList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(unlockProgressList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueTalent mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // talentId
            talentId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // status
            final int value = input.readInt32();
            if (RogueTalentStatusOuterClass.RogueTalentStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000002;
            }
            tag = input.readTag();
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // unlockProgressList
            tag = input.readRepeatedMessage(unlockProgressList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.talentId, talentId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeEnum(FieldNames.status, status, RogueTalentStatusOuterClass.RogueTalentStatus.converter());
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.unlockProgressList, unlockProgressList);
      }
      output.endObject();
    }

    @Override
    public RogueTalent mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -615305433:
          case -1894577842: {
            if (input.isAtField(FieldNames.talentId)) {
              if (!input.trySkipNullValue()) {
                talentId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final RogueTalentStatusOuterClass.RogueTalentStatus value = input.readEnum(RogueTalentStatusOuterClass.RogueTalentStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000002;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -580094513:
          case -313023051: {
            if (input.isAtField(FieldNames.unlockProgressList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(unlockProgressList);
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
    public RogueTalent clone() {
      return new RogueTalent().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueTalent parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueTalent(), data).checkInitialized();
    }

    public static RogueTalent parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalent(), input).checkInitialized();
    }

    public static RogueTalent parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueTalent(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueTalent messages
     */
    public static MessageFactory<RogueTalent> getFactory() {
      return RogueTalentFactory.INSTANCE;
    }

    private enum RogueTalentFactory implements MessageFactory<RogueTalent> {
      INSTANCE;

      @Override
      public RogueTalent create() {
        return RogueTalent.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName talentId = FieldName.forField("talentId", "talent_id");

      static final FieldName status = FieldName.forField("status");

      static final FieldName unlockProgressList = FieldName.forField("unlockProgressList", "unlock_progress_list");
    }
  }
}

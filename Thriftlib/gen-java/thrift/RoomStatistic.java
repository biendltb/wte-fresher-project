/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package ChatProject;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Room statistic by day(system time)
 */
public class RoomStatistic implements org.apache.thrift.TBase<RoomStatistic, RoomStatistic._Fields>, java.io.Serializable, Cloneable, Comparable<RoomStatistic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RoomStatistic");

  private static final org.apache.thrift.protocol.TField ROOM_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("roomId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField VIEW_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("ViewCount", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RoomStatisticStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RoomStatisticTupleSchemeFactory());
  }

  public String roomId; // required
  public int date; // required
  public int ViewCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROOM_ID((short)1, "roomId"),
    DATE((short)2, "date"),
    VIEW_COUNT((short)3, "ViewCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ROOM_ID
          return ROOM_ID;
        case 2: // DATE
          return DATE;
        case 3: // VIEW_COUNT
          return VIEW_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __DATE_ISSET_ID = 0;
  private static final int __VIEWCOUNT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROOM_ID, new org.apache.thrift.meta_data.FieldMetaData("roomId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VIEW_COUNT, new org.apache.thrift.meta_data.FieldMetaData("ViewCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RoomStatistic.class, metaDataMap);
  }

  public RoomStatistic() {
  }

  public RoomStatistic(
    String roomId,
    int date,
    int ViewCount)
  {
    this();
    this.roomId = roomId;
    this.date = date;
    setDateIsSet(true);
    this.ViewCount = ViewCount;
    setViewCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RoomStatistic(RoomStatistic other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRoomId()) {
      this.roomId = other.roomId;
    }
    this.date = other.date;
    this.ViewCount = other.ViewCount;
  }

  public RoomStatistic deepCopy() {
    return new RoomStatistic(this);
  }

  @Override
  public void clear() {
    this.roomId = null;
    setDateIsSet(false);
    this.date = 0;
    setViewCountIsSet(false);
    this.ViewCount = 0;
  }

  public String getRoomId() {
    return this.roomId;
  }

  public RoomStatistic setRoomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

  public void unsetRoomId() {
    this.roomId = null;
  }

  /** Returns true if field roomId is set (has been assigned a value) and false otherwise */
  public boolean isSetRoomId() {
    return this.roomId != null;
  }

  public void setRoomIdIsSet(boolean value) {
    if (!value) {
      this.roomId = null;
    }
  }

  public int getDate() {
    return this.date;
  }

  public RoomStatistic setDate(int date) {
    this.date = date;
    setDateIsSet(true);
    return this;
  }

  public void unsetDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return EncodingUtils.testBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  public void setDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATE_ISSET_ID, value);
  }

  public int getViewCount() {
    return this.ViewCount;
  }

  public RoomStatistic setViewCount(int ViewCount) {
    this.ViewCount = ViewCount;
    setViewCountIsSet(true);
    return this;
  }

  public void unsetViewCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID);
  }

  /** Returns true if field ViewCount is set (has been assigned a value) and false otherwise */
  public boolean isSetViewCount() {
    return EncodingUtils.testBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID);
  }

  public void setViewCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VIEWCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROOM_ID:
      if (value == null) {
        unsetRoomId();
      } else {
        setRoomId((String)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((Integer)value);
      }
      break;

    case VIEW_COUNT:
      if (value == null) {
        unsetViewCount();
      } else {
        setViewCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROOM_ID:
      return getRoomId();

    case DATE:
      return Integer.valueOf(getDate());

    case VIEW_COUNT:
      return Integer.valueOf(getViewCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROOM_ID:
      return isSetRoomId();
    case DATE:
      return isSetDate();
    case VIEW_COUNT:
      return isSetViewCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RoomStatistic)
      return this.equals((RoomStatistic)that);
    return false;
  }

  public boolean equals(RoomStatistic that) {
    if (that == null)
      return false;

    boolean this_present_roomId = true && this.isSetRoomId();
    boolean that_present_roomId = true && that.isSetRoomId();
    if (this_present_roomId || that_present_roomId) {
      if (!(this_present_roomId && that_present_roomId))
        return false;
      if (!this.roomId.equals(that.roomId))
        return false;
    }

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_ViewCount = true;
    boolean that_present_ViewCount = true;
    if (this_present_ViewCount || that_present_ViewCount) {
      if (!(this_present_ViewCount && that_present_ViewCount))
        return false;
      if (this.ViewCount != that.ViewCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(RoomStatistic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRoomId()).compareTo(other.isSetRoomId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoomId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roomId, other.roomId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetViewCount()).compareTo(other.isSetViewCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetViewCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ViewCount, other.ViewCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RoomStatistic(");
    boolean first = true;

    sb.append("roomId:");
    if (this.roomId == null) {
      sb.append("null");
    } else {
      sb.append(this.roomId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ViewCount:");
    sb.append(this.ViewCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RoomStatisticStandardSchemeFactory implements SchemeFactory {
    public RoomStatisticStandardScheme getScheme() {
      return new RoomStatisticStandardScheme();
    }
  }

  private static class RoomStatisticStandardScheme extends StandardScheme<RoomStatistic> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RoomStatistic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROOM_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roomId = iprot.readString();
              struct.setRoomIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.date = iprot.readI32();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VIEW_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.ViewCount = iprot.readI32();
              struct.setViewCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RoomStatistic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.roomId != null) {
        oprot.writeFieldBegin(ROOM_ID_FIELD_DESC);
        oprot.writeString(struct.roomId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI32(struct.date);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VIEW_COUNT_FIELD_DESC);
      oprot.writeI32(struct.ViewCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RoomStatisticTupleSchemeFactory implements SchemeFactory {
    public RoomStatisticTupleScheme getScheme() {
      return new RoomStatisticTupleScheme();
    }
  }

  private static class RoomStatisticTupleScheme extends TupleScheme<RoomStatistic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RoomStatistic struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRoomId()) {
        optionals.set(0);
      }
      if (struct.isSetDate()) {
        optionals.set(1);
      }
      if (struct.isSetViewCount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRoomId()) {
        oprot.writeString(struct.roomId);
      }
      if (struct.isSetDate()) {
        oprot.writeI32(struct.date);
      }
      if (struct.isSetViewCount()) {
        oprot.writeI32(struct.ViewCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RoomStatistic struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.roomId = iprot.readString();
        struct.setRoomIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.date = iprot.readI32();
        struct.setDateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ViewCount = iprot.readI32();
        struct.setViewCountIsSet(true);
      }
    }
  }

}

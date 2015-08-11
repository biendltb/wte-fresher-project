/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package business.library.thrift;

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
 * 
 */
public class EmotionIdDate implements org.apache.thrift.TBase<EmotionIdDate, EmotionIdDate._Fields>, java.io.Serializable, Cloneable, Comparable<EmotionIdDate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmotionIdDate");

  private static final org.apache.thrift.protocol.TField EMOTION_ID_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("emotionIdDate", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EmotionIdDateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EmotionIdDateTupleSchemeFactory());
  }

  public String emotionIdDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EMOTION_ID_DATE((short)1, "emotionIdDate");

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
        case 1: // EMOTION_ID_DATE
          return EMOTION_ID_DATE;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EMOTION_ID_DATE, new org.apache.thrift.meta_data.FieldMetaData("emotionIdDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmotionIdDate.class, metaDataMap);
  }

  public EmotionIdDate() {
  }

  public EmotionIdDate(
    String emotionIdDate)
  {
    this();
    this.emotionIdDate = emotionIdDate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmotionIdDate(EmotionIdDate other) {
    if (other.isSetEmotionIdDate()) {
      this.emotionIdDate = other.emotionIdDate;
    }
  }

  public EmotionIdDate deepCopy() {
    return new EmotionIdDate(this);
  }

  @Override
  public void clear() {
    this.emotionIdDate = null;
  }

  public String getEmotionIdDate() {
    return this.emotionIdDate;
  }

  public EmotionIdDate setEmotionIdDate(String emotionIdDate) {
    this.emotionIdDate = emotionIdDate;
    return this;
  }

  public void unsetEmotionIdDate() {
    this.emotionIdDate = null;
  }

  /** Returns true if field emotionIdDate is set (has been assigned a value) and false otherwise */
  public boolean isSetEmotionIdDate() {
    return this.emotionIdDate != null;
  }

  public void setEmotionIdDateIsSet(boolean value) {
    if (!value) {
      this.emotionIdDate = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMOTION_ID_DATE:
      if (value == null) {
        unsetEmotionIdDate();
      } else {
        setEmotionIdDate((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMOTION_ID_DATE:
      return getEmotionIdDate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMOTION_ID_DATE:
      return isSetEmotionIdDate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EmotionIdDate)
      return this.equals((EmotionIdDate)that);
    return false;
  }

  public boolean equals(EmotionIdDate that) {
    if (that == null)
      return false;

    boolean this_present_emotionIdDate = true && this.isSetEmotionIdDate();
    boolean that_present_emotionIdDate = true && that.isSetEmotionIdDate();
    if (this_present_emotionIdDate || that_present_emotionIdDate) {
      if (!(this_present_emotionIdDate && that_present_emotionIdDate))
        return false;
      if (!this.emotionIdDate.equals(that.emotionIdDate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(EmotionIdDate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEmotionIdDate()).compareTo(other.isSetEmotionIdDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmotionIdDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emotionIdDate, other.emotionIdDate);
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
    StringBuilder sb = new StringBuilder("EmotionIdDate(");
    boolean first = true;

    sb.append("emotionIdDate:");
    if (this.emotionIdDate == null) {
      sb.append("null");
    } else {
      sb.append(this.emotionIdDate);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EmotionIdDateStandardSchemeFactory implements SchemeFactory {
    public EmotionIdDateStandardScheme getScheme() {
      return new EmotionIdDateStandardScheme();
    }
  }

  private static class EmotionIdDateStandardScheme extends StandardScheme<EmotionIdDate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmotionIdDate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EMOTION_ID_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.emotionIdDate = iprot.readString();
              struct.setEmotionIdDateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmotionIdDate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.emotionIdDate != null) {
        oprot.writeFieldBegin(EMOTION_ID_DATE_FIELD_DESC);
        oprot.writeString(struct.emotionIdDate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmotionIdDateTupleSchemeFactory implements SchemeFactory {
    public EmotionIdDateTupleScheme getScheme() {
      return new EmotionIdDateTupleScheme();
    }
  }

  private static class EmotionIdDateTupleScheme extends TupleScheme<EmotionIdDate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmotionIdDate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEmotionIdDate()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetEmotionIdDate()) {
        oprot.writeString(struct.emotionIdDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmotionIdDate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.emotionIdDate = iprot.readString();
        struct.setEmotionIdDateIsSet(true);
      }
    }
  }

}

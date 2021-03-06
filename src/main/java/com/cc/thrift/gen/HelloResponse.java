/**
 * Autogenerated by Thrift Compiler (0.15.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cc.thrift.gen;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.15.0)", date = "2022-02-15")
public class HelloResponse implements org.apache.thrift.TBase<HelloResponse, HelloResponse._Fields>, java.io.Serializable, Cloneable, Comparable<HelloResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelloResponse");

  private static final org.apache.thrift.protocol.TField GREETING_FIELD_DESC = new org.apache.thrift.protocol.TField("greeting", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new HelloResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new HelloResponseTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String greeting; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GREETING((short)1, "greeting");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GREETING
          return GREETING;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GREETING, new org.apache.thrift.meta_data.FieldMetaData("greeting", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelloResponse.class, metaDataMap);
  }

  public HelloResponse() {
  }

  public HelloResponse(
    java.lang.String greeting)
  {
    this();
    this.greeting = greeting;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelloResponse(HelloResponse other) {
    if (other.isSetGreeting()) {
      this.greeting = other.greeting;
    }
  }

  public HelloResponse deepCopy() {
    return new HelloResponse(this);
  }

  @Override
  public void clear() {
    this.greeting = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getGreeting() {
    return this.greeting;
  }

  public HelloResponse setGreeting(@org.apache.thrift.annotation.Nullable java.lang.String greeting) {
    this.greeting = greeting;
    return this;
  }

  public void unsetGreeting() {
    this.greeting = null;
  }

  /** Returns true if field greeting is set (has been assigned a value) and false otherwise */
  public boolean isSetGreeting() {
    return this.greeting != null;
  }

  public void setGreetingIsSet(boolean value) {
    if (!value) {
      this.greeting = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case GREETING:
      if (value == null) {
        unsetGreeting();
      } else {
        setGreeting((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case GREETING:
      return getGreeting();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case GREETING:
      return isSetGreeting();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof HelloResponse)
      return this.equals((HelloResponse)that);
    return false;
  }

  public boolean equals(HelloResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_greeting = true && this.isSetGreeting();
    boolean that_present_greeting = true && that.isSetGreeting();
    if (this_present_greeting || that_present_greeting) {
      if (!(this_present_greeting && that_present_greeting))
        return false;
      if (!this.greeting.equals(that.greeting))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetGreeting()) ? 131071 : 524287);
    if (isSetGreeting())
      hashCode = hashCode * 8191 + greeting.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(HelloResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetGreeting(), other.isSetGreeting());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGreeting()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.greeting, other.greeting);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("HelloResponse(");
    boolean first = true;

    sb.append("greeting:");
    if (this.greeting == null) {
      sb.append("null");
    } else {
      sb.append(this.greeting);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HelloResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HelloResponseStandardScheme getScheme() {
      return new HelloResponseStandardScheme();
    }
  }

  private static class HelloResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<HelloResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelloResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GREETING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.greeting = iprot.readString();
              struct.setGreetingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelloResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.greeting != null) {
        oprot.writeFieldBegin(GREETING_FIELD_DESC);
        oprot.writeString(struct.greeting);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelloResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public HelloResponseTupleScheme getScheme() {
      return new HelloResponseTupleScheme();
    }
  }

  private static class HelloResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<HelloResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HelloResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetGreeting()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetGreeting()) {
        oprot.writeString(struct.greeting);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HelloResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.greeting = iprot.readString();
        struct.setGreetingIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


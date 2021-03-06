/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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

@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class TableMeta implements org.apache.thrift.TBase<TableMeta, TableMeta._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableMeta");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("tableType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COMMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("comments", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableMetaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableMetaTupleSchemeFactory());
  }

  private String dbName; // required
  private String tableName; // required
  private String tableType; // required
  private String comments; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TABLE_NAME((short)2, "tableName"),
    TABLE_TYPE((short)3, "tableType"),
    COMMENTS((short)4, "comments");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // TABLE_TYPE
          return TABLE_TYPE;
        case 4: // COMMENTS
          return COMMENTS;
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
  private _Fields optionals[] = {_Fields.COMMENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("tableType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COMMENTS, new org.apache.thrift.meta_data.FieldMetaData("comments", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableMeta.class, metaDataMap);
  }

  public TableMeta() {
  }

  public TableMeta(
    String dbName,
    String tableName,
    String tableType)
  {
    this();
    this.dbName = dbName;
    this.tableName = tableName;
    this.tableType = tableType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableMeta(TableMeta other) {
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetTableType()) {
      this.tableType = other.tableType;
    }
    if (other.isSetComments()) {
      this.comments = other.comments;
    }
  }

  public TableMeta deepCopy() {
    return new TableMeta(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tableName = null;
    this.tableType = null;
    this.comments = null;
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getTableName() {
    return this.tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public String getTableType() {
    return this.tableType;
  }

  public void setTableType(String tableType) {
    this.tableType = tableType;
  }

  public void unsetTableType() {
    this.tableType = null;
  }

  /** Returns true if field tableType is set (has been assigned a value) and false otherwise */
  public boolean isSetTableType() {
    return this.tableType != null;
  }

  public void setTableTypeIsSet(boolean value) {
    if (!value) {
      this.tableType = null;
    }
  }

  public String getComments() {
    return this.comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public void unsetComments() {
    this.comments = null;
  }

  /** Returns true if field comments is set (has been assigned a value) and false otherwise */
  public boolean isSetComments() {
    return this.comments != null;
  }

  public void setCommentsIsSet(boolean value) {
    if (!value) {
      this.comments = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((String)value);
      }
      break;

    case TABLE_TYPE:
      if (value == null) {
        unsetTableType();
      } else {
        setTableType((String)value);
      }
      break;

    case COMMENTS:
      if (value == null) {
        unsetComments();
      } else {
        setComments((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case TABLE_TYPE:
      return getTableType();

    case COMMENTS:
      return getComments();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case TABLE_TYPE:
      return isSetTableType();
    case COMMENTS:
      return isSetComments();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableMeta)
      return this.equals((TableMeta)that);
    return false;
  }

  public boolean equals(TableMeta that) {
    if (that == null)
      return false;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_tableType = true && this.isSetTableType();
    boolean that_present_tableType = true && that.isSetTableType();
    if (this_present_tableType || that_present_tableType) {
      if (!(this_present_tableType && that_present_tableType))
        return false;
      if (!this.tableType.equals(that.tableType))
        return false;
    }

    boolean this_present_comments = true && this.isSetComments();
    boolean that_present_comments = true && that.isSetComments();
    if (this_present_comments || that_present_comments) {
      if (!(this_present_comments && that_present_comments))
        return false;
      if (!this.comments.equals(that.comments))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_dbName = true && (isSetDbName());
    builder.append(present_dbName);
    if (present_dbName)
      builder.append(dbName);

    boolean present_tableName = true && (isSetTableName());
    builder.append(present_tableName);
    if (present_tableName)
      builder.append(tableName);

    boolean present_tableType = true && (isSetTableType());
    builder.append(present_tableType);
    if (present_tableType)
      builder.append(tableType);

    boolean present_comments = true && (isSetComments());
    builder.append(present_comments);
    if (present_comments)
      builder.append(comments);

    return builder.toHashCode();
  }

  public int compareTo(TableMeta other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TableMeta typedOther = (TableMeta)other;

    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(typedOther.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, typedOther.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableName()).compareTo(typedOther.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, typedOther.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableType()).compareTo(typedOther.isSetTableType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableType, typedOther.tableType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComments()).compareTo(typedOther.isSetComments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.comments, typedOther.comments);
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
    StringBuilder sb = new StringBuilder("TableMeta(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableType:");
    if (this.tableType == null) {
      sb.append("null");
    } else {
      sb.append(this.tableType);
    }
    first = false;
    if (isSetComments()) {
      if (!first) sb.append(", ");
      sb.append("comments:");
      if (this.comments == null) {
        sb.append("null");
      } else {
        sb.append(this.comments);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' is unset! Struct:" + toString());
    }

    if (!isSetTableType()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableType' is unset! Struct:" + toString());
    }

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

  private static class TableMetaStandardSchemeFactory implements SchemeFactory {
    public TableMetaStandardScheme getScheme() {
      return new TableMetaStandardScheme();
    }
  }

  private static class TableMetaStandardScheme extends StandardScheme<TableMeta> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableMeta struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableType = iprot.readString();
              struct.setTableTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COMMENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.comments = iprot.readString();
              struct.setCommentsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableMeta struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.tableType != null) {
        oprot.writeFieldBegin(TABLE_TYPE_FIELD_DESC);
        oprot.writeString(struct.tableType);
        oprot.writeFieldEnd();
      }
      if (struct.comments != null) {
        if (struct.isSetComments()) {
          oprot.writeFieldBegin(COMMENTS_FIELD_DESC);
          oprot.writeString(struct.comments);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableMetaTupleSchemeFactory implements SchemeFactory {
    public TableMetaTupleScheme getScheme() {
      return new TableMetaTupleScheme();
    }
  }

  private static class TableMetaTupleScheme extends TupleScheme<TableMeta> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tableName);
      oprot.writeString(struct.tableType);
      BitSet optionals = new BitSet();
      if (struct.isSetComments()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetComments()) {
        oprot.writeString(struct.comments);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableMeta struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tableName = iprot.readString();
      struct.setTableNameIsSet(true);
      struct.tableType = iprot.readString();
      struct.setTableTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.comments = iprot.readString();
        struct.setCommentsIsSet(true);
      }
    }
  }

}


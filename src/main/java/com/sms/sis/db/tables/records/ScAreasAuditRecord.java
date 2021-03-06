/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScAreasAudit;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScAreasAuditRecord extends UpdatableRecordImpl<ScAreasAuditRecord> implements Record10<String, String, Timestamp, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 2103469156;

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.parent_id</code>.
     */
    public void setParentId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.parent_id</code>.
     */
    public String getParentId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.date_created</code>.
     */
    public void setDateCreated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.date_created</code>.
     */
    public Timestamp getDateCreated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.field_name</code>.
     */
    public void setFieldName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.field_name</code>.
     */
    public String getFieldName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.data_type</code>.
     */
    public void setDataType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.data_type</code>.
     */
    public String getDataType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.before_value_string</code>.
     */
    public void setBeforeValueString(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.before_value_string</code>.
     */
    public String getBeforeValueString() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.after_value_string</code>.
     */
    public void setAfterValueString(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.after_value_string</code>.
     */
    public String getAfterValueString() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.before_value_text</code>.
     */
    public void setBeforeValueText(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.before_value_text</code>.
     */
    public String getBeforeValueText() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_areas_audit.after_value_text</code>.
     */
    public void setAfterValueText(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_areas_audit.after_value_text</code>.
     */
    public String getAfterValueText() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, Timestamp, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, Timestamp, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScAreasAudit.SC_AREAS_AUDIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ScAreasAudit.SC_AREAS_AUDIT.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ScAreasAudit.SC_AREAS_AUDIT.DATE_CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScAreasAudit.SC_AREAS_AUDIT.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScAreasAudit.SC_AREAS_AUDIT.FIELD_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ScAreasAudit.SC_AREAS_AUDIT.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ScAreasAudit.SC_AREAS_AUDIT.BEFORE_VALUE_STRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ScAreasAudit.SC_AREAS_AUDIT.AFTER_VALUE_STRING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ScAreasAudit.SC_AREAS_AUDIT.BEFORE_VALUE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ScAreasAudit.SC_AREAS_AUDIT.AFTER_VALUE_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFieldName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBeforeValueString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAfterValueString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBeforeValueText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAfterValueText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value2(String value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value3(Timestamp value) {
        setDateCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value4(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value5(String value) {
        setFieldName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value6(String value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value7(String value) {
        setBeforeValueString(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value8(String value) {
        setAfterValueString(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value9(String value) {
        setBeforeValueText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord value10(String value) {
        setAfterValueText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAreasAuditRecord values(String value1, String value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScAreasAuditRecord
     */
    public ScAreasAuditRecord() {
        super(ScAreasAudit.SC_AREAS_AUDIT);
    }

    /**
     * Create a detached, initialised ScAreasAuditRecord
     */
    public ScAreasAuditRecord(String id, String parentId, Timestamp dateCreated, String createdBy, String fieldName, String dataType, String beforeValueString, String afterValueString, String beforeValueText, String afterValueText) {
        super(ScAreasAudit.SC_AREAS_AUDIT);

        set(0, id);
        set(1, parentId);
        set(2, dateCreated);
        set(3, createdBy);
        set(4, fieldName);
        set(5, dataType);
        set(6, beforeValueString);
        set(7, afterValueString);
        set(8, beforeValueText);
        set(9, afterValueText);
    }
}

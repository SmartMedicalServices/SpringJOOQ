/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScDoctortype;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ScDoctortypeRecord extends UpdatableRecordImpl<ScDoctortypeRecord> implements Record12<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, Integer> {

    private static final long serialVersionUID = -76794947;

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.english_name</code>.
     */
    public void setEnglishName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.english_name</code>.
     */
    public String getEnglishName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.remarks</code>.
     */
    public void setRemarks(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.remarks</code>.
     */
    public String getRemarks() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_doctortype.cmid</code>.
     */
    public void setCmid(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_doctortype.cmid</code>.
     */
    public Integer getCmid() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScDoctortype.SC_DOCTORTYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ScDoctortype.SC_DOCTORTYPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ScDoctortype.SC_DOCTORTYPE.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ScDoctortype.SC_DOCTORTYPE.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScDoctortype.SC_DOCTORTYPE.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ScDoctortype.SC_DOCTORTYPE.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ScDoctortype.SC_DOCTORTYPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ScDoctortype.SC_DOCTORTYPE.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ScDoctortype.SC_DOCTORTYPE.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ScDoctortype.SC_DOCTORTYPE.ENGLISH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ScDoctortype.SC_DOCTORTYPE.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return ScDoctortype.SC_DOCTORTYPE.CMID;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateEntered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModifiedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getEnglishName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getCmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value10(String value) {
        setEnglishName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value11(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord value12(Integer value) {
        setCmid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDoctortypeRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, String value11, Integer value12) {
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
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScDoctortypeRecord
     */
    public ScDoctortypeRecord() {
        super(ScDoctortype.SC_DOCTORTYPE);
    }

    /**
     * Create a detached, initialised ScDoctortypeRecord
     */
    public ScDoctortypeRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String englishName, String remarks, Integer cmid) {
        super(ScDoctortype.SC_DOCTORTYPE);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, englishName);
        set(10, remarks);
        set(11, cmid);
    }
}

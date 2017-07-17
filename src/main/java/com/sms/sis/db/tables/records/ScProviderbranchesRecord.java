/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScProviderbranches;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class ScProviderbranchesRecord extends UpdatableRecordImpl<ScProviderbranchesRecord> implements Record16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1320898838;

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.sc_areas_id_c</code>.
     */
    public void setScAreasIdC(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.sc_areas_id_c</code>.
     */
    public String getScAreasIdC() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.address</code>.
     */
    public void setAddress(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.address</code>.
     */
    public String getAddress() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.phone_1</code>.
     */
    public void setPhone_1(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.phone_1</code>.
     */
    public String getPhone_1() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.phone_2</code>.
     */
    public void setPhone_2(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.phone_2</code>.
     */
    public String getPhone_2() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.phone_3</code>.
     */
    public void setPhone_3(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.phone_3</code>.
     */
    public String getPhone_3() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.phone_4</code>.
     */
    public void setPhone_4(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.phone_4</code>.
     */
    public String getPhone_4() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providerbranches.fax</code>.
     */
    public void setFax(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providerbranches.fax</code>.
     */
    public String getFax() {
        return (String) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.SC_AREAS_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.PHONE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.PHONE_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.PHONE_3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.PHONE_4;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ScProviderbranches.SC_PROVIDERBRANCHES.FAX;
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
        return getScAreasIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPhone_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPhone_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPhone_3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPhone_4();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getFax();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value10(String value) {
        setScAreasIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value11(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value12(String value) {
        setPhone_1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value13(String value) {
        setPhone_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value14(String value) {
        setPhone_3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value15(String value) {
        setPhone_4(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord value16(String value) {
        setFax(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScProviderbranchesRecord
     */
    public ScProviderbranchesRecord() {
        super(ScProviderbranches.SC_PROVIDERBRANCHES);
    }

    /**
     * Create a detached, initialised ScProviderbranchesRecord
     */
    public ScProviderbranchesRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String scAreasIdC, String address, String phone_1, String phone_2, String phone_3, String phone_4, String fax) {
        super(ScProviderbranches.SC_PROVIDERBRANCHES);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, scAreasIdC);
        set(10, address);
        set(11, phone_1);
        set(12, phone_2);
        set(13, phone_3);
        set(14, phone_4);
        set(15, fax);
    }
}

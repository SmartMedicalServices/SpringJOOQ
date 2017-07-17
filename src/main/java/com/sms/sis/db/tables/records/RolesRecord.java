/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.Roles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class RolesRecord extends UpdatableRecordImpl<RolesRecord> implements Record9<String, Timestamp, Timestamp, String, String, String, String, String, Byte> {

    private static final long serialVersionUID = -392957715;

    /**
     * Setter for <code>sugarcrm_4_12.roles.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.modules</code>.
     */
    public void setModules(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.modules</code>.
     */
    public String getModules() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.roles.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.roles.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Timestamp, Timestamp, String, String, String, String, String, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, Timestamp, Timestamp, String, String, String, String, String, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Roles.ROLES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Roles.ROLES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Roles.ROLES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Roles.ROLES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Roles.ROLES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Roles.ROLES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Roles.ROLES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Roles.ROLES.MODULES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Roles.ROLES.DELETED;
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
    public Timestamp value2() {
        return getDateEntered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getModifiedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getName();
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
    public String value8() {
        return getModules();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value2(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value3(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value4(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value8(String value) {
        setModules(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord value9(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RolesRecord values(String value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, Byte value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RolesRecord
     */
    public RolesRecord() {
        super(Roles.ROLES);
    }

    /**
     * Create a detached, initialised RolesRecord
     */
    public RolesRecord(String id, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String name, String description, String modules, Byte deleted) {
        super(Roles.ROLES);

        set(0, id);
        set(1, dateEntered);
        set(2, dateModified);
        set(3, modifiedUserId);
        set(4, createdBy);
        set(5, name);
        set(6, description);
        set(7, modules);
        set(8, deleted);
    }
}

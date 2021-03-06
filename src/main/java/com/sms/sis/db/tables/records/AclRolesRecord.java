/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.AclRoles;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class AclRolesRecord extends UpdatableRecordImpl<AclRolesRecord> implements Record8<String, Timestamp, Timestamp, String, String, String, String, Byte> {

    private static final long serialVersionUID = -1424521572;

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.name</code>.
     */
    public void setName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Timestamp, Timestamp, String, String, String, String, Byte> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Timestamp, Timestamp, String, String, String, String, Byte> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AclRoles.ACL_ROLES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return AclRoles.ACL_ROLES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AclRoles.ACL_ROLES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AclRoles.ACL_ROLES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AclRoles.ACL_ROLES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AclRoles.ACL_ROLES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AclRoles.ACL_ROLES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return AclRoles.ACL_ROLES.DELETED;
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
    public Byte value8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value2(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value3(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value4(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value6(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesRecord values(String value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, Byte value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AclRolesRecord
     */
    public AclRolesRecord() {
        super(AclRoles.ACL_ROLES);
    }

    /**
     * Create a detached, initialised AclRolesRecord
     */
    public AclRolesRecord(String id, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String name, String description, Byte deleted) {
        super(AclRoles.ACL_ROLES);

        set(0, id);
        set(1, dateEntered);
        set(2, dateModified);
        set(3, modifiedUserId);
        set(4, createdBy);
        set(5, name);
        set(6, description);
        set(7, deleted);
    }
}

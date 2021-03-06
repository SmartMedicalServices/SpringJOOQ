/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.AclRolesActions;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class AclRolesActionsRecord extends UpdatableRecordImpl<AclRolesActionsRecord> implements Record6<String, String, String, Integer, Timestamp, Byte> {

    private static final long serialVersionUID = 1758822662;

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.role_id</code>.
     */
    public void setRoleId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.role_id</code>.
     */
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.action_id</code>.
     */
    public void setActionId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.action_id</code>.
     */
    public String getActionId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.access_override</code>.
     */
    public void setAccessOverride(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.access_override</code>.
     */
    public Integer getAccessOverride() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.acl_roles_actions.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.acl_roles_actions.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, Integer, Timestamp, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, Integer, Timestamp, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AclRolesActions.ACL_ROLES_ACTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AclRolesActions.ACL_ROLES_ACTIONS.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AclRolesActions.ACL_ROLES_ACTIONS.ACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return AclRolesActions.ACL_ROLES_ACTIONS.ACCESS_OVERRIDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return AclRolesActions.ACL_ROLES_ACTIONS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return AclRolesActions.ACL_ROLES_ACTIONS.DELETED;
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getActionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAccessOverride();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value3(String value) {
        setActionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value4(Integer value) {
        setAccessOverride(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value5(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord value6(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AclRolesActionsRecord values(String value1, String value2, String value3, Integer value4, Timestamp value5, Byte value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AclRolesActionsRecord
     */
    public AclRolesActionsRecord() {
        super(AclRolesActions.ACL_ROLES_ACTIONS);
    }

    /**
     * Create a detached, initialised AclRolesActionsRecord
     */
    public AclRolesActionsRecord(String id, String roleId, String actionId, Integer accessOverride, Timestamp dateModified, Byte deleted) {
        super(AclRolesActions.ACL_ROLES_ACTIONS);

        set(0, id);
        set(1, roleId);
        set(2, actionId);
        set(3, accessOverride);
        set(4, dateModified);
        set(5, deleted);
    }
}

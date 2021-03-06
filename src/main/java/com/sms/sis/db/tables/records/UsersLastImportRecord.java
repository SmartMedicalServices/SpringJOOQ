/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.UsersLastImport;

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
public class UsersLastImportRecord extends UpdatableRecordImpl<UsersLastImportRecord> implements Record6<String, String, String, String, String, Byte> {

    private static final long serialVersionUID = 973973446;

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.import_module</code>.
     */
    public void setImportModule(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.import_module</code>.
     */
    public String getImportModule() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.bean_type</code>.
     */
    public void setBeanType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.bean_type</code>.
     */
    public String getBeanType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.bean_id</code>.
     */
    public void setBeanId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.bean_id</code>.
     */
    public String getBeanId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_last_import.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_last_import.deleted</code>.
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
    public Row6<String, String, String, String, String, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, String, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UsersLastImport.USERS_LAST_IMPORT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UsersLastImport.USERS_LAST_IMPORT.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UsersLastImport.USERS_LAST_IMPORT.IMPORT_MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UsersLastImport.USERS_LAST_IMPORT.BEAN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return UsersLastImport.USERS_LAST_IMPORT.BEAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return UsersLastImport.USERS_LAST_IMPORT.DELETED;
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
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getImportModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBeanType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBeanId();
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
    public UsersLastImportRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord value2(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord value3(String value) {
        setImportModule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord value4(String value) {
        setBeanType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord value5(String value) {
        setBeanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord value6(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersLastImportRecord values(String value1, String value2, String value3, String value4, String value5, Byte value6) {
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
     * Create a detached UsersLastImportRecord
     */
    public UsersLastImportRecord() {
        super(UsersLastImport.USERS_LAST_IMPORT);
    }

    /**
     * Create a detached, initialised UsersLastImportRecord
     */
    public UsersLastImportRecord(String id, String assignedUserId, String importModule, String beanType, String beanId, Byte deleted) {
        super(UsersLastImport.USERS_LAST_IMPORT);

        set(0, id);
        set(1, assignedUserId);
        set(2, importModule);
        set(3, beanType);
        set(4, beanId);
        set(5, deleted);
    }
}

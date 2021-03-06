/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.UsersPasswordLink;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class UsersPasswordLinkRecord extends UpdatableRecordImpl<UsersPasswordLinkRecord> implements Record4<String, String, Timestamp, Byte> {

    private static final long serialVersionUID = 1222947377;

    /**
     * Setter for <code>sugarcrm_4_12.users_password_link.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_password_link.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_password_link.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_password_link.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_password_link.date_generated</code>.
     */
    public void setDateGenerated(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_password_link.date_generated</code>.
     */
    public Timestamp getDateGenerated() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.users_password_link.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.users_password_link.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, Timestamp, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UsersPasswordLink.USERS_PASSWORD_LINK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UsersPasswordLink.USERS_PASSWORD_LINK.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return UsersPasswordLink.USERS_PASSWORD_LINK.DATE_GENERATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return UsersPasswordLink.USERS_PASSWORD_LINK.DELETED;
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
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateGenerated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersPasswordLinkRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersPasswordLinkRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersPasswordLinkRecord value3(Timestamp value) {
        setDateGenerated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersPasswordLinkRecord value4(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersPasswordLinkRecord values(String value1, String value2, Timestamp value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersPasswordLinkRecord
     */
    public UsersPasswordLinkRecord() {
        super(UsersPasswordLink.USERS_PASSWORD_LINK);
    }

    /**
     * Create a detached, initialised UsersPasswordLinkRecord
     */
    public UsersPasswordLinkRecord(String id, String username, Timestamp dateGenerated, Byte deleted) {
        super(UsersPasswordLink.USERS_PASSWORD_LINK);

        set(0, id);
        set(1, username);
        set(2, dateGenerated);
        set(3, deleted);
    }
}

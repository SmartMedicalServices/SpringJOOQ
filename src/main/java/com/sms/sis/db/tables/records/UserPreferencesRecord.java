/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.UserPreferences;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class UserPreferencesRecord extends UpdatableRecordImpl<UserPreferencesRecord> implements Record7<String, String, Byte, Timestamp, Timestamp, String, String> {

    private static final long serialVersionUID = 682967160;

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.category</code>.
     */
    public void setCategory(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.category</code>.
     */
    public String getCategory() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.user_preferences.contents</code>.
     */
    public void setContents(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.user_preferences.contents</code>.
     */
    public String getContents() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Byte, Timestamp, Timestamp, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Byte, Timestamp, Timestamp, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserPreferences.USER_PREFERENCES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserPreferences.USER_PREFERENCES.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return UserPreferences.USER_PREFERENCES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return UserPreferences.USER_PREFERENCES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return UserPreferences.USER_PREFERENCES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserPreferences.USER_PREFERENCES.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return UserPreferences.USER_PREFERENCES.CONTENTS;
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
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateEntered();
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
    public String value6() {
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getContents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value2(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value4(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value5(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value6(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord value7(String value) {
        setContents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreferencesRecord values(String value1, String value2, Byte value3, Timestamp value4, Timestamp value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserPreferencesRecord
     */
    public UserPreferencesRecord() {
        super(UserPreferences.USER_PREFERENCES);
    }

    /**
     * Create a detached, initialised UserPreferencesRecord
     */
    public UserPreferencesRecord(String id, String category, Byte deleted, Timestamp dateEntered, Timestamp dateModified, String assignedUserId, String contents) {
        super(UserPreferences.USER_PREFERENCES);

        set(0, id);
        set(1, category);
        set(2, deleted);
        set(3, dateEntered);
        set(4, dateModified);
        set(5, assignedUserId);
        set(6, contents);
    }
}

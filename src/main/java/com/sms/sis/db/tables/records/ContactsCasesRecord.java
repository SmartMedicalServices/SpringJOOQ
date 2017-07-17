/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ContactsCases;

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
public class ContactsCasesRecord extends UpdatableRecordImpl<ContactsCasesRecord> implements Record6<String, String, String, String, Timestamp, Byte> {

    private static final long serialVersionUID = -719627297;

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.contact_id</code>.
     */
    public void setContactId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.contact_id</code>.
     */
    public String getContactId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.case_id</code>.
     */
    public void setCaseId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.case_id</code>.
     */
    public String getCaseId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.contact_role</code>.
     */
    public void setContactRole(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.contact_role</code>.
     */
    public String getContactRole() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.contacts_cases.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.contacts_cases.deleted</code>.
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
    public Row6<String, String, String, String, Timestamp, Byte> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, String, String, Timestamp, Byte> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ContactsCases.CONTACTS_CASES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ContactsCases.CONTACTS_CASES.CONTACT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContactsCases.CONTACTS_CASES.CASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContactsCases.CONTACTS_CASES.CONTACT_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ContactsCases.CONTACTS_CASES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return ContactsCases.CONTACTS_CASES.DELETED;
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
        return getContactId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContactRole();
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
    public ContactsCasesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord value2(String value) {
        setContactId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord value3(String value) {
        setCaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord value4(String value) {
        setContactRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord value5(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord value6(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCasesRecord values(String value1, String value2, String value3, String value4, Timestamp value5, Byte value6) {
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
     * Create a detached ContactsCasesRecord
     */
    public ContactsCasesRecord() {
        super(ContactsCases.CONTACTS_CASES);
    }

    /**
     * Create a detached, initialised ContactsCasesRecord
     */
    public ContactsCasesRecord(String id, String contactId, String caseId, String contactRole, Timestamp dateModified, Byte deleted) {
        super(ContactsCases.CONTACTS_CASES);

        set(0, id);
        set(1, contactId);
        set(2, caseId);
        set(3, contactRole);
        set(4, dateModified);
        set(5, deleted);
    }
}

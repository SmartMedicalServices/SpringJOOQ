/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.EmailsEmailAddrRel;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class EmailsEmailAddrRelRecord extends UpdatableRecordImpl<EmailsEmailAddrRelRecord> implements Record5<String, String, String, String, Byte> {

    private static final long serialVersionUID = 572482459;

    /**
     * Setter for <code>sugarcrm_4_12.emails_email_addr_rel.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_email_addr_rel.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_email_addr_rel.email_id</code>.
     */
    public void setEmailId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_email_addr_rel.email_id</code>.
     */
    public String getEmailId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_email_addr_rel.address_type</code>.
     */
    public void setAddressType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_email_addr_rel.address_type</code>.
     */
    public String getAddressType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_email_addr_rel.email_address_id</code>.
     */
    public void setEmailAddressId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_email_addr_rel.email_address_id</code>.
     */
    public String getEmailAddressId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_email_addr_rel.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_email_addr_rel.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL.EMAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL.ADDRESS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL.EMAIL_ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL.DELETED;
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
        return getEmailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddressType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmailAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord value2(String value) {
        setEmailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord value3(String value) {
        setAddressType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord value4(String value) {
        setEmailAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord value5(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsEmailAddrRelRecord values(String value1, String value2, String value3, String value4, Byte value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailsEmailAddrRelRecord
     */
    public EmailsEmailAddrRelRecord() {
        super(EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL);
    }

    /**
     * Create a detached, initialised EmailsEmailAddrRelRecord
     */
    public EmailsEmailAddrRelRecord(String id, String emailId, String addressType, String emailAddressId, Byte deleted) {
        super(EmailsEmailAddrRel.EMAILS_EMAIL_ADDR_REL);

        set(0, id);
        set(1, emailId);
        set(2, addressType);
        set(3, emailAddressId);
        set(4, deleted);
    }
}

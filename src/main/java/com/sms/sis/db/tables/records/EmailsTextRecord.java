/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.EmailsText;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class EmailsTextRecord extends UpdatableRecordImpl<EmailsTextRecord> implements Record10<String, String, String, String, String, String, String, String, String, Byte> {

    private static final long serialVersionUID = 159998580;

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.email_id</code>.
     */
    public void setEmailId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.email_id</code>.
     */
    public String getEmailId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.from_addr</code>.
     */
    public void setFromAddr(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.from_addr</code>.
     */
    public String getFromAddr() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.reply_to_addr</code>.
     */
    public void setReplyToAddr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.reply_to_addr</code>.
     */
    public String getReplyToAddr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.to_addrs</code>.
     */
    public void setToAddrs(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.to_addrs</code>.
     */
    public String getToAddrs() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.cc_addrs</code>.
     */
    public void setCcAddrs(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.cc_addrs</code>.
     */
    public String getCcAddrs() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.bcc_addrs</code>.
     */
    public void setBccAddrs(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.bcc_addrs</code>.
     */
    public String getBccAddrs() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.description_html</code>.
     */
    public void setDescriptionHtml(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.description_html</code>.
     */
    public String getDescriptionHtml() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.raw_source</code>.
     */
    public void setRawSource(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.raw_source</code>.
     */
    public String getRawSource() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails_text.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails_text.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EmailsText.EMAILS_TEXT.EMAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmailsText.EMAILS_TEXT.FROM_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmailsText.EMAILS_TEXT.REPLY_TO_ADDR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailsText.EMAILS_TEXT.TO_ADDRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmailsText.EMAILS_TEXT.CC_ADDRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmailsText.EMAILS_TEXT.BCC_ADDRS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmailsText.EMAILS_TEXT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EmailsText.EMAILS_TEXT.DESCRIPTION_HTML;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EmailsText.EMAILS_TEXT.RAW_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return EmailsText.EMAILS_TEXT.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEmailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFromAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReplyToAddr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getToAddrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCcAddrs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getBccAddrs();
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
        return getDescriptionHtml();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getRawSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value1(String value) {
        setEmailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value2(String value) {
        setFromAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value3(String value) {
        setReplyToAddr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value4(String value) {
        setToAddrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value5(String value) {
        setCcAddrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value6(String value) {
        setBccAddrs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value8(String value) {
        setDescriptionHtml(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value9(String value) {
        setRawSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord value10(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsTextRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, Byte value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailsTextRecord
     */
    public EmailsTextRecord() {
        super(EmailsText.EMAILS_TEXT);
    }

    /**
     * Create a detached, initialised EmailsTextRecord
     */
    public EmailsTextRecord(String emailId, String fromAddr, String replyToAddr, String toAddrs, String ccAddrs, String bccAddrs, String description, String descriptionHtml, String rawSource, Byte deleted) {
        super(EmailsText.EMAILS_TEXT);

        set(0, emailId);
        set(1, fromAddr);
        set(2, replyToAddr);
        set(3, toAddrs);
        set(4, ccAddrs);
        set(5, bccAddrs);
        set(6, description);
        set(7, descriptionHtml);
        set(8, rawSource);
        set(9, deleted);
    }
}

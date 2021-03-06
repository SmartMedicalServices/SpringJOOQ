/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.Emails;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class EmailsRecord extends UpdatableRecordImpl<EmailsRecord> implements Record18<String, Timestamp, Timestamp, String, String, String, Byte, Timestamp, String, String, String, String, Byte, Byte, String, String, String, String> {

    private static final long serialVersionUID = -1537836078;

    /**
     * Setter for <code>sugarcrm_4_12.emails.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.date_sent</code>.
     */
    public void setDateSent(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.date_sent</code>.
     */
    public Timestamp getDateSent() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.message_id</code>.
     */
    public void setMessageId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.message_id</code>.
     */
    public String getMessageId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.name</code>.
     */
    public void setName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.name</code>.
     */
    public String getName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.type</code>.
     */
    public void setType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.type</code>.
     */
    public String getType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.status</code>.
     */
    public void setStatus(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.status</code>.
     */
    public String getStatus() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.flagged</code>.
     */
    public void setFlagged(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.flagged</code>.
     */
    public Byte getFlagged() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.reply_to_status</code>.
     */
    public void setReplyToStatus(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.reply_to_status</code>.
     */
    public Byte getReplyToStatus() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.intent</code>.
     */
    public void setIntent(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.intent</code>.
     */
    public String getIntent() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.mailbox_id</code>.
     */
    public void setMailboxId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.mailbox_id</code>.
     */
    public String getMailboxId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.parent_type</code>.
     */
    public void setParentType(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.parent_type</code>.
     */
    public String getParentType() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sugarcrm_4_12.emails.parent_id</code>.
     */
    public void setParentId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.emails.parent_id</code>.
     */
    public String getParentId() {
        return (String) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, Timestamp, Timestamp, String, String, String, Byte, Timestamp, String, String, String, String, Byte, Byte, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, Timestamp, Timestamp, String, String, String, Byte, Timestamp, String, String, String, String, Byte, Byte, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Emails.EMAILS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Emails.EMAILS.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Emails.EMAILS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Emails.EMAILS.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Emails.EMAILS.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Emails.EMAILS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Emails.EMAILS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Emails.EMAILS.DATE_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Emails.EMAILS.MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Emails.EMAILS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Emails.EMAILS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Emails.EMAILS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return Emails.EMAILS.FLAGGED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return Emails.EMAILS.REPLY_TO_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Emails.EMAILS.INTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Emails.EMAILS.MAILBOX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Emails.EMAILS.PARENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Emails.EMAILS.PARENT_ID;
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
        return getAssignedUserId();
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
    public Byte value7() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getDateSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getFlagged();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getReplyToStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getIntent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getMailboxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getParentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value2(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value3(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value4(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value7(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value8(Timestamp value) {
        setDateSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value9(String value) {
        setMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value10(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value11(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value12(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value13(Byte value) {
        setFlagged(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value14(Byte value) {
        setReplyToStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value15(String value) {
        setIntent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value16(String value) {
        setMailboxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value17(String value) {
        setParentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord value18(String value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailsRecord values(String value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, Byte value7, Timestamp value8, String value9, String value10, String value11, String value12, Byte value13, Byte value14, String value15, String value16, String value17, String value18) {
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
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailsRecord
     */
    public EmailsRecord() {
        super(Emails.EMAILS);
    }

    /**
     * Create a detached, initialised EmailsRecord
     */
    public EmailsRecord(String id, Timestamp dateEntered, Timestamp dateModified, String assignedUserId, String modifiedUserId, String createdBy, Byte deleted, Timestamp dateSent, String messageId, String name, String type, String status, Byte flagged, Byte replyToStatus, String intent, String mailboxId, String parentType, String parentId) {
        super(Emails.EMAILS);

        set(0, id);
        set(1, dateEntered);
        set(2, dateModified);
        set(3, assignedUserId);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, deleted);
        set(7, dateSent);
        set(8, messageId);
        set(9, name);
        set(10, type);
        set(11, status);
        set(12, flagged);
        set(13, replyToStatus);
        set(14, intent);
        set(15, mailboxId);
        set(16, parentType);
        set(17, parentId);
    }
}

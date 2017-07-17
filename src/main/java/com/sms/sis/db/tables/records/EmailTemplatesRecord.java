/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.EmailTemplates;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class EmailTemplatesRecord extends UpdatableRecordImpl<EmailTemplatesRecord> implements Record15<String, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Byte, String, Byte, String> {

    private static final long serialVersionUID = 1796512750;

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.published</code>.
     */
    public void setPublished(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.published</code>.
     */
    public String getPublished() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.name</code>.
     */
    public void setName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.name</code>.
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.subject</code>.
     */
    public void setSubject(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.subject</code>.
     */
    public String getSubject() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.body</code>.
     */
    public void setBody(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.body</code>.
     */
    public String getBody() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.body_html</code>.
     */
    public void setBodyHtml(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.body_html</code>.
     */
    public String getBodyHtml() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.text_only</code>.
     */
    public void setTextOnly(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.text_only</code>.
     */
    public Byte getTextOnly() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.email_templates.type</code>.
     */
    public void setType(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.email_templates.type</code>.
     */
    public String getType() {
        return (String) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Byte, String, Byte, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Timestamp, Timestamp, String, String, String, String, String, String, String, String, Byte, String, Byte, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return EmailTemplates.EMAIL_TEMPLATES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return EmailTemplates.EMAIL_TEMPLATES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return EmailTemplates.EMAIL_TEMPLATES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmailTemplates.EMAIL_TEMPLATES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmailTemplates.EMAIL_TEMPLATES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EmailTemplates.EMAIL_TEMPLATES.PUBLISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EmailTemplates.EMAIL_TEMPLATES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EmailTemplates.EMAIL_TEMPLATES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EmailTemplates.EMAIL_TEMPLATES.SUBJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return EmailTemplates.EMAIL_TEMPLATES.BODY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return EmailTemplates.EMAIL_TEMPLATES.BODY_HTML;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return EmailTemplates.EMAIL_TEMPLATES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return EmailTemplates.EMAIL_TEMPLATES.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return EmailTemplates.EMAIL_TEMPLATES.TEXT_ONLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return EmailTemplates.EMAIL_TEMPLATES.TYPE;
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
        return getPublished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSubject();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBody();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBodyHtml();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getTextOnly();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value2(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value3(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value4(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value5(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value6(String value) {
        setPublished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value7(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value9(String value) {
        setSubject(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value10(String value) {
        setBody(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value11(String value) {
        setBodyHtml(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value12(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value13(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value14(Byte value) {
        setTextOnly(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord value15(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplatesRecord values(String value1, Timestamp value2, Timestamp value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Byte value12, String value13, Byte value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailTemplatesRecord
     */
    public EmailTemplatesRecord() {
        super(EmailTemplates.EMAIL_TEMPLATES);
    }

    /**
     * Create a detached, initialised EmailTemplatesRecord
     */
    public EmailTemplatesRecord(String id, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String published, String name, String description, String subject, String body, String bodyHtml, Byte deleted, String assignedUserId, Byte textOnly, String type) {
        super(EmailTemplates.EMAIL_TEMPLATES);

        set(0, id);
        set(1, dateEntered);
        set(2, dateModified);
        set(3, modifiedUserId);
        set(4, createdBy);
        set(5, published);
        set(6, name);
        set(7, description);
        set(8, subject);
        set(9, body);
        set(10, bodyHtml);
        set(11, deleted);
        set(12, assignedUserId);
        set(13, textOnly);
        set(14, type);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.EmailTemplatesRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class EmailTemplates extends TableImpl<EmailTemplatesRecord> {

    private static final long serialVersionUID = 704386930;

    /**
     * The reference instance of <code>sugarcrm_4_12.email_templates</code>
     */
    public static final EmailTemplates EMAIL_TEMPLATES = new EmailTemplates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailTemplatesRecord> getRecordType() {
        return EmailTemplatesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.email_templates.id</code>.
     */
    public final TableField<EmailTemplatesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.date_entered</code>.
     */
    public final TableField<EmailTemplatesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.date_modified</code>.
     */
    public final TableField<EmailTemplatesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.modified_user_id</code>.
     */
    public final TableField<EmailTemplatesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.created_by</code>.
     */
    public final TableField<EmailTemplatesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.published</code>.
     */
    public final TableField<EmailTemplatesRecord, String> PUBLISHED = createField("published", org.jooq.impl.SQLDataType.VARCHAR.length(3), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.name</code>.
     */
    public final TableField<EmailTemplatesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.description</code>.
     */
    public final TableField<EmailTemplatesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.subject</code>.
     */
    public final TableField<EmailTemplatesRecord, String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.body</code>.
     */
    public final TableField<EmailTemplatesRecord, String> BODY = createField("body", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.body_html</code>.
     */
    public final TableField<EmailTemplatesRecord, String> BODY_HTML = createField("body_html", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.deleted</code>.
     */
    public final TableField<EmailTemplatesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.assigned_user_id</code>.
     */
    public final TableField<EmailTemplatesRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.text_only</code>.
     */
    public final TableField<EmailTemplatesRecord, Byte> TEXT_ONLY = createField("text_only", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_templates.type</code>.
     */
    public final TableField<EmailTemplatesRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>sugarcrm_4_12.email_templates</code> table reference
     */
    public EmailTemplates() {
        this("email_templates", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.email_templates</code> table reference
     */
    public EmailTemplates(String alias) {
        this(alias, EMAIL_TEMPLATES);
    }

    private EmailTemplates(String alias, Table<EmailTemplatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailTemplates(String alias, Table<EmailTemplatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sugarcrm_4_12.SUGARCRM_4_12;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmailTemplatesRecord> getPrimaryKey() {
        return Keys.KEY_EMAIL_TEMPLATES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailTemplatesRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailTemplatesRecord>>asList(Keys.KEY_EMAIL_TEMPLATES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailTemplates as(String alias) {
        return new EmailTemplates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailTemplates rename(String name) {
        return new EmailTemplates(name, null);
    }
}

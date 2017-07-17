/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.EmailAddrBeanRelRecord;

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
public class EmailAddrBeanRel extends TableImpl<EmailAddrBeanRelRecord> {

    private static final long serialVersionUID = 197257641;

    /**
     * The reference instance of <code>sugarcrm_4_12.email_addr_bean_rel</code>
     */
    public static final EmailAddrBeanRel EMAIL_ADDR_BEAN_REL = new EmailAddrBeanRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmailAddrBeanRelRecord> getRecordType() {
        return EmailAddrBeanRelRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.id</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.email_address_id</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, String> EMAIL_ADDRESS_ID = createField("email_address_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.bean_id</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, String> BEAN_ID = createField("bean_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.bean_module</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, String> BEAN_MODULE = createField("bean_module", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.primary_address</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, Byte> PRIMARY_ADDRESS = createField("primary_address", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.reply_to_address</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, Byte> REPLY_TO_ADDRESS = createField("reply_to_address", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.date_created</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.date_modified</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.email_addr_bean_rel.deleted</code>.
     */
    public final TableField<EmailAddrBeanRelRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.email_addr_bean_rel</code> table reference
     */
    public EmailAddrBeanRel() {
        this("email_addr_bean_rel", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.email_addr_bean_rel</code> table reference
     */
    public EmailAddrBeanRel(String alias) {
        this(alias, EMAIL_ADDR_BEAN_REL);
    }

    private EmailAddrBeanRel(String alias, Table<EmailAddrBeanRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmailAddrBeanRel(String alias, Table<EmailAddrBeanRelRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EmailAddrBeanRelRecord> getPrimaryKey() {
        return Keys.KEY_EMAIL_ADDR_BEAN_REL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmailAddrBeanRelRecord>> getKeys() {
        return Arrays.<UniqueKey<EmailAddrBeanRelRecord>>asList(Keys.KEY_EMAIL_ADDR_BEAN_REL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailAddrBeanRel as(String alias) {
        return new EmailAddrBeanRel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmailAddrBeanRel rename(String name) {
        return new EmailAddrBeanRel(name, null);
    }
}

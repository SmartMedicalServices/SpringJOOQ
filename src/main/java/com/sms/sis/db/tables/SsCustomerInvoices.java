/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsCustomerInvoicesRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class SsCustomerInvoices extends TableImpl<SsCustomerInvoicesRecord> {

    private static final long serialVersionUID = 830703458;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_customer_invoices</code>
     */
    public static final SsCustomerInvoices SS_CUSTOMER_INVOICES = new SsCustomerInvoices();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsCustomerInvoicesRecord> getRecordType() {
        return SsCustomerInvoicesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.id</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.name</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.date_entered</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.date_modified</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.modified_user_id</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.created_by</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.description</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.deleted</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.assigned_user_id</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.total_amount</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 6), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.currency_id</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> CURRENCY_ID = createField("currency_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.invoice_date</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, Date> INVOICE_DATE = createField("invoice_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.ss_gl_account_id_c</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> SS_GL_ACCOUNT_ID_C = createField("ss_gl_account_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_customer_invoices.journal_entry_id</code>.
     */
    public final TableField<SsCustomerInvoicesRecord, String> JOURNAL_ENTRY_ID = createField("journal_entry_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_customer_invoices</code> table reference
     */
    public SsCustomerInvoices() {
        this("ss_customer_invoices", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_customer_invoices</code> table reference
     */
    public SsCustomerInvoices(String alias) {
        this(alias, SS_CUSTOMER_INVOICES);
    }

    private SsCustomerInvoices(String alias, Table<SsCustomerInvoicesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsCustomerInvoices(String alias, Table<SsCustomerInvoicesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsCustomerInvoicesRecord> getPrimaryKey() {
        return Keys.KEY_SS_CUSTOMER_INVOICES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsCustomerInvoicesRecord>> getKeys() {
        return Arrays.<UniqueKey<SsCustomerInvoicesRecord>>asList(Keys.KEY_SS_CUSTOMER_INVOICES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoices as(String alias) {
        return new SsCustomerInvoices(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsCustomerInvoices rename(String name) {
        return new SsCustomerInvoices(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsPayablesRecord;

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
public class SsPayables extends TableImpl<SsPayablesRecord> {

    private static final long serialVersionUID = -70265299;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_payables</code>
     */
    public static final SsPayables SS_PAYABLES = new SsPayables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsPayablesRecord> getRecordType() {
        return SsPayablesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_payables.id</code>.
     */
    public final TableField<SsPayablesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.name</code>.
     */
    public final TableField<SsPayablesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.date_entered</code>.
     */
    public final TableField<SsPayablesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.date_modified</code>.
     */
    public final TableField<SsPayablesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.modified_user_id</code>.
     */
    public final TableField<SsPayablesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.created_by</code>.
     */
    public final TableField<SsPayablesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.description</code>.
     */
    public final TableField<SsPayablesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.deleted</code>.
     */
    public final TableField<SsPayablesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.assigned_user_id</code>.
     */
    public final TableField<SsPayablesRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.submit_date</code>.
     */
    public final TableField<SsPayablesRecord, Date> SUBMIT_DATE = createField("submit_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.pay_to</code>.
     */
    public final TableField<SsPayablesRecord, String> PAY_TO = createField("pay_to", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("Provider", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.paymemt_method</code>.
     */
    public final TableField<SsPayablesRecord, String> PAYMEMT_METHOD = createField("paymemt_method", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("Case", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.total_amount</code>.
     */
    public final TableField<SsPayablesRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 6), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.currency_id</code>.
     */
    public final TableField<SsPayablesRecord, String> CURRENCY_ID = createField("currency_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.memo</code>.
     */
    public final TableField<SsPayablesRecord, String> MEMO = createField("memo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_branches_id_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_BRANCHES_ID_C = createField("ss_branches_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_gl_account_id_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_GL_ACCOUNT_ID_C = createField("ss_gl_account_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_gl_account_id1_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_GL_ACCOUNT_ID1_C = createField("ss_gl_account_id1_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_gl_account_id2_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_GL_ACCOUNT_ID2_C = createField("ss_gl_account_id2_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.journal_entry_id</code>.
     */
    public final TableField<SsPayablesRecord, String> JOURNAL_ENTRY_ID = createField("journal_entry_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_gl_account_id3_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_GL_ACCOUNT_ID3_C = createField("ss_gl_account_id3_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_gl_account_id4_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_GL_ACCOUNT_ID4_C = createField("ss_gl_account_id4_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.acase_id_c</code>.
     */
    public final TableField<SsPayablesRecord, String> ACASE_ID_C = createField("acase_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_banks_id_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_BANKS_ID_C = createField("ss_banks_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.ss_branch_cases_id_c</code>.
     */
    public final TableField<SsPayablesRecord, String> SS_BRANCH_CASES_ID_C = createField("ss_branch_cases_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.automatic_receipt_number</code>.
     */
    public final TableField<SsPayablesRecord, Integer> AUTOMATIC_RECEIPT_NUMBER = createField("automatic_receipt_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.receipt_number</code>.
     */
    public final TableField<SsPayablesRecord, String> RECEIPT_NUMBER = createField("receipt_number", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_payables.is_valid</code>.
     */
    public final TableField<SsPayablesRecord, Byte> IS_VALID = createField("is_valid", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_payables</code> table reference
     */
    public SsPayables() {
        this("ss_payables", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_payables</code> table reference
     */
    public SsPayables(String alias) {
        this(alias, SS_PAYABLES);
    }

    private SsPayables(String alias, Table<SsPayablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsPayables(String alias, Table<SsPayablesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsPayablesRecord> getPrimaryKey() {
        return Keys.KEY_SS_PAYABLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsPayablesRecord>> getKeys() {
        return Arrays.<UniqueKey<SsPayablesRecord>>asList(Keys.KEY_SS_PAYABLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayables as(String alias) {
        return new SsPayables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsPayables rename(String name) {
        return new SsPayables(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsJournalEntryRowRecord;

import java.math.BigDecimal;
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
public class SsJournalEntryRow extends TableImpl<SsJournalEntryRowRecord> {

    private static final long serialVersionUID = -540913022;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_journal_entry_row</code>
     */
    public static final SsJournalEntryRow SS_JOURNAL_ENTRY_ROW = new SsJournalEntryRow();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsJournalEntryRowRecord> getRecordType() {
        return SsJournalEntryRowRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.id</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.name</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.date_entered</code>.
     */
    public final TableField<SsJournalEntryRowRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.date_modified</code>.
     */
    public final TableField<SsJournalEntryRowRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.modified_user_id</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.created_by</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.description</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.deleted</code>.
     */
    public final TableField<SsJournalEntryRowRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.assigned_user_id</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.credit</code>.
     */
    public final TableField<SsJournalEntryRowRecord, BigDecimal> CREDIT = createField("credit", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 6), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.currency_id</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> CURRENCY_ID = createField("currency_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.debit</code>.
     */
    public final TableField<SsJournalEntryRowRecord, BigDecimal> DEBIT = createField("debit", org.jooq.impl.SQLDataType.DECIMAL.precision(26, 6), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.memo</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> MEMO = createField("memo", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.ss_gl_account_id_c</code>.
     */
    public final TableField<SsJournalEntryRowRecord, String> SS_GL_ACCOUNT_ID_C = createField("ss_gl_account_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.is_processed</code>.
     */
    public final TableField<SsJournalEntryRowRecord, Byte> IS_PROCESSED = createField("is_processed", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_row.is_automatic</code>.
     */
    public final TableField<SsJournalEntryRowRecord, Byte> IS_AUTOMATIC = createField("is_automatic", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_journal_entry_row</code> table reference
     */
    public SsJournalEntryRow() {
        this("ss_journal_entry_row", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_journal_entry_row</code> table reference
     */
    public SsJournalEntryRow(String alias) {
        this(alias, SS_JOURNAL_ENTRY_ROW);
    }

    private SsJournalEntryRow(String alias, Table<SsJournalEntryRowRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsJournalEntryRow(String alias, Table<SsJournalEntryRowRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsJournalEntryRowRecord> getPrimaryKey() {
        return Keys.KEY_SS_JOURNAL_ENTRY_ROW_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsJournalEntryRowRecord>> getKeys() {
        return Arrays.<UniqueKey<SsJournalEntryRowRecord>>asList(Keys.KEY_SS_JOURNAL_ENTRY_ROW_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRow as(String alias) {
        return new SsJournalEntryRow(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsJournalEntryRow rename(String name) {
        return new SsJournalEntryRow(name, null);
    }
}

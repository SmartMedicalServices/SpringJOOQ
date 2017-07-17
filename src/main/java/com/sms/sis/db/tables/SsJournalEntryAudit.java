/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsJournalEntryAuditRecord;

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
public class SsJournalEntryAudit extends TableImpl<SsJournalEntryAuditRecord> {

    private static final long serialVersionUID = -1051439745;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_journal_entry_audit</code>
     */
    public static final SsJournalEntryAudit SS_JOURNAL_ENTRY_AUDIT = new SsJournalEntryAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsJournalEntryAuditRecord> getRecordType() {
        return SsJournalEntryAuditRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.id</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.parent_id</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.date_created</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.created_by</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.field_name</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.data_type</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.before_value_string</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> BEFORE_VALUE_STRING = createField("before_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.after_value_string</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> AFTER_VALUE_STRING = createField("after_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.before_value_text</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> BEFORE_VALUE_TEXT = createField("before_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_journal_entry_audit.after_value_text</code>.
     */
    public final TableField<SsJournalEntryAuditRecord, String> AFTER_VALUE_TEXT = createField("after_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_journal_entry_audit</code> table reference
     */
    public SsJournalEntryAudit() {
        this("ss_journal_entry_audit", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_journal_entry_audit</code> table reference
     */
    public SsJournalEntryAudit(String alias) {
        this(alias, SS_JOURNAL_ENTRY_AUDIT);
    }

    private SsJournalEntryAudit(String alias, Table<SsJournalEntryAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsJournalEntryAudit(String alias, Table<SsJournalEntryAuditRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsJournalEntryAuditRecord> getPrimaryKey() {
        return Keys.KEY_SS_JOURNAL_ENTRY_AUDIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsJournalEntryAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<SsJournalEntryAuditRecord>>asList(Keys.KEY_SS_JOURNAL_ENTRY_AUDIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryAudit as(String alias) {
        return new SsJournalEntryAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsJournalEntryAudit rename(String name) {
        return new SsJournalEntryAudit(name, null);
    }
}

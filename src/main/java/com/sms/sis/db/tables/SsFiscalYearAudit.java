/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsFiscalYearAuditRecord;

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
public class SsFiscalYearAudit extends TableImpl<SsFiscalYearAuditRecord> {

    private static final long serialVersionUID = 362483695;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_fiscal_year_audit</code>
     */
    public static final SsFiscalYearAudit SS_FISCAL_YEAR_AUDIT = new SsFiscalYearAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsFiscalYearAuditRecord> getRecordType() {
        return SsFiscalYearAuditRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.id</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.parent_id</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.date_created</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.created_by</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.field_name</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.data_type</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.before_value_string</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> BEFORE_VALUE_STRING = createField("before_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.after_value_string</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> AFTER_VALUE_STRING = createField("after_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.before_value_text</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> BEFORE_VALUE_TEXT = createField("before_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year_audit.after_value_text</code>.
     */
    public final TableField<SsFiscalYearAuditRecord, String> AFTER_VALUE_TEXT = createField("after_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_fiscal_year_audit</code> table reference
     */
    public SsFiscalYearAudit() {
        this("ss_fiscal_year_audit", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_fiscal_year_audit</code> table reference
     */
    public SsFiscalYearAudit(String alias) {
        this(alias, SS_FISCAL_YEAR_AUDIT);
    }

    private SsFiscalYearAudit(String alias, Table<SsFiscalYearAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsFiscalYearAudit(String alias, Table<SsFiscalYearAuditRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsFiscalYearAuditRecord> getPrimaryKey() {
        return Keys.KEY_SS_FISCAL_YEAR_AUDIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsFiscalYearAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<SsFiscalYearAuditRecord>>asList(Keys.KEY_SS_FISCAL_YEAR_AUDIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsFiscalYearAudit as(String alias) {
        return new SsFiscalYearAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsFiscalYearAudit rename(String name) {
        return new SsFiscalYearAudit(name, null);
    }
}

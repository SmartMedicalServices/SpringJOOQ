/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsFiscalYearRecord;

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
public class SsFiscalYear extends TableImpl<SsFiscalYearRecord> {

    private static final long serialVersionUID = -496813905;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_fiscal_year</code>
     */
    public static final SsFiscalYear SS_FISCAL_YEAR = new SsFiscalYear();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsFiscalYearRecord> getRecordType() {
        return SsFiscalYearRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.id</code>.
     */
    public final TableField<SsFiscalYearRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.name</code>.
     */
    public final TableField<SsFiscalYearRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.date_entered</code>.
     */
    public final TableField<SsFiscalYearRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.date_modified</code>.
     */
    public final TableField<SsFiscalYearRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.modified_user_id</code>.
     */
    public final TableField<SsFiscalYearRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.created_by</code>.
     */
    public final TableField<SsFiscalYearRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.description</code>.
     */
    public final TableField<SsFiscalYearRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.deleted</code>.
     */
    public final TableField<SsFiscalYearRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.assigned_user_id</code>.
     */
    public final TableField<SsFiscalYearRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.fiscal_year_begin</code>.
     */
    public final TableField<SsFiscalYearRecord, Date> FISCAL_YEAR_BEGIN = createField("fiscal_year_begin", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.fiscal_year_end</code>.
     */
    public final TableField<SsFiscalYearRecord, Date> FISCAL_YEAR_END = createField("fiscal_year_end", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.is_closed</code>.
     */
    public final TableField<SsFiscalYearRecord, Byte> IS_CLOSED = createField("is_closed", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_fiscal_year.is_current</code>.
     */
    public final TableField<SsFiscalYearRecord, Byte> IS_CURRENT = createField("is_current", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_fiscal_year</code> table reference
     */
    public SsFiscalYear() {
        this("ss_fiscal_year", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_fiscal_year</code> table reference
     */
    public SsFiscalYear(String alias) {
        this(alias, SS_FISCAL_YEAR);
    }

    private SsFiscalYear(String alias, Table<SsFiscalYearRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsFiscalYear(String alias, Table<SsFiscalYearRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsFiscalYearRecord> getPrimaryKey() {
        return Keys.KEY_SS_FISCAL_YEAR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsFiscalYearRecord>> getKeys() {
        return Arrays.<UniqueKey<SsFiscalYearRecord>>asList(Keys.KEY_SS_FISCAL_YEAR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsFiscalYear as(String alias) {
        return new SsFiscalYear(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsFiscalYear rename(String name) {
        return new SsFiscalYear(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.SsAccountingSettingsRecord;

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
public class SsAccountingSettings extends TableImpl<SsAccountingSettingsRecord> {

    private static final long serialVersionUID = 414051990;

    /**
     * The reference instance of <code>sugarcrm_4_12.ss_accounting_settings</code>
     */
    public static final SsAccountingSettings SS_ACCOUNTING_SETTINGS = new SsAccountingSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SsAccountingSettingsRecord> getRecordType() {
        return SsAccountingSettingsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.id</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.name</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.date_entered</code>.
     */
    public final TableField<SsAccountingSettingsRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.date_modified</code>.
     */
    public final TableField<SsAccountingSettingsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.modified_user_id</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.created_by</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.description</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.deleted</code>.
     */
    public final TableField<SsAccountingSettingsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.assigned_user_id</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.gl_account_setting_type</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> GL_ACCOUNT_SETTING_TYPE = createField("gl_account_setting_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.ss_accounting_settings.ss_gl_account_id_c</code>.
     */
    public final TableField<SsAccountingSettingsRecord, String> SS_GL_ACCOUNT_ID_C = createField("ss_gl_account_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.ss_accounting_settings</code> table reference
     */
    public SsAccountingSettings() {
        this("ss_accounting_settings", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.ss_accounting_settings</code> table reference
     */
    public SsAccountingSettings(String alias) {
        this(alias, SS_ACCOUNTING_SETTINGS);
    }

    private SsAccountingSettings(String alias, Table<SsAccountingSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SsAccountingSettings(String alias, Table<SsAccountingSettingsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SsAccountingSettingsRecord> getPrimaryKey() {
        return Keys.KEY_SS_ACCOUNTING_SETTINGS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SsAccountingSettingsRecord>> getKeys() {
        return Arrays.<UniqueKey<SsAccountingSettingsRecord>>asList(Keys.KEY_SS_ACCOUNTING_SETTINGS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsAccountingSettings as(String alias) {
        return new SsAccountingSettings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SsAccountingSettings rename(String name) {
        return new SsAccountingSettings(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScProviderbranchesAuditRecord;

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
public class ScProviderbranchesAudit extends TableImpl<ScProviderbranchesAuditRecord> {

    private static final long serialVersionUID = 421304833;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_providerbranches_audit</code>
     */
    public static final ScProviderbranchesAudit SC_PROVIDERBRANCHES_AUDIT = new ScProviderbranchesAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScProviderbranchesAuditRecord> getRecordType() {
        return ScProviderbranchesAuditRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.id</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.parent_id</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.date_created</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.created_by</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.field_name</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.data_type</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.before_value_string</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> BEFORE_VALUE_STRING = createField("before_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.after_value_string</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> AFTER_VALUE_STRING = createField("after_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.before_value_text</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> BEFORE_VALUE_TEXT = createField("before_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providerbranches_audit.after_value_text</code>.
     */
    public final TableField<ScProviderbranchesAuditRecord, String> AFTER_VALUE_TEXT = createField("after_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_providerbranches_audit</code> table reference
     */
    public ScProviderbranchesAudit() {
        this("sc_providerbranches_audit", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_providerbranches_audit</code> table reference
     */
    public ScProviderbranchesAudit(String alias) {
        this(alias, SC_PROVIDERBRANCHES_AUDIT);
    }

    private ScProviderbranchesAudit(String alias, Table<ScProviderbranchesAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScProviderbranchesAudit(String alias, Table<ScProviderbranchesAuditRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScProviderbranchesAuditRecord> getPrimaryKey() {
        return Keys.KEY_SC_PROVIDERBRANCHES_AUDIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScProviderbranchesAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<ScProviderbranchesAuditRecord>>asList(Keys.KEY_SC_PROVIDERBRANCHES_AUDIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProviderbranchesAudit as(String alias) {
        return new ScProviderbranchesAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScProviderbranchesAudit rename(String name) {
        return new ScProviderbranchesAudit(name, null);
    }
}

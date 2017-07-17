/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScServicessupergroupsAuditRecord;

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
public class ScServicessupergroupsAudit extends TableImpl<ScServicessupergroupsAuditRecord> {

    private static final long serialVersionUID = -1625051727;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_servicessupergroups_audit</code>
     */
    public static final ScServicessupergroupsAudit SC_SERVICESSUPERGROUPS_AUDIT = new ScServicessupergroupsAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScServicessupergroupsAuditRecord> getRecordType() {
        return ScServicessupergroupsAuditRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.id</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.parent_id</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.date_created</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.created_by</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.field_name</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.data_type</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.before_value_string</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> BEFORE_VALUE_STRING = createField("before_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.after_value_string</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> AFTER_VALUE_STRING = createField("after_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.before_value_text</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> BEFORE_VALUE_TEXT = createField("before_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_servicessupergroups_audit.after_value_text</code>.
     */
    public final TableField<ScServicessupergroupsAuditRecord, String> AFTER_VALUE_TEXT = createField("after_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_servicessupergroups_audit</code> table reference
     */
    public ScServicessupergroupsAudit() {
        this("sc_servicessupergroups_audit", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_servicessupergroups_audit</code> table reference
     */
    public ScServicessupergroupsAudit(String alias) {
        this(alias, SC_SERVICESSUPERGROUPS_AUDIT);
    }

    private ScServicessupergroupsAudit(String alias, Table<ScServicessupergroupsAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScServicessupergroupsAudit(String alias, Table<ScServicessupergroupsAuditRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScServicessupergroupsAuditRecord> getPrimaryKey() {
        return Keys.KEY_SC_SERVICESSUPERGROUPS_AUDIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScServicessupergroupsAuditRecord>> getKeys() {
        return Arrays.<UniqueKey<ScServicessupergroupsAuditRecord>>asList(Keys.KEY_SC_SERVICESSUPERGROUPS_AUDIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScServicessupergroupsAudit as(String alias) {
        return new ScServicessupergroupsAudit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScServicessupergroupsAudit rename(String name) {
        return new ScServicessupergroupsAudit(name, null);
    }
}

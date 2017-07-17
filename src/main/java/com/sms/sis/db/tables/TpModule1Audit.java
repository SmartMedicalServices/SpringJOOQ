/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.TpModule1AuditRecord;

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
public class TpModule1Audit extends TableImpl<TpModule1AuditRecord> {

    private static final long serialVersionUID = 2049368897;

    /**
     * The reference instance of <code>sugarcrm_4_12.tp_module1_audit</code>
     */
    public static final TpModule1Audit TP_MODULE1_AUDIT = new TpModule1Audit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TpModule1AuditRecord> getRecordType() {
        return TpModule1AuditRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.id</code>.
     */
    public final TableField<TpModule1AuditRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.parent_id</code>.
     */
    public final TableField<TpModule1AuditRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.date_created</code>.
     */
    public final TableField<TpModule1AuditRecord, Timestamp> DATE_CREATED = createField("date_created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.created_by</code>.
     */
    public final TableField<TpModule1AuditRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.field_name</code>.
     */
    public final TableField<TpModule1AuditRecord, String> FIELD_NAME = createField("field_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.data_type</code>.
     */
    public final TableField<TpModule1AuditRecord, String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.before_value_string</code>.
     */
    public final TableField<TpModule1AuditRecord, String> BEFORE_VALUE_STRING = createField("before_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.after_value_string</code>.
     */
    public final TableField<TpModule1AuditRecord, String> AFTER_VALUE_STRING = createField("after_value_string", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.before_value_text</code>.
     */
    public final TableField<TpModule1AuditRecord, String> BEFORE_VALUE_TEXT = createField("before_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.tp_module1_audit.after_value_text</code>.
     */
    public final TableField<TpModule1AuditRecord, String> AFTER_VALUE_TEXT = createField("after_value_text", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sugarcrm_4_12.tp_module1_audit</code> table reference
     */
    public TpModule1Audit() {
        this("tp_module1_audit", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.tp_module1_audit</code> table reference
     */
    public TpModule1Audit(String alias) {
        this(alias, TP_MODULE1_AUDIT);
    }

    private TpModule1Audit(String alias, Table<TpModule1AuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private TpModule1Audit(String alias, Table<TpModule1AuditRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<TpModule1AuditRecord> getPrimaryKey() {
        return Keys.KEY_TP_MODULE1_AUDIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TpModule1AuditRecord>> getKeys() {
        return Arrays.<UniqueKey<TpModule1AuditRecord>>asList(Keys.KEY_TP_MODULE1_AUDIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TpModule1Audit as(String alias) {
        return new TpModule1Audit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TpModule1Audit rename(String name) {
        return new TpModule1Audit(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.CallsLeadsRecord;

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
public class CallsLeads extends TableImpl<CallsLeadsRecord> {

    private static final long serialVersionUID = -1697561962;

    /**
     * The reference instance of <code>sugarcrm_4_12.calls_leads</code>
     */
    public static final CallsLeads CALLS_LEADS = new CallsLeads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CallsLeadsRecord> getRecordType() {
        return CallsLeadsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.calls_leads.id</code>.
     */
    public final TableField<CallsLeadsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.call_id</code>.
     */
    public final TableField<CallsLeadsRecord, String> CALL_ID = createField("call_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.lead_id</code>.
     */
    public final TableField<CallsLeadsRecord, String> LEAD_ID = createField("lead_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.required</code>.
     */
    public final TableField<CallsLeadsRecord, String> REQUIRED = createField("required", org.jooq.impl.SQLDataType.VARCHAR.length(1).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.accept_status</code>.
     */
    public final TableField<CallsLeadsRecord, String> ACCEPT_STATUS = createField("accept_status", org.jooq.impl.SQLDataType.VARCHAR.length(25).defaultValue(org.jooq.impl.DSL.inline("none", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.date_modified</code>.
     */
    public final TableField<CallsLeadsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_leads.deleted</code>.
     */
    public final TableField<CallsLeadsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.calls_leads</code> table reference
     */
    public CallsLeads() {
        this("calls_leads", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.calls_leads</code> table reference
     */
    public CallsLeads(String alias) {
        this(alias, CALLS_LEADS);
    }

    private CallsLeads(String alias, Table<CallsLeadsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CallsLeads(String alias, Table<CallsLeadsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CallsLeadsRecord> getPrimaryKey() {
        return Keys.KEY_CALLS_LEADS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CallsLeadsRecord>> getKeys() {
        return Arrays.<UniqueKey<CallsLeadsRecord>>asList(Keys.KEY_CALLS_LEADS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CallsLeads as(String alias) {
        return new CallsLeads(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CallsLeads rename(String name) {
        return new CallsLeads(name, null);
    }
}

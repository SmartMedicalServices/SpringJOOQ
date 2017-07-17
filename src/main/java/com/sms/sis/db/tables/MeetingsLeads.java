/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.MeetingsLeadsRecord;

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
public class MeetingsLeads extends TableImpl<MeetingsLeadsRecord> {

    private static final long serialVersionUID = -1681325519;

    /**
     * The reference instance of <code>sugarcrm_4_12.meetings_leads</code>
     */
    public static final MeetingsLeads MEETINGS_LEADS = new MeetingsLeads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MeetingsLeadsRecord> getRecordType() {
        return MeetingsLeadsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.id</code>.
     */
    public final TableField<MeetingsLeadsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.meeting_id</code>.
     */
    public final TableField<MeetingsLeadsRecord, String> MEETING_ID = createField("meeting_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.lead_id</code>.
     */
    public final TableField<MeetingsLeadsRecord, String> LEAD_ID = createField("lead_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.required</code>.
     */
    public final TableField<MeetingsLeadsRecord, String> REQUIRED = createField("required", org.jooq.impl.SQLDataType.VARCHAR.length(1).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.accept_status</code>.
     */
    public final TableField<MeetingsLeadsRecord, String> ACCEPT_STATUS = createField("accept_status", org.jooq.impl.SQLDataType.VARCHAR.length(25).defaultValue(org.jooq.impl.DSL.inline("none", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.date_modified</code>.
     */
    public final TableField<MeetingsLeadsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.meetings_leads.deleted</code>.
     */
    public final TableField<MeetingsLeadsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.meetings_leads</code> table reference
     */
    public MeetingsLeads() {
        this("meetings_leads", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.meetings_leads</code> table reference
     */
    public MeetingsLeads(String alias) {
        this(alias, MEETINGS_LEADS);
    }

    private MeetingsLeads(String alias, Table<MeetingsLeadsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MeetingsLeads(String alias, Table<MeetingsLeadsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<MeetingsLeadsRecord> getPrimaryKey() {
        return Keys.KEY_MEETINGS_LEADS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MeetingsLeadsRecord>> getKeys() {
        return Arrays.<UniqueKey<MeetingsLeadsRecord>>asList(Keys.KEY_MEETINGS_LEADS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeads as(String alias) {
        return new MeetingsLeads(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MeetingsLeads rename(String name) {
        return new MeetingsLeads(name, null);
    }
}

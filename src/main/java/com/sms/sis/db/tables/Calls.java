/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.CallsRecord;

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
public class Calls extends TableImpl<CallsRecord> {

    private static final long serialVersionUID = 221386187;

    /**
     * The reference instance of <code>sugarcrm_4_12.calls</code>
     */
    public static final Calls CALLS = new Calls();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CallsRecord> getRecordType() {
        return CallsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.calls.id</code>.
     */
    public final TableField<CallsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.name</code>.
     */
    public final TableField<CallsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.date_entered</code>.
     */
    public final TableField<CallsRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.date_modified</code>.
     */
    public final TableField<CallsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.modified_user_id</code>.
     */
    public final TableField<CallsRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.created_by</code>.
     */
    public final TableField<CallsRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.description</code>.
     */
    public final TableField<CallsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.deleted</code>.
     */
    public final TableField<CallsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.assigned_user_id</code>.
     */
    public final TableField<CallsRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.duration_hours</code>.
     */
    public final TableField<CallsRecord, Integer> DURATION_HOURS = createField("duration_hours", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.duration_minutes</code>.
     */
    public final TableField<CallsRecord, Integer> DURATION_MINUTES = createField("duration_minutes", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.date_start</code>.
     */
    public final TableField<CallsRecord, Timestamp> DATE_START = createField("date_start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.date_end</code>.
     */
    public final TableField<CallsRecord, Timestamp> DATE_END = createField("date_end", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.parent_type</code>.
     */
    public final TableField<CallsRecord, String> PARENT_TYPE = createField("parent_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.status</code>.
     */
    public final TableField<CallsRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("Planned", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.direction</code>.
     */
    public final TableField<CallsRecord, String> DIRECTION = createField("direction", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.parent_id</code>.
     */
    public final TableField<CallsRecord, String> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.reminder_time</code>.
     */
    public final TableField<CallsRecord, Integer> REMINDER_TIME = createField("reminder_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.email_reminder_time</code>.
     */
    public final TableField<CallsRecord, Integer> EMAIL_REMINDER_TIME = createField("email_reminder_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("-1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.email_reminder_sent</code>.
     */
    public final TableField<CallsRecord, Byte> EMAIL_REMINDER_SENT = createField("email_reminder_sent", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.outlook_id</code>.
     */
    public final TableField<CallsRecord, String> OUTLOOK_ID = createField("outlook_id", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_type</code>.
     */
    public final TableField<CallsRecord, String> REPEAT_TYPE = createField("repeat_type", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_interval</code>.
     */
    public final TableField<CallsRecord, Integer> REPEAT_INTERVAL = createField("repeat_interval", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_dow</code>.
     */
    public final TableField<CallsRecord, String> REPEAT_DOW = createField("repeat_dow", org.jooq.impl.SQLDataType.VARCHAR.length(7), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_until</code>.
     */
    public final TableField<CallsRecord, Date> REPEAT_UNTIL = createField("repeat_until", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_count</code>.
     */
    public final TableField<CallsRecord, Integer> REPEAT_COUNT = createField("repeat_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.repeat_parent_id</code>.
     */
    public final TableField<CallsRecord, String> REPEAT_PARENT_ID = createField("repeat_parent_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.recurring_source</code>.
     */
    public final TableField<CallsRecord, String> RECURRING_SOURCE = createField("recurring_source", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls.cmid</code>.
     */
    public final TableField<CallsRecord, Integer> CMID = createField("cmid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>sugarcrm_4_12.calls</code> table reference
     */
    public Calls() {
        this("calls", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.calls</code> table reference
     */
    public Calls(String alias) {
        this(alias, CALLS);
    }

    private Calls(String alias, Table<CallsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Calls(String alias, Table<CallsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CallsRecord> getPrimaryKey() {
        return Keys.KEY_CALLS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CallsRecord>> getKeys() {
        return Arrays.<UniqueKey<CallsRecord>>asList(Keys.KEY_CALLS_PRIMARY, Keys.KEY_CALLS_CMID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calls as(String alias) {
        return new Calls(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Calls rename(String name) {
        return new Calls(name, null);
    }
}

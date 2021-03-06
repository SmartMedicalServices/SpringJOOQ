/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.TrackerRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Tracker extends TableImpl<TrackerRecord> {

    private static final long serialVersionUID = -1859893776;

    /**
     * The reference instance of <code>sugarcrm_4_12.tracker</code>
     */
    public static final Tracker TRACKER = new Tracker();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackerRecord> getRecordType() {
        return TrackerRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.tracker.id</code>.
     */
    public final TableField<TrackerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.monitor_id</code>.
     */
    public final TableField<TrackerRecord, String> MONITOR_ID = createField("monitor_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.user_id</code>.
     */
    public final TableField<TrackerRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.module_name</code>.
     */
    public final TableField<TrackerRecord, String> MODULE_NAME = createField("module_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.item_id</code>.
     */
    public final TableField<TrackerRecord, String> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.item_summary</code>.
     */
    public final TableField<TrackerRecord, String> ITEM_SUMMARY = createField("item_summary", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.date_modified</code>.
     */
    public final TableField<TrackerRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.action</code>.
     */
    public final TableField<TrackerRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.session_id</code>.
     */
    public final TableField<TrackerRecord, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.visible</code>.
     */
    public final TableField<TrackerRecord, Byte> VISIBLE = createField("visible", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.tracker.deleted</code>.
     */
    public final TableField<TrackerRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.tracker</code> table reference
     */
    public Tracker() {
        this("tracker", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.tracker</code> table reference
     */
    public Tracker(String alias) {
        this(alias, TRACKER);
    }

    private Tracker(String alias, Table<TrackerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tracker(String alias, Table<TrackerRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TrackerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRACKER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrackerRecord> getPrimaryKey() {
        return Keys.KEY_TRACKER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrackerRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackerRecord>>asList(Keys.KEY_TRACKER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tracker as(String alias) {
        return new Tracker(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tracker rename(String name) {
        return new Tracker(name, null);
    }
}

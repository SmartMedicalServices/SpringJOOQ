/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.CampaignLogRecord;

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
public class CampaignLog extends TableImpl<CampaignLogRecord> {

    private static final long serialVersionUID = -336870592;

    /**
     * The reference instance of <code>sugarcrm_4_12.campaign_log</code>
     */
    public static final CampaignLog CAMPAIGN_LOG = new CampaignLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CampaignLogRecord> getRecordType() {
        return CampaignLogRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.campaign_log.id</code>.
     */
    public final TableField<CampaignLogRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.campaign_id</code>.
     */
    public final TableField<CampaignLogRecord, String> CAMPAIGN_ID = createField("campaign_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.target_tracker_key</code>.
     */
    public final TableField<CampaignLogRecord, String> TARGET_TRACKER_KEY = createField("target_tracker_key", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.target_id</code>.
     */
    public final TableField<CampaignLogRecord, String> TARGET_ID = createField("target_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.target_type</code>.
     */
    public final TableField<CampaignLogRecord, String> TARGET_TYPE = createField("target_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.activity_type</code>.
     */
    public final TableField<CampaignLogRecord, String> ACTIVITY_TYPE = createField("activity_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.activity_date</code>.
     */
    public final TableField<CampaignLogRecord, Timestamp> ACTIVITY_DATE = createField("activity_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.related_id</code>.
     */
    public final TableField<CampaignLogRecord, String> RELATED_ID = createField("related_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.related_type</code>.
     */
    public final TableField<CampaignLogRecord, String> RELATED_TYPE = createField("related_type", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.archived</code>.
     */
    public final TableField<CampaignLogRecord, Byte> ARCHIVED = createField("archived", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.hits</code>.
     */
    public final TableField<CampaignLogRecord, Integer> HITS = createField("hits", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.list_id</code>.
     */
    public final TableField<CampaignLogRecord, String> LIST_ID = createField("list_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.deleted</code>.
     */
    public final TableField<CampaignLogRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.date_modified</code>.
     */
    public final TableField<CampaignLogRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.more_information</code>.
     */
    public final TableField<CampaignLogRecord, String> MORE_INFORMATION = createField("more_information", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.campaign_log.marketing_id</code>.
     */
    public final TableField<CampaignLogRecord, String> MARKETING_ID = createField("marketing_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.campaign_log</code> table reference
     */
    public CampaignLog() {
        this("campaign_log", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.campaign_log</code> table reference
     */
    public CampaignLog(String alias) {
        this(alias, CAMPAIGN_LOG);
    }

    private CampaignLog(String alias, Table<CampaignLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private CampaignLog(String alias, Table<CampaignLogRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<CampaignLogRecord> getPrimaryKey() {
        return Keys.KEY_CAMPAIGN_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CampaignLogRecord>> getKeys() {
        return Arrays.<UniqueKey<CampaignLogRecord>>asList(Keys.KEY_CAMPAIGN_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CampaignLog as(String alias) {
        return new CampaignLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CampaignLog rename(String name) {
        return new CampaignLog(name, null);
    }
}

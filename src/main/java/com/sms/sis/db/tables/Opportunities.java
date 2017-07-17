/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.OpportunitiesRecord;

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
public class Opportunities extends TableImpl<OpportunitiesRecord> {

    private static final long serialVersionUID = -749028524;

    /**
     * The reference instance of <code>sugarcrm_4_12.opportunities</code>
     */
    public static final Opportunities OPPORTUNITIES = new Opportunities();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OpportunitiesRecord> getRecordType() {
        return OpportunitiesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.opportunities.id</code>.
     */
    public final TableField<OpportunitiesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.name</code>.
     */
    public final TableField<OpportunitiesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.date_entered</code>.
     */
    public final TableField<OpportunitiesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.date_modified</code>.
     */
    public final TableField<OpportunitiesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.modified_user_id</code>.
     */
    public final TableField<OpportunitiesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.created_by</code>.
     */
    public final TableField<OpportunitiesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.description</code>.
     */
    public final TableField<OpportunitiesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.deleted</code>.
     */
    public final TableField<OpportunitiesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.assigned_user_id</code>.
     */
    public final TableField<OpportunitiesRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.opportunity_type</code>.
     */
    public final TableField<OpportunitiesRecord, String> OPPORTUNITY_TYPE = createField("opportunity_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.campaign_id</code>.
     */
    public final TableField<OpportunitiesRecord, String> CAMPAIGN_ID = createField("campaign_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.lead_source</code>.
     */
    public final TableField<OpportunitiesRecord, String> LEAD_SOURCE = createField("lead_source", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.amount</code>.
     */
    public final TableField<OpportunitiesRecord, Double> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.amount_usdollar</code>.
     */
    public final TableField<OpportunitiesRecord, Double> AMOUNT_USDOLLAR = createField("amount_usdollar", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.currency_id</code>.
     */
    public final TableField<OpportunitiesRecord, String> CURRENCY_ID = createField("currency_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.date_closed</code>.
     */
    public final TableField<OpportunitiesRecord, Date> DATE_CLOSED = createField("date_closed", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.next_step</code>.
     */
    public final TableField<OpportunitiesRecord, String> NEXT_STEP = createField("next_step", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.sales_stage</code>.
     */
    public final TableField<OpportunitiesRecord, String> SALES_STAGE = createField("sales_stage", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.opportunities.probability</code>.
     */
    public final TableField<OpportunitiesRecord, Double> PROBABILITY = createField("probability", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * Create a <code>sugarcrm_4_12.opportunities</code> table reference
     */
    public Opportunities() {
        this("opportunities", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.opportunities</code> table reference
     */
    public Opportunities(String alias) {
        this(alias, OPPORTUNITIES);
    }

    private Opportunities(String alias, Table<OpportunitiesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Opportunities(String alias, Table<OpportunitiesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<OpportunitiesRecord> getPrimaryKey() {
        return Keys.KEY_OPPORTUNITIES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OpportunitiesRecord>> getKeys() {
        return Arrays.<UniqueKey<OpportunitiesRecord>>asList(Keys.KEY_OPPORTUNITIES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Opportunities as(String alias) {
        return new Opportunities(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Opportunities rename(String name) {
        return new Opportunities(name, null);
    }
}

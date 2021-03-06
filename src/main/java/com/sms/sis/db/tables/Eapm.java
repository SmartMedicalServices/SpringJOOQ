/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.EapmRecord;

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
public class Eapm extends TableImpl<EapmRecord> {

    private static final long serialVersionUID = -571967192;

    /**
     * The reference instance of <code>sugarcrm_4_12.eapm</code>
     */
    public static final Eapm EAPM = new Eapm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EapmRecord> getRecordType() {
        return EapmRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.eapm.id</code>.
     */
    public final TableField<EapmRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.name</code>.
     */
    public final TableField<EapmRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.date_entered</code>.
     */
    public final TableField<EapmRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.date_modified</code>.
     */
    public final TableField<EapmRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.modified_user_id</code>.
     */
    public final TableField<EapmRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.created_by</code>.
     */
    public final TableField<EapmRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.description</code>.
     */
    public final TableField<EapmRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.deleted</code>.
     */
    public final TableField<EapmRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.assigned_user_id</code>.
     */
    public final TableField<EapmRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.password</code>.
     */
    public final TableField<EapmRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.url</code>.
     */
    public final TableField<EapmRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.application</code>.
     */
    public final TableField<EapmRecord, String> APPLICATION = createField("application", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("webex", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.api_data</code>.
     */
    public final TableField<EapmRecord, String> API_DATA = createField("api_data", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.consumer_key</code>.
     */
    public final TableField<EapmRecord, String> CONSUMER_KEY = createField("consumer_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.consumer_secret</code>.
     */
    public final TableField<EapmRecord, String> CONSUMER_SECRET = createField("consumer_secret", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.oauth_token</code>.
     */
    public final TableField<EapmRecord, String> OAUTH_TOKEN = createField("oauth_token", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.oauth_secret</code>.
     */
    public final TableField<EapmRecord, String> OAUTH_SECRET = createField("oauth_secret", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.eapm.validated</code>.
     */
    public final TableField<EapmRecord, Byte> VALIDATED = createField("validated", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>sugarcrm_4_12.eapm</code> table reference
     */
    public Eapm() {
        this("eapm", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.eapm</code> table reference
     */
    public Eapm(String alias) {
        this(alias, EAPM);
    }

    private Eapm(String alias, Table<EapmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Eapm(String alias, Table<EapmRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<EapmRecord> getPrimaryKey() {
        return Keys.KEY_EAPM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EapmRecord>> getKeys() {
        return Arrays.<UniqueKey<EapmRecord>>asList(Keys.KEY_EAPM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Eapm as(String alias) {
        return new Eapm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Eapm rename(String name) {
        return new Eapm(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ReleasesRecord;

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
public class Releases extends TableImpl<ReleasesRecord> {

    private static final long serialVersionUID = 952508959;

    /**
     * The reference instance of <code>sugarcrm_4_12.releases</code>
     */
    public static final Releases RELEASES = new Releases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReleasesRecord> getRecordType() {
        return ReleasesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.releases.id</code>.
     */
    public final TableField<ReleasesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.deleted</code>.
     */
    public final TableField<ReleasesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.date_entered</code>.
     */
    public final TableField<ReleasesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.date_modified</code>.
     */
    public final TableField<ReleasesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.modified_user_id</code>.
     */
    public final TableField<ReleasesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.created_by</code>.
     */
    public final TableField<ReleasesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.name</code>.
     */
    public final TableField<ReleasesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.list_order</code>.
     */
    public final TableField<ReleasesRecord, Integer> LIST_ORDER = createField("list_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.releases.status</code>.
     */
    public final TableField<ReleasesRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * Create a <code>sugarcrm_4_12.releases</code> table reference
     */
    public Releases() {
        this("releases", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.releases</code> table reference
     */
    public Releases(String alias) {
        this(alias, RELEASES);
    }

    private Releases(String alias, Table<ReleasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Releases(String alias, Table<ReleasesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ReleasesRecord> getPrimaryKey() {
        return Keys.KEY_RELEASES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReleasesRecord>> getKeys() {
        return Arrays.<UniqueKey<ReleasesRecord>>asList(Keys.KEY_RELEASES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Releases as(String alias) {
        return new Releases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Releases rename(String name) {
        return new Releases(name, null);
    }
}

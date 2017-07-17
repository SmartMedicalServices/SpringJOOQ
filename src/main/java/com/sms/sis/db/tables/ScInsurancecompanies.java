/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScInsurancecompaniesRecord;

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
public class ScInsurancecompanies extends TableImpl<ScInsurancecompaniesRecord> {

    private static final long serialVersionUID = -1340764397;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_insurancecompanies</code>
     */
    public static final ScInsurancecompanies SC_INSURANCECOMPANIES = new ScInsurancecompanies();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScInsurancecompaniesRecord> getRecordType() {
        return ScInsurancecompaniesRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.id</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.name</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.date_entered</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.date_modified</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.modified_user_id</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.created_by</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.description</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.deleted</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_insurancecompanies.assigned_user_id</code>.
     */
    public final TableField<ScInsurancecompaniesRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_insurancecompanies</code> table reference
     */
    public ScInsurancecompanies() {
        this("sc_insurancecompanies", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_insurancecompanies</code> table reference
     */
    public ScInsurancecompanies(String alias) {
        this(alias, SC_INSURANCECOMPANIES);
    }

    private ScInsurancecompanies(String alias, Table<ScInsurancecompaniesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScInsurancecompanies(String alias, Table<ScInsurancecompaniesRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScInsurancecompaniesRecord> getPrimaryKey() {
        return Keys.KEY_SC_INSURANCECOMPANIES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScInsurancecompaniesRecord>> getKeys() {
        return Arrays.<UniqueKey<ScInsurancecompaniesRecord>>asList(Keys.KEY_SC_INSURANCECOMPANIES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScInsurancecompanies as(String alias) {
        return new ScInsurancecompanies(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScInsurancecompanies rename(String name) {
        return new ScInsurancecompanies(name, null);
    }
}

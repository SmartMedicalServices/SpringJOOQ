/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScPatienttypeRecord;

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
public class ScPatienttype extends TableImpl<ScPatienttypeRecord> {

    private static final long serialVersionUID = 1606848766;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_patienttype</code>
     */
    public static final ScPatienttype SC_PATIENTTYPE = new ScPatienttype();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScPatienttypeRecord> getRecordType() {
        return ScPatienttypeRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.id</code>.
     */
    public final TableField<ScPatienttypeRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.name</code>.
     */
    public final TableField<ScPatienttypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.date_entered</code>.
     */
    public final TableField<ScPatienttypeRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.date_modified</code>.
     */
    public final TableField<ScPatienttypeRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.modified_user_id</code>.
     */
    public final TableField<ScPatienttypeRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.created_by</code>.
     */
    public final TableField<ScPatienttypeRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.description</code>.
     */
    public final TableField<ScPatienttypeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.deleted</code>.
     */
    public final TableField<ScPatienttypeRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.assigned_user_id</code>.
     */
    public final TableField<ScPatienttypeRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patienttype.cmid</code>.
     */
    public final TableField<ScPatienttypeRecord, Integer> CMID = createField("cmid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_patienttype</code> table reference
     */
    public ScPatienttype() {
        this("sc_patienttype", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_patienttype</code> table reference
     */
    public ScPatienttype(String alias) {
        this(alias, SC_PATIENTTYPE);
    }

    private ScPatienttype(String alias, Table<ScPatienttypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScPatienttype(String alias, Table<ScPatienttypeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScPatienttypeRecord> getPrimaryKey() {
        return Keys.KEY_SC_PATIENTTYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScPatienttypeRecord>> getKeys() {
        return Arrays.<UniqueKey<ScPatienttypeRecord>>asList(Keys.KEY_SC_PATIENTTYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScPatienttype as(String alias) {
        return new ScPatienttype(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScPatienttype rename(String name) {
        return new ScPatienttype(name, null);
    }
}

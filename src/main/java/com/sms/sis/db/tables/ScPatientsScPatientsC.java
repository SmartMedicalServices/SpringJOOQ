/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScPatientsScPatientsCRecord;

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
public class ScPatientsScPatientsC extends TableImpl<ScPatientsScPatientsCRecord> {

    private static final long serialVersionUID = 383957649;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_patients_sc_patients_c</code>
     */
    public static final ScPatientsScPatientsC SC_PATIENTS_SC_PATIENTS_C = new ScPatientsScPatientsC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScPatientsScPatientsCRecord> getRecordType() {
        return ScPatientsScPatientsCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_patients_sc_patients_c.id</code>.
     */
    public final TableField<ScPatientsScPatientsCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients_sc_patients_c.date_modified</code>.
     */
    public final TableField<ScPatientsScPatientsCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients_sc_patients_c.deleted</code>.
     */
    public final TableField<ScPatientsScPatientsCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients_sc_patients_c.sc_patients_sc_patientssc_patients_ida</code>.
     */
    public final TableField<ScPatientsScPatientsCRecord, String> SC_PATIENTS_SC_PATIENTSSC_PATIENTS_IDA = createField("sc_patients_sc_patientssc_patients_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients_sc_patients_c.sc_patients_sc_patientssc_patients_idb</code>.
     */
    public final TableField<ScPatientsScPatientsCRecord, String> SC_PATIENTS_SC_PATIENTSSC_PATIENTS_IDB = createField("sc_patients_sc_patientssc_patients_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_patients_sc_patients_c</code> table reference
     */
    public ScPatientsScPatientsC() {
        this("sc_patients_sc_patients_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_patients_sc_patients_c</code> table reference
     */
    public ScPatientsScPatientsC(String alias) {
        this(alias, SC_PATIENTS_SC_PATIENTS_C);
    }

    private ScPatientsScPatientsC(String alias, Table<ScPatientsScPatientsCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScPatientsScPatientsC(String alias, Table<ScPatientsScPatientsCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScPatientsScPatientsCRecord> getPrimaryKey() {
        return Keys.KEY_SC_PATIENTS_SC_PATIENTS_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScPatientsScPatientsCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScPatientsScPatientsCRecord>>asList(Keys.KEY_SC_PATIENTS_SC_PATIENTS_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScPatientsScPatientsC as(String alias) {
        return new ScPatientsScPatientsC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScPatientsScPatientsC rename(String name) {
        return new ScPatientsScPatientsC(name, null);
    }
}

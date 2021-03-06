/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScContractsClassesScPatientsCRecord;

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
public class ScContractsClassesScPatientsC extends TableImpl<ScContractsClassesScPatientsCRecord> {

    private static final long serialVersionUID = 505313610;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c</code>
     */
    public static final ScContractsClassesScPatientsC SC_CONTRACTS_CLASSES_SC_PATIENTS_C = new ScContractsClassesScPatientsC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScContractsClassesScPatientsCRecord> getRecordType() {
        return ScContractsClassesScPatientsCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c.id</code>.
     */
    public final TableField<ScContractsClassesScPatientsCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c.date_modified</code>.
     */
    public final TableField<ScContractsClassesScPatientsCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c.deleted</code>.
     */
    public final TableField<ScContractsClassesScPatientsCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c.sc_contracts_classes_sc_patientssc_contracts_classes_ida</code>.
     */
    public final TableField<ScContractsClassesScPatientsCRecord, Integer> SC_CONTRACTS_CLASSES_SC_PATIENTSSC_CONTRACTS_CLASSES_IDA = createField("sc_contracts_classes_sc_patientssc_contracts_classes_ida", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c.sc_contracts_classes_sc_patientssc_patients_idb</code>.
     */
    public final TableField<ScContractsClassesScPatientsCRecord, String> SC_CONTRACTS_CLASSES_SC_PATIENTSSC_PATIENTS_IDB = createField("sc_contracts_classes_sc_patientssc_patients_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c</code> table reference
     */
    public ScContractsClassesScPatientsC() {
        this("sc_contracts_classes_sc_patients_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_contracts_classes_sc_patients_c</code> table reference
     */
    public ScContractsClassesScPatientsC(String alias) {
        this(alias, SC_CONTRACTS_CLASSES_SC_PATIENTS_C);
    }

    private ScContractsClassesScPatientsC(String alias, Table<ScContractsClassesScPatientsCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScContractsClassesScPatientsC(String alias, Table<ScContractsClassesScPatientsCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScContractsClassesScPatientsCRecord> getPrimaryKey() {
        return Keys.KEY_SC_CONTRACTS_CLASSES_SC_PATIENTS_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScContractsClassesScPatientsCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScContractsClassesScPatientsCRecord>>asList(Keys.KEY_SC_CONTRACTS_CLASSES_SC_PATIENTS_C_IDX_SC_CONTRACTS_CLASSES_SC_PATIENTS_C, Keys.KEY_SC_CONTRACTS_CLASSES_SC_PATIENTS_C_PRIMARY, Keys.KEY_SC_CONTRACTS_CLASSES_SC_PATIENTS_C_SC_CONTRACTS_CLASSES_SC_PATIENTS_ALT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScContractsClassesScPatientsC as(String alias) {
        return new ScContractsClassesScPatientsC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScContractsClassesScPatientsC rename(String name) {
        return new ScContractsClassesScPatientsC(name, null);
    }
}

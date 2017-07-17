/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScConstraintsScContractsClassesCRecord;

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
public class ScConstraintsScContractsClassesC extends TableImpl<ScConstraintsScContractsClassesCRecord> {

    private static final long serialVersionUID = -1838461916;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c</code>
     */
    public static final ScConstraintsScContractsClassesC SC_CONSTRAINTS_SC_CONTRACTS_CLASSES_C = new ScConstraintsScContractsClassesC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScConstraintsScContractsClassesCRecord> getRecordType() {
        return ScConstraintsScContractsClassesCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c.id</code>.
     */
    public final TableField<ScConstraintsScContractsClassesCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c.date_modified</code>.
     */
    public final TableField<ScConstraintsScContractsClassesCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c.deleted</code>.
     */
    public final TableField<ScConstraintsScContractsClassesCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c.sc_constraints_sc_contracts_classessc_contracts_classes_ida</code>.
     */
    public final TableField<ScConstraintsScContractsClassesCRecord, String> SC_CONSTRAINTS_SC_CONTRACTS_CLASSESSC_CONTRACTS_CLASSES_IDA = createField("sc_constraints_sc_contracts_classessc_contracts_classes_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c.sc_constraints_sc_contracts_classessc_constraints_idb</code>.
     */
    public final TableField<ScConstraintsScContractsClassesCRecord, String> SC_CONSTRAINTS_SC_CONTRACTS_CLASSESSC_CONSTRAINTS_IDB = createField("sc_constraints_sc_contracts_classessc_constraints_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c</code> table reference
     */
    public ScConstraintsScContractsClassesC() {
        this("sc_constraints_sc_contracts_classes_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_constraints_sc_contracts_classes_c</code> table reference
     */
    public ScConstraintsScContractsClassesC(String alias) {
        this(alias, SC_CONSTRAINTS_SC_CONTRACTS_CLASSES_C);
    }

    private ScConstraintsScContractsClassesC(String alias, Table<ScConstraintsScContractsClassesCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScConstraintsScContractsClassesC(String alias, Table<ScConstraintsScContractsClassesCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScConstraintsScContractsClassesCRecord> getPrimaryKey() {
        return Keys.KEY_SC_CONSTRAINTS_SC_CONTRACTS_CLASSES_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScConstraintsScContractsClassesCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScConstraintsScContractsClassesCRecord>>asList(Keys.KEY_SC_CONSTRAINTS_SC_CONTRACTS_CLASSES_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScConstraintsScContractsClassesC as(String alias) {
        return new ScConstraintsScContractsClassesC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScConstraintsScContractsClassesC rename(String name) {
        return new ScConstraintsScContractsClassesC(name, null);
    }
}

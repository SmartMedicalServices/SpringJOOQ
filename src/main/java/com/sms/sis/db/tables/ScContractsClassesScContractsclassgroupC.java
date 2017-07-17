/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScContractsClassesScContractsclassgroupCRecord;

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
public class ScContractsClassesScContractsclassgroupC extends TableImpl<ScContractsClassesScContractsclassgroupCRecord> {

    private static final long serialVersionUID = -913094399;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c</code>
     */
    public static final ScContractsClassesScContractsclassgroupC SC_CONTRACTS_CLASSES_SC_CONTRACTSCLASSGROUP_C = new ScContractsClassesScContractsclassgroupC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScContractsClassesScContractsclassgroupCRecord> getRecordType() {
        return ScContractsClassesScContractsclassgroupCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c.id</code>.
     */
    public final TableField<ScContractsClassesScContractsclassgroupCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c.date_modified</code>.
     */
    public final TableField<ScContractsClassesScContractsclassgroupCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c.deleted</code>.
     */
    public final TableField<ScContractsClassesScContractsclassgroupCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c.sc_contraca923classes_ida</code>.
     */
    public final TableField<ScContractsClassesScContractsclassgroupCRecord, String> SC_CONTRACA923CLASSES_IDA = createField("sc_contraca923classes_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c.sc_contrac1745ssgroup_idb</code>.
     */
    public final TableField<ScContractsClassesScContractsclassgroupCRecord, String> SC_CONTRAC1745SSGROUP_IDB = createField("sc_contrac1745ssgroup_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c</code> table reference
     */
    public ScContractsClassesScContractsclassgroupC() {
        this("sc_contracts_classes_sc_contractsclassgroup_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_contracts_classes_sc_contractsclassgroup_c</code> table reference
     */
    public ScContractsClassesScContractsclassgroupC(String alias) {
        this(alias, SC_CONTRACTS_CLASSES_SC_CONTRACTSCLASSGROUP_C);
    }

    private ScContractsClassesScContractsclassgroupC(String alias, Table<ScContractsClassesScContractsclassgroupCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScContractsClassesScContractsclassgroupC(String alias, Table<ScContractsClassesScContractsclassgroupCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScContractsClassesScContractsclassgroupCRecord> getPrimaryKey() {
        return Keys.KEY_SC_CONTRACTS_CLASSES_SC_CONTRACTSCLASSGROUP_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScContractsClassesScContractsclassgroupCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScContractsClassesScContractsclassgroupCRecord>>asList(Keys.KEY_SC_CONTRACTS_CLASSES_SC_CONTRACTSCLASSGROUP_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScContractsClassesScContractsclassgroupC as(String alias) {
        return new ScContractsClassesScContractsclassgroupC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScContractsClassesScContractsclassgroupC rename(String name) {
        return new ScContractsClassesScContractsclassgroupC(name, null);
    }
}

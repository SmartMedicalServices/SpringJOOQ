/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScCompaniesScCompanycontractsCRecord;

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
public class ScCompaniesScCompanycontractsC extends TableImpl<ScCompaniesScCompanycontractsCRecord> {

    private static final long serialVersionUID = -1094229150;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c</code>
     */
    public static final ScCompaniesScCompanycontractsC SC_COMPANIES_SC_COMPANYCONTRACTS_C = new ScCompaniesScCompanycontractsC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScCompaniesScCompanycontractsCRecord> getRecordType() {
        return ScCompaniesScCompanycontractsCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c.id</code>.
     */
    public final TableField<ScCompaniesScCompanycontractsCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c.date_modified</code>.
     */
    public final TableField<ScCompaniesScCompanycontractsCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c.deleted</code>.
     */
    public final TableField<ScCompaniesScCompanycontractsCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c.sc_companies_sc_companycontractssc_companies_ida</code>.
     */
    public final TableField<ScCompaniesScCompanycontractsCRecord, String> SC_COMPANIES_SC_COMPANYCONTRACTSSC_COMPANIES_IDA = createField("sc_companies_sc_companycontractssc_companies_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c.sc_companies_sc_companycontractssc_companycontracts_idb</code>.
     */
    public final TableField<ScCompaniesScCompanycontractsCRecord, String> SC_COMPANIES_SC_COMPANYCONTRACTSSC_COMPANYCONTRACTS_IDB = createField("sc_companies_sc_companycontractssc_companycontracts_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c</code> table reference
     */
    public ScCompaniesScCompanycontractsC() {
        this("sc_companies_sc_companycontracts_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_companies_sc_companycontracts_c</code> table reference
     */
    public ScCompaniesScCompanycontractsC(String alias) {
        this(alias, SC_COMPANIES_SC_COMPANYCONTRACTS_C);
    }

    private ScCompaniesScCompanycontractsC(String alias, Table<ScCompaniesScCompanycontractsCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScCompaniesScCompanycontractsC(String alias, Table<ScCompaniesScCompanycontractsCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScCompaniesScCompanycontractsCRecord> getPrimaryKey() {
        return Keys.KEY_SC_COMPANIES_SC_COMPANYCONTRACTS_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScCompaniesScCompanycontractsCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScCompaniesScCompanycontractsCRecord>>asList(Keys.KEY_SC_COMPANIES_SC_COMPANYCONTRACTS_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScCompaniesScCompanycontractsC as(String alias) {
        return new ScCompaniesScCompanycontractsC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScCompaniesScCompanycontractsC rename(String name) {
        return new ScCompaniesScCompanycontractsC(name, null);
    }
}

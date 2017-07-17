/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScProvidersScClaims_1CRecord;

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
public class ScProvidersScClaims_1C extends TableImpl<ScProvidersScClaims_1CRecord> {

    private static final long serialVersionUID = -811452850;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_providers_sc_claims_1_c</code>
     */
    public static final ScProvidersScClaims_1C SC_PROVIDERS_SC_CLAIMS_1_C = new ScProvidersScClaims_1C();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScProvidersScClaims_1CRecord> getRecordType() {
        return ScProvidersScClaims_1CRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.id</code>.
     */
    public final TableField<ScProvidersScClaims_1CRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.date_modified</code>.
     */
    public final TableField<ScProvidersScClaims_1CRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.deleted</code>.
     */
    public final TableField<ScProvidersScClaims_1CRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_providers_ida</code>.
     */
    public final TableField<ScProvidersScClaims_1CRecord, String> SC_PROVIDERS_SC_CLAIMS_1SC_PROVIDERS_IDA = createField("sc_providers_sc_claims_1sc_providers_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_claims_idb</code>.
     */
    public final TableField<ScProvidersScClaims_1CRecord, String> SC_PROVIDERS_SC_CLAIMS_1SC_CLAIMS_IDB = createField("sc_providers_sc_claims_1sc_claims_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_providers_sc_claims_1_c</code> table reference
     */
    public ScProvidersScClaims_1C() {
        this("sc_providers_sc_claims_1_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_providers_sc_claims_1_c</code> table reference
     */
    public ScProvidersScClaims_1C(String alias) {
        this(alias, SC_PROVIDERS_SC_CLAIMS_1_C);
    }

    private ScProvidersScClaims_1C(String alias, Table<ScProvidersScClaims_1CRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScProvidersScClaims_1C(String alias, Table<ScProvidersScClaims_1CRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScProvidersScClaims_1CRecord> getPrimaryKey() {
        return Keys.KEY_SC_PROVIDERS_SC_CLAIMS_1_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScProvidersScClaims_1CRecord>> getKeys() {
        return Arrays.<UniqueKey<ScProvidersScClaims_1CRecord>>asList(Keys.KEY_SC_PROVIDERS_SC_CLAIMS_1_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1C as(String alias) {
        return new ScProvidersScClaims_1C(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScProvidersScClaims_1C rename(String name) {
        return new ScProvidersScClaims_1C(name, null);
    }
}

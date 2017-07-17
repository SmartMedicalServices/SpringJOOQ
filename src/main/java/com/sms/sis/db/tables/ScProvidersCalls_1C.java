/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScProvidersCalls_1CRecord;

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
public class ScProvidersCalls_1C extends TableImpl<ScProvidersCalls_1CRecord> {

    private static final long serialVersionUID = 1763218326;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_providers_calls_1_c</code>
     */
    public static final ScProvidersCalls_1C SC_PROVIDERS_CALLS_1_C = new ScProvidersCalls_1C();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScProvidersCalls_1CRecord> getRecordType() {
        return ScProvidersCalls_1CRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_providers_calls_1_c.id</code>.
     */
    public final TableField<ScProvidersCalls_1CRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_calls_1_c.date_modified</code>.
     */
    public final TableField<ScProvidersCalls_1CRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_calls_1_c.deleted</code>.
     */
    public final TableField<ScProvidersCalls_1CRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_calls_1_c.sc_providers_calls_1sc_providers_ida</code>.
     */
    public final TableField<ScProvidersCalls_1CRecord, String> SC_PROVIDERS_CALLS_1SC_PROVIDERS_IDA = createField("sc_providers_calls_1sc_providers_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_providers_calls_1_c.sc_providers_calls_1calls_idb</code>.
     */
    public final TableField<ScProvidersCalls_1CRecord, String> SC_PROVIDERS_CALLS_1CALLS_IDB = createField("sc_providers_calls_1calls_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_providers_calls_1_c</code> table reference
     */
    public ScProvidersCalls_1C() {
        this("sc_providers_calls_1_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_providers_calls_1_c</code> table reference
     */
    public ScProvidersCalls_1C(String alias) {
        this(alias, SC_PROVIDERS_CALLS_1_C);
    }

    private ScProvidersCalls_1C(String alias, Table<ScProvidersCalls_1CRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScProvidersCalls_1C(String alias, Table<ScProvidersCalls_1CRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScProvidersCalls_1CRecord> getPrimaryKey() {
        return Keys.KEY_SC_PROVIDERS_CALLS_1_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScProvidersCalls_1CRecord>> getKeys() {
        return Arrays.<UniqueKey<ScProvidersCalls_1CRecord>>asList(Keys.KEY_SC_PROVIDERS_CALLS_1_C_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersCalls_1C as(String alias) {
        return new ScProvidersCalls_1C(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScProvidersCalls_1C rename(String name) {
        return new ScProvidersCalls_1C(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScProvidersScClaims_1C;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ScProvidersScClaims_1CRecord extends UpdatableRecordImpl<ScProvidersScClaims_1CRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = 164200676;

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_providers_ida</code>.
     */
    public void setScProvidersScClaims_1scProvidersIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_providers_ida</code>.
     */
    public String getScProvidersScClaims_1scProvidersIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_claims_idb</code>.
     */
    public void setScProvidersScClaims_1scClaimsIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_claims_1_c.sc_providers_sc_claims_1sc_claims_idb</code>.
     */
    public String getScProvidersScClaims_1scClaimsIdb() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, Byte, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, Byte, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C.SC_PROVIDERS_SC_CLAIMS_1SC_PROVIDERS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C.SC_PROVIDERS_SC_CLAIMS_1SC_CLAIMS_IDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getScProvidersScClaims_1scProvidersIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScProvidersScClaims_1scClaimsIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord value4(String value) {
        setScProvidersScClaims_1scProvidersIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord value5(String value) {
        setScProvidersScClaims_1scClaimsIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScClaims_1CRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScProvidersScClaims_1CRecord
     */
    public ScProvidersScClaims_1CRecord() {
        super(ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C);
    }

    /**
     * Create a detached, initialised ScProvidersScClaims_1CRecord
     */
    public ScProvidersScClaims_1CRecord(String id, Timestamp dateModified, Byte deleted, String scProvidersScClaims_1scProvidersIda, String scProvidersScClaims_1scClaimsIdb) {
        super(ScProvidersScClaims_1C.SC_PROVIDERS_SC_CLAIMS_1_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, scProvidersScClaims_1scProvidersIda);
        set(4, scProvidersScClaims_1scClaimsIdb);
    }
}

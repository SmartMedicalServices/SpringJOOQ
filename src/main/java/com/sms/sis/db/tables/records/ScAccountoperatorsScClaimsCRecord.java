/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScAccountoperatorsScClaimsC;

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
public class ScAccountoperatorsScClaimsCRecord extends UpdatableRecordImpl<ScAccountoperatorsScClaimsCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = -848026562;

    /**
     * Setter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.sc_accountoperators_sc_claimssc_accountoperators_ida</code>.
     */
    public void setScAccountoperatorsScClaimsscAccountoperatorsIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.sc_accountoperators_sc_claimssc_accountoperators_ida</code>.
     */
    public String getScAccountoperatorsScClaimsscAccountoperatorsIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.sc_accountoperators_sc_claimssc_claims_idb</code>.
     */
    public void setScAccountoperatorsScClaimsscClaimsIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_accountoperators_sc_claims_c.sc_accountoperators_sc_claimssc_claims_idb</code>.
     */
    public String getScAccountoperatorsScClaimsscClaimsIdb() {
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
        return ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C.SC_ACCOUNTOPERATORS_SC_CLAIMSSC_ACCOUNTOPERATORS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C.SC_ACCOUNTOPERATORS_SC_CLAIMSSC_CLAIMS_IDB;
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
        return getScAccountoperatorsScClaimsscAccountoperatorsIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScAccountoperatorsScClaimsscClaimsIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord value4(String value) {
        setScAccountoperatorsScClaimsscAccountoperatorsIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord value5(String value) {
        setScAccountoperatorsScClaimsscClaimsIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScAccountoperatorsScClaimsCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached ScAccountoperatorsScClaimsCRecord
     */
    public ScAccountoperatorsScClaimsCRecord() {
        super(ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C);
    }

    /**
     * Create a detached, initialised ScAccountoperatorsScClaimsCRecord
     */
    public ScAccountoperatorsScClaimsCRecord(String id, Timestamp dateModified, Byte deleted, String scAccountoperatorsScClaimsscAccountoperatorsIda, String scAccountoperatorsScClaimsscClaimsIdb) {
        super(ScAccountoperatorsScClaimsC.SC_ACCOUNTOPERATORS_SC_CLAIMS_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, scAccountoperatorsScClaimsscAccountoperatorsIda);
        set(4, scAccountoperatorsScClaimsscClaimsIdb);
    }
}

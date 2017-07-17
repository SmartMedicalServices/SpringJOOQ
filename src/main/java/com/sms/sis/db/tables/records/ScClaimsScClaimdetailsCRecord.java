/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScClaimsScClaimdetailsC;

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
public class ScClaimsScClaimdetailsCRecord extends UpdatableRecordImpl<ScClaimsScClaimdetailsCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = 552313466;

    /**
     * Setter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.sc_claims_sc_claimdetailssc_claims_ida</code>.
     */
    public void setScClaimsScClaimdetailsscClaimsIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.sc_claims_sc_claimdetailssc_claims_ida</code>.
     */
    public String getScClaimsScClaimdetailsscClaimsIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.sc_claims_sc_claimdetailssc_claimdetails_idb</code>.
     */
    public void setScClaimsScClaimdetailsscClaimdetailsIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_claims_sc_claimdetails_c.sc_claims_sc_claimdetailssc_claimdetails_idb</code>.
     */
    public String getScClaimsScClaimdetailsscClaimdetailsIdb() {
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
        return ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C.SC_CLAIMS_SC_CLAIMDETAILSSC_CLAIMS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C.SC_CLAIMS_SC_CLAIMDETAILSSC_CLAIMDETAILS_IDB;
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
        return getScClaimsScClaimdetailsscClaimsIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScClaimsScClaimdetailsscClaimdetailsIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord value4(String value) {
        setScClaimsScClaimdetailsscClaimsIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord value5(String value) {
        setScClaimsScClaimdetailsscClaimdetailsIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScClaimsScClaimdetailsCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached ScClaimsScClaimdetailsCRecord
     */
    public ScClaimsScClaimdetailsCRecord() {
        super(ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C);
    }

    /**
     * Create a detached, initialised ScClaimsScClaimdetailsCRecord
     */
    public ScClaimsScClaimdetailsCRecord(String id, Timestamp dateModified, Byte deleted, String scClaimsScClaimdetailsscClaimsIda, String scClaimsScClaimdetailsscClaimdetailsIdb) {
        super(ScClaimsScClaimdetailsC.SC_CLAIMS_SC_CLAIMDETAILS_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, scClaimsScClaimdetailsscClaimsIda);
        set(4, scClaimsScClaimdetailsscClaimdetailsIdb);
    }
}

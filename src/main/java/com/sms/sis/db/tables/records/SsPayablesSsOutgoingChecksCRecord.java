/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsPayablesSsOutgoingChecksC;

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
public class SsPayablesSsOutgoingChecksCRecord extends UpdatableRecordImpl<SsPayablesSsOutgoingChecksCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = -136756382;

    /**
     * Setter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.ss_payables_ss_outgoing_checksss_payables_ida</code>.
     */
    public void setSsPayablesSsOutgoingChecksssPayablesIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.ss_payables_ss_outgoing_checksss_payables_ida</code>.
     */
    public String getSsPayablesSsOutgoingChecksssPayablesIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.ss_payables_ss_outgoing_checksss_outgoing_checks_idb</code>.
     */
    public void setSsPayablesSsOutgoingChecksssOutgoingChecksIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_payables_ss_outgoing_checks_c.ss_payables_ss_outgoing_checksss_outgoing_checks_idb</code>.
     */
    public String getSsPayablesSsOutgoingChecksssOutgoingChecksIdb() {
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
        return SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C.SS_PAYABLES_SS_OUTGOING_CHECKSSS_PAYABLES_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C.SS_PAYABLES_SS_OUTGOING_CHECKSSS_OUTGOING_CHECKS_IDB;
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
        return getSsPayablesSsOutgoingChecksssPayablesIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSsPayablesSsOutgoingChecksssOutgoingChecksIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord value4(String value) {
        setSsPayablesSsOutgoingChecksssPayablesIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord value5(String value) {
        setSsPayablesSsOutgoingChecksssOutgoingChecksIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsPayablesSsOutgoingChecksCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached SsPayablesSsOutgoingChecksCRecord
     */
    public SsPayablesSsOutgoingChecksCRecord() {
        super(SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C);
    }

    /**
     * Create a detached, initialised SsPayablesSsOutgoingChecksCRecord
     */
    public SsPayablesSsOutgoingChecksCRecord(String id, Timestamp dateModified, Byte deleted, String ssPayablesSsOutgoingChecksssPayablesIda, String ssPayablesSsOutgoingChecksssOutgoingChecksIdb) {
        super(SsPayablesSsOutgoingChecksC.SS_PAYABLES_SS_OUTGOING_CHECKS_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, ssPayablesSsOutgoingChecksssPayablesIda);
        set(4, ssPayablesSsOutgoingChecksssOutgoingChecksIdb);
    }
}

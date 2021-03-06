/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScApprovalsScPatientsC;

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
public class ScApprovalsScPatientsCRecord extends UpdatableRecordImpl<ScApprovalsScPatientsCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = -401086538;

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.sc_approvals_sc_patientssc_patients_ida</code>.
     */
    public void setScApprovalsScPatientsscPatientsIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.sc_approvals_sc_patientssc_patients_ida</code>.
     */
    public String getScApprovalsScPatientsscPatientsIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.sc_approvals_sc_patientssc_approvals_idb</code>.
     */
    public void setScApprovalsScPatientsscApprovalsIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvals_sc_patients_c.sc_approvals_sc_patientssc_approvals_idb</code>.
     */
    public String getScApprovalsScPatientsscApprovalsIdb() {
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
        return ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C.SC_APPROVALS_SC_PATIENTSSC_PATIENTS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C.SC_APPROVALS_SC_PATIENTSSC_APPROVALS_IDB;
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
        return getScApprovalsScPatientsscPatientsIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getScApprovalsScPatientsscApprovalsIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord value4(String value) {
        setScApprovalsScPatientsscPatientsIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord value5(String value) {
        setScApprovalsScPatientsscApprovalsIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovalsScPatientsCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached ScApprovalsScPatientsCRecord
     */
    public ScApprovalsScPatientsCRecord() {
        super(ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C);
    }

    /**
     * Create a detached, initialised ScApprovalsScPatientsCRecord
     */
    public ScApprovalsScPatientsCRecord(String id, Timestamp dateModified, Byte deleted, String scApprovalsScPatientsscPatientsIda, String scApprovalsScPatientsscApprovalsIdb) {
        super(ScApprovalsScPatientsC.SC_APPROVALS_SC_PATIENTS_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, scApprovalsScPatientsscPatientsIda);
        set(4, scApprovalsScPatientsscApprovalsIdb);
    }
}

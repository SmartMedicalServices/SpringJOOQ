/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScApprovaldetailsdrugs;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class ScApprovaldetailsdrugsRecord extends UpdatableRecordImpl<ScApprovaldetailsdrugsRecord> implements Record14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, Double, Double, String, String> {

    private static final long serialVersionUID = -1678292198;

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.sc_drugs_id_c</code>.
     */
    public void setScDrugsIdC(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.sc_drugs_id_c</code>.
     */
    public String getScDrugsIdC() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugprice</code>.
     */
    public void setDrugprice(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugprice</code>.
     */
    public Double getDrugprice() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugdose</code>.
     */
    public void setDrugdose(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugdose</code>.
     */
    public Double getDrugdose() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugduration</code>.
     */
    public void setDrugduration(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.drugduration</code>.
     */
    public String getDrugduration() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.dosagetype</code>.
     */
    public void setDosagetype(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_approvaldetailsdrugs.dosagetype</code>.
     */
    public String getDosagetype() {
        return (String) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, Double, Double, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, Double, Double, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.SC_DRUGS_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field11() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DRUGPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field12() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DRUGDOSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DRUGDURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS.DOSAGETYPE;
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateEntered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getModifiedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getScDrugsIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value11() {
        return getDrugprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value12() {
        return getDrugdose();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDrugduration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getDosagetype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value10(String value) {
        setScDrugsIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value11(Double value) {
        setDrugprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value12(Double value) {
        setDrugdose(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value13(String value) {
        setDrugduration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord value14(String value) {
        setDosagetype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScApprovaldetailsdrugsRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, Double value11, Double value12, String value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScApprovaldetailsdrugsRecord
     */
    public ScApprovaldetailsdrugsRecord() {
        super(ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS);
    }

    /**
     * Create a detached, initialised ScApprovaldetailsdrugsRecord
     */
    public ScApprovaldetailsdrugsRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String scDrugsIdC, Double drugprice, Double drugdose, String drugduration, String dosagetype) {
        super(ScApprovaldetailsdrugs.SC_APPROVALDETAILSDRUGS);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, scDrugsIdC);
        set(10, drugprice);
        set(11, drugdose);
        set(12, drugduration);
        set(13, dosagetype);
    }
}

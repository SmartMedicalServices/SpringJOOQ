/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsJournalEntryRow;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class SsJournalEntryRowRecord extends UpdatableRecordImpl<SsJournalEntryRowRecord> implements Record16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, BigDecimal, String, String, Byte, Byte> {

    private static final long serialVersionUID = -1572715986;

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.credit</code>.
     */
    public void setCredit(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.credit</code>.
     */
    public BigDecimal getCredit() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.currency_id</code>.
     */
    public void setCurrencyId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.currency_id</code>.
     */
    public String getCurrencyId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.debit</code>.
     */
    public void setDebit(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.debit</code>.
     */
    public BigDecimal getDebit() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.memo</code>.
     */
    public void setMemo(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.memo</code>.
     */
    public String getMemo() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.ss_gl_account_id_c</code>.
     */
    public void setSsGlAccountIdC(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.ss_gl_account_id_c</code>.
     */
    public String getSsGlAccountIdC() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.is_processed</code>.
     */
    public void setIsProcessed(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.is_processed</code>.
     */
    public Byte getIsProcessed() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_journal_entry_row.is_automatic</code>.
     */
    public void setIsAutomatic(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_journal_entry_row.is_automatic</code>.
     */
    public Byte getIsAutomatic() {
        return (Byte) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, BigDecimal, String, String, Byte, Byte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, BigDecimal, String, String, Byte, Byte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.CREDIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.CURRENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.DEBIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.MEMO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.SS_GL_ACCOUNT_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.IS_PROCESSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW.IS_AUTOMATIC;
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
    public BigDecimal value10() {
        return getCredit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getCurrencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getDebit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getMemo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSsGlAccountIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getIsProcessed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getIsAutomatic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value10(BigDecimal value) {
        setCredit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value11(String value) {
        setCurrencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value12(BigDecimal value) {
        setDebit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value13(String value) {
        setMemo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value14(String value) {
        setSsGlAccountIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value15(Byte value) {
        setIsProcessed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord value16(Byte value) {
        setIsAutomatic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsJournalEntryRowRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, BigDecimal value10, String value11, BigDecimal value12, String value13, String value14, Byte value15, Byte value16) {
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
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SsJournalEntryRowRecord
     */
    public SsJournalEntryRowRecord() {
        super(SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW);
    }

    /**
     * Create a detached, initialised SsJournalEntryRowRecord
     */
    public SsJournalEntryRowRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, BigDecimal credit, String currencyId, BigDecimal debit, String memo, String ssGlAccountIdC, Byte isProcessed, Byte isAutomatic) {
        super(SsJournalEntryRow.SS_JOURNAL_ENTRY_ROW);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, credit);
        set(10, currencyId);
        set(11, debit);
        set(12, memo);
        set(13, ssGlAccountIdC);
        set(14, isProcessed);
        set(15, isAutomatic);
    }
}

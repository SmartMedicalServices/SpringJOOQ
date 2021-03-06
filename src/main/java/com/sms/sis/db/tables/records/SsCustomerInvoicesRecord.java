/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsCustomerInvoices;

import java.math.BigDecimal;
import java.sql.Date;
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
public class SsCustomerInvoicesRecord extends UpdatableRecordImpl<SsCustomerInvoicesRecord> implements Record14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, Date, String, String> {

    private static final long serialVersionUID = -48663913;

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.total_amount</code>.
     */
    public void setTotalAmount(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.total_amount</code>.
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.currency_id</code>.
     */
    public void setCurrencyId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.currency_id</code>.
     */
    public String getCurrencyId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.invoice_date</code>.
     */
    public void setInvoiceDate(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.invoice_date</code>.
     */
    public Date getInvoiceDate() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.ss_gl_account_id_c</code>.
     */
    public void setSsGlAccountIdC(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.ss_gl_account_id_c</code>.
     */
    public String getSsGlAccountIdC() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_customer_invoices.journal_entry_id</code>.
     */
    public void setJournalEntryId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_customer_invoices.journal_entry_id</code>.
     */
    public String getJournalEntryId() {
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
    public Row14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, Date, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, Timestamp, Timestamp, String, String, String, Byte, String, BigDecimal, String, Date, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.TOTAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.CURRENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field12() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.INVOICE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.SS_GL_ACCOUNT_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SsCustomerInvoices.SS_CUSTOMER_INVOICES.JOURNAL_ENTRY_ID;
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
        return getTotalAmount();
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
    public Date value12() {
        return getInvoiceDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSsGlAccountIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getJournalEntryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value10(BigDecimal value) {
        setTotalAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value11(String value) {
        setCurrencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value12(Date value) {
        setInvoiceDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value13(String value) {
        setSsGlAccountIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord value14(String value) {
        setJournalEntryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsCustomerInvoicesRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, BigDecimal value10, String value11, Date value12, String value13, String value14) {
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
     * Create a detached SsCustomerInvoicesRecord
     */
    public SsCustomerInvoicesRecord() {
        super(SsCustomerInvoices.SS_CUSTOMER_INVOICES);
    }

    /**
     * Create a detached, initialised SsCustomerInvoicesRecord
     */
    public SsCustomerInvoicesRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, BigDecimal totalAmount, String currencyId, Date invoiceDate, String ssGlAccountIdC, String journalEntryId) {
        super(SsCustomerInvoices.SS_CUSTOMER_INVOICES);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, totalAmount);
        set(10, currencyId);
        set(11, invoiceDate);
        set(12, ssGlAccountIdC);
        set(13, journalEntryId);
    }
}

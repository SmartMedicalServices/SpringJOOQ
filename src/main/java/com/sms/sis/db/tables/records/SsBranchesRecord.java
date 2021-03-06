/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsBranches;

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
public class SsBranchesRecord extends UpdatableRecordImpl<SsBranchesRecord> implements Record16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1608473514;

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.invoices_footer_text</code>.
     */
    public void setInvoicesFooterText(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.invoices_footer_text</code>.
     */
    public String getInvoicesFooterText() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.exchange_perm_footer_text</code>.
     */
    public void setExchangePermFooterText(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.exchange_perm_footer_text</code>.
     */
    public String getExchangePermFooterText() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.address</code>.
     */
    public void setAddress(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.address</code>.
     */
    public String getAddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.branch_phone</code>.
     */
    public void setBranchPhone(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.branch_phone</code>.
     */
    public String getBranchPhone() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.manager_phone</code>.
     */
    public void setManagerPhone(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.manager_phone</code>.
     */
    public String getManagerPhone() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.manager</code>.
     */
    public void setManager(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.manager</code>.
     */
    public String getManager() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_branches.email</code>.
     */
    public void setEmail(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_branches.email</code>.
     */
    public String getEmail() {
        return (String) get(15);
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
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SsBranches.SS_BRANCHES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SsBranches.SS_BRANCHES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SsBranches.SS_BRANCHES.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SsBranches.SS_BRANCHES.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsBranches.SS_BRANCHES.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SsBranches.SS_BRANCHES.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SsBranches.SS_BRANCHES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SsBranches.SS_BRANCHES.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SsBranches.SS_BRANCHES.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SsBranches.SS_BRANCHES.INVOICES_FOOTER_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SsBranches.SS_BRANCHES.EXCHANGE_PERM_FOOTER_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SsBranches.SS_BRANCHES.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SsBranches.SS_BRANCHES.BRANCH_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SsBranches.SS_BRANCHES.MANAGER_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SsBranches.SS_BRANCHES.MANAGER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SsBranches.SS_BRANCHES.EMAIL;
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
        return getInvoicesFooterText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getExchangePermFooterText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getBranchPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getManagerPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getManager();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value10(String value) {
        setInvoicesFooterText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value11(String value) {
        setExchangePermFooterText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value12(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value13(String value) {
        setBranchPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value14(String value) {
        setManagerPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value15(String value) {
        setManager(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord value16(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBranchesRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16) {
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
     * Create a detached SsBranchesRecord
     */
    public SsBranchesRecord() {
        super(SsBranches.SS_BRANCHES);
    }

    /**
     * Create a detached, initialised SsBranchesRecord
     */
    public SsBranchesRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String invoicesFooterText, String exchangePermFooterText, String address, String branchPhone, String managerPhone, String manager, String email) {
        super(SsBranches.SS_BRANCHES);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, invoicesFooterText);
        set(10, exchangePermFooterText);
        set(11, address);
        set(12, branchPhone);
        set(13, managerPhone);
        set(14, manager);
        set(15, email);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsBanks;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class SsBanksRecord extends UpdatableRecordImpl<SsBanksRecord> implements Record20<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -201035506;

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.address_city</code>.
     */
    public void setAddressCity(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.address_city</code>.
     */
    public String getAddressCity() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.address_state</code>.
     */
    public void setAddressState(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.address_state</code>.
     */
    public String getAddressState() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.address_postalcode</code>.
     */
    public void setAddressPostalcode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.address_postalcode</code>.
     */
    public String getAddressPostalcode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.address_country</code>.
     */
    public void setAddressCountry(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.address_country</code>.
     */
    public String getAddressCountry() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.address</code>.
     */
    public void setAddress(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.address</code>.
     */
    public String getAddress() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.phone</code>.
     */
    public void setPhone(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.phone</code>.
     */
    public String getPhone() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.location</code>.
     */
    public void setLocation(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.location</code>.
     */
    public String getLocation() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.ss_gl_account_id_c</code>.
     */
    public void setSsGlAccountIdC(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.ss_gl_account_id_c</code>.
     */
    public String getSsGlAccountIdC() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.responsabile_name</code>.
     */
    public void setResponsabileName(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.responsabile_name</code>.
     */
    public String getResponsabileName() {
        return (String) get(17);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.account_number</code>.
     */
    public void setAccountNumber(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.account_number</code>.
     */
    public String getAccountNumber() {
        return (String) get(18);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_banks.bank_branch</code>.
     */
    public void setBankBranch(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_banks.bank_branch</code>.
     */
    public String getBankBranch() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SsBanks.SS_BANKS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SsBanks.SS_BANKS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SsBanks.SS_BANKS.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SsBanks.SS_BANKS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsBanks.SS_BANKS.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SsBanks.SS_BANKS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SsBanks.SS_BANKS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SsBanks.SS_BANKS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SsBanks.SS_BANKS.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SsBanks.SS_BANKS.ADDRESS_CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SsBanks.SS_BANKS.ADDRESS_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SsBanks.SS_BANKS.ADDRESS_POSTALCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SsBanks.SS_BANKS.ADDRESS_COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SsBanks.SS_BANKS.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SsBanks.SS_BANKS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SsBanks.SS_BANKS.LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SsBanks.SS_BANKS.SS_GL_ACCOUNT_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return SsBanks.SS_BANKS.RESPONSABILE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SsBanks.SS_BANKS.ACCOUNT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return SsBanks.SS_BANKS.BANK_BRANCH;
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
        return getAddressCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getAddressState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAddressPostalcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAddressCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSsGlAccountIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getResponsabileName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getAccountNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getBankBranch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value10(String value) {
        setAddressCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value11(String value) {
        setAddressState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value12(String value) {
        setAddressPostalcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value13(String value) {
        setAddressCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value14(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value15(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value16(String value) {
        setLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value17(String value) {
        setSsGlAccountIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value18(String value) {
        setResponsabileName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value19(String value) {
        setAccountNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord value20(String value) {
        setBankBranch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBanksRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SsBanksRecord
     */
    public SsBanksRecord() {
        super(SsBanks.SS_BANKS);
    }

    /**
     * Create a detached, initialised SsBanksRecord
     */
    public SsBanksRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String addressCity, String addressState, String addressPostalcode, String addressCountry, String address, String phone, String location, String ssGlAccountIdC, String responsabileName, String accountNumber, String bankBranch) {
        super(SsBanks.SS_BANKS);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, addressCity);
        set(10, addressState);
        set(11, addressPostalcode);
        set(12, addressCountry);
        set(13, address);
        set(14, phone);
        set(15, location);
        set(16, ssGlAccountIdC);
        set(17, responsabileName);
        set(18, accountNumber);
        set(19, bankBranch);
    }
}

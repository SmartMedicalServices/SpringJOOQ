/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.Claimdetailsutilizationtable;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class ClaimdetailsutilizationtableRecord extends UpdatableRecordImpl<ClaimdetailsutilizationtableRecord> implements Record19<Integer, String, String, String, String, String, String, String, Date, String, String, Short, String, String, String, Double, Double, Double, String> {

    private static final long serialVersionUID = -45122927;

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.detailID</code>.
     */
    public void setDetailid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.detailID</code>.
     */
    public Integer getDetailid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.companyName</code>.
     */
    public void setCompanyname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.companyName</code>.
     */
    public String getCompanyname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.class_code</code>.
     */
    public void setClassCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.class_code</code>.
     */
    public String getClassCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.className</code>.
     */
    public void setClassname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.className</code>.
     */
    public String getClassname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.name</code>.
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.name</code>.
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.providerName</code>.
     */
    public void setProvidername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.providerName</code>.
     */
    public String getProvidername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.card_number</code>.
     */
    public void setCardNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.card_number</code>.
     */
    public String getCardNumber() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.ActionType</code>.
     */
    public void setActiontype(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.ActionType</code>.
     */
    public String getActiontype() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceDate</code>.
     */
    public void setServicedate(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceDate</code>.
     */
    public Date getServicedate() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.movementName</code>.
     */
    public void setMovementname(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.movementName</code>.
     */
    public String getMovementname() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.documentnumber</code>.
     */
    public void setDocumentnumber(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.documentnumber</code>.
     */
    public String getDocumentnumber() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.ClaimApprovalType</code>.
     */
    public void setClaimapprovaltype(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.ClaimApprovalType</code>.
     */
    public Short getClaimapprovaltype() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceName</code>.
     */
    public void setServicename(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceName</code>.
     */
    public String getServicename() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceEnglishName</code>.
     */
    public void setServiceenglishname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceEnglishName</code>.
     */
    public String getServiceenglishname() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.supergroupName</code>.
     */
    public void setSupergroupname(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.supergroupName</code>.
     */
    public String getSupergroupname() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.gross</code>.
     */
    public void setGross(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.gross</code>.
     */
    public Double getGross() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.public_price</code>.
     */
    public void setPublicPrice(Double value) {
        set(16, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.public_price</code>.
     */
    public Double getPublicPrice() {
        return (Double) get(16);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.paid_amount</code>.
     */
    public void setPaidAmount(Double value) {
        set(17, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.paid_amount</code>.
     */
    public Double getPaidAmount() {
        return (Double) get(17);
    }

    /**
     * Setter for <code>sugarcrm_4_12.claimdetailsutilizationtable.accountID</code>.
     */
    public void setAccountid(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.claimdetailsutilizationtable.accountID</code>.
     */
    public String getAccountid() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, String, String, String, String, String, String, Date, String, String, Short, String, String, String, Double, Double, Double, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Integer, String, String, String, String, String, String, String, Date, String, String, Short, String, String, String, Double, Double, Double, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.DETAILID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.COMPANYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.CLASS_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.CLASSNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.PROVIDERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.CARD_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.ACTIONTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.SERVICEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.MOVEMENTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.DOCUMENTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.CLAIMAPPROVALTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.SERVICENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.SERVICEENGLISHNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.SUPERGROUPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field16() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.GROSS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field17() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.PUBLIC_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field18() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.PAID_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE.ACCOUNTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDetailid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCompanyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClassCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClassname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProvidername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCardNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getActiontype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getServicedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMovementname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDocumentnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getClaimapprovaltype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getServicename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getServiceenglishname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSupergroupname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value16() {
        return getGross();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value17() {
        return getPublicPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value18() {
        return getPaidAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getAccountid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value1(Integer value) {
        setDetailid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value2(String value) {
        setCompanyname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value3(String value) {
        setClassCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value4(String value) {
        setClassname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value6(String value) {
        setProvidername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value7(String value) {
        setCardNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value8(String value) {
        setActiontype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value9(Date value) {
        setServicedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value10(String value) {
        setMovementname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value11(String value) {
        setDocumentnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value12(Short value) {
        setClaimapprovaltype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value13(String value) {
        setServicename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value14(String value) {
        setServiceenglishname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value15(String value) {
        setSupergroupname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value16(Double value) {
        setGross(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value17(Double value) {
        setPublicPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value18(Double value) {
        setPaidAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord value19(String value) {
        setAccountid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClaimdetailsutilizationtableRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, Date value9, String value10, String value11, Short value12, String value13, String value14, String value15, Double value16, Double value17, Double value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClaimdetailsutilizationtableRecord
     */
    public ClaimdetailsutilizationtableRecord() {
        super(Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE);
    }

    /**
     * Create a detached, initialised ClaimdetailsutilizationtableRecord
     */
    public ClaimdetailsutilizationtableRecord(Integer detailid, String companyname, String classCode, String classname, String name, String providername, String cardNumber, String actiontype, Date servicedate, String movementname, String documentnumber, Short claimapprovaltype, String servicename, String serviceenglishname, String supergroupname, Double gross, Double publicPrice, Double paidAmount, String accountid) {
        super(Claimdetailsutilizationtable.CLAIMDETAILSUTILIZATIONTABLE);

        set(0, detailid);
        set(1, companyname);
        set(2, classCode);
        set(3, classname);
        set(4, name);
        set(5, providername);
        set(6, cardNumber);
        set(7, actiontype);
        set(8, servicedate);
        set(9, movementname);
        set(10, documentnumber);
        set(11, claimapprovaltype);
        set(12, servicename);
        set(13, serviceenglishname);
        set(14, supergroupname);
        set(15, gross);
        set(16, publicPrice);
        set(17, paidAmount);
        set(18, accountid);
    }
}

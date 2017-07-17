/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsIsTemplateData;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

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
public class SsIsTemplateDataRecord extends UpdatableRecordImpl<SsIsTemplateDataRecord> implements Record19<String, String, Timestamp, Timestamp, String, String, String, Byte, String, Date, Date, String, String, String, BigDecimal, String, String, Byte, String> {

    private static final long serialVersionUID = -930353812;

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.ss_income_statemant_templates_id_c</code>.
     */
    public void setSsIncomeStatemantTemplatesIdC(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.ss_income_statemant_templates_id_c</code>.
     */
    public String getSsIncomeStatemantTemplatesIdC() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.ss_i_s_template_details_id_c</code>.
     */
    public void setSsISTemplateDetailsIdC(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.ss_i_s_template_details_id_c</code>.
     */
    public String getSsISTemplateDetailsIdC() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.section</code>.
     */
    public void setSection(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.section</code>.
     */
    public String getSection() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.balance</code>.
     */
    public void setBalance(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.balance</code>.
     */
    public BigDecimal getBalance() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.currency_id</code>.
     */
    public void setCurrencyId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.currency_id</code>.
     */
    public String getCurrencyId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.calcuation_method</code>.
     */
    public void setCalcuationMethod(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.calcuation_method</code>.
     */
    public String getCalcuationMethod() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.current_interval</code>.
     */
    public void setCurrentInterval(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.current_interval</code>.
     */
    public Byte getCurrentInterval() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_is_template_data.ss_is_template_data_id_c</code>.
     */
    public void setSsIsTemplateDataIdC(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_is_template_data.ss_is_template_data_id_c</code>.
     */
    public String getSsIsTemplateDataIdC() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, Timestamp, Timestamp, String, String, String, Byte, String, Date, Date, String, String, String, BigDecimal, String, String, Byte, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, Timestamp, Timestamp, String, String, String, Byte, String, Date, Date, String, String, String, BigDecimal, String, String, Byte, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field11() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.SS_INCOME_STATEMANT_TEMPLATES_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.SS_I_S_TEMPLATE_DETAILS_ID_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.SECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.CURRENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.CALCUATION_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field18() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.CURRENT_INTERVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SsIsTemplateData.SS_IS_TEMPLATE_DATA.SS_IS_TEMPLATE_DATA_ID_C;
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
    public Date value10() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value11() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getSsIncomeStatemantTemplatesIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSsISTemplateDetailsIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCurrencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getCalcuationMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value18() {
        return getCurrentInterval();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getSsIsTemplateDataIdC();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value10(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value11(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value12(String value) {
        setSsIncomeStatemantTemplatesIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value13(String value) {
        setSsISTemplateDetailsIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value14(String value) {
        setSection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value15(BigDecimal value) {
        setBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value16(String value) {
        setCurrencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value17(String value) {
        setCalcuationMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value18(Byte value) {
        setCurrentInterval(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord value19(String value) {
        setSsIsTemplateDataIdC(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsIsTemplateDataRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, Date value10, Date value11, String value12, String value13, String value14, BigDecimal value15, String value16, String value17, Byte value18, String value19) {
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
     * Create a detached SsIsTemplateDataRecord
     */
    public SsIsTemplateDataRecord() {
        super(SsIsTemplateData.SS_IS_TEMPLATE_DATA);
    }

    /**
     * Create a detached, initialised SsIsTemplateDataRecord
     */
    public SsIsTemplateDataRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, Date startDate, Date endDate, String ssIncomeStatemantTemplatesIdC, String ssISTemplateDetailsIdC, String section, BigDecimal balance, String currencyId, String calcuationMethod, Byte currentInterval, String ssIsTemplateDataIdC) {
        super(SsIsTemplateData.SS_IS_TEMPLATE_DATA);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, startDate);
        set(10, endDate);
        set(11, ssIncomeStatemantTemplatesIdC);
        set(12, ssISTemplateDetailsIdC);
        set(13, section);
        set(14, balance);
        set(15, currencyId);
        set(16, calcuationMethod);
        set(17, currentInterval);
        set(18, ssIsTemplateDataIdC);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsBalanceSheetTemplatesSsBSTemplateDetailsC;

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
public class SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord extends UpdatableRecordImpl<SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = -1948563005;

    /**
     * Setter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.ss_balancef883mplates_ida</code>.
     */
    public void setSsBalancef883mplatesIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.ss_balancef883mplates_ida</code>.
     */
    public String getSsBalancef883mplatesIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.ss_balanceb305details_idb</code>.
     */
    public void setSsBalanceb305detailsIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_balance_sheet_templates_ss_b_s_template_details_c.ss_balanceb305details_idb</code>.
     */
    public String getSsBalanceb305detailsIdb() {
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
        return SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C.SS_BALANCEF883MPLATES_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C.SS_BALANCEB305DETAILS_IDB;
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
        return getSsBalancef883mplatesIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSsBalanceb305detailsIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord value4(String value) {
        setSsBalancef883mplatesIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord value5(String value) {
        setSsBalanceb305detailsIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord
     */
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord() {
        super(SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C);
    }

    /**
     * Create a detached, initialised SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord
     */
    public SsBalanceSheetTemplatesSsBSTemplateDetailsCRecord(String id, Timestamp dateModified, Byte deleted, String ssBalancef883mplatesIda, String ssBalanceb305detailsIdb) {
        super(SsBalanceSheetTemplatesSsBSTemplateDetailsC.SS_BALANCE_SHEET_TEMPLATES_SS_B_S_TEMPLATE_DETAILS_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, ssBalancef883mplatesIda);
        set(4, ssBalanceb305detailsIdb);
    }
}

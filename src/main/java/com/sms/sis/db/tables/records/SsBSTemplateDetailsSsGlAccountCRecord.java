/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.SsBSTemplateDetailsSsGlAccountC;

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
public class SsBSTemplateDetailsSsGlAccountCRecord extends UpdatableRecordImpl<SsBSTemplateDetailsSsGlAccountCRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = -1274507012;

    /**
     * Setter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.ss_b_s_template_details_ss_gl_accountss_b_s_template_details_ida</code>.
     */
    public void setSsBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.ss_b_s_template_details_ss_gl_accountss_b_s_template_details_ida</code>.
     */
    public String getSsBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.ss_b_s_template_details_ss_gl_accountss_gl_account_idb</code>.
     */
    public void setSsBSTemplateDetailsSsGlAccountssGlAccountIdb(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.ss_b_s_template_details_ss_gl_account_c.ss_b_s_template_details_ss_gl_accountss_gl_account_idb</code>.
     */
    public String getSsBSTemplateDetailsSsGlAccountssGlAccountIdb() {
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
        return SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNTSS_B_S_TEMPLATE_DETAILS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNTSS_GL_ACCOUNT_IDB;
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
        return getSsBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSsBSTemplateDetailsSsGlAccountssGlAccountIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord value4(String value) {
        setSsBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord value5(String value) {
        setSsBSTemplateDetailsSsGlAccountssGlAccountIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsBSTemplateDetailsSsGlAccountCRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached SsBSTemplateDetailsSsGlAccountCRecord
     */
    public SsBSTemplateDetailsSsGlAccountCRecord() {
        super(SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C);
    }

    /**
     * Create a detached, initialised SsBSTemplateDetailsSsGlAccountCRecord
     */
    public SsBSTemplateDetailsSsGlAccountCRecord(String id, Timestamp dateModified, Byte deleted, String ssBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda, String ssBSTemplateDetailsSsGlAccountssGlAccountIdb) {
        super(SsBSTemplateDetailsSsGlAccountC.SS_B_S_TEMPLATE_DETAILS_SS_GL_ACCOUNT_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, ssBSTemplateDetailsSsGlAccountssBSTemplateDetailsIda);
        set(4, ssBSTemplateDetailsSsGlAccountssGlAccountIdb);
    }
}

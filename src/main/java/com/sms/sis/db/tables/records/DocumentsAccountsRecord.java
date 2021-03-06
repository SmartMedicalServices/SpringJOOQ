/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.DocumentsAccounts;

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
public class DocumentsAccountsRecord extends UpdatableRecordImpl<DocumentsAccountsRecord> implements Record5<String, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = 2132307045;

    /**
     * Setter for <code>sugarcrm_4_12.documents_accounts.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.documents_accounts.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.documents_accounts.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.documents_accounts.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.documents_accounts.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.documents_accounts.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.documents_accounts.document_id</code>.
     */
    public void setDocumentId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.documents_accounts.document_id</code>.
     */
    public String getDocumentId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.documents_accounts.account_id</code>.
     */
    public void setAccountId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.documents_accounts.account_id</code>.
     */
    public String getAccountId() {
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
        return DocumentsAccounts.DOCUMENTS_ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DocumentsAccounts.DOCUMENTS_ACCOUNTS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return DocumentsAccounts.DOCUMENTS_ACCOUNTS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DocumentsAccounts.DOCUMENTS_ACCOUNTS.DOCUMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DocumentsAccounts.DOCUMENTS_ACCOUNTS.ACCOUNT_ID;
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
        return getDocumentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord value4(String value) {
        setDocumentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord value5(String value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentsAccountsRecord values(String value1, Timestamp value2, Byte value3, String value4, String value5) {
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
     * Create a detached DocumentsAccountsRecord
     */
    public DocumentsAccountsRecord() {
        super(DocumentsAccounts.DOCUMENTS_ACCOUNTS);
    }

    /**
     * Create a detached, initialised DocumentsAccountsRecord
     */
    public DocumentsAccountsRecord(String id, Timestamp dateModified, Byte deleted, String documentId, String accountId) {
        super(DocumentsAccounts.DOCUMENTS_ACCOUNTS);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, documentId);
        set(4, accountId);
    }
}

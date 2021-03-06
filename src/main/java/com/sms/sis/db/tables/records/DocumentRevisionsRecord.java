/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.DocumentRevisions;

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
public class DocumentRevisionsRecord extends UpdatableRecordImpl<DocumentRevisionsRecord> implements Record14<String, String, String, String, String, String, Timestamp, String, String, String, String, String, Byte, Timestamp> {

    private static final long serialVersionUID = 885362144;

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.change_log</code>.
     */
    public void setChangeLog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.change_log</code>.
     */
    public String getChangeLog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.document_id</code>.
     */
    public void setDocumentId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.document_id</code>.
     */
    public String getDocumentId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.doc_id</code>.
     */
    public void setDocId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.doc_id</code>.
     */
    public String getDocId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.doc_type</code>.
     */
    public void setDocType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.doc_type</code>.
     */
    public String getDocType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.doc_url</code>.
     */
    public void setDocUrl(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.doc_url</code>.
     */
    public String getDocUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.filename</code>.
     */
    public void setFilename(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.filename</code>.
     */
    public String getFilename() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.file_ext</code>.
     */
    public void setFileExt(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.file_ext</code>.
     */
    public String getFileExt() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.file_mime_type</code>.
     */
    public void setFileMimeType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.file_mime_type</code>.
     */
    public String getFileMimeType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.revision</code>.
     */
    public void setRevision(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.revision</code>.
     */
    public String getRevision() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.document_revisions.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.document_revisions.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(13);
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
    public Row14<String, String, String, String, String, String, Timestamp, String, String, String, String, String, Byte, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, Timestamp, String, String, String, String, String, Byte, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DocumentRevisions.DOCUMENT_REVISIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DocumentRevisions.DOCUMENT_REVISIONS.CHANGE_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DOCUMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DOC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DOC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DOC_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DocumentRevisions.DOCUMENT_REVISIONS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return DocumentRevisions.DOCUMENT_REVISIONS.FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return DocumentRevisions.DOCUMENT_REVISIONS.FILE_EXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return DocumentRevisions.DOCUMENT_REVISIONS.FILE_MIME_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DocumentRevisions.DOCUMENT_REVISIONS.REVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return DocumentRevisions.DOCUMENT_REVISIONS.DATE_MODIFIED;
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
        return getChangeLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDocumentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDocId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDocType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDocUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDateEntered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFileExt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getFileMimeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value2(String value) {
        setChangeLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value3(String value) {
        setDocumentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value4(String value) {
        setDocId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value5(String value) {
        setDocType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value6(String value) {
        setDocUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value7(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value8(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value9(String value) {
        setFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value10(String value) {
        setFileExt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value11(String value) {
        setFileMimeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value12(String value) {
        setRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value13(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord value14(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DocumentRevisionsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Timestamp value7, String value8, String value9, String value10, String value11, String value12, Byte value13, Timestamp value14) {
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
     * Create a detached DocumentRevisionsRecord
     */
    public DocumentRevisionsRecord() {
        super(DocumentRevisions.DOCUMENT_REVISIONS);
    }

    /**
     * Create a detached, initialised DocumentRevisionsRecord
     */
    public DocumentRevisionsRecord(String id, String changeLog, String documentId, String docId, String docType, String docUrl, Timestamp dateEntered, String createdBy, String filename, String fileExt, String fileMimeType, String revision, Byte deleted, Timestamp dateModified) {
        super(DocumentRevisions.DOCUMENT_REVISIONS);

        set(0, id);
        set(1, changeLog);
        set(2, documentId);
        set(3, docId);
        set(4, docType);
        set(5, docUrl);
        set(6, dateEntered);
        set(7, createdBy);
        set(8, filename);
        set(9, fileExt);
        set(10, fileMimeType);
        set(11, revision);
        set(12, deleted);
        set(13, dateModified);
    }
}

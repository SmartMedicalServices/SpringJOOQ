/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.FoldersRel;

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
public class FoldersRelRecord extends UpdatableRecordImpl<FoldersRelRecord> implements Record5<String, String, String, String, Byte> {

    private static final long serialVersionUID = -1153790411;

    /**
     * Setter for <code>sugarcrm_4_12.folders_rel.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.folders_rel.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.folders_rel.folder_id</code>.
     */
    public void setFolderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.folders_rel.folder_id</code>.
     */
    public String getFolderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.folders_rel.polymorphic_module</code>.
     */
    public void setPolymorphicModule(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.folders_rel.polymorphic_module</code>.
     */
    public String getPolymorphicModule() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.folders_rel.polymorphic_id</code>.
     */
    public void setPolymorphicId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.folders_rel.polymorphic_id</code>.
     */
    public String getPolymorphicId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.folders_rel.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.folders_rel.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(4);
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
    public Row5<String, String, String, String, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FoldersRel.FOLDERS_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FoldersRel.FOLDERS_REL.FOLDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FoldersRel.FOLDERS_REL.POLYMORPHIC_MODULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FoldersRel.FOLDERS_REL.POLYMORPHIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return FoldersRel.FOLDERS_REL.DELETED;
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
        return getFolderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPolymorphicModule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPolymorphicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord value2(String value) {
        setFolderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord value3(String value) {
        setPolymorphicModule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord value4(String value) {
        setPolymorphicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord value5(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersRelRecord values(String value1, String value2, String value3, String value4, Byte value5) {
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
     * Create a detached FoldersRelRecord
     */
    public FoldersRelRecord() {
        super(FoldersRel.FOLDERS_REL);
    }

    /**
     * Create a detached, initialised FoldersRelRecord
     */
    public FoldersRelRecord(String id, String folderId, String polymorphicModule, String polymorphicId, Byte deleted) {
        super(FoldersRel.FOLDERS_REL);

        set(0, id);
        set(1, folderId);
        set(2, polymorphicModule);
        set(3, polymorphicId);
        set(4, deleted);
    }
}

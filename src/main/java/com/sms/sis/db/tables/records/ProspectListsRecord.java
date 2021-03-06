/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ProspectLists;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ProspectListsRecord extends UpdatableRecordImpl<ProspectListsRecord> implements Record11<String, String, String, String, Timestamp, Timestamp, String, String, Byte, String, String> {

    private static final long serialVersionUID = -389411170;

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.id</code>.
     */
    public void setId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.id</code>.
     */
    public String getId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.list_type</code>.
     */
    public void setListType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.list_type</code>.
     */
    public String getListType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.description</code>.
     */
    public void setDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.description</code>.
     */
    public String getDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.prospect_lists.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.prospect_lists.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Timestamp, Timestamp, String, String, Byte, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, Timestamp, Timestamp, String, String, Byte, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ProspectLists.PROSPECT_LISTS.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ProspectLists.PROSPECT_LISTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ProspectLists.PROSPECT_LISTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ProspectLists.PROSPECT_LISTS.LIST_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ProspectLists.PROSPECT_LISTS.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ProspectLists.PROSPECT_LISTS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ProspectLists.PROSPECT_LISTS.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ProspectLists.PROSPECT_LISTS.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return ProspectLists.PROSPECT_LISTS.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ProspectLists.PROSPECT_LISTS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ProspectLists.PROSPECT_LISTS.DOMAIN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAssignedUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getListType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDateEntered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getDateModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getModifiedUserId();
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
    public Byte value9() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDomainName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value1(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value2(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value4(String value) {
        setListType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value5(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value6(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value7(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value8(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value9(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value10(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord value11(String value) {
        setDomainName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProspectListsRecord values(String value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6, String value7, String value8, Byte value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProspectListsRecord
     */
    public ProspectListsRecord() {
        super(ProspectLists.PROSPECT_LISTS);
    }

    /**
     * Create a detached, initialised ProspectListsRecord
     */
    public ProspectListsRecord(String assignedUserId, String id, String name, String listType, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, Byte deleted, String description, String domainName) {
        super(ProspectLists.PROSPECT_LISTS);

        set(0, assignedUserId);
        set(1, id);
        set(2, name);
        set(3, listType);
        set(4, dateEntered);
        set(5, dateModified);
        set(6, modifiedUserId);
        set(7, createdBy);
        set(8, deleted);
        set(9, description);
        set(10, domainName);
    }
}

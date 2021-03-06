/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.Eapm;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class EapmRecord extends UpdatableRecordImpl<EapmRecord> implements Record18<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, Byte> {

    private static final long serialVersionUID = 598889443;

    /**
     * Setter for <code>sugarcrm_4_12.eapm.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.date_entered</code>.
     */
    public void setDateEntered(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.date_entered</code>.
     */
    public Timestamp getDateEntered() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.modified_user_id</code>.
     */
    public void setModifiedUserId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.modified_user_id</code>.
     */
    public String getModifiedUserId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.assigned_user_id</code>.
     */
    public void setAssignedUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.assigned_user_id</code>.
     */
    public String getAssignedUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.password</code>.
     */
    public void setPassword(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.password</code>.
     */
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.url</code>.
     */
    public void setUrl(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.url</code>.
     */
    public String getUrl() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.application</code>.
     */
    public void setApplication(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.application</code>.
     */
    public String getApplication() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.api_data</code>.
     */
    public void setApiData(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.api_data</code>.
     */
    public String getApiData() {
        return (String) get(12);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.consumer_key</code>.
     */
    public void setConsumerKey(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.consumer_key</code>.
     */
    public String getConsumerKey() {
        return (String) get(13);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.consumer_secret</code>.
     */
    public void setConsumerSecret(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.consumer_secret</code>.
     */
    public String getConsumerSecret() {
        return (String) get(14);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.oauth_token</code>.
     */
    public void setOauthToken(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.oauth_token</code>.
     */
    public String getOauthToken() {
        return (String) get(15);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.oauth_secret</code>.
     */
    public void setOauthSecret(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.oauth_secret</code>.
     */
    public String getOauthSecret() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sugarcrm_4_12.eapm.validated</code>.
     */
    public void setValidated(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.eapm.validated</code>.
     */
    public Byte getValidated() {
        return (Byte) get(17);
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
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, Byte> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, Timestamp, Timestamp, String, String, String, Byte, String, String, String, String, String, String, String, String, String, Byte> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Eapm.EAPM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Eapm.EAPM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Eapm.EAPM.DATE_ENTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Eapm.EAPM.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Eapm.EAPM.MODIFIED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Eapm.EAPM.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Eapm.EAPM.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Eapm.EAPM.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Eapm.EAPM.ASSIGNED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Eapm.EAPM.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Eapm.EAPM.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Eapm.EAPM.APPLICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Eapm.EAPM.API_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Eapm.EAPM.CONSUMER_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Eapm.EAPM.CONSUMER_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Eapm.EAPM.OAUTH_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Eapm.EAPM.OAUTH_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field18() {
        return Eapm.EAPM.VALIDATED;
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
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getApplication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getApiData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getConsumerKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getConsumerSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getOauthToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getOauthSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value18() {
        return getValidated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value3(Timestamp value) {
        setDateEntered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value4(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value5(String value) {
        setModifiedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value6(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value8(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value9(String value) {
        setAssignedUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value10(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value11(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value12(String value) {
        setApplication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value13(String value) {
        setApiData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value14(String value) {
        setConsumerKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value15(String value) {
        setConsumerSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value16(String value) {
        setOauthToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value17(String value) {
        setOauthSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord value18(Byte value) {
        setValidated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EapmRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7, Byte value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, Byte value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EapmRecord
     */
    public EapmRecord() {
        super(Eapm.EAPM);
    }

    /**
     * Create a detached, initialised EapmRecord
     */
    public EapmRecord(String id, String name, Timestamp dateEntered, Timestamp dateModified, String modifiedUserId, String createdBy, String description, Byte deleted, String assignedUserId, String password, String url, String application, String apiData, String consumerKey, String consumerSecret, String oauthToken, String oauthSecret, Byte validated) {
        super(Eapm.EAPM);

        set(0, id);
        set(1, name);
        set(2, dateEntered);
        set(3, dateModified);
        set(4, modifiedUserId);
        set(5, createdBy);
        set(6, description);
        set(7, deleted);
        set(8, assignedUserId);
        set(9, password);
        set(10, url);
        set(11, application);
        set(12, apiData);
        set(13, consumerKey);
        set(14, consumerSecret);
        set(15, oauthToken);
        set(16, oauthSecret);
        set(17, validated);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.ScProvidersScProviderservicesC;

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
public class ScProvidersScProviderservicesCRecord extends UpdatableRecordImpl<ScProvidersScProviderservicesCRecord> implements Record5<String, Timestamp, Byte, String, Integer> {

    private static final long serialVersionUID = 1566276128;

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.sc_providers_sc_providerservicessc_providers_ida</code>.
     */
    public void setScProvidersScProviderservicesscProvidersIda(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.sc_providers_sc_providerservicessc_providers_ida</code>.
     */
    public String getScProvidersScProviderservicesscProvidersIda() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.sc_providers_sc_providerservicessc_providerservices_idb</code>.
     */
    public void setScProvidersScProviderservicesscProviderservicesIdb(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.sc_providers_sc_providerservices_c.sc_providers_sc_providerservicessc_providerservices_idb</code>.
     */
    public Integer getScProvidersScProviderservicesscProviderservicesIdb() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, Byte, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, Timestamp, Byte, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C.DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C.SC_PROVIDERS_SC_PROVIDERSERVICESSC_PROVIDERS_IDA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C.SC_PROVIDERS_SC_PROVIDERSERVICESSC_PROVIDERSERVICES_IDB;
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
        return getScProvidersScProviderservicesscProvidersIda();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getScProvidersScProviderservicesscProviderservicesIdb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord value2(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord value3(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord value4(String value) {
        setScProvidersScProviderservicesscProvidersIda(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord value5(Integer value) {
        setScProvidersScProviderservicesscProviderservicesIdb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScProvidersScProviderservicesCRecord values(String value1, Timestamp value2, Byte value3, String value4, Integer value5) {
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
     * Create a detached ScProvidersScProviderservicesCRecord
     */
    public ScProvidersScProviderservicesCRecord() {
        super(ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C);
    }

    /**
     * Create a detached, initialised ScProvidersScProviderservicesCRecord
     */
    public ScProvidersScProviderservicesCRecord(String id, Timestamp dateModified, Byte deleted, String scProvidersScProviderservicesscProvidersIda, Integer scProvidersScProviderservicesscProviderservicesIdb) {
        super(ScProvidersScProviderservicesC.SC_PROVIDERS_SC_PROVIDERSERVICES_C);

        set(0, id);
        set(1, dateModified);
        set(2, deleted);
        set(3, scProvidersScProviderservicesscProvidersIda);
        set(4, scProvidersScProviderservicesscProviderservicesIdb);
    }
}

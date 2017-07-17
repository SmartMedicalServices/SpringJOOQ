/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.CallsContactsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class CallsContacts extends TableImpl<CallsContactsRecord> {

    private static final long serialVersionUID = 2066743478;

    /**
     * The reference instance of <code>sugarcrm_4_12.calls_contacts</code>
     */
    public static final CallsContacts CALLS_CONTACTS = new CallsContacts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CallsContactsRecord> getRecordType() {
        return CallsContactsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.id</code>.
     */
    public final TableField<CallsContactsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.call_id</code>.
     */
    public final TableField<CallsContactsRecord, String> CALL_ID = createField("call_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.contact_id</code>.
     */
    public final TableField<CallsContactsRecord, String> CONTACT_ID = createField("contact_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.required</code>.
     */
    public final TableField<CallsContactsRecord, String> REQUIRED = createField("required", org.jooq.impl.SQLDataType.VARCHAR.length(1).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.accept_status</code>.
     */
    public final TableField<CallsContactsRecord, String> ACCEPT_STATUS = createField("accept_status", org.jooq.impl.SQLDataType.VARCHAR.length(25).defaultValue(org.jooq.impl.DSL.inline("none", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.date_modified</code>.
     */
    public final TableField<CallsContactsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.calls_contacts.deleted</code>.
     */
    public final TableField<CallsContactsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.calls_contacts</code> table reference
     */
    public CallsContacts() {
        this("calls_contacts", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.calls_contacts</code> table reference
     */
    public CallsContacts(String alias) {
        this(alias, CALLS_CONTACTS);
    }

    private CallsContacts(String alias, Table<CallsContactsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CallsContacts(String alias, Table<CallsContactsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sugarcrm_4_12.SUGARCRM_4_12;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CallsContactsRecord> getPrimaryKey() {
        return Keys.KEY_CALLS_CONTACTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CallsContactsRecord>> getKeys() {
        return Arrays.<UniqueKey<CallsContactsRecord>>asList(Keys.KEY_CALLS_CONTACTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CallsContacts as(String alias) {
        return new CallsContacts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CallsContacts rename(String name) {
        return new CallsContacts(name, null);
    }
}

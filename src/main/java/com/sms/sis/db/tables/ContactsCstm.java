/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ContactsCstmRecord;

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
public class ContactsCstm extends TableImpl<ContactsCstmRecord> {

    private static final long serialVersionUID = 2118525615;

    /**
     * The reference instance of <code>sugarcrm_4_12.contacts_cstm</code>
     */
    public static final ContactsCstm CONTACTS_CSTM = new ContactsCstm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContactsCstmRecord> getRecordType() {
        return ContactsCstmRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.contacts_cstm.id_c</code>.
     */
    public final TableField<ContactsCstmRecord, String> ID_C = createField("id_c", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.contacts_cstm.sc_areas_id_c</code>.
     */
    public final TableField<ContactsCstmRecord, String> SC_AREAS_ID_C = createField("sc_areas_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.contacts_cstm</code> table reference
     */
    public ContactsCstm() {
        this("contacts_cstm", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.contacts_cstm</code> table reference
     */
    public ContactsCstm(String alias) {
        this(alias, CONTACTS_CSTM);
    }

    private ContactsCstm(String alias, Table<ContactsCstmRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContactsCstm(String alias, Table<ContactsCstmRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ContactsCstmRecord> getPrimaryKey() {
        return Keys.KEY_CONTACTS_CSTM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContactsCstmRecord>> getKeys() {
        return Arrays.<UniqueKey<ContactsCstmRecord>>asList(Keys.KEY_CONTACTS_CSTM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContactsCstm as(String alias) {
        return new ContactsCstm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContactsCstm rename(String name) {
        return new ContactsCstm(name, null);
    }
}

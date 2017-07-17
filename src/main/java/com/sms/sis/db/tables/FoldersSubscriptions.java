/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.FoldersSubscriptionsRecord;

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
public class FoldersSubscriptions extends TableImpl<FoldersSubscriptionsRecord> {

    private static final long serialVersionUID = 1651253897;

    /**
     * The reference instance of <code>sugarcrm_4_12.folders_subscriptions</code>
     */
    public static final FoldersSubscriptions FOLDERS_SUBSCRIPTIONS = new FoldersSubscriptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FoldersSubscriptionsRecord> getRecordType() {
        return FoldersSubscriptionsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.folders_subscriptions.id</code>.
     */
    public final TableField<FoldersSubscriptionsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.folders_subscriptions.folder_id</code>.
     */
    public final TableField<FoldersSubscriptionsRecord, String> FOLDER_ID = createField("folder_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.folders_subscriptions.assigned_user_id</code>.
     */
    public final TableField<FoldersSubscriptionsRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * Create a <code>sugarcrm_4_12.folders_subscriptions</code> table reference
     */
    public FoldersSubscriptions() {
        this("folders_subscriptions", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.folders_subscriptions</code> table reference
     */
    public FoldersSubscriptions(String alias) {
        this(alias, FOLDERS_SUBSCRIPTIONS);
    }

    private FoldersSubscriptions(String alias, Table<FoldersSubscriptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FoldersSubscriptions(String alias, Table<FoldersSubscriptionsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<FoldersSubscriptionsRecord> getPrimaryKey() {
        return Keys.KEY_FOLDERS_SUBSCRIPTIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FoldersSubscriptionsRecord>> getKeys() {
        return Arrays.<UniqueKey<FoldersSubscriptionsRecord>>asList(Keys.KEY_FOLDERS_SUBSCRIPTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FoldersSubscriptions as(String alias) {
        return new FoldersSubscriptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FoldersSubscriptions rename(String name) {
        return new FoldersSubscriptions(name, null);
    }
}

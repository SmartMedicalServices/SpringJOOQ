/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.RelationshipsRecord;

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
public class Relationships extends TableImpl<RelationshipsRecord> {

    private static final long serialVersionUID = -1365808839;

    /**
     * The reference instance of <code>sugarcrm_4_12.relationships</code>
     */
    public static final Relationships RELATIONSHIPS = new Relationships();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RelationshipsRecord> getRecordType() {
        return RelationshipsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.relationships.id</code>.
     */
    public final TableField<RelationshipsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.relationship_name</code>.
     */
    public final TableField<RelationshipsRecord, String> RELATIONSHIP_NAME = createField("relationship_name", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.lhs_module</code>.
     */
    public final TableField<RelationshipsRecord, String> LHS_MODULE = createField("lhs_module", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.lhs_table</code>.
     */
    public final TableField<RelationshipsRecord, String> LHS_TABLE = createField("lhs_table", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.lhs_key</code>.
     */
    public final TableField<RelationshipsRecord, String> LHS_KEY = createField("lhs_key", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.rhs_module</code>.
     */
    public final TableField<RelationshipsRecord, String> RHS_MODULE = createField("rhs_module", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.rhs_table</code>.
     */
    public final TableField<RelationshipsRecord, String> RHS_TABLE = createField("rhs_table", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.rhs_key</code>.
     */
    public final TableField<RelationshipsRecord, String> RHS_KEY = createField("rhs_key", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.join_table</code>.
     */
    public final TableField<RelationshipsRecord, String> JOIN_TABLE = createField("join_table", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.join_key_lhs</code>.
     */
    public final TableField<RelationshipsRecord, String> JOIN_KEY_LHS = createField("join_key_lhs", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.join_key_rhs</code>.
     */
    public final TableField<RelationshipsRecord, String> JOIN_KEY_RHS = createField("join_key_rhs", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.relationship_type</code>.
     */
    public final TableField<RelationshipsRecord, String> RELATIONSHIP_TYPE = createField("relationship_type", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.relationship_role_column</code>.
     */
    public final TableField<RelationshipsRecord, String> RELATIONSHIP_ROLE_COLUMN = createField("relationship_role_column", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.relationship_role_column_value</code>.
     */
    public final TableField<RelationshipsRecord, String> RELATIONSHIP_ROLE_COLUMN_VALUE = createField("relationship_role_column_value", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.reverse</code>.
     */
    public final TableField<RelationshipsRecord, Byte> REVERSE = createField("reverse", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.relationships.deleted</code>.
     */
    public final TableField<RelationshipsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>sugarcrm_4_12.relationships</code> table reference
     */
    public Relationships() {
        this("relationships", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.relationships</code> table reference
     */
    public Relationships(String alias) {
        this(alias, RELATIONSHIPS);
    }

    private Relationships(String alias, Table<RelationshipsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Relationships(String alias, Table<RelationshipsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<RelationshipsRecord> getPrimaryKey() {
        return Keys.KEY_RELATIONSHIPS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RelationshipsRecord>> getKeys() {
        return Arrays.<UniqueKey<RelationshipsRecord>>asList(Keys.KEY_RELATIONSHIPS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationships as(String alias) {
        return new Relationships(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Relationships rename(String name) {
        return new Relationships(name, null);
    }
}

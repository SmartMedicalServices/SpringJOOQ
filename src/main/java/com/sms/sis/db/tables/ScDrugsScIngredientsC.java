/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScDrugsScIngredientsCRecord;

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
public class ScDrugsScIngredientsC extends TableImpl<ScDrugsScIngredientsCRecord> {

    private static final long serialVersionUID = 591547803;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c</code>
     */
    public static final ScDrugsScIngredientsC SC_DRUGS_SC_INGREDIENTS_C = new ScDrugsScIngredientsC();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScDrugsScIngredientsCRecord> getRecordType() {
        return ScDrugsScIngredientsCRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c.id</code>.
     */
    public final TableField<ScDrugsScIngredientsCRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c.date_modified</code>.
     */
    public final TableField<ScDrugsScIngredientsCRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c.deleted</code>.
     */
    public final TableField<ScDrugsScIngredientsCRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c.sc_drugs_sc_ingredientssc_drugs_ida</code>.
     */
    public final TableField<ScDrugsScIngredientsCRecord, String> SC_DRUGS_SC_INGREDIENTSSC_DRUGS_IDA = createField("sc_drugs_sc_ingredientssc_drugs_ida", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c.sc_drugs_sc_ingredientssc_ingredients_idb</code>.
     */
    public final TableField<ScDrugsScIngredientsCRecord, String> SC_DRUGS_SC_INGREDIENTSSC_INGREDIENTS_IDB = createField("sc_drugs_sc_ingredientssc_ingredients_idb", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c</code> table reference
     */
    public ScDrugsScIngredientsC() {
        this("sc_drugs_sc_ingredients_c", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_drugs_sc_ingredients_c</code> table reference
     */
    public ScDrugsScIngredientsC(String alias) {
        this(alias, SC_DRUGS_SC_INGREDIENTS_C);
    }

    private ScDrugsScIngredientsC(String alias, Table<ScDrugsScIngredientsCRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScDrugsScIngredientsC(String alias, Table<ScDrugsScIngredientsCRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScDrugsScIngredientsCRecord> getPrimaryKey() {
        return Keys.KEY_SC_DRUGS_SC_INGREDIENTS_C_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScDrugsScIngredientsCRecord>> getKeys() {
        return Arrays.<UniqueKey<ScDrugsScIngredientsCRecord>>asList(Keys.KEY_SC_DRUGS_SC_INGREDIENTS_C_PRIMARY, Keys.KEY_SC_DRUGS_SC_INGREDIENTS_C_UNIQUE_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScDrugsScIngredientsC as(String alias) {
        return new ScDrugsScIngredientsC(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScDrugsScIngredientsC rename(String name) {
        return new ScDrugsScIngredientsC(name, null);
    }
}

/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ClaimdetailsutilizationtableRecord;

import java.sql.Date;
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
public class Claimdetailsutilizationtable extends TableImpl<ClaimdetailsutilizationtableRecord> {

    private static final long serialVersionUID = -4056588;

    /**
     * The reference instance of <code>sugarcrm_4_12.claimdetailsutilizationtable</code>
     */
    public static final Claimdetailsutilizationtable CLAIMDETAILSUTILIZATIONTABLE = new Claimdetailsutilizationtable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClaimdetailsutilizationtableRecord> getRecordType() {
        return ClaimdetailsutilizationtableRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.detailID</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Integer> DETAILID = createField("detailID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.companyName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> COMPANYNAME = createField("companyName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.class_code</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> CLASS_CODE = createField("class_code", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.className</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> CLASSNAME = createField("className", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.name</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.providerName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> PROVIDERNAME = createField("providerName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.card_number</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.ActionType</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> ACTIONTYPE = createField("ActionType", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceDate</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Date> SERVICEDATE = createField("serviceDate", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.movementName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> MOVEMENTNAME = createField("movementName", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.documentnumber</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> DOCUMENTNUMBER = createField("documentnumber", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.ClaimApprovalType</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Short> CLAIMAPPROVALTYPE = createField("ClaimApprovalType", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> SERVICENAME = createField("serviceName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.serviceEnglishName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> SERVICEENGLISHNAME = createField("serviceEnglishName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.supergroupName</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> SUPERGROUPNAME = createField("supergroupName", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.gross</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Double> GROSS = createField("gross", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.public_price</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Double> PUBLIC_PRICE = createField("public_price", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.paid_amount</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, Double> PAID_AMOUNT = createField("paid_amount", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>sugarcrm_4_12.claimdetailsutilizationtable.accountID</code>.
     */
    public final TableField<ClaimdetailsutilizationtableRecord, String> ACCOUNTID = createField("accountID", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.claimdetailsutilizationtable</code> table reference
     */
    public Claimdetailsutilizationtable() {
        this("claimdetailsutilizationtable", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.claimdetailsutilizationtable</code> table reference
     */
    public Claimdetailsutilizationtable(String alias) {
        this(alias, CLAIMDETAILSUTILIZATIONTABLE);
    }

    private Claimdetailsutilizationtable(String alias, Table<ClaimdetailsutilizationtableRecord> aliased) {
        this(alias, aliased, null);
    }

    private Claimdetailsutilizationtable(String alias, Table<ClaimdetailsutilizationtableRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ClaimdetailsutilizationtableRecord> getPrimaryKey() {
        return Keys.KEY_CLAIMDETAILSUTILIZATIONTABLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClaimdetailsutilizationtableRecord>> getKeys() {
        return Arrays.<UniqueKey<ClaimdetailsutilizationtableRecord>>asList(Keys.KEY_CLAIMDETAILSUTILIZATIONTABLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Claimdetailsutilizationtable as(String alias) {
        return new Claimdetailsutilizationtable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Claimdetailsutilizationtable rename(String name) {
        return new Claimdetailsutilizationtable(name, null);
    }
}

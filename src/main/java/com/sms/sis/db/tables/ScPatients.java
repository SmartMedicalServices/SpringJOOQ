/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables;


import com.sms.sis.db.Keys;
import com.sms.sis.db.Sugarcrm_4_12;
import com.sms.sis.db.tables.records.ScPatientsRecord;

import java.sql.Date;
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
public class ScPatients extends TableImpl<ScPatientsRecord> {

    private static final long serialVersionUID = 2022261500;

    /**
     * The reference instance of <code>sugarcrm_4_12.sc_patients</code>
     */
    public static final ScPatients SC_PATIENTS = new ScPatients();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScPatientsRecord> getRecordType() {
        return ScPatientsRecord.class;
    }

    /**
     * The column <code>sugarcrm_4_12.sc_patients.id</code>.
     */
    public final TableField<ScPatientsRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.name</code>.
     */
    public final TableField<ScPatientsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.date_entered</code>.
     */
    public final TableField<ScPatientsRecord, Timestamp> DATE_ENTERED = createField("date_entered", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.date_modified</code>.
     */
    public final TableField<ScPatientsRecord, Timestamp> DATE_MODIFIED = createField("date_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.modified_user_id</code>.
     */
    public final TableField<ScPatientsRecord, String> MODIFIED_USER_ID = createField("modified_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.created_by</code>.
     */
    public final TableField<ScPatientsRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.description</code>.
     */
    public final TableField<ScPatientsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.deleted</code>.
     */
    public final TableField<ScPatientsRecord, Byte> DELETED = createField("deleted", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.assigned_user_id</code>.
     */
    public final TableField<ScPatientsRecord, String> ASSIGNED_USER_ID = createField("assigned_user_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.prev_card_no</code>.
     */
    public final TableField<ScPatientsRecord, String> PREV_CARD_NO = createField("prev_card_no", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.rehire_reason</code>.
     */
    public final TableField<ScPatientsRecord, String> REHIRE_REASON = createField("rehire_reason", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.hr_no</code>.
     */
    public final TableField<ScPatientsRecord, String> HR_NO = createField("hr_no", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.card_number</code>.
     */
    public final TableField<ScPatientsRecord, String> CARD_NUMBER = createField("card_number", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.nameenglish</code>.
     */
    public final TableField<ScPatientsRecord, String> NAMEENGLISH = createField("nameenglish", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.date_of_birth</code>.
     */
    public final TableField<ScPatientsRecord, Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.idcard_number</code>.
     */
    public final TableField<ScPatientsRecord, String> IDCARD_NUMBER = createField("idcard_number", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.idtype</code>.
     */
    public final TableField<ScPatientsRecord, String> IDTYPE = createField("idtype", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.hiring_date</code>.
     */
    public final TableField<ScPatientsRecord, Date> HIRING_DATE = createField("hiring_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.emp_status</code>.
     */
    public final TableField<ScPatientsRecord, String> EMP_STATUS = createField("emp_status", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.term_date</code>.
     */
    public final TableField<ScPatientsRecord, Date> TERM_DATE = createField("term_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.term_reason</code>.
     */
    public final TableField<ScPatientsRecord, String> TERM_REASON = createField("term_reason", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.glasses</code>.
     */
    public final TableField<ScPatientsRecord, Byte> GLASSES = createField("glasses", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.remarks</code>.
     */
    public final TableField<ScPatientsRecord, String> REMARKS = createField("remarks", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.cont_id</code>.
     */
    public final TableField<ScPatientsRecord, Integer> CONT_ID = createField("cont_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.contact</code>.
     */
    public final TableField<ScPatientsRecord, Byte> CONTACT = createField("contact", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.pre_existing</code>.
     */
    public final TableField<ScPatientsRecord, Byte> PRE_EXISTING = createField("pre_existing", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.level</code>.
     */
    public final TableField<ScPatientsRecord, Integer> LEVEL = createField("level", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.card_type</code>.
     */
    public final TableField<ScPatientsRecord, String> CARD_TYPE = createField("card_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.abuser</code>.
     */
    public final TableField<ScPatientsRecord, Byte> ABUSER = createField("abuser", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.vip</code>.
     */
    public final TableField<ScPatientsRecord, Byte> VIP = createField("vip", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.cp</code>.
     */
    public final TableField<ScPatientsRecord, Byte> CP = createField("cp", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.contact_id_c</code>.
     */
    public final TableField<ScPatientsRecord, String> CONTACT_ID_C = createField("contact_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.cmid</code>.
     */
    public final TableField<ScPatientsRecord, Integer> CMID = createField("cmid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.sc_contracts_classes_id_c</code>.
     */
    public final TableField<ScPatientsRecord, String> SC_CONTRACTS_CLASSES_ID_C = createField("sc_contracts_classes_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.sc_areas_id_c</code>.
     */
    public final TableField<ScPatientsRecord, String> SC_AREAS_ID_C = createField("sc_areas_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.claimmanagementid</code>.
     */
    public final TableField<ScPatientsRecord, String> CLAIMMANAGEMENTID = createField("claimmanagementid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.chroniccheck</code>.
     */
    public final TableField<ScPatientsRecord, Byte> CHRONICCHECK = createField("chroniccheck", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.genderdropdown</code>.
     */
    public final TableField<ScPatientsRecord, String> GENDERDROPDOWN = createField("genderdropdown", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.martialstatusdropdown</code>.
     */
    public final TableField<ScPatientsRecord, String> MARTIALSTATUSDROPDOWN = createField("martialstatusdropdown", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.patienttypedropdown</code>.
     */
    public final TableField<ScPatientsRecord, String> PATIENTTYPEDROPDOWN = createField("patienttypedropdown", org.jooq.impl.SQLDataType.VARCHAR.length(100).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.has_id_photocopy</code>.
     */
    public final TableField<ScPatientsRecord, Byte> HAS_ID_PHOTOCOPY = createField("has_id_photocopy", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.scanned</code>.
     */
    public final TableField<ScPatientsRecord, Byte> SCANNED = createField("scanned", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.has_photo</code>.
     */
    public final TableField<ScPatientsRecord, Byte> HAS_PHOTO = createField("has_photo", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.has_birth_certficate</code>.
     */
    public final TableField<ScPatientsRecord, Byte> HAS_BIRTH_CERTFICATE = createField("has_birth_certficate", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.employee_constraints_structure</code>.
     */
    public final TableField<ScPatientsRecord, String> EMPLOYEE_CONSTRAINTS_STRUCTURE = createField("employee_constraints_structure", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.id_in_company</code>.
     */
    public final TableField<ScPatientsRecord, String> ID_IN_COMPANY = createField("id_in_company", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>sugarcrm_4_12.sc_patients.sc_regions_id_c</code>.
     */
    public final TableField<ScPatientsRecord, String> SC_REGIONS_ID_C = createField("sc_regions_id_c", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * Create a <code>sugarcrm_4_12.sc_patients</code> table reference
     */
    public ScPatients() {
        this("sc_patients", null);
    }

    /**
     * Create an aliased <code>sugarcrm_4_12.sc_patients</code> table reference
     */
    public ScPatients(String alias) {
        this(alias, SC_PATIENTS);
    }

    private ScPatients(String alias, Table<ScPatientsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ScPatients(String alias, Table<ScPatientsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<ScPatientsRecord> getPrimaryKey() {
        return Keys.KEY_SC_PATIENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScPatientsRecord>> getKeys() {
        return Arrays.<UniqueKey<ScPatientsRecord>>asList(Keys.KEY_SC_PATIENTS_PRIMARY, Keys.KEY_SC_PATIENTS_CMID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScPatients as(String alias) {
        return new ScPatients(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ScPatients rename(String name) {
        return new ScPatients(name, null);
    }
}

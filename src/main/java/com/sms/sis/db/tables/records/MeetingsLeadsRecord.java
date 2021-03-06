/*
 * This file is generated by jOOQ.
*/
package com.sms.sis.db.tables.records;


import com.sms.sis.db.tables.MeetingsLeads;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class MeetingsLeadsRecord extends UpdatableRecordImpl<MeetingsLeadsRecord> implements Record7<String, String, String, String, String, Timestamp, Byte> {

    private static final long serialVersionUID = -182929638;

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.meeting_id</code>.
     */
    public void setMeetingId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.meeting_id</code>.
     */
    public String getMeetingId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.lead_id</code>.
     */
    public void setLeadId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.lead_id</code>.
     */
    public String getLeadId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.required</code>.
     */
    public void setRequired(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.required</code>.
     */
    public String getRequired() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.accept_status</code>.
     */
    public void setAcceptStatus(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.accept_status</code>.
     */
    public String getAcceptStatus() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.date_modified</code>.
     */
    public void setDateModified(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.date_modified</code>.
     */
    public Timestamp getDateModified() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>sugarcrm_4_12.meetings_leads.deleted</code>.
     */
    public void setDeleted(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>sugarcrm_4_12.meetings_leads.deleted</code>.
     */
    public Byte getDeleted() {
        return (Byte) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, Timestamp, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MeetingsLeads.MEETINGS_LEADS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MeetingsLeads.MEETINGS_LEADS.MEETING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MeetingsLeads.MEETINGS_LEADS.LEAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MeetingsLeads.MEETINGS_LEADS.REQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MeetingsLeads.MEETINGS_LEADS.ACCEPT_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return MeetingsLeads.MEETINGS_LEADS.DATE_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return MeetingsLeads.MEETINGS_LEADS.DELETED;
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
        return getMeetingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLeadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAcceptStatus();
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
    public Byte value7() {
        return getDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value2(String value) {
        setMeetingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value3(String value) {
        setLeadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value4(String value) {
        setRequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value5(String value) {
        setAcceptStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value6(Timestamp value) {
        setDateModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord value7(Byte value) {
        setDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeetingsLeadsRecord values(String value1, String value2, String value3, String value4, String value5, Timestamp value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MeetingsLeadsRecord
     */
    public MeetingsLeadsRecord() {
        super(MeetingsLeads.MEETINGS_LEADS);
    }

    /**
     * Create a detached, initialised MeetingsLeadsRecord
     */
    public MeetingsLeadsRecord(String id, String meetingId, String leadId, String required, String acceptStatus, Timestamp dateModified, Byte deleted) {
        super(MeetingsLeads.MEETINGS_LEADS);

        set(0, id);
        set(1, meetingId);
        set(2, leadId);
        set(3, required);
        set(4, acceptStatus);
        set(5, dateModified);
        set(6, deleted);
    }
}

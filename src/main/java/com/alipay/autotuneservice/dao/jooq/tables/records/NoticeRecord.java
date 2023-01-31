/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.Notice;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NoticeRecord extends UpdatableRecordImpl<NoticeRecord> implements Record7<Integer, String, LocalDateTime, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.ID</code>.
     */
    public NoticeRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.NOTICE_TYPE</code>.
     */
    public NoticeRecord setNoticeType(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.NOTICE_TYPE</code>.
     */
    public String getNoticeType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.CREATED_TIME</code>.
     */
    public NoticeRecord setCreatedTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.CREATED_TIME</code>.
     */
    public LocalDateTime getCreatedTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.UPDATED_TIME</code>.
     */
    public NoticeRecord setUpdatedTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.UPDATED_TIME</code>.
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.ACCEPT</code>.
     */
    public NoticeRecord setAccept(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.ACCEPT</code>.
     */
    public String getAccept() {
        return (String) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.ACCESS_TOKEN</code>.
     */
    public NoticeRecord setAccessToken(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.ACCESS_TOKEN</code>.
     */
    public String getAccessToken() {
        return (String) get(5);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.NOTICE.NOTICE_STATUS</code>.
     */
    public NoticeRecord setNoticeStatus(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.NOTICE.NOTICE_STATUS</code>.
     */
    public String getNoticeStatus() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, LocalDateTime, LocalDateTime, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, LocalDateTime, LocalDateTime, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Notice.NOTICE.ID;
    }

    @Override
    public Field<String> field2() {
        return Notice.NOTICE.NOTICE_TYPE;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Notice.NOTICE.CREATED_TIME;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Notice.NOTICE.UPDATED_TIME;
    }

    @Override
    public Field<String> field5() {
        return Notice.NOTICE.ACCEPT;
    }

    @Override
    public Field<String> field6() {
        return Notice.NOTICE.ACCESS_TOKEN;
    }

    @Override
    public Field<String> field7() {
        return Notice.NOTICE.NOTICE_STATUS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNoticeType();
    }

    @Override
    public LocalDateTime component3() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime component4() {
        return getUpdatedTime();
    }

    @Override
    public String component5() {
        return getAccept();
    }

    @Override
    public String component6() {
        return getAccessToken();
    }

    @Override
    public String component7() {
        return getNoticeStatus();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNoticeType();
    }

    @Override
    public LocalDateTime value3() {
        return getCreatedTime();
    }

    @Override
    public LocalDateTime value4() {
        return getUpdatedTime();
    }

    @Override
    public String value5() {
        return getAccept();
    }

    @Override
    public String value6() {
        return getAccessToken();
    }

    @Override
    public String value7() {
        return getNoticeStatus();
    }

    @Override
    public NoticeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public NoticeRecord value2(String value) {
        setNoticeType(value);
        return this;
    }

    @Override
    public NoticeRecord value3(LocalDateTime value) {
        setCreatedTime(value);
        return this;
    }

    @Override
    public NoticeRecord value4(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public NoticeRecord value5(String value) {
        setAccept(value);
        return this;
    }

    @Override
    public NoticeRecord value6(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public NoticeRecord value7(String value) {
        setNoticeStatus(value);
        return this;
    }

    @Override
    public NoticeRecord values(Integer value1, String value2, LocalDateTime value3, LocalDateTime value4, String value5, String value6, String value7) {
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
     * Create a detached NoticeRecord
     */
    public NoticeRecord() {
        super(Notice.NOTICE);
    }

    /**
     * Create a detached, initialised NoticeRecord
     */
    public NoticeRecord(Integer id, String noticeType, LocalDateTime createdTime, LocalDateTime updatedTime, String accept, String accessToken, String noticeStatus) {
        super(Notice.NOTICE);

        setId(id);
        setNoticeType(noticeType);
        setCreatedTime(createdTime);
        setUpdatedTime(updatedTime);
        setAccept(accept);
        setAccessToken(accessToken);
        setNoticeStatus(noticeStatus);
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.records;


import com.alipay.autotuneservice.dao.jooq.tables.TuneParamInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TuneParamInfoRecord extends UpdatableRecordImpl<TuneParamInfoRecord> implements Record13<Integer, LocalDateTime, LocalDateTime, Integer, Integer, Integer, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.ID</code>.
     */
    public TuneParamInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.CREATE_TIME</code>. 创建时间
     */
    public TuneParamInfoRecord setCreateTime(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATED_TIME</code>. 更新时间
     */
    public TuneParamInfoRecord setUpdatedTime(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATED_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.APP_ID</code>. app id
     */
    public TuneParamInfoRecord setAppId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.APP_ID</code>. app id
     */
    public Integer getAppId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.PIPELINE_ID</code>. pipeline id
     */
    public TuneParamInfoRecord setPipelineId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.PIPELINE_ID</code>. pipeline id
     */
    public Integer getPipelineId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.JVM_MARKET_ID</code>. jvm market id
     */
    public TuneParamInfoRecord setJvmMarketId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.JVM_MARKET_ID</code>. jvm market id
     */
    public Integer getJvmMarketId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.DECISION_ID</code>. decision Id
     */
    public TuneParamInfoRecord setDecisionId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.DECISION_ID</code>. decision Id
     */
    public String getDecisionId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATE_STATUS</code>. 更新参数的状态
     */
    public TuneParamInfoRecord setUpdateStatus(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATE_STATUS</code>. 更新参数的状态
     */
    public String getUpdateStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.ACCESS_TOKEN</code>. acess token
     */
    public TuneParamInfoRecord setAccessToken(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.ACCESS_TOKEN</code>. acess token
     */
    public String getAccessToken() {
        return (String) get(8);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATE_PARAMS</code>. 更新的JVM参数，以JSON形式存储
     */
    public TuneParamInfoRecord setUpdateParams(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.UPDATE_PARAMS</code>. 更新的JVM参数，以JSON形式存储
     */
    public String getUpdateParams() {
        return (String) get(9);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.OPERATOR</code>. 操作员
     */
    public TuneParamInfoRecord setOperator(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.OPERATOR</code>. 操作员
     */
    public String getOperator() {
        return (String) get(10);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.CHANGED_TUNE_GROUP</code>. 修改的调参分组信息，json形式
     */
    public TuneParamInfoRecord setChangedTuneGroup(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.CHANGED_TUNE_GROUP</code>. 修改的调参分组信息，json形式
     */
    public String getChangedTuneGroup() {
        return (String) get(11);
    }

    /**
     * Setter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.DEFAULT_PARAM</code>. app默认启动参数
     */
    public TuneParamInfoRecord setDefaultParam(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.TUNE_PARAM_INFO.DEFAULT_PARAM</code>. app默认启动参数
     */
    public String getDefaultParam() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, LocalDateTime, LocalDateTime, Integer, Integer, Integer, String, String, String, String, String, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, LocalDateTime, LocalDateTime, Integer, Integer, Integer, String, String, String, String, String, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TuneParamInfo.TUNE_PARAM_INFO.ID;
    }

    @Override
    public Field<LocalDateTime> field2() {
        return TuneParamInfo.TUNE_PARAM_INFO.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return TuneParamInfo.TUNE_PARAM_INFO.UPDATED_TIME;
    }

    @Override
    public Field<Integer> field4() {
        return TuneParamInfo.TUNE_PARAM_INFO.APP_ID;
    }

    @Override
    public Field<Integer> field5() {
        return TuneParamInfo.TUNE_PARAM_INFO.PIPELINE_ID;
    }

    @Override
    public Field<Integer> field6() {
        return TuneParamInfo.TUNE_PARAM_INFO.JVM_MARKET_ID;
    }

    @Override
    public Field<String> field7() {
        return TuneParamInfo.TUNE_PARAM_INFO.DECISION_ID;
    }

    @Override
    public Field<String> field8() {
        return TuneParamInfo.TUNE_PARAM_INFO.UPDATE_STATUS;
    }

    @Override
    public Field<String> field9() {
        return TuneParamInfo.TUNE_PARAM_INFO.ACCESS_TOKEN;
    }

    @Override
    public Field<String> field10() {
        return TuneParamInfo.TUNE_PARAM_INFO.UPDATE_PARAMS;
    }

    @Override
    public Field<String> field11() {
        return TuneParamInfo.TUNE_PARAM_INFO.OPERATOR;
    }

    @Override
    public Field<String> field12() {
        return TuneParamInfo.TUNE_PARAM_INFO.CHANGED_TUNE_GROUP;
    }

    @Override
    public Field<String> field13() {
        return TuneParamInfo.TUNE_PARAM_INFO.DEFAULT_PARAM;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public LocalDateTime component2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component3() {
        return getUpdatedTime();
    }

    @Override
    public Integer component4() {
        return getAppId();
    }

    @Override
    public Integer component5() {
        return getPipelineId();
    }

    @Override
    public Integer component6() {
        return getJvmMarketId();
    }

    @Override
    public String component7() {
        return getDecisionId();
    }

    @Override
    public String component8() {
        return getUpdateStatus();
    }

    @Override
    public String component9() {
        return getAccessToken();
    }

    @Override
    public String component10() {
        return getUpdateParams();
    }

    @Override
    public String component11() {
        return getOperator();
    }

    @Override
    public String component12() {
        return getChangedTuneGroup();
    }

    @Override
    public String component13() {
        return getDefaultParam();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public LocalDateTime value2() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value3() {
        return getUpdatedTime();
    }

    @Override
    public Integer value4() {
        return getAppId();
    }

    @Override
    public Integer value5() {
        return getPipelineId();
    }

    @Override
    public Integer value6() {
        return getJvmMarketId();
    }

    @Override
    public String value7() {
        return getDecisionId();
    }

    @Override
    public String value8() {
        return getUpdateStatus();
    }

    @Override
    public String value9() {
        return getAccessToken();
    }

    @Override
    public String value10() {
        return getUpdateParams();
    }

    @Override
    public String value11() {
        return getOperator();
    }

    @Override
    public String value12() {
        return getChangedTuneGroup();
    }

    @Override
    public String value13() {
        return getDefaultParam();
    }

    @Override
    public TuneParamInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value2(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value3(LocalDateTime value) {
        setUpdatedTime(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value4(Integer value) {
        setAppId(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value5(Integer value) {
        setPipelineId(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value6(Integer value) {
        setJvmMarketId(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value7(String value) {
        setDecisionId(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value8(String value) {
        setUpdateStatus(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value9(String value) {
        setAccessToken(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value10(String value) {
        setUpdateParams(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value11(String value) {
        setOperator(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value12(String value) {
        setChangedTuneGroup(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord value13(String value) {
        setDefaultParam(value);
        return this;
    }

    @Override
    public TuneParamInfoRecord values(Integer value1, LocalDateTime value2, LocalDateTime value3, Integer value4, Integer value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TuneParamInfoRecord
     */
    public TuneParamInfoRecord() {
        super(TuneParamInfo.TUNE_PARAM_INFO);
    }

    /**
     * Create a detached, initialised TuneParamInfoRecord
     */
    public TuneParamInfoRecord(Integer id, LocalDateTime createTime, LocalDateTime updatedTime, Integer appId, Integer pipelineId, Integer jvmMarketId, String decisionId, String updateStatus, String accessToken, String updateParams, String operator, String changedTuneGroup, String defaultParam) {
        super(TuneParamInfo.TUNE_PARAM_INFO);

        setId(id);
        setCreateTime(createTime);
        setUpdatedTime(updatedTime);
        setAppId(appId);
        setPipelineId(pipelineId);
        setJvmMarketId(jvmMarketId);
        setDecisionId(decisionId);
        setUpdateStatus(updateStatus);
        setAccessToken(accessToken);
        setUpdateParams(updateParams);
        setOperator(operator);
        setChangedTuneGroup(changedTuneGroup);
        setDefaultParam(defaultParam);
    }
}

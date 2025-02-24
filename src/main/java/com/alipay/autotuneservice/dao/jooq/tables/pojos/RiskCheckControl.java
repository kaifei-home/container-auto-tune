/*
 * This file is generated by jOOQ.
 */
package com.alipay.autotuneservice.dao.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskCheckControl implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       appId;
    private String        appName;
    private Integer       checkTime;
    private String        taskIds;
    private String        status;
    private String        checkResult;
    private String        traceId;
    private String        riskMsg;
    private LocalDateTime createTime;
    private LocalDateTime riskbegintime;
    private LocalDateTime riskendtime;

    public RiskCheckControl() {}

    public RiskCheckControl(RiskCheckControl value) {
        this.id = value.id;
        this.appId = value.appId;
        this.appName = value.appName;
        this.checkTime = value.checkTime;
        this.taskIds = value.taskIds;
        this.status = value.status;
        this.checkResult = value.checkResult;
        this.traceId = value.traceId;
        this.riskMsg = value.riskMsg;
        this.createTime = value.createTime;
        this.riskbegintime = value.riskbegintime;
        this.riskendtime = value.riskendtime;
    }

    public RiskCheckControl(
        Integer       id,
        Integer       appId,
        String        appName,
        Integer       checkTime,
        String        taskIds,
        String        status,
        String        checkResult,
        String        traceId,
        String        riskMsg,
        LocalDateTime createTime,
        LocalDateTime riskbegintime,
        LocalDateTime riskendtime
    ) {
        this.id = id;
        this.appId = appId;
        this.appName = appName;
        this.checkTime = checkTime;
        this.taskIds = taskIds;
        this.status = status;
        this.checkResult = checkResult;
        this.traceId = traceId;
        this.riskMsg = riskMsg;
        this.createTime = createTime;
        this.riskbegintime = riskbegintime;
        this.riskendtime = riskendtime;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.ID</code>. 主键ID
     */
    public RiskCheckControl setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_ID</code>. 应用id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_ID</code>. 应用id
     */
    public RiskCheckControl setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_NAME</code>. 应用名称
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.APP_NAME</code>. 应用名称
     */
    public RiskCheckControl setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_TIME</code>. 风险检查次数
     */
    public Integer getCheckTime() {
        return this.checkTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_TIME</code>. 风险检查次数
     */
    public RiskCheckControl setCheckTime(Integer checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TASK_IDS</code>. 任务ID列表
     */
    public String getTaskIds() {
        return this.taskIds;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TASK_IDS</code>. 任务ID列表
     */
    public RiskCheckControl setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.STATUS</code>. 任务执行状态(EXECETING,END)
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.STATUS</code>. 任务执行状态(EXECETING,END)
     */
    public RiskCheckControl setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_RESULT</code>. 风险检查结果
     */
    public String getCheckResult() {
        return this.checkResult;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CHECK_RESULT</code>. 风险检查结果
     */
    public RiskCheckControl setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TRACE_ID</code>. 任务唯一标识
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.TRACE_ID</code>. 任务唯一标识
     */
    public RiskCheckControl setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISK_MSG</code>. 风险详情
     */
    public String getRiskMsg() {
        return this.riskMsg;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISK_MSG</code>. 风险详情
     */
    public RiskCheckControl setRiskMsg(String riskMsg) {
        this.riskMsg = riskMsg;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.CREATE_TIME</code>. 创建时间
     */
    public RiskCheckControl setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKBEGINTIME</code>.
     */
    public LocalDateTime getRiskbegintime() {
        return this.riskbegintime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKBEGINTIME</code>.
     */
    public RiskCheckControl setRiskbegintime(LocalDateTime riskbegintime) {
        this.riskbegintime = riskbegintime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKENDTIME</code>.
     */
    public LocalDateTime getRiskendtime() {
        return this.riskendtime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.RISK_CHECK_CONTROL.RISKENDTIME</code>.
     */
    public RiskCheckControl setRiskendtime(LocalDateTime riskendtime) {
        this.riskendtime = riskendtime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiskCheckControl (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(appName);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(taskIds);
        sb.append(", ").append(status);
        sb.append(", ").append(checkResult);
        sb.append(", ").append(traceId);
        sb.append(", ").append(riskMsg);
        sb.append(", ").append(createTime);
        sb.append(", ").append(riskbegintime);
        sb.append(", ").append(riskendtime);

        sb.append(")");
        return sb.toString();
    }
}

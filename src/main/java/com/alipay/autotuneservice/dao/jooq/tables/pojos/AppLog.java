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
public class AppLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long          id;
    private Integer       appId;
    private String        logType;
    private String        s3Key;
    private String        hostName;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private String        fileName;
    private String        context;
    private String        status;

    public AppLog() {}

    public AppLog(AppLog value) {
        this.id = value.id;
        this.appId = value.appId;
        this.logType = value.logType;
        this.s3Key = value.s3Key;
        this.hostName = value.hostName;
        this.createdTime = value.createdTime;
        this.updatedTime = value.updatedTime;
        this.fileName = value.fileName;
        this.context = value.context;
        this.status = value.status;
    }

    public AppLog(
        Long          id,
        Integer       appId,
        String        logType,
        String        s3Key,
        String        hostName,
        LocalDateTime createdTime,
        LocalDateTime updatedTime,
        String        fileName,
        String        context,
        String        status
    ) {
        this.id = id;
        this.appId = appId;
        this.logType = logType;
        this.s3Key = s3Key;
        this.hostName = hostName;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.fileName = fileName;
        this.context = context;
        this.status = status;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.ID</code>. 主键
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.ID</code>. 主键
     */
    public AppLog setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.APP_ID</code>. 应用id
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.APP_ID</code>. 应用id
     */
    public AppLog setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.LOG_TYPE</code>. 日志类型
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.LOG_TYPE</code>. 日志类型
     */
    public AppLog setLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.S3_KEY</code>. s3文件key
     */
    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.S3_KEY</code>. s3文件key
     */
    public AppLog setS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.HOST_NAME</code>. 主机名
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.HOST_NAME</code>. 主机名
     */
    public AppLog setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.CREATED_TIME</code>. 创建时间
     */
    public LocalDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.CREATED_TIME</code>. 创建时间
     */
    public AppLog setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.UPDATED_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.UPDATED_TIME</code>. 更新时间
     */
    public AppLog setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.FILE_NAME</code>. 文件名
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.FILE_NAME</code>. 文件名
     */
    public AppLog setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.CONTEXT</code>. 上下文
     */
    public String getContext() {
        return this.context;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.CONTEXT</code>. 上下文
     */
    public AppLog setContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.APP_LOG.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.APP_LOG.STATUS</code>.
     */
    public AppLog setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppLog (");

        sb.append(id);
        sb.append(", ").append(appId);
        sb.append(", ").append(logType);
        sb.append(", ").append(s3Key);
        sb.append(", ").append(hostName);
        sb.append(", ").append(createdTime);
        sb.append(", ").append(updatedTime);
        sb.append(", ").append(fileName);
        sb.append(", ").append(context);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}

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
public class K8sAccessTokenInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private LocalDateTime createTime;
    private LocalDateTime updatedTime;
    private String        accessToken;
    private String        clusterName;
    private String        region;
    private String        s3Key;
    private String        accessKeyId;
    private String        secretAccessKey;
    private String        cer;
    private String        endpoint;
    private String        clusterId;
    private String        clusterStatus;

    public K8sAccessTokenInfo() {}

    public K8sAccessTokenInfo(K8sAccessTokenInfo value) {
        this.id = value.id;
        this.createTime = value.createTime;
        this.updatedTime = value.updatedTime;
        this.accessToken = value.accessToken;
        this.clusterName = value.clusterName;
        this.region = value.region;
        this.s3Key = value.s3Key;
        this.accessKeyId = value.accessKeyId;
        this.secretAccessKey = value.secretAccessKey;
        this.cer = value.cer;
        this.endpoint = value.endpoint;
        this.clusterId = value.clusterId;
        this.clusterStatus = value.clusterStatus;
    }

    public K8sAccessTokenInfo(
        Integer       id,
        LocalDateTime createTime,
        LocalDateTime updatedTime,
        String        accessToken,
        String        clusterName,
        String        region,
        String        s3Key,
        String        accessKeyId,
        String        secretAccessKey,
        String        cer,
        String        endpoint,
        String        clusterId,
        String        clusterStatus
    ) {
        this.id = id;
        this.createTime = createTime;
        this.updatedTime = updatedTime;
        this.accessToken = accessToken;
        this.clusterName = clusterName;
        this.region = region;
        this.s3Key = s3Key;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.cer = cer;
        this.endpoint = endpoint;
        this.clusterId = clusterId;
        this.clusterStatus = clusterStatus;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ID</code>. 主键ID
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ID</code>. 主键ID
     */
    public K8sAccessTokenInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CREATE_TIME</code>. 创建时间
     */
    public K8sAccessTokenInfo setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.UPDATED_TIME</code>. 修改时间
     */
    public LocalDateTime getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.UPDATED_TIME</code>. 修改时间
     */
    public K8sAccessTokenInfo setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_TOKEN</code>. access;token
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_TOKEN</code>. access;token
     */
    public K8sAccessTokenInfo setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_NAME</code>. 集群名称
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_NAME</code>. 集群名称
     */
    public K8sAccessTokenInfo setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.REGION</code>. aws;region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.REGION</code>. aws;region
     */
    public K8sAccessTokenInfo setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.S3_KEY</code>.
     */
    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.S3_KEY</code>.
     */
    public K8sAccessTokenInfo setS3Key(String s3Key) {
        this.s3Key = s3Key;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_KEY_ID</code>. access;key id
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ACCESS_KEY_ID</code>. access;key id
     */
    public K8sAccessTokenInfo setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.SECRET_ACCESS_KEY</code>. Secret;Access Key
     */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.SECRET_ACCESS_KEY</code>. Secret;Access Key
     */
    public K8sAccessTokenInfo setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CER</code>. 证书
     */
    public String getCer() {
        return this.cer;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CER</code>. 证书
     */
    public K8sAccessTokenInfo setCer(String cer) {
        this.cer = cer;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ENDPOINT</code>. aws;endpoint url
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.ENDPOINT</code>. aws;endpoint url
     */
    public K8sAccessTokenInfo setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_ID</code>. 集群ID
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_ID</code>. 集群ID
     */
    public K8sAccessTokenInfo setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Getter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_STATUS</code>. 集群状态：INSTALLING 安装中; INSTALLED 已安装； INSTALL_FAILED 安装失败
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * Setter for <code>TMAESTRO-LITE.K8S_ACCESS_TOKEN_INFO.CLUSTER_STATUS</code>. 集群状态：INSTALLING 安装中; INSTALLED 已安装； INSTALL_FAILED 安装失败
     */
    public K8sAccessTokenInfo setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("K8sAccessTokenInfo (");

        sb.append(id);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updatedTime);
        sb.append(", ").append(accessToken);
        sb.append(", ").append(clusterName);
        sb.append(", ").append(region);
        sb.append(", ").append(s3Key);
        sb.append(", ").append(accessKeyId);
        sb.append(", ").append(secretAccessKey);
        sb.append(", ").append(cer);
        sb.append(", ").append(endpoint);
        sb.append(", ").append(clusterId);
        sb.append(", ").append(clusterStatus);

        sb.append(")");
        return sb.toString();
    }
}

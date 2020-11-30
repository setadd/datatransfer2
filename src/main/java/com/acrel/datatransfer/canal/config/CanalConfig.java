package com.acrel.datatransfer.canal.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * canal配置类
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
@ConfigurationProperties(prefix = "canal.client")
public class CanalConfig {


    private String host = "127.1.1.1";

    /**
     * canal 服务设置的端口，默认 11111
     */
    private int port = 11111;


    /**
     * 批量从 canal 服务器获取数据的最多数目
     */
    private int batchSize = 1000;

    private String destination;

    /**
     * 是否有过滤规则
     */
    private String filter;

    /**
     * 当错误发生时，重试次数
     */
    private int retryCount = 5;

    /**
     * 信息捕获心跳时间
     */
    private long acquireInterval = 1000;

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public long getAcquireInterval() {
        return acquireInterval;
    }

    public void setAcquireInterval(long acquireInterval) {
        this.acquireInterval = acquireInterval;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}

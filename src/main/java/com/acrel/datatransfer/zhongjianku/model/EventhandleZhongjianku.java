package com.acrel.datatransfer.zhongjianku.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ffy
 * @since 2020-11-30
 */
@TableName("t_eventhandle")
public class EventhandleZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键(UUID生成)
     */
    @TableId("Id")
    private String id;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime createtime;

    /**
     * 事件id (关联t_Event中的Id)
     */
    @TableField("EventId")
    private String eventid;

    /**
     * 处理人，如果需要申报则也是申报人，对应t_User中的Id
     */
    @TableField("Creator")
    private String creator;

    /**
     * 异常原因
     */
    @TableField("Reason")
    private String reason;

    /**
     * 事件处理说明(处理详情描述)
     */
    @TableField("Remark")
    private String remark;

    /**
     * 核查人
     */
    @TableField("Checker")
    private String checker;

    /**
     * 核查时间
     */
    @TableField("CheckTime")
    private LocalDateTime checktime;

    /**
     * 核查结果(0：企业异常，1：用电监管设备异常)
     */
    @TableField("CheckResult")
    private Integer checkresult;

    /**
     * 数据状态 0未转发 1已转发
     */
    @TableField("DataStatus")
    private Boolean datastatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public LocalDateTime getChecktime() {
        return checktime;
    }

    public void setChecktime(LocalDateTime checktime) {
        this.checktime = checktime;
    }

    public Integer getCheckresult() {
        return checkresult;
    }

    public void setCheckresult(Integer checkresult) {
        this.checkresult = checkresult;
    }

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "EventhandleZhongjianku{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", eventid=" + eventid +
        ", creator=" + creator +
        ", reason=" + reason +
        ", remark=" + remark +
        ", checker=" + checker +
        ", checktime=" + checktime +
        ", checkresult=" + checkresult +
        ", datastatus=" + datastatus +
        "}";
    }
}

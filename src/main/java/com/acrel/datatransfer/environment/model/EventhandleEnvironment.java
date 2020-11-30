package com.acrel.datatransfer.environment.model;

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
public class EventhandleEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("EventId")
    private String eventid;

    @TableField("Creator")
    private String creator;

    @TableField("Reason")
    private String reason;

    @TableField("Remark")
    private String remark;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    @TableField("Checker")
    private String checker;

    @TableField("CheckTime")
    private LocalDateTime checktime;

    @TableField("CheckResult")
    private Integer checkresult;

    @TableField("SignAddress")
    private String signaddress;

    @TableField("SignType")
    private Integer signtype;


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

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
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

    public String getSignaddress() {
        return signaddress;
    }

    public void setSignaddress(String signaddress) {
        this.signaddress = signaddress;
    }

    public Integer getSigntype() {
        return signtype;
    }

    public void setSigntype(Integer signtype) {
        this.signtype = signtype;
    }

    @Override
    public String toString() {
        return "EventhandleEnvironment{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", eventid=" + eventid +
        ", creator=" + creator +
        ", reason=" + reason +
        ", remark=" + remark +
        ", isdeleted=" + isdeleted +
        ", checker=" + checker +
        ", checktime=" + checktime +
        ", checkresult=" + checkresult +
        ", signaddress=" + signaddress +
        ", signtype=" + signtype +
        "}";
    }
}

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
@TableName("t_eventcheck")
public class EventcheckEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("HandleId")
    private String handleid;

    @TableField("Creator")
    private String creator;

    @TableField("CheckPerson")
    private String checkperson;

    @TableField("CheckTime")
    private LocalDateTime checktime;

    /**
     * 审核结果，0：未通过，1：通过
     */
    @TableField("CheckResult")
    private Integer checkresult;

    @TableField("Remark")
    private String remark;

    @TableField("IsDeleted")
    private Boolean isdeleted;


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

    public String getHandleid() {
        return handleid;
    }

    public void setHandleid(String handleid) {
        this.handleid = handleid;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson;
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

    @Override
    public String toString() {
        return "EventcheckEnvironment{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", handleid=" + handleid +
        ", creator=" + creator +
        ", checkperson=" + checkperson +
        ", checktime=" + checktime +
        ", checkresult=" + checkresult +
        ", remark=" + remark +
        ", isdeleted=" + isdeleted +
        "}";
    }
}

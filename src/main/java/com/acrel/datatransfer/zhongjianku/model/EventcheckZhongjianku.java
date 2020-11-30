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
@TableName("t_eventcheck")
public class EventcheckZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键(UUID生成)
     */
    @TableId("Id")
    private String id;

    /**
     * 创建时间（异常申报时间)
     */
    @TableField("CreateTime")
    private LocalDateTime createtime;

    /**
     * 处理记录 (关联t_EventHandle中的Id)
     */
    @TableField("HandleId")
    private String handleid;

    /**
     * 申报人，对应t_User中的Id
     */
    @TableField("Creator")
    private String creator;

    /**
     * 审核人，对应t_User中的Id
     */
    @TableField("CheckPerson")
    private String checkperson;

    /**
     * 审核时间
     */
    @TableField("CheckTime")
    private LocalDateTime checktime;

    /**
     * 审核结果，0：未通过，1：通过
     */
    @TableField("CheckResult")
    private Integer checkresult;

    /**
     * 审核意见
     */
    @TableField("Remark")
    private String remark;

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

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "EventcheckZhongjianku{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", handleid=" + handleid +
        ", creator=" + creator +
        ", checkperson=" + checkperson +
        ", checktime=" + checktime +
        ", checkresult=" + checkresult +
        ", remark=" + remark +
        ", datastatus=" + datastatus +
        "}";
    }
}

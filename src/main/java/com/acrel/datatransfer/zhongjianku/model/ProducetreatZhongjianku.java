package com.acrel.datatransfer.zhongjianku.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_producetreat")
public class ProducetreatZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("Id")
    private String id;

    /**
     * 产污监测点Id 关联t_Monitor中产污设备的Id
     */
    @TableField("ProduceId")
    private String produceid;

    /**
     * 治污监测点Id 关联t_Monitor中的治污设备Id
     */
    @TableField("TreatId")
    private String treatid;

    /**
     * 备用关系 0：用，1：备
     */
    @TableField("BackUp")
    private Integer backup;

    /**
     * 备用关系说明
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

    public String getProduceid() {
        return produceid;
    }

    public void setProduceid(String produceid) {
        this.produceid = produceid;
    }

    public String getTreatid() {
        return treatid;
    }

    public void setTreatid(String treatid) {
        this.treatid = treatid;
    }

    public Integer getBackup() {
        return backup;
    }

    public void setBackup(Integer backup) {
        this.backup = backup;
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
        return "ProducetreatZhongjianku{" +
        "id=" + id +
        ", produceid=" + produceid +
        ", treatid=" + treatid +
        ", backup=" + backup +
        ", remark=" + remark +
        ", datastatus=" + datastatus +
        "}";
    }
}

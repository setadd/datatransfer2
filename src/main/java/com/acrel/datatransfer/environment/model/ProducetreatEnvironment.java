package com.acrel.datatransfer.environment.model;

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
public class ProducetreatEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("ProduceId")
    private String produceid;

    @TableField("TreatId")
    private String treatid;

    @TableField("BackUp")
    private Integer backup;

    @TableField("RunMode")
    private Integer runmode;

    @TableField("Remark")
    private String remark;


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

    public Integer getRunmode() {
        return runmode;
    }

    public void setRunmode(Integer runmode) {
        this.runmode = runmode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ProducetreatEnvironment{" +
        "id=" + id +
        ", produceid=" + produceid +
        ", treatid=" + treatid +
        ", backup=" + backup +
        ", runmode=" + runmode +
        ", remark=" + remark +
        "}";
    }
}

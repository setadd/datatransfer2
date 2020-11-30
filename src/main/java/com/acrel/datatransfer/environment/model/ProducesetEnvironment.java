package com.acrel.datatransfer.environment.model;

import java.math.BigDecimal;
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
@TableName("t_produceset")
public class ProducesetEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("SetObject")
    private Integer setobject;

    /**
     * 设置类型，0：限产，1：停产
     */
    @TableField("ProduceType")
    private Integer producetype;

    /**
     * 减产量（%）
     */
    @TableField("LessProduce")
    private BigDecimal lessproduce;

    @TableField("StartTime")
    private LocalDateTime starttime;

    @TableField("EndTime")
    private LocalDateTime endtime;

    @TableField("Cycle")
    private Integer cycle;

    @TableField("Remark")
    private String remark;

    /**
     * 是否启用，0：禁用，1：启用
     */
    @TableField("Active")
    private Integer active;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 预警等级：1黄色预警，2橙色预警，3红色预警
     */
    @TableField("Level")
    private Integer level;


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

    public Integer getSetobject() {
        return setobject;
    }

    public void setSetobject(Integer setobject) {
        this.setobject = setobject;
    }

    public Integer getProducetype() {
        return producetype;
    }

    public void setProducetype(Integer producetype) {
        this.producetype = producetype;
    }

    public BigDecimal getLessproduce() {
        return lessproduce;
    }

    public void setLessproduce(BigDecimal lessproduce) {
        this.lessproduce = lessproduce;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ProducesetEnvironment{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", setobject=" + setobject +
        ", producetype=" + producetype +
        ", lessproduce=" + lessproduce +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", cycle=" + cycle +
        ", remark=" + remark +
        ", active=" + active +
        ", isdeleted=" + isdeleted +
        ", level=" + level +
        "}";
    }
}

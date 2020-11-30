package com.acrel.datatransfer.zhongjianku.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
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
@TableName("t_event")
public class EventZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id (UUID生成)
     */
    @TableField("Id")
    private String id;

    /**
     * 创建时间
     */
    @TableId("CreateTime")
    private LocalDateTime createtime;

    /**
     * 网关编号 (关联t_meter中 SwicthId)
     */
    @TableField("SwicthId")
    private String swicthid;

    /**
     * 仪表地址(关联t_meter中 MeterId)
     */
    @TableField("MeterId")
    private String meterid;

    /**
     * 事件类型(关联t_EventType中的Id)
     */
    @TableField("EventType")
    private Long eventtype;

    /**
     * 事件类型名称(关联t_EventType中的EventType)
     */
    @TableField("EventTypeName")
    private String eventtypename;

    /**
     * 事件等级 1：预警(通知企业用户)，2：报警(通知企业、机构用户)
     */
    @TableField("EventLevel")
    private Integer eventlevel;

    /**
     * 异常类型 关联t_EventType中的 UnusualType
     */
    @TableField("UnusualType")
    private Integer unusualtype;

    /**
     * 是否需要申报(0：否；1：是)
     */
    @TableField("IsSubmit")
    private Integer issubmit;

    /**
     * 事件说明
     */
    @TableField("Remark")
    private String remark;

    /**
     * 事件详细描述
     */
    @TableField("Description")
    private String description;

    /**
     * 企业Id (关联t_Enterprise中的Id)
     */
    @TableField("EnterpriseId")
    private String enterpriseid;

    /**
     * 企业名称
     */
    @TableField("EnterpriseName")
    private String enterprisename;

    /**
     * 行业Id
     */
    @TableField("TradeId")
    private String tradeid;

    /**
     * 行业名称
     */
    @TableField("TradeName")
    private String tradename;

    /**
     * 机构Id
     */
    @TableField("OrganizeId")
    private String organizeid;

    /**
     * 机构名称
     */
    @TableField("OrganizeName")
    private String organizename;

    /**
     * 车间Id(关联t_workshop中的Id)
     */
    @TableField("WorkshopId")
    private String workshopid;

    /**
     * 车间名称
     */
    @TableField("WorkshopName")
    private String workshopname;

    /**
     * 监测点id(关联t_monitor中的Id)
     */
    @TableField("MonitorId")
    private String monitorid;

    @TableField("MonitorName")
    private String monitorname;

    /**
     * 设备类型(t：治污，p：生产)
     */
    @TableField("CodeType")
    private String codetype;

    /**
     * 设备类型名称
     */
    @TableField("EquipmentName")
    private String equipmentname;

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

    public String getSwicthid() {
        return swicthid;
    }

    public void setSwicthid(String swicthid) {
        this.swicthid = swicthid;
    }

    public String getMeterid() {
        return meterid;
    }

    public void setMeterid(String meterid) {
        this.meterid = meterid;
    }

    public Long getEventtype() {
        return eventtype;
    }

    public void setEventtype(Long eventtype) {
        this.eventtype = eventtype;
    }

    public String getEventtypename() {
        return eventtypename;
    }

    public void setEventtypename(String eventtypename) {
        this.eventtypename = eventtypename;
    }

    public Integer getEventlevel() {
        return eventlevel;
    }

    public void setEventlevel(Integer eventlevel) {
        this.eventlevel = eventlevel;
    }

    public Integer getUnusualtype() {
        return unusualtype;
    }

    public void setUnusualtype(Integer unusualtype) {
        this.unusualtype = unusualtype;
    }

    public Integer getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid;
    }

    public String getOrganizename() {
        return organizename;
    }

    public void setOrganizename(String organizename) {
        this.organizename = organizename;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public String getWorkshopname() {
        return workshopname;
    }

    public void setWorkshopname(String workshopname) {
        this.workshopname = workshopname;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    public String getMonitorname() {
        return monitorname;
    }

    public void setMonitorname(String monitorname) {
        this.monitorname = monitorname;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "EventZhongjianku{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", swicthid=" + swicthid +
        ", meterid=" + meterid +
        ", eventtype=" + eventtype +
        ", eventtypename=" + eventtypename +
        ", eventlevel=" + eventlevel +
        ", unusualtype=" + unusualtype +
        ", issubmit=" + issubmit +
        ", remark=" + remark +
        ", description=" + description +
        ", enterpriseid=" + enterpriseid +
        ", enterprisename=" + enterprisename +
        ", tradeid=" + tradeid +
        ", tradename=" + tradename +
        ", organizeid=" + organizeid +
        ", organizename=" + organizename +
        ", workshopid=" + workshopid +
        ", workshopname=" + workshopname +
        ", monitorid=" + monitorid +
        ", monitorname=" + monitorname +
        ", codetype=" + codetype +
        ", equipmentname=" + equipmentname +
        ", datastatus=" + datastatus +
        "}";
    }
}

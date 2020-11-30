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
 * @since 2020-11-22
 */
@TableName("t_enterprise")
public class EnterpriseEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("EnterpriseName")
    private String enterprisename;

    @TableField("TrustCode")
    private String trustcode;

    @TableField("Address")
    private String address;

    @TableField("Longitude")
    private String longitude;

    @TableField("Latitude")
    private String latitude;

    @TableField("Province")
    private String province;

    @TableField("City")
    private String city;

    @TableField("Area")
    private String area;

    @TableField("TradeId")
    private String tradeid;

    @TableField("Remark")
    private String remark;

    @TableField("DoorMonitor")
    private String doormonitor;

    @TableField("ChargePerson")
    private String chargeperson;

    @TableField("Phone")
    private String phone;

    @TableField("CheckPerson")
    private String checkperson;

    @TableField("CheckPhone")
    private String checkphone;

    @TableField("LawPerson")
    private String lawperson;

    @TableField("LawPhone")
    private String lawphone;

    @TableField("PicUrl")
    private String picurl;

    @TableField("OrganizeId")
    private String organizeid;

    @TableField("CreateDate")
    private LocalDateTime createdate;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    @TableField("ProduceLevel")
    private Integer producelevel;

    @TableField("Stove")
    private String stove;

    @TableField("OpenArea")
    private String openarea;

    @TableField("EatSeat")
    private String eatseat;

    @TableField("LimiteValue")
    private Double limitevalue;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getTrustcode() {
        return trustcode;
    }

    public void setTrustcode(String trustcode) {
        this.trustcode = trustcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDoormonitor() {
        return doormonitor;
    }

    public void setDoormonitor(String doormonitor) {
        this.doormonitor = doormonitor;
    }

    public String getChargeperson() {
        return chargeperson;
    }

    public void setChargeperson(String chargeperson) {
        this.chargeperson = chargeperson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson;
    }

    public String getCheckphone() {
        return checkphone;
    }

    public void setCheckphone(String checkphone) {
        this.checkphone = checkphone;
    }

    public String getLawperson() {
        return lawperson;
    }

    public void setLawperson(String lawperson) {
        this.lawperson = lawperson;
    }

    public String getLawphone() {
        return lawphone;
    }

    public void setLawphone(String lawphone) {
        this.lawphone = lawphone;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getProducelevel() {
        return producelevel;
    }

    public void setProducelevel(Integer producelevel) {
        this.producelevel = producelevel;
    }

    public String getStove() {
        return stove;
    }

    public void setStove(String stove) {
        this.stove = stove;
    }

    public String getOpenarea() {
        return openarea;
    }

    public void setOpenarea(String openarea) {
        this.openarea = openarea;
    }

    public String getEatseat() {
        return eatseat;
    }

    public void setEatseat(String eatseat) {
        this.eatseat = eatseat;
    }

    public Double getLimitevalue() {
        return limitevalue;
    }

    public void setLimitevalue(Double limitevalue) {
        this.limitevalue = limitevalue;
    }

    @Override
    public String toString() {
        return "EnterpriseEnvironment{" +
        "id=" + id +
        ", enterprisename=" + enterprisename +
        ", trustcode=" + trustcode +
        ", address=" + address +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", tradeid=" + tradeid +
        ", remark=" + remark +
        ", doormonitor=" + doormonitor +
        ", chargeperson=" + chargeperson +
        ", phone=" + phone +
        ", checkperson=" + checkperson +
        ", checkphone=" + checkphone +
        ", lawperson=" + lawperson +
        ", lawphone=" + lawphone +
        ", picurl=" + picurl +
        ", organizeid=" + organizeid +
        ", createdate=" + createdate +
        ", isdeleted=" + isdeleted +
        ", producelevel=" + producelevel +
        ", stove=" + stove +
        ", openarea=" + openarea +
        ", eatseat=" + eatseat +
        ", limitevalue=" + limitevalue +
        "}";
    }
}

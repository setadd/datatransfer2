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
 * @since 2020-11-22
 */
@TableName("t_enterprise")
public class EnterpriseZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键(UUID生成)
     */
    @TableId("Id")
    private String id;

    /**
     * 企业名称
     */
    @TableField("EnterpriseName")
    private String enterprisename;

    /**
     * 企业社会信用代码
     */
    @TableField("TrustCode")
    private String trustcode;

    /**
     * 企业地址
     */
    @TableField("Address")
    private String address;

    /**
     * 经度
     */
    @TableField("Longitude")
    private Double longitude;

    /**
     * 纬度
     */
    @TableField("Latitude")
    private Double latitude;

    /**
     * 省
     */
    @TableField("Province")
    private String province;

    /**
     * 城市
     */
    @TableField("City")
    private String city;

    /**
     * 区
     */
    @TableField("Area")
    private String area;

    /**
     * 行业
     */
    @TableField("TradeId")
    private String tradeid;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 企业联系人
     */
    @TableField("ChargePerson")
    private String chargeperson;

    /**
     * 企业联系人电话
     */
    @TableField("Phone")
    private String phone;

    /**
     * 运维人员
     */
    @TableField("CheckPerson")
    private String checkperson;

    /**
     * 运维人员电话
     */
    @TableField("CheckPhone")
    private String checkphone;

    /**
     * 执法人员
     */
    @TableField("LawPerson")
    private String lawperson;

    /**
     * 执法人员电话
     */
    @TableField("LawPhone")
    private String lawphone;

    /**
     * 机构Id (关联t_Organize中Id)
     */
    @TableField("OrganizeId")
    private String organizeid;

    /**
     * 创建时间
     */
    @TableField("CreateDate")
    private LocalDateTime createdate;

    /**
     * 删除标志0：是；1：否
     */
    @TableField("IsDeleted")
    private Boolean isdeleted;

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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
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

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "EnterpriseZhongjianku{" +
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
        ", chargeperson=" + chargeperson +
        ", phone=" + phone +
        ", checkperson=" + checkperson +
        ", checkphone=" + checkphone +
        ", lawperson=" + lawperson +
        ", lawphone=" + lawphone +
        ", organizeid=" + organizeid +
        ", createdate=" + createdate +
        ", isdeleted=" + isdeleted +
        ", datastatus=" + datastatus +
        "}";
    }
}

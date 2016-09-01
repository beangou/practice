/**
 * 
 */
package com.beangou.day0430;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 秒杀商品信息
 * @author <a href="mailto:liutb@59store.com">小彬</a>
 * @version 1.1 2016年4月14日
 * @since 1.1
 */
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
public class ShowItemDO implements Serializable {
    private static final long serialVersionUID = -7336334359195058810L;
    private String id; // 时间戳+6位随机数
    private String name; // 商品名称
    private String image; // 商品图片
    private String sponsorName; // 赞助商名称
    private String recomTerm; // 推荐用语
    
    private BigDecimal price; // 当前价格
    private BigDecimal oriPrice; // 原价
    
//    @JsonIgnore
    private int sum; // 商品总数
//    @JsonIgnore
    private int remainder; // 商品剩余数量
    private int showSum; // 显示商品总数
    
    private int showRemainder; // 显示商品剩余数量
    private int type; // 商品类型(1:实物 2:赞助商优惠券)
    private long activityId; // 活动场次id
    private Timestamp startTime; // 活动开始时间
    private String awardUrl; // 领奖页面url 
    
    private String ownerId; // 所有者
    private String productId; // 商品服务的商品id
    private Timestamp endTime; // 活动结束时间
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }
    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    /**
     * @return the recomTerm
     */
    public String getRecomTerm() {
        return recomTerm;
    }
    /**
     * @param recomTerm the recomTerm to set
     */
    public void setRecomTerm(String recomTerm) {
        this.recomTerm = recomTerm;
    }
    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /**
     * @return the oriPrice
     */
    public BigDecimal getOriPrice() {
        return oriPrice;
    }
    /**
     * @param oriPrice the oriPrice to set
     */
    public void setOriPrice(BigDecimal oriPrice) {
        this.oriPrice = oriPrice;
    }
    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }
    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }
    /**
     * @return the remainder
     */
    public int getRemainder() {
        return remainder;
    }
    /**
     * @param remainder the remainder to set
     */
    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }
    /**
     * @return the showSum
     */
    public int getShowSum() {
        return showSum;
    }
    /**
     * @param showSum the showSum to set
     */
    public void setShowSum(int showSum) {
        this.showSum = showSum;
    }
    /**
     * @return the showRemainder
     */
    public int getShowRemainder() {
        return showRemainder;
    }
    /**
     * @param showRemainder the showRemainder to set
     */
    public void setShowRemainder(int showRemainder) {
        this.showRemainder = showRemainder;
    }
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    /**
     * @return the activityId
     */
    public long getActivityId() {
        return activityId;
    }
    /**
     * @param activityId the activityId to set
     */
    public void setActivityId(long activityId) {
        this.activityId = activityId;
    }
    /**
     * @return the awardUrl
     */
    public String getAwardUrl() {
        return awardUrl;
    }
    /**
     * @param awardUrl the awardUrl to set
     */
    public void setAwardUrl(String awardUrl) {
        this.awardUrl = awardUrl;
    }
    /**
     * @return the sponsorName
     */
    public String getSponsorName() {
        return sponsorName;
    }
    /**
     * @param sponsorName the sponsorName to set
     */
    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }
    /**
     * @return the startTime
     */
    public Timestamp getStartTime() {
        return startTime;
    }
    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
    public String getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Timestamp getEndTime() {
        return endTime;
    }
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }
    
    
} 

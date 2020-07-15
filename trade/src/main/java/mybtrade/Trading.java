package mybtrade;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Trading_table")
public class Trading {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long salesNum;
    private String smemberId;
    private String pmemberId;
    private String bookId;
    private String status;
    private Date revDate;
    private Date purDate;
    private Date cancelDate;
    private Integer trPrice;

    @PostUpdate
    public void onPostUpdate(){
        if ("Deposited".equals(this.status)) {
            Deposited deposited = new Deposited();
            BeanUtils.copyProperties(this, deposited);
            deposited.publishAfterCommit();
        }else if ("Taked".equals(this.status)) {
            Taked taked = new Taked();
            BeanUtils.copyProperties(this, taked);
            taked.publishAfterCommit();
        }else if ("Canceled".equals(this.status)) {
            System.out.println("=========================tradecancel commit=======================");
            TradeCanceled tradeCanceled = new TradeCanceled();
            BeanUtils.copyProperties(this, tradeCanceled);
            tradeCanceled.publishAfterCommit();
        }
    }

    @PreUpdate
    public void onPreUpdate(){
        PurchaseCanceled purchaseCanceled = new PurchaseCanceled();
        BeanUtils.copyProperties(this, purchaseCanceled);
        purchaseCanceled.publishAfterCommit();


    }

    @PreRemove
    public void onPreRemove(){
        TradeCanceled tradeCanceled = new TradeCanceled();
        BeanUtils.copyProperties(this, tradeCanceled);
        tradeCanceled.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalesNum() {
        return salesNum;
    }
    public void setSalesNum(Long salesNum) {
        this.salesNum = salesNum;
    }

    public String getSmemberId() {
        return smemberId;
    }
    public void setSmemberId(String smemberId) {
        this.smemberId = smemberId;
    }

    public String getPmemberId() {
        return pmemberId;
    }
    public void setPmemberId(String pmemberId) {
        this.pmemberId = pmemberId;
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRevDate() {
        return revDate;
    }
    public void setRevDate(Date revDate) {
        this.revDate = revDate;
    }

    public Date getPurDate() {
        return purDate;
    }
    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Integer getTrPrice() {
        return trPrice;
    }
    public void setTrPrice(Integer trPrice) {
        this.trPrice = trPrice;
    }

}

package mybtrade.external;

import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;

public class Trading {

    private Long id;
    private Long salesNum;
    private String smemberId;
    private String pmemberId;
    private String bookId;
    private String status;
    private Date revDate;
    private Date purDate;
    private String cancelDate;
    private Integer trPrice;


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

    public String getCancelDate() {
        return cancelDate;
    }
    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Integer getTrPrice() {
        return trPrice;
    }
    public void setTrPrice(Integer trPrice) {
        this.trPrice = trPrice;
    }

}


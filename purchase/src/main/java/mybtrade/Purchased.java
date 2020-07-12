
package mybtrade;

import java.util.Date;

public class Purchased extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String pmemberId;
    private Integer trPrice;
    private Date purDate;
    private String status;
    private String bookId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getSalesNum() {
        return salesNum;
    }

    public void setSalesNum(Long trId) {
        this.salesNum = salesNum;
    }
    public String getPmemberId() {
        return pmemberId;
    }

    public void setPmemberId(String pmemberId) {
        this.pmemberId = pmemberId;
    }
    public Integer getTrPrice() {
        return trPrice;
    }

    public void setTrPrice(Integer trPrice) {
        this.trPrice = trPrice;
    }
    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}

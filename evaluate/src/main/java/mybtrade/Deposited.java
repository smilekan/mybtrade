
package mybtrade;

import java.util.Date;

public class Deposited extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String smemberId;
    private String bookId;
    private String status;
    private Date depositDate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalesNum() { return salesNum; }
    public void setSalesNum(Long salesNum) { this.salesNum = salesNum; }

    public String getSmemberId() {
        return smemberId;
    }
    public void setSmemberId(String smemberId) {
        this.smemberId = smemberId;
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

    public Date getDepositDate() {
        return depositDate;
    }
    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }
}

package mybtrade;

import java.util.Date;

public class SaleCanceled extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String smemberId;
    private String bookId;
    private Date cancelDate;
    private String status;

    public SaleCanceled(){
        super();
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
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

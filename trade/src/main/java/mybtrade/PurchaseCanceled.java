package mybtrade;

import java.util.Date;

public class PurchaseCanceled extends AbstractEvent {

    private Long id;
    private Long trId;
    private String pmemberId;
    private String bookId;
    private String status;
    private Date cancelDate;

    public PurchaseCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getTrId() {
        return trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
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
    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
}

package mybtrade;

public class PurchaseCanceled extends AbstractEvent {

    private Long id;
    private String pmemberId;
    private String bookId;
    private Date cancelDate;
    private String status;
    private Long trId;

    public PurchaseCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    public Long getTrId() {
        return trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
    }
}

package mybtrade;

import java.util.Date;

public class Taked extends AbstractEvent {

    private Long id;
    private String pmemberId;
    private String bookId;
    private String status;
    private Date takeDate;
    private String trId;

    public Taked(){
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
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Date getTakeDate() {
        return takeDate;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }
    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }
}

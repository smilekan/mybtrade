package mybtrade;

public class TradeCanceled extends AbstractEvent {

    private Long id;
    private String smemberId;
    private String bookId;

    public TradeCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

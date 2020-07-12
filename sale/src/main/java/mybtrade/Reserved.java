
package mybtrade;

import java.util.Date;

public class Reserved extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String smemberId;
    private String bookId;
    private String bookNm;
    private String bookPrice;
    private String author;
    private Date reqDate;
    private String status ;

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

    public String getBookNm() {
        return bookNm;
    }
    public void setBookNm(String bookNm) {
        this.bookNm = bookNm;
    }

    public String getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReqDate() {
        return reqDate;
    }
    public void setReqDate(Date reqDate) {this.reqDate = reqDate; }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

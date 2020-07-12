package mybtrade;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Sale_table")
public class Sale {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long salesNum;
    private String smemberId;
    private String bookId;
    private String bookNm;
    private Integer bookPrice;
    private String author;
    private Date reqDate;
    private Date cancelDate;

    @PostPersist
    public void onPostPersist(){
        Reserved reserved = new Reserved();
        BeanUtils.copyProperties(this, reserved);
        reserved.publishAfterCommit();
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

    public String getBookNm() {
        return bookNm;
    }
    public void setBookNm(String bookNm) {
        this.bookNm = bookNm;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(Integer bookPrice) {
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
    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }


}

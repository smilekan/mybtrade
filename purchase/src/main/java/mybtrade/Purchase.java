package mybtrade;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Purchase_table")
public class Purchase {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long salesNum;
    private String pmemberId;
    private String status;
    private Integer trPrice;
    private Date purDate;
    private Date cancelDate;
    private String bookId;

    @PostPersist
    public void onPostPersist(){
        Purchased purchased = new Purchased();
        BeanUtils.copyProperties(this, purchased);
        purchased.publishAfterCommit();

    }

    @PostUpdate
    public void onPostUpdate(){

        PurchaseCanceled purchaseCanceled = new PurchaseCanceled();
        BeanUtils.copyProperties(this, purchaseCanceled);
        purchaseCanceled.publishAfterCommit();

     }

    @PreRemove
    public void onPreRemove(){
        PurchaseCanceled purchaseCanceled = new PurchaseCanceled();
        BeanUtils.copyProperties(this, purchaseCanceled);
        purchaseCanceled.publishAfterCommit();


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

    public void setTrId(Long salesNum) {
        this.salesNum = salesNum;
    }
    public String getPmemberId() {
        return pmemberId;
    }

    public void setPmemberId(String pmemberId) {
        this.pmemberId = pmemberId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }




}

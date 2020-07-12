package mybtrade;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="Evaluation_table")
public class Evaluation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long salesNum;
    private String bookId;
    private String quality;
    private Integer uavPrice;
    private Integer evPrice;
    private Date evDate ;
    private String status;

    @PreUpdate
    public void onPreUpdate(){
        if ("Evaluated".equals(this.status)){
            this.evDate = new Date();
        }
    }

    @PostUpdate
    public void onPostUpdate(){
        if ("Scanned".equals(this.status)) {
            Scanned scanned = new Scanned();
            BeanUtils.copyProperties(this, scanned);
            scanned.publishAfterCommit();
        }else if ("Evaluated".equals(this.status)) {
            Evaluated evaluated = new Evaluated();
            BeanUtils.copyProperties(this, evaluated);
            evaluated.publishAfterCommit();
        }
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalesNum() { return salesNum; }
    public void setSalesNum(Long salesNum) { this.salesNum = salesNum; }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getQuality() {
        return quality;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Integer getUavPrice() {
        return uavPrice;
    }
    public void setUavPrice(Integer uavPrice) {
        this.uavPrice = uavPrice;
    }

    public Integer getEvPrice() {
        return evPrice;
    }
    public void setEvPrice(Integer evPrice) {
        this.evPrice = evPrice;
    }

    public Date getEvDate() {
        return evDate;
    }
    public void setEvDate(Date evDate) {
        this.evDate = evDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}

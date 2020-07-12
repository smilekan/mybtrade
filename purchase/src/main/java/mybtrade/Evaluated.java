
package mybtrade;

import java.util.Date;

public class Evaluated extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String bookId;
    private String quality;
    private Integer uavParice;
    private Integer evPrice;
    private Date evDate;

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

    public Integer getUavParice() {
        return uavParice;
    }
    public void setUavParice(Integer uavParice) {
        this.uavParice = uavParice;
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

}

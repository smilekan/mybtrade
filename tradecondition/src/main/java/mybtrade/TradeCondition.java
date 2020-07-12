package mybtrade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="TradeCondition_table")
public class TradeCondition {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long trId;
        private String smemberId;
        private String pmemberId;
        private String bookId;
        private String status;
        private Date revDate;
        private Date depositDate;
        private Date purDate;
        private Date takeDate;
        private Date cancelDate;


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
        public String getSmemberId() {
            return smemberId;
        }

        public void setSmemberId(String smemberId) {
            this.smemberId = smemberId;
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
        public Date getRevDate() {
            return revDate;
        }

        public void setRevDate(Date revDate) {
            this.revDate = revDate;
        }
        public Date getDepositDate() {
            return depositDate;
        }

        public void setDepositDate(Date depositDate) {
            this.depositDate = depositDate;
        }
        public Date getPurDate() {
            return purDate;
        }

        public void setPurDate(Date purDate) {
            this.purDate = purDate;
        }
        public Date getTakeDate() {
            return takeDate;
        }

        public void setTakeDate(Date takeDate) {
            this.takeDate = takeDate;
        }
        public Date getCancelDate() {
            return cancelDate;
        }

        public void setCancelDate(Date cancelDate) {
            this.cancelDate = cancelDate;
        }

}

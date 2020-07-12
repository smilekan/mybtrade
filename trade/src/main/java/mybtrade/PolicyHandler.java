package mybtrade;

import mybtrade.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PolicyHandler{

    @Autowired
    TradingRepository tradingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_Depositready(@Payload Reserved reserved){

        if(reserved.isMe()){
            System.out.println("##### listener Depositready : " + reserved.toJson());
            Trading trading = new Trading();
            trading.setSalesNum(reserved.getSalesNum());
            trading.setSmemberId(reserved.getSmemberId());
            trading.setBookId(reserved.getBookId());
            trading.setRevDate(reserved.getReqDate());
            trading.setStatus(reserved.getStatus());

            tradingRepository.save(trading);
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPurchased_Takeready(@Payload Purchased purchased){

        if(purchased.isMe()){
            System.out.println("##### listener Takeready : " + purchased.toJson());
            Trading trading = tradingRepository.findBySalesNum(purchased.getSalesNum());
    //        List<Trading> tradingList = tradingRepository.findBySalesNum(purchased.getSalesNum());
            //for(Trading trading : tradingList) {
                //trading.setSalesNum(purchased.getSalesNum());
                trading.setPmemberId(purchased.getPmemberId());
                //trading.setBookId(purchased.getBookId());
                trading.setPurDate(purchased.getPurDate());
                trading.setTrPrice(purchased.getTrPrice());
                trading.setStatus(purchased.getStatus());

                tradingRepository.save(trading);
            //}

/*            Trading trading = new Trading();
            trading.setSalesNum(purchased.getSalesNum());
            trading.setPmemberId(purchased.getPmemberId());
            trading.setBookId(purchased.getBookId());
            trading.setPurDate(purchased.getPurDate());
            trading.setTrPrice(purchased.getTrPrice());
            trading.setStatus("Purchased");

            tradingRepository.save(trading);*/

        }
    }

}
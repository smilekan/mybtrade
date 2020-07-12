package mybtrade;

import mybtrade.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

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
            trading.setStatus("Reserved");

            tradingRepository.save(trading);
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPurchased_Takeready(@Payload Purchased purchased){

        if(purchased.isMe()){
            System.out.println("##### listener Takeready : " + purchased.toJson());
            Trading trading = new Trading();
            trading.setSalesNum(purchased.getSalesNum());
            trading.setPmemberId(purchased.getPmemberId());
            trading.setBookId(purchased.getBookId());
            trading.setPurDate(purchased.getPurDate());
            trading.setTrPrice(purchased.getTrPrice());
            trading.setStatus("Purchased");

            tradingRepository.save(trading);
        }
    }

}

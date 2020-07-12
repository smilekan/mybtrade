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
    PurchaseRepository purchaseRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverEvaluated_Shoppable(@Payload Evaluated evaluated){

        if(evaluated.isMe()){
            System.out.println("##### listener Shoppable : " + evaluated.toJson());

            Purchase purchase = new Purchase();
            purchase.setSalesNum(evaluated.getSalesNum());
            purchase.setBookId(evaluated.getBookId());
            purchase.setTrPrice(evaluated.getEvPrice());

            purchaseRepository.save(purchase);
        }
    }

}

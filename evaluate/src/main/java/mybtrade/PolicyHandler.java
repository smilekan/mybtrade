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
    EvaluationRepository evaluationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeposited_Evaluate(@Payload Deposited deposited){

        if(deposited.isMe()){
            System.out.println("##### listener Evaluate : " + deposited.toJson());

            Evaluation evaluation = new Evaluation();
            evaluation.setSalesNum(deposited.getSalesNum());
            evaluation.setBookId(deposited.getBookId());

            evaluationRepository.save(evaluation);
        }
    }

}

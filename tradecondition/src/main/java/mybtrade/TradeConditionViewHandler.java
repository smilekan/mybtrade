package mybtrade;

import mybtrade.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class TradeConditionViewHandler {


    @Autowired
    private TradeConditionRepository tradeConditionRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_ (@Payload Reserved reserved) {
        try {
            if (reserved.isMe()) {
                // view 객체 생성
                TradeCondition tradeCondition = new TradeCondition();
                // view 객체에 이벤트의 Value 를 set 함
                tradeCondition.setTrId(reserved.getId());
                tradeCondition.setSmemberId(reserved.getSmemberId());
                tradeCondition.setBookId(reserved.getBookId());
                tradeCondition.setStatus(reserved.getStatus());
                tradeCondition.setRevDate(reserved.getReqDate());
                tradeCondition.set(reserved.get());
                // view 레파지 토리에 save
                tradeConditionRepository.save(tradeCondition);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_CREATE_ (@Payload  ) {
        try {
            if (.isMe()) {
                // view 객체 생성
                TradeCondition tradeCondition = new TradeCondition();
                // view 객체에 이벤트의 Value 를 set 함
                tradeCondition.set(.get());
                // view 레파지 토리에 save
                tradeConditionRepository.save(tradeCondition);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeposited_then_UPDATE_(@Payload Deposited deposited) {
        try {
            if (deposited.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findByTrId(deposited.getTrId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(deposited.getStatus());
                    tradeCondition.setDepositDate(deposited.getDepositDate());
                    tradeCondition.setTrId(deposited.getTrId());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBy(deposited.get());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(deposited.getStatus());
                    tradeCondition.setDepositDate(deposited.getDepositDate());
                    tradeCondition.set(deposited.get());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){ms
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPurchased_then_UPDATE_(@Payload Purchased purchased) {
        try {
            if (purchased.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findByTrId(purchased.getTrId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setPmemberId(purchased.getPmemberId());
                    tradeCondition.setStatus(purchased.getStatus());
                    tradeCondition.setPurDate(purchased.getPurDate());
                    tradeCondition.setTrId(purchased.getTrId());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBy(purchased.get());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setPmemberId(purchased.getPmemberId());
                    tradeCondition.setStatus(purchased.getStatus());
                    tradeCondition.setPurDate(purchased.getPurDate());
                    tradeCondition.set(purchased.get());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenTaked_then_UPDATE_(@Payload Taked taked) {
        try {
            if (taked.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findByTrId(taked.getTrId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(taked.getStatus());
                    tradeCondition.setTakeDate(taked.getTakeDate());
                    tradeCondition.setTrId(taked.getTrId());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPurchaseCanceled_then_UPDATE_(@Payload PurchaseCanceled purchaseCanceled) {
        try {
            if (purchaseCanceled.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findByTrId(purchaseCanceled.getTrId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(purchaseCanceled.getStatus());
                    tradeCondition.setCancelDate(purchaseCanceled.getCancelDate());
                    tradeCondition.setTrId(purchaseCanceled.getTrId());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBy(purchaseCanceled.get());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(purchaseCanceled.getStatus());
                    tradeCondition.setCancelDate(purchaseCanceled.getCancelDate());
                    tradeCondition.set(purchaseCanceled.get());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenSaleCanceled_then_UPDATE_(@Payload SaleCanceled saleCanceled) {
        try {
            if (saleCanceled.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBySmemberId(saleCanceled.getSmemberId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(saleCanceled.getStatus());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findByBookId(saleCanceled.getBookId());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(saleCanceled.getStatus());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBy(saleCanceled.get());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.setStatus(saleCanceled.getStatus());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_UPDATE_(@Payload  ) {
        try {
            if (.isMe()) {
                // view 객체 조회
                List<TradeCondition> tradeConditionList = tradeConditionRepository.findBy(.get());
                for(TradeCondition tradeCondition : tradeConditionList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    tradeCondition.set(.get());
                    // view 레파지 토리에 save
                    tradeConditionRepository.save(tradeCondition);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void when_then_DELETE_(@Payload  ) {
        try {
            if (.isMe()) {
                // view 레파지 토리에 삭제 쿼리
                tradeConditionRepository.deleteBy(.get());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
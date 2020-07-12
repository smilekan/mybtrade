package mybtrade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TradeConditionRepository extends CrudRepository<TradeCondition, Long> {

    List<TradeCondition> findByTrId(Long trId);
    List<TradeCondition> findBy( );
    List<TradeCondition> findByTrId(Long trId);
    List<TradeCondition> findBy( );
    List<TradeCondition> findByTrId(Long trId);
    List<TradeCondition> findByTrId(Long trId);
    List<TradeCondition> findBy( );
    List<TradeCondition> findBySmemberId(String smemberId);
    List<TradeCondition> findByBookId(String bookId);
    List<TradeCondition> findBy( );
    List<TradeCondition> findBy( );

        void deleteBy( );
}
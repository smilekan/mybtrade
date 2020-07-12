package mybtrade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TradeConditionRepository extends CrudRepository<TradeCondition, Long> {

    List<TradeCondition> findBySalesNum(Long salesNum);

}
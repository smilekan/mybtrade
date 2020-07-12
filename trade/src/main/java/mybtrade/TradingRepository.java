package mybtrade;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TradingRepository extends PagingAndSortingRepository<Trading, Long>{

    Trading findBySalesNum(Long salesNum);


}
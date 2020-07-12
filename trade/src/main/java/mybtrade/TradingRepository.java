package mybtrade;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TradingRepository extends PagingAndSortingRepository<Trading, Long>{

    Trading findByBookId(Long salesNum);

    Trading findBySalesNum(Long salesNum);
}
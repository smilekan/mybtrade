
package mybtrade.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="trade", url="http://trade:8080")
public interface TradingService {

    @RequestMapping(method= RequestMethod.PATCH, path="/tradings")
    public void purchasecancel(@RequestBody Trading trading);

}
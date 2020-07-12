
package mybtrade.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@FeignClient(name="trading", url="${api.url.mybtrade}")
public interface TradingService {

    @RequestMapping(method= RequestMethod.POST, path="/tradings/getStatus")
    public @ResponseBody Trading tradecancel(@RequestParam String salesNum);

//    public void tradecancel(@RequestBody Trading trading);

}
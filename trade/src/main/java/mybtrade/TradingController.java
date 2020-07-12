package mybtrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 @RequestMapping("/tradings")
 public class TradingController {

   @Autowired
   private TradingRepository tradingRepository;

   @RequestMapping(value = "/getStatus",
                   method = RequestMethod.GET,
                   produces = "application/json;charset=UTF-8"
   )

   public @ResponseBody Trading tradecancel(@RequestParam(name = "salesNum") Long salesNum)
            throws Exception {
       System.out.println("======== /tradings/tradecancel called ========");
       return tradingRepository.findBySalesNum(salesNum);
   }

   /*public @ResponseBody Trading tradecancel(@RequestParam(name = "salesNum") Long salesNum)
          throws Exception {

        System.out.println("======== /tradings/tradecancel called ========");
        return tradingRepository.findBySalesNum(salesNum);

   }*/





 }

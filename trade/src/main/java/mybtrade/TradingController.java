package mybtrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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

     @RequestMapping(value = "/purchaseCancel",
             method = RequestMethod.POST,
             produces = "application/json;charset=UTF-8"
     )

     public @ResponseBody Trading purchaseCancel(@RequestParam(name = "salesNum") Long salesNum)
             throws Exception {
         System.out.println("======== /tradings/purchasecancel called ========");

         Trading tradingUpdate = tradingRepository.findBySalesNum(salesNum);
         tradingUpdate.setStatus("Deposited");
         tradingUpdate.setCancelDate(new Date());
         tradingRepository.save(tradingUpdate);

         return tradingRepository.findBySalesNum(salesNum);
     }

   /*public @ResponseBody Trading tradecancel(@RequestParam(name = "salesNum") Long salesNum)
          throws Exception {

        System.out.println("======== /tradings/tradecancel called ========");
        return tradingRepository.findBySalesNum(salesNum);

   }*/





 }

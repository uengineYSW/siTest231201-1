package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/상품관리")
@Transactional
public class 상품관리Controller {

    @Autowired
    상품관리Repository 상품관리Repository;

    @RequestMapping(
        value = "상품관리/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public 상품관리 상품수정(
        @PathVariable(value = "id") String id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /상품관리/상품수정  called #####");
        Optional<상품관리> optional상품관리 = 상품관리Repository.findById(id);

        optional상품관리.orElseThrow(() -> new Exception("No Entity Found"));
        상품관리 상품관리 = optional상품관리.get();
        상품관리.상품수정();

        상품관리Repository.save(상품관리);
        return 상품관리;
    }
}
//>>> Clean Arch / Inbound Adaptor

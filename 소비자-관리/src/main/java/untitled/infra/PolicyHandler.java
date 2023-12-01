package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    의류상품Repository 의류상품Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='의류상품검색됨'"
    )
    public void whenever의류상품검색됨_의류상품조회시상품검색됨이벤트발생(
        @Payload 의류상품검색됨 의류상품검색됨
    ) {
        의류상품검색됨 event = 의류상품검색됨;
        System.out.println(
            "\n\n##### listener 의류상품조회시상품검색됨이벤트발생 : " +
            의류상품검색됨 +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='상품상세정보확인됨'"
    )
    public void whenever상품상세정보확인됨_상품상세정보확인시상품상세정보확인됨이벤트발생(
        @Payload 상품상세정보확인됨 상품상세정보확인됨
    ) {
        상품상세정보확인됨 event = 상품상세정보확인됨;
        System.out.println(
            "\n\n##### listener 상품상세정보확인시상품상세정보확인됨이벤트발생 : " +
            상품상세정보확인됨 +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='상품구매됨'"
    )
    public void whenever상품구매됨_상품구매시상품구매됨이벤트발생(
        @Payload 상품구매됨 상품구매됨
    ) {
        상품구매됨 event = 상품구매됨;
        System.out.println(
            "\n\n##### listener 상품구매시상품구매됨이벤트발생 : " +
            상품구매됨 +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문상태조회됨'"
    )
    public void whenever주문상태조회됨_주문상태조회시주문상태조회됨이벤트발생(
        @Payload 주문상태조회됨 주문상태조회됨
    ) {
        주문상태조회됨 event = 주문상태조회됨;
        System.out.println(
            "\n\n##### listener 주문상태조회시주문상태조회됨이벤트발생 : " +
            주문상태조회됨 +
            "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor

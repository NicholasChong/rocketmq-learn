package cn.dongzeviva.rocketmq.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RocketMQMessageListener(
        consumerGroup = "group_a", topic = "test", selectorExpression = "tag_a")
public class TestConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("TestConsumer onMessage : {}", s);
    }

}

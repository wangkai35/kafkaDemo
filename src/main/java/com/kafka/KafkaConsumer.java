package com.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * 消费者
 */
@Component
public class KafkaConsumer {

    //监听消费
    @KafkaListener(topics = {"kd"})
    public void onMessage(ConsumerRecord<?, ?> consumerRecord) {
        // 消费的哪个topic、partition的消息,打印出消息内容
        System.out.println("消费Demo:" + consumerRecord.topic() + "=====" + consumerRecord.partition() + "====" + consumerRecord.value());
    }

}

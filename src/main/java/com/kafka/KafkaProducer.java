package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 生产者
 *
 * @author wangkai
 * @date 2021/04/01 21:09
 * @description 简单生产者, 发送消息到指定topic下, 消息再根据分配规则Append到某个partition中的末尾
 */
@RestController
public class KafkaProducer {
    //注入kafkaTemplate模板
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    //发送消息
    @GetMapping("/kafka/send")
    public void sendMessage(@RequestParam String message) {
        kafkaTemplate.send("kd", message);
    }
}

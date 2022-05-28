package cn.dongzeviva.rocketmq.controller;

import cn.dongzeviva.rocketmq.producer.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestProducer testProducer;


    @GetMapping("/send")
    public void sendMessage() {
        testProducer.sendMessage("test", "message-body");
    }

}

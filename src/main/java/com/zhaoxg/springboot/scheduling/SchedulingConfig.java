package com.zhaoxg.springboot.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/1.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    private static final SimpleDateFormat   dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static final Logger logger = LoggerFactory.getLogger(SchedulingConfig.class);

//    @Scheduled(cron = "0/20 * * * * ?")
    @Scheduled(fixedRate = 5000)
    public void schedluar(){

        logger.info("The time is now {}", dateFormat.format(new Date()));
        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
    }
}

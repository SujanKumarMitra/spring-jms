package com.github.sujankumarmitra.springjms.messaging;

import com.github.sujankumarmitra.springjms.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class JmsEmailReceiver implements EmailReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(JmsEmailReceiver.class);

    @Override
    @JmsListener(destination = JmsEmailQueue.QUEUE_NAME)
    public void onReceive(Email email) {
        LOGGER.info("Received Email:: {}", email);
    }
}

package com.github.sujankumarmitra.springjms.messaging;

import com.github.sujankumarmitra.springjms.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsEmailSender implements EmailSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(JmsEmailSender.class);
    private JmsTemplate jmsTemplate;

    @Autowired
    public JmsEmailSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendEmail(Email email) {
        LOGGER.info("Sending email:: {}", email);
        jmsTemplate.convertAndSend(JmsEmailQueue.QUEUE_NAME, email);
    }

}

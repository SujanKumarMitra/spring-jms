package com.github.sujankumarmitra.springjms.messaging;

import com.github.sujankumarmitra.springjms.model.Email;

public interface EmailReceiver {

    void onReceive(Email email);
}

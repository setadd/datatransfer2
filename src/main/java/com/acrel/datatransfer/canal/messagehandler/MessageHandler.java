package com.acrel.datatransfer.canal.messagehandler;

public interface MessageHandler<T> {



    void handleMessage(T t);
}

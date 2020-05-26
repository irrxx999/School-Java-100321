package org.example.interaction;

import java.util.Optional;

public class Responce {
    private String payload;
    private int code;
    private String desc;


    public Responce(String payload) {
        this.payload = payload;
        this.code = 0;
        this.desc = "Ok";
    }

    public Responce(int code, String desc) {
        this.code = code;
        this.desc = desc;

        this.payload = null;
    }

    public Optional<String> getBalance() {
        return Optional.ofNullable(payload);
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

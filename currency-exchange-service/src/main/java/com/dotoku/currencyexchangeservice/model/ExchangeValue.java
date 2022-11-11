package com.dotoku.currencyexchangeservice.model;

import java.math.BigDecimal;

public class ExchangeValue {
    private Long id;


    @Override
    public String toString() {
        return "ExchangeValue{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", convMult=" + convMult +
                '}';
    }

    private String from;

    private String to;

    private BigDecimal convMult;
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public ExchangeValue() {
    }

    public ExchangeValue(String from, String to, Long id, BigDecimal convMult) {
        this.from = from;
        this.to = to;
        this.id = id;
        this.convMult = convMult;
    }


    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getConvMult() {
        return convMult;
    }



}

package com.dotoku.currencyexchangeservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {
    @Id
    private Long id;
    @Column(name="curr_from")
    private String from;
    @Column(name="curr_to")
    private String to;

    private BigDecimal convMult;
    private int port;

    @Override
    public String toString() {
        return "ExchangeValue{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", convMult=" + convMult +
                '}';
    }



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

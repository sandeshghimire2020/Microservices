package com.dotoku.currencycalculationservice.model;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

public class CalculatedAmount {

    private Long id;
    private String from;
    private String to;
    private BigDecimal convMult;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;

    public CalculatedAmount() {
    }

    public CalculatedAmount(Long id, String from, String to, BigDecimal multiplicationFactor, BigDecimal quantity, BigDecimal totalCalculatedAmount, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convMult = multiplicationFactor;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
    }

    @Override
    public String toString() {
        return "CalculatedAmount{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", multiplicationFactor=" + convMult +
                ", quantity=" + quantity +
                ", totalCalculatedAmount=" + totalCalculatedAmount +
                ", port=" + port +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConvMult() {
        return convMult;
    }

    public void setConvMult(BigDecimal multiplicationFactor) {
        this.convMult = multiplicationFactor;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

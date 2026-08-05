package com.pagorapido.soa.application;

import com.pagorapido.soa.domain.Payment;
import com.pagorapido.soa.infrastructure.PaymentGatewayClient;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentGatewayClient paymentGatewayClient;

    public PaymentService(PaymentGatewayClient paymentGatewayClient) {
        this.paymentGatewayClient = paymentGatewayClient;
    }

    public void processPayment(Payment payment) {
        paymentGatewayClient.processPayment(payment);
    }
}
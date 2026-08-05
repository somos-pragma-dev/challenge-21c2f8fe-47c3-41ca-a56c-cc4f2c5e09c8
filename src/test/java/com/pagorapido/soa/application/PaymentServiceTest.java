package com.pagorapido.soa.application;

import com.pagorapido.soa.domain.Payment;
import com.pagorapido.soa.infrastructure.PaymentGatewayClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

public class PaymentServiceTest {
    @Mock
    private PaymentGatewayClient paymentGatewayClient;

    @InjectMocks
    private PaymentService paymentService;

    public PaymentServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testProcessPayment() {
        Payment payment = new Payment("123", "100.00", "USD");
        paymentService.processPayment(payment);
        verify(paymentGatewayClient).processPayment(payment);
    }
}
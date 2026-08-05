package com.pagorapido.soa.domain;

import jakarta.validation.constraints.NotNull;

public record Payment(
    @NotNull String operationId,
    @NotNull String amount,
    @NotNull String currency
) {}
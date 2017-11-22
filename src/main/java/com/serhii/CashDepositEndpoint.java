package com.serhii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CashDepositEndpoint {
    private static final String NAMESPACE_URI = "http://serhii.com";

    private CashDepositRepository cashDepositRepository;

    @Autowired
    public CashDepositEndpoint(CashDepositRepository cashDepositRepository) {
        this.cashDepositRepository = cashDepositRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "cashDeposit")
    @ResponsePayload
    public CashDepositResponse cashDeposit(@RequestPayload CashDeposit request) {
        CashDepositResponse response = new CashDepositResponse();
        // Check results for Request and send Response
        cashDepositRepository.save(request);
        response.setCashDepositResult("Saved");
        return response;
    }
}

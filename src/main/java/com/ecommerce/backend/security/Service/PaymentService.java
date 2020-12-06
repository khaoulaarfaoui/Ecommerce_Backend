package com.ecommerce.backend.security.Service;

import com.ecommerce.backend.model.PaymentCallback;
import com.ecommerce.backend.model.PaymentDetail;

public interface PaymentService {

	String payuCallback(PaymentCallback paymentResponse);

	PaymentDetail proceedPayment(PaymentDetail paymentDetail);

}

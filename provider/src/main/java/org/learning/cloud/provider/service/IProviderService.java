package org.learning.cloud.provider.service;

import org.learning.cloud.provider.domain.Produces;

public interface IProviderService {

    String SERVICE_ID = "provider.providerService";

    Produces getProduces(String id);
}

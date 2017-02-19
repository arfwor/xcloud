package org.learning.provider.service;

import org.learning.provider.domain.Produces;

public interface IProviderService {

    String SERVICE_ID = "provider.providerService";

    Produces getProduces(String id);
}

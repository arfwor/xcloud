package org.learning.provider.service.support;

import org.learning.provider.domain.Produces;
import org.learning.provider.service.IProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(IProviderService.SERVICE_ID)
public class ProviderServiceImpl implements IProviderService {

    @Value("${basic.scheduler.threadNamePrefix}")
    private String name;

    @Override
    public Produces getProduces(String id) {
        Produces produces = new Produces();
        produces.setId(id);
        produces.setName(name);
        return produces;
    }

}

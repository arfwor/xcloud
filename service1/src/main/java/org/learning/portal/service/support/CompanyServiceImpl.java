package org.learning.portal.service.support;

import org.learning.portal.domain.Company;
import org.learning.portal.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service(ICompanyService.SERVICE_ID)
public class CompanyServiceImpl implements ICompanyService {

//    @Autowired
//    @LoadBalanced
//    private RestTemplate restTemplate;

    public Company getCompany(String id) {
        return null;
    }

}

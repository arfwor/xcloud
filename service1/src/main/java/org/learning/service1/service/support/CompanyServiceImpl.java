package org.learning.service1.service.support;

import org.learning.service1.domain.Company;
import org.learning.service1.service.ICompanyService;
import org.springframework.stereotype.Service;

@Service(ICompanyService.SERVICE_ID)
public class CompanyServiceImpl implements ICompanyService {

//    @Autowired
//    @LoadBalanced
//    private RestTemplate restTemplate;

    public Company getCompany(String id) {
        return null;
    }

}

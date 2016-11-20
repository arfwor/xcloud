package org.learning.portal.service.support;

import org.learning.portal.domain.Company;
import org.learning.portal.service.ICompanyService;
import org.springframework.stereotype.Service;

@Service(ICompanyService.SERVICE_ID)
public class CompanyServiceImpl implements ICompanyService {

    public Company getCompany(String id) {
        return null;
    }

}

package org.learning.service2.service;

import org.learning.service2.domain.Company;

public interface ICompanyService {

    String SERVICE_ID = "portal.companyService";

    Company getCompany(String id);
}

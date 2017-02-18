package org.learning.service1.service;

import org.learning.service1.domain.Company;

public interface ICompanyService {

    String SERVICE_ID = "portal.companyService";

    Company getCompany(String id);
}

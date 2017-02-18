package org.learning.portal.service;

import org.learning.portal.domain.Company;

public interface ICompanyService {

    String SERVICE_ID = "portal.companyService";

    Company getCompany(String id);
}

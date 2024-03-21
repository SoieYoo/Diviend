package com.example.money.scraper;

import com.example.money.model.Company;
import com.example.money.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}

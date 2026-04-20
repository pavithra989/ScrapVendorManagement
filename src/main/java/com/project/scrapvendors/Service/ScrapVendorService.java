package com.project.scrapvendors.Service;

import com.project.scrapvendors.Model.ScrapVendor;

import java.util.List;

public interface ScrapVendorService {

    public String createScrapVendor(ScrapVendor scrapVendor);
    public String updateScrapVendor(ScrapVendor scrapVendor);
    public String deleteScrapVendor(String scrapVendorId);
    public ScrapVendor getScrapVendorById( String ScrapVendorId);

    public List<ScrapVendor> getAllScrapVendor();

}

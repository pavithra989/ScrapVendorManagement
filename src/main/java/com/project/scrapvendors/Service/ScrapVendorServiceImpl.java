package com.project.scrapvendors.Service;

import com.project.scrapvendors.Model.ScrapVendor;
import com.project.scrapvendors.Repository.ScrapVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScrapVendorServiceImpl implements ScrapVendorService{

    ScrapVendorRepository scrapVendorRepository;

    public ScrapVendorServiceImpl(ScrapVendorRepository scrapVendorRepository) {
        this.scrapVendorRepository = scrapVendorRepository;
    }

    @Override
    public String createScrapVendor(ScrapVendor scrapVendor) {
        scrapVendorRepository.save(scrapVendor);
        return "Success";
    }

    @Override
    public String updateScrapVendor(ScrapVendor scrapVendor) {
        scrapVendorRepository.save(scrapVendor);
        return "Success";
    }

    @Override
    public String deleteScrapVendor(String scrapVendorId) {
        scrapVendorRepository.deleteById( scrapVendorId);
        return "Success";
    }

    @Override
    public ScrapVendor getScrapVendorById(String scrapVendorId) {
        return scrapVendorRepository.findById(scrapVendorId).get();

    }



    @Override
    public List<ScrapVendor> getAllScrapVendor() {

        return scrapVendorRepository.findAll();

    }
}

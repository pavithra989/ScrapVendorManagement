package com.project.scrapvendors.Controller;


import com.project.scrapvendors.Model.ScrapVendor;
import com.project.scrapvendors.Service.ScrapVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scrapvendor")
public class ScrapVendorController
{
    ScrapVendorService scrapVendorService;

    public ScrapVendorController(ScrapVendorService scrapVendorService) {
        this.scrapVendorService = scrapVendorService;
    }

    @GetMapping("{vendorId}")
    public ScrapVendor getScrapVendorDetails(@PathVariable("vendorId") String vendorId){
        return scrapVendorService.getScrapVendorById(vendorId);
    }

    @GetMapping()
    public List<ScrapVendor> getAllScrapVendorDetails()
    {
        return scrapVendorService.getAllScrapVendor();
    }


    @PostMapping()
    public String createScrapVendorDetails(@RequestBody ScrapVendor scrapVendor)
    {
        scrapVendorService.createScrapVendor(scrapVendor);
        return "Scrap vendor created successfully";
    }

    @PutMapping()
    public String updateScrapVendorDetails(@RequestBody ScrapVendor scrapVendor)
    {
        scrapVendorService.updateScrapVendor(scrapVendor);
        return "Scrap vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteScrapVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        scrapVendorService.deleteScrapVendor(vendorId);
        return "Scrap vendor deleted successfully";
    }



}

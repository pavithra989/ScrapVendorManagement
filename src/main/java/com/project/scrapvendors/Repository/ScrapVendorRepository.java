package com.project.scrapvendors.Repository;

import com.project.scrapvendors.Model.ScrapVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScrapVendorRepository extends JpaRepository<ScrapVendor, String> {
    // List<ScrapVendor> findByNameIgnoreCase(String vendorName );


}

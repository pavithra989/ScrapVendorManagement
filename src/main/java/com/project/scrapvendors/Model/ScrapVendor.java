package com.project.scrapvendors.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Scrap-vendor-details")
public class ScrapVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  vendorId;

    @Column(name = "Vendor company name")
    private String vendorName;
    @Column(name = "Vendor owner name")
    private String vendorOwnerName;
    @Column(name = "Vendor email")
    private String vendorEmail;
    @Column(name = "Vendor Contact", nullable = true)
    private String vendorPhoneNumber;

}

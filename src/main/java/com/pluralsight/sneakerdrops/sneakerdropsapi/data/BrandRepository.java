package com.pluralsight.sneakerdrops.sneakerdropsapi.data;

import com.pluralsight.sneakerdrops.sneakerdropsapi.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand, Long> {

}

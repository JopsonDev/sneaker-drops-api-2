package com.pluralsight.sneakerdrops.sneakerdrops.data;

import com.pluralsight.sneakerdrops.sneakerdrops.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BrandRepository extends JpaRepository<Brand, Long> {

}

package com.pluralsight.sneakerdrops.sneakerdrops.data;

import com.pluralsight.sneakerdrops.sneakerdrops.models.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {

}

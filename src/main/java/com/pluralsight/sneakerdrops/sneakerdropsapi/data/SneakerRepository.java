package com.pluralsight.sneakerdrops.sneakerdropsapi.data;

import com.pluralsight.sneakerdrops.sneakerdropsapi.models.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SneakerRepository extends JpaRepository<Sneaker, Long> {

}

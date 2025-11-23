package com.ammar.SpringBoot.repository;

import com.ammar.SpringBoot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer>  {

}

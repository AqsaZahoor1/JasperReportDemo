package com.jasper.reports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jasper.reports.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

}

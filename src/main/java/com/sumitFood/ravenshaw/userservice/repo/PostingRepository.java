package com.sumitFood.ravenshaw.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumitFood.ravenshaw.userservice.bean.Posting;

public interface PostingRepository extends JpaRepository<Posting, Long> {

}

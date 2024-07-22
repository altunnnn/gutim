package com.altun.gutim.repository;

import com.altun.gutim.entity.Blog;
import com.altun.gutim.entity.Class;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Long> {

    Page<Blog> findAllBy(Pageable pageable);
}

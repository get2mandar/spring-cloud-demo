package com.wp.panditmandar.scdemo.bookdata.author;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Author Entity
 * 
 * @author Mandar Pandit
 *
 */
@Transactional
public interface AuthorRepository extends JpaRepository<Author, Long> {

}

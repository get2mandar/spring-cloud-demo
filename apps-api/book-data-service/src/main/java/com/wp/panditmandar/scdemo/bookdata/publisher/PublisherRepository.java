package com.wp.panditmandar.scdemo.bookdata.publisher;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Publisher Entity
 * 
 * @author Mandar Pandit
 *
 */
@Transactional
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
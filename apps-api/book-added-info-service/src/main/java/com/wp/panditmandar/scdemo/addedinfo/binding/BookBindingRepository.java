package com.wp.panditmandar.scdemo.addedinfo.binding;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Book Binding Entity
 * 
 * @author Mandar Pandit
 *
 */
@Transactional
public interface BookBindingRepository extends JpaRepository<BookBinding, Long> {

}

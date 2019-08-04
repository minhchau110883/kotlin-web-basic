package com.nmc.kotlin.web.basic.repository

import com.nmc.kotlin.web.basic.domain.Authority

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Spring Data JPA repository for the [Authority] entity.
 */

interface AuthorityRepository : JpaRepository<Authority, String>

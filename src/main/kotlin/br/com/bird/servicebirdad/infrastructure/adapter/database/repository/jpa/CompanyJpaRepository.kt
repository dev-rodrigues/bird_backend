package br.com.bird.servicebirdad.infrastructure.adapter.database.repository.jpa

import br.com.bird.servicebirdad.infrastructure.adapter.database.entity.CompanyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyJpaRepository : JpaRepository<CompanyEntity, Long> {
    fun existsByCnpjOrEmail(cnpj: String, email: String): Boolean
}
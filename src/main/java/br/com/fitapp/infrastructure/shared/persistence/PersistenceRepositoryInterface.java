package br.com.fitapp.infrastructure.shared.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersistenceRepositoryInterface<T, ID>  extends JpaRepository<T, ID> {
}

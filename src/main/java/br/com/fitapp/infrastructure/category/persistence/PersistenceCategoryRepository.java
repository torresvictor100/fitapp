package br.com.fitapp.infrastructure.category.persistence;

import br.com.fitapp.infrastructure.category.model.CategoryModel;
import br.com.fitapp.infrastructure.shared.persistence.PersistenceRepositoryInterface;

public interface PersistenceCategoryRepository extends PersistenceRepositoryInterface<CategoryModel, Long> {
}

package br.com.fitapp.infrastructure.group.persistence;

import br.com.fitapp.infrastructure.group.model.GroupModel;
import br.com.fitapp.infrastructure.shared.persistence.PersistenceRepositoryInterface;

public interface PersistenceGroupRepository extends PersistenceRepositoryInterface<GroupModel, Long> {
}

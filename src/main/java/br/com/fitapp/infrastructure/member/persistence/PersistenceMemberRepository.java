package br.com.fitapp.infrastructure.member.persistence;

import br.com.fitapp.infrastructure.member.model.MemberModel;
import br.com.fitapp.infrastructure.shared.persistence.PersistenceRepositoryInterface;

public interface PersistenceMemberRepository extends PersistenceRepositoryInterface<MemberModel, Long> {
}

package br.com.fitapp.infrastructure.exercise.persistence;

import br.com.fitapp.infrastructure.exercise.model.ExerciseModel;
import br.com.fitapp.infrastructure.shared.persistence.PersistenceRepositoryInterface;

public interface PersistenceExerciseRepository extends PersistenceRepositoryInterface<ExerciseModel, Long> {
}

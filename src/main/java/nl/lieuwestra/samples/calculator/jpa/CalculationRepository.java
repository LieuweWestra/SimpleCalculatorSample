package nl.lieuwestra.samples.calculator.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CalculationRepository extends CrudRepository<CalculationHistory, Long> {

    CalculationHistory findById(long id);
}

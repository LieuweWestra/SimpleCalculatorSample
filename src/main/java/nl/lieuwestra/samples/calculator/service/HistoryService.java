package nl.lieuwestra.samples.calculator.service;

import nl.lieuwestra.samples.calculator.jpa.CalculationHistory;
import nl.lieuwestra.samples.calculator.jpa.CalculationRepository;
import nl.lieuwestra.samples.calculator.model.ValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class HistoryService {

    @Autowired
    private CalculationRepository repository;

    public void addToHistory(ValuePair inputvalues, double outputValue, String operation) {
        repository.save(new CalculationHistory(
                new BigDecimal(inputvalues.a),
                new BigDecimal(inputvalues.b),
                new BigDecimal(outputValue),
                operation)
        );
    }

    public Iterable<CalculationHistory> all() {
        return repository.findAll();
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}

package nl.lieuwestra.samples.calculator.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CalculationHistory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private BigDecimal firstValue;
    private BigDecimal secondValue;
    private BigDecimal result;
    private String operation;

    protected CalculationHistory() {
    }

    public CalculationHistory(BigDecimal firstValue, BigDecimal secondValue, BigDecimal result, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = result;
        this.operation = operation;
    }

    public BigDecimal getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(BigDecimal firstValue) {
        this.firstValue = firstValue;
    }

    public BigDecimal getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(BigDecimal secondValue) {
        this.secondValue = secondValue;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

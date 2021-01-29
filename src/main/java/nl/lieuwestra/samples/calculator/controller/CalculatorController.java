package nl.lieuwestra.samples.calculator.controller;

import nl.lieuwestra.samples.calculator.model.ValuePair;
import nl.lieuwestra.samples.calculator.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "calculate")
public class CalculatorController {

    @Autowired
    private HistoryService service;

    /**
     * Adds the values in the {@link ValuePair values} together and returns a single double value.
     * @param pair the pair of numbers to perform the operation with.
     * @return the resulting value of the operation
     */
    @RequestMapping(value = "/add", produces = "application/json")
    public double add(@RequestBody ValuePair pair) {
        double value = (double) pair.a + (double) pair.b;
        service.addToHistory(pair,value,"add");
        return value;
    }

    /**
     * Subtracts the values in the {@link ValuePair values} and returns a single double value.
     * @param pair the pair of numbers to perform the operation with.
     * @return the resulting value of the operation
     */
    @RequestMapping(value = "/subtract", produces = "application/json")
    public double subtract(@RequestBody ValuePair pair) {
        double value = (double) pair.a - (double) pair.b;
        service.addToHistory(pair,value,"subtract");
        return value;
    }

    /**
     * Multiplies the values in the {@link ValuePair values} and returns a single double value.
     * @param pair the pair of numbers to perform the operation with.
     * @return the resulting value of the operation
     */
    @RequestMapping(value = "/multiply", produces = "application/json")
    public double multiply(@RequestBody ValuePair pair) {
        double value = (double) pair.a * (double) pair.b;
        service.addToHistory(pair,value,"multiply");
        return value;
    }

    /**
     * Devides the values in the {@link ValuePair values} and returns a single double value.
     * @param pair the pair of numbers to perform the operation with.
     * @return the resulting value of the operation
     */
    @RequestMapping(value = "/divide", produces = "application/json")
    public double divide(@RequestBody ValuePair pair) {
        double value = (double) pair.a / (double) pair.b;
        service.addToHistory(pair,value,"divide");
        return value;
    }

}

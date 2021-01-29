package nl.lieuwestra.samples.calculator.controller;

import nl.lieuwestra.samples.calculator.jpa.CalculationHistory;
import nl.lieuwestra.samples.calculator.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "history")
public class HistoryController {

    @Autowired
    HistoryService service;

    @GetMapping(value = "", produces = "application/json")
    public Iterable<CalculationHistory> add() {
        return service.all();
    }

    @PostMapping(value = "clear", produces = "application/json")
    public void clear() {
        service.deleteAll();
    }

}

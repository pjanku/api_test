package cz.utb.tampere_sample_app.controllers;

import cz.utb.tampere_sample_app.entity.HistoryRecord;
import cz.utb.tampere_sample_app.services.HistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    private final HistoryRecordService historyRecordService;

    @Autowired
    public RestController(HistoryRecordService historyRecordService) {
        this.historyRecordService = historyRecordService;
    }

    @GetMapping("/test")
    String test(){
        return "Hello world";
    }

    @GetMapping("/sum/{a}/{b}")
    Long sum(@PathVariable Long a, @PathVariable Long b) {
        return a + b;
    }
    @GetMapping("/history_records")
    public List<HistoryRecord> getAllHistoryRecords(){
        return historyRecordService.getAll();
    }

    @PostMapping("/history_records")
    public HistoryRecord saveHistoryRecord(@RequestBody HistoryRecord historyRecord){
       return  historyRecordService.saveHistoryRecord(historyRecord);
    }

}

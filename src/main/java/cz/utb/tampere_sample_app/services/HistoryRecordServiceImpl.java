package cz.utb.tampere_sample_app.services;

import cz.utb.tampere_sample_app.entity.HistoryRecord;
import cz.utb.tampere_sample_app.repository.HistoryRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryRecordServiceImpl implements HistoryRecordService {

    private final HistoryRecordRepository historyRecordRepository;

    @Autowired
    public HistoryRecordServiceImpl(HistoryRecordRepository historyRecordRepository) {
        this.historyRecordRepository = historyRecordRepository;
    }

    @Override
    public HistoryRecord saveHistoryRecord(HistoryRecord historyRecord){
        return historyRecordRepository.save(historyRecord);
    }

    public List<HistoryRecord> getAll(){
        return (List<HistoryRecord>) historyRecordRepository.findAll();
    }

    public void deleteByID(Long historyRecordID){
        historyRecordRepository.deleteById(historyRecordID);
    }
}

package cz.utb.tampere_sample_app.services;

import cz.utb.tampere_sample_app.entity.HistoryRecord;
import cz.utb.tampere_sample_app.repository.HistoryRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryRecordServiceImpl implements HistoryRecordService {

    @Autowired
    private HistoryRecordRepository historyRecordRepository;

    @Override
    public HistoryRecord saveHistoryRecord(HistoryRecord record){
        return historyRecordRepository.save(record);
    }

    public List<HistoryRecord> getAll(){
        return (List<HistoryRecord>) historyRecordRepository.findAll();
    }

    public void deleteByID(Long historyRecordID){
        historyRecordRepository.deleteById(historyRecordID);
    }
}

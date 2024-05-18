package cz.utb.tampere_sample_app.services;

import cz.utb.tampere_sample_app.entity.HistoryRecord;

import java.util.List;

public interface HistoryRecordService {

    HistoryRecord saveHistoryRecord(HistoryRecord record);

    List<HistoryRecord> getAll();

    void deleteByID(Long historyRecordID);
}

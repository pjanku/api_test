package cz.utb.tampere_sample_app.repository;

import cz.utb.tampere_sample_app.entity.HistoryRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRecordRepository
    extends CrudRepository<HistoryRecord,Long> {
}

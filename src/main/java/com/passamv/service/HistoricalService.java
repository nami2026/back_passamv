package com.passamv.service;

import com.passamv.dto.HistoricalDto;
import com.passamv.entity.Historical;
import com.passamv.entity.HistoricalPK;
import com.passamv.repository.HistoricalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoricalService {

    @Autowired
    private HistoricalRepository historicalRepository;

    public Historical save(HistoricalDto historical) {
        HistoricalPK historicalPK = new HistoricalPK(historical.getIds().getAreaId(),
                historical.getIds().getExamId(), historical.getIds().getUserId());

        Historical historicalEntity = new Historical(historicalPK, historical.getScore(), historical.getStartDate(),
                historical.getEndDate(), historical.getTotalScore(), historical.getStatus(), historical.getWrongAnswersId(),
                historical.getRightAnswersId(), null, null, null);

        return historicalRepository.save(historicalEntity);
    }

}

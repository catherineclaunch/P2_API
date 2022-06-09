package com.revature.beats_ahoy.survey;
import com.revature.beats_ahoy.util.interfaces.Serviceable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SurveyServices implements Serviceable<Survey> {
    @Override
    public Survey create(Survey newObject) {
        return null;
    }

    @Override
    public List<Survey> readAll() {
        return null;
    }

    @Override
    public Survey readById(String id) {
        return null;
    }

    @Override
    public Survey update(Survey updatedObject) {
        return null;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public boolean validateInput(Survey object) {
        return false;
    }
}

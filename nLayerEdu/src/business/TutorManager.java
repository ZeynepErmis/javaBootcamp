package business;

import core.logging.Logger;
import dataAccess.TutorDao;
import entity.Tutor;

public class TutorManager {
    private TutorDao tutorDao;
    private Logger[] loggers;

    public TutorManager(TutorDao tutorDao, Logger[] loggers) {
        this.tutorDao = tutorDao;
        this.loggers = loggers;
    }

    public void add(Tutor tutor){
        tutorDao.add(tutor);

        for (Logger logger: loggers){
            logger.log(tutor.getFirstName());
        }
    }
}

package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entity.Course;


import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Course> courses = new ArrayList<>();
    private Logger[] loggers;


    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        for (Course course2 : courses) {
            if (course2.getName() == course.getName())
                throw new Exception("Course name cannot be repeated");
        }
        if (course.getPrice() <= 0) {
            throw new Exception("Price needs to be greater than 0");
        }
        courseDao.add(course);
        for (Logger logger: loggers){
            logger.log(course.getName());
        }
    }
}

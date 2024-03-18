package dataAccess;

import entity.Category;
import entity.Course;
import entity.Tutor;

    public class JdbcDao implements CategoryDao, CourseDao, TutorDao{
    @Override
    public void add(Category category) {
        System.out.println("Category added with Jdbc");
    }

    @Override
    public void add(Course course) {
        System.out.println("Course added with Jdbc");
    }

    @Override
    public void add(Tutor tutor) {
        System.out.println("Tutor added with Jdbc");
    }
}

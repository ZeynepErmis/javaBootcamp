package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Category> categories = new ArrayList<>();
    private Logger[] loggers;


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getName().equals(category.getName()))
                throw new Exception("Course name cannot be repeated");
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger: loggers){
            logger.log(category.getName());
        }

    }
}

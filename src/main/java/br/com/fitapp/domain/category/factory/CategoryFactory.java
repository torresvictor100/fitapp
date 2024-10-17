package br.com.fitapp.domain.category.factory;

import br.com.fitapp.domain.category.entity.Category;

public class CategoryFactory {
    public static Category create(String photoUrl, String discription, String name){
        return new Category(photoUrl, discription, name);
    }
}

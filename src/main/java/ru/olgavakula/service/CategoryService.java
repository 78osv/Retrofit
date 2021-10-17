package ru.olgavakula.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import ru.olgavakula.dto.Category;

public interface CategoryService {
    @GET("categories/{id}")
    Call<Category> getCategory(@Part("id") Integer id);
}

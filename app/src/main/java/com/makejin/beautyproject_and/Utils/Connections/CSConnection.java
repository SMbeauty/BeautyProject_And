package com.makejin.beautyproject_and.Utils.Connections;


import com.makejin.beautyproject_and.Model.Brand;
import com.makejin.beautyproject_and.Model.Category;
import com.makejin.beautyproject_and.Model.Cosmetic;
import com.makejin.beautyproject_and.Model.GlobalResponse;
import com.makejin.beautyproject_and.Model.User;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by kksd0900 on 16. 9. 29..
 */
public interface CSConnection{






    @GET("/users/{user_id}")
    Observable<User> oneUser_get(@Path("user_id") String user_id);






    @POST("/users/{user_id}/cosmetics")
    Observable<List<User>> myCosmetic_post(@Body Cosmetic cosmetic,
                                           @Path("user_id") String user_id);
    @GET("/users/{user_id}/cosmetics")
    Observable<List<User>> myCosmetic_get(@Path("user_id") String user_id);






    @GET("/users/{user_id}/cosmetics/{cosmetic-id}")
    Observable<Cosmetic> myOneCosmetic_get(@Path("user_id") String user_id,
                                         @Path("cosmetic-id") String cosmetic_id);
    @PUT("/users/{user_id}/cosmetics/{cosmetic-id}")
    Observable<Cosmetic> myOneCosmetic_put(@Body Cosmetic cosmetic,
                                         @Path("user_id") String user_id,
                                         @Path("cosmetic_id") String cosmetic_id);
    @DELETE("/users/{user_id}/cosmetics/{cosmetic-id}")
    Observable<GlobalResponse> myOneCosmetic_delete(@Path("user_id") String user_id,
                                                    @Path("cosmetic_id") String cosmetic_id);






    @GET("/users/{user_id}/cosmetics?main={main-category}")
    Observable<List<Cosmetic>> myMainCategoryCosmetic(@Path("user_id") String user_id,
                                         @Path("main-category") String main_category);






    @GET("/users/{user_id}/cosmetics?main={sub-category}")
    Observable<List<Cosmetic>> mySubCategoryCosmetic(@Path("user_id") String user_id,
                                                      @Path("sub-category") String sub_category);





    @GET("/category")
    Observable<List<Category>> category();






    @GET("/brand")
    Observable<List<Brand>> brand();






    @GET("/cosmetics")
    Observable<List<Cosmetic>> cosmetic();






    @GET("/cosmetics?brand={brand-id}")
    Observable<List<Cosmetic>> cosmeticInBrand(@Path("brand-id") String brand_id);







    @GET("/cosmetics?main={main-category}")
    Observable<List<Cosmetic>> cosmeticInMainCategory(@Path("main-category") String main_category);






    @GET("/cosmetics?main={sub-category}")
    Observable<List<Cosmetic>> cosmeticInSubCategory(@Path("sub-category") String sub_category);






    @GET("/cosmetics/{cosmetic-id}")
    Observable<Cosmetic> oneCosmetic(@Path("cosmetic-id") String cosmetic_id);
}



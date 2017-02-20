package com.makejin.beautyproject_and.Utils.PredictionIO;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by mijeong on 2016. 10. 13..
 * predictionIO 학습 이벤트들은 공통으로 많이 쓰일 것 같아 따로 뺐습니다
 */
public class PredictionIOLearnEvent {
    SharedPreferences sp;
    String user_id;
    Context context;
    boolean rate_result;

    public PredictionIOLearnEvent(Context ctx) {
        context = ctx;
        sp = context.getSharedPreferences("TodayFood", context.MODE_PRIVATE);
        user_id = sp.getString("user_id", null);
    }
//
//    public void food_like(Food food, final ImageView heart, final Drawable img) {
//        CSConnection conn = ServiceGenerator.createService(CSConnection.class);
//        conn.likeFood(SharedManager.getInstance().getMe()._id, food._id)
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<Food>() {
//                    @Override
//                    public final void onCompleted() {
//                        heart.setImageDrawable(img);
//                    }
//                    @Override
//                    public final void onError(Throwable e) {
//                        e.printStackTrace();
//                        Toast.makeText(context, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show();
//                    }
//                    @Override
//                    public final void onNext(Food response) {
//                        if (response != null) {
//                            //결과 값이 food??
////                            food = response;
//                        } else {
//                            Toast.makeText(context, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//    }


//    public boolean food_rate(String event_id) {
//        rate_result = false;
//        final CSConnection conn = ServiceGenerator.createService(CSConnection.class);
//        conn.likeCancle(event_id)
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<Food>() {
//                    @Override
//                    public final void onCompleted() {
//                        rate_result = true;
//                    }
//                    @Override
//                    public final void onError(Throwable e) {
//                        e.printStackTrace();
//                        Toast.makeText(context, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show();
//                    }
//                    @Override
//                    public final void onNext(Food response) {
//                        if (response != null) {
//                            Log.i("pio","response : "+response.toString());
//                        } else {
//                            Toast.makeText(context, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
//        return rate_result;
//    }
}

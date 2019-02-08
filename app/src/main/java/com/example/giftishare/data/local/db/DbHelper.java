package com.example.giftishare.data.local.db;

import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.giftishare.data.model.Coupon;

import java.util.List;

/**
 * Created by KS-KIM on 19/02/06.
 */

public interface DbHelper {

    LiveData<List<Coupon>> getAllCoupons();

    void saveCoupon(Coupon coupon);

    void deleteAllCoupons();

    void deleteCoupon(@NonNull Coupon coupon);
}

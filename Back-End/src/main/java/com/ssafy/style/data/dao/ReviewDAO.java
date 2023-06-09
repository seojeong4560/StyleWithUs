package com.ssafy.style.data.dao;

import com.ssafy.style.data.entity.Consultant;
import com.ssafy.style.data.entity.Review;
import com.ssafy.style.data.entity.User;

import java.util.List;

public interface ReviewDAO {
    Review createReview(Review review) throws Exception;
    List<Review> readConsultantReview(String consultantId) throws Exception;
    List<Review> readUserReview(String userId) throws Exception;
    Review readReview(int reviewNo) throws Exception;
    Review updateReview(Review review) throws Exception;
    void deleteReview(int reviewNo) throws Exception;
    Consultant toConsultant(String consultantId);
    String toConsultantId(Consultant consultant);
    User toUser(String userId);
    String toUserId(User user);

}

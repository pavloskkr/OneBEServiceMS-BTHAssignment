package bth.assignment.OneBEServiceMS.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @Column(name = "review_rating", nullable = false)
    private int reviewRating;
    @Column(name = "review_description", length = 200, nullable = false)
    private String reviewDescription;
    @Column(name = "review_show_in_front", nullable = false)
    private boolean reviewShowInFront;

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription;
    }

    public boolean isReviewShowInFront() {
        return reviewShowInFront;
    }

    public void setReviewShowInFront(boolean reviewShowInFront) {
        this.reviewShowInFront = reviewShowInFront;
    }
}

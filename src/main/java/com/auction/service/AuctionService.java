package com.auction.service;

public class AuctionService {
  public double calculateFee(double bidAmount, boolean isPremiumUser) {
    if (isPremiumUser) {
      return bidAmount * 0.01;
    }

    if (bidAmount >= 1000) {
      return bidAmount * 0.05;
    } else if (bidAmount > 0) {
      return bidAmount * 0.1;
    }

    return 0;
  }
}
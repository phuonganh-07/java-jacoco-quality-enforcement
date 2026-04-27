package com.auction.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AuctionServiceTest {
  private final AuctionService service = new AuctionService();

  @Test
  public void testPremiumUserFee() {
    assertEquals(10, service.calculateFee(1000, true));
  }

  @Test
  public void testHighValueStandardFee() {
    // Bao phủ nhánh bidAmount >= 1000
    assertEquals(50, service.calculateFee(1000, false));
  }

  @Test
  public void testSmallValueStandardFee() {
    // Bao phủ nhánh bidAmount > 0
    assertEquals(10, service.calculateFee(100, false));
  }

  @Test
  public void testInvalidBid() {
    // Bao phủ nhánh cuối cùng (return 0)
    assertEquals(0, service.calculateFee(-1, false));
  }
}
package com.beangou.day0415;

import java.math.BigDecimal;

public class BigDecimal2Int {

	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal(0);
		BigDecimal bd2 = new BigDecimal(21);
		BigDecimal bd3 = new BigDecimal(-11.2);
		BigDecimal bd4 = new BigDecimal(121.2);
		
		int intbd = bd.intValue();
		int intbd2 = bd2.intValue();
		int intbd3 = bd3.intValue();
		int intbd4 = bd4.intValue();

//		INSERT INTO `59_order` (`order_id`,         `status`, `type`, `paytype`, `paystatus`, `pay_trade_no`,            `source`, `consumption_type`, `suspicious`, `sid`, `site_id`, `dorm_id`, `dormentry_id`, `shop_id`, `uid`,      `service_eva`, `delivery_eva`, `food_eva`, `food_num`, `food_amount`, `ship_fee`, `coupon_discount`, `promotion_discount`, `discount`, `order_amount`, `delivery_id`, `add_time`, `confirm_time`, `send_time`, `expect_date`, `delivery_type`, `expect_time`, `expect_timeslot`, `order_mark`, `uname`,       `portrait`, `phone`,    `phone_addr`, `buy_times`, `address1`, `address2`, `dormitory`, `time_deliver`, `credit`, `ip`, `coupon_code`, `feature`, `remark`, `evaluation`, `expect_start_time`, `expect_end_time`, `timeline`)
//		VALUES
//								(1466086358016790816,  5,        4,       6,          10,   '4004472001201606167378089822', 3,        0,                   0,           0,     2449,         29378, 18222,           13617, 1451221679813548, NULL,          NULL,          NULL,       8,         13.50,          0.0,        0.00,               0.00,                 0.0,       13.50,          NULL,      1466086358,     0,             0,          1466086358,        2,             0,              '',              NULL,    'p_13418933361',     '',   '13418933361',   NULL,          NULL,      '本校区',       'D3',      '1111',        NULL,        0,      '',       '',          NULL, '', '', 0, 0, '2016-06-16 22:19:45');
		
		
//		System.out.println(intbd + ", " + intbd2 + ", " + intbd3 + ", " + intbd4);
//		
//		int intbde = bd.intValueExact();
//		int intbde2 = bd2.intValueExact();
//		int intbde3 = bd3.intValueExact();
//		int intbde4 = bd4.intValueExact();
		
		Integer myInt = new Integer(1);
		System.out.println(1 == myInt);
	}

}

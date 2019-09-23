package com.woniuxy.domain;

import lombok.Data;

@Data
public class Tuple<I,S> {
	private I num;
	private S str;
}

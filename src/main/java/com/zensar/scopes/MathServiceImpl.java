package com.zensar.scopes;

import org.springframework.stereotype.Service;

@Service("mathService")
public class MathServiceImpl implements MathService {

	@Override
	public int sum(int a, int b) {
		return a+b;
	}

}

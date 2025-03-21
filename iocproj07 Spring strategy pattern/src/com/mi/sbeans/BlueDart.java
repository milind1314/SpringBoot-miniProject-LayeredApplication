package com.mi.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bDart")
@Lazy(true)
public final class BlueDart implements Icourier {

	public BlueDart() {
		System.out.println("BlueDart :: 0-param constructor.");
	}
	
	@Override
	public String deliver(int oid) {
		return "BlueDart courier is ready to deliver "+oid+" order number products ";
	}

}

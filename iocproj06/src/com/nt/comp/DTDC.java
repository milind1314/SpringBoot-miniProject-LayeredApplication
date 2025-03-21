package com.nt.comp;

public final class DTDC implements Courier {

	@Override
	public String delivery(int oid) {
		return oid+" Order items are kept for delivery by DTDC";
	}

}

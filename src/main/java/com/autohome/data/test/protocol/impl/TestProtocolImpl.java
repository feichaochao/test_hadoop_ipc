package com.autohome.data.test.protocol.impl;

import java.io.IOException;

import org.apache.hadoop.ipc.ProtocolSignature;

import com.autohome.data.test.protocol.TestProtocol;

public class TestProtocolImpl implements TestProtocol {

	private static final long version = 1;
	
	public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
		return version;
	}

	public ProtocolSignature getProtocolSignature(String protocol, long clientVersion, int clientMethodsHash)
			throws IOException {
		int[] a = {clientMethodsHash};
		ProtocolSignature ps = new ProtocolSignature(clientVersion, a);
		return ps;
	}

	public String eat(String smt) {
		
		return "eat .... " + smt;
	}

	public String play(String smt) {
		return "play .... " + smt;
	}

}

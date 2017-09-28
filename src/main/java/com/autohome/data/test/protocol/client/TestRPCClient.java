package com.autohome.data.test.protocol.client;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import com.autohome.data.test.protocol.TestProtocol;

public class TestRPCClient {
	
	public static void main(String[] args) throws Exception {
		InetSocketAddress addr = new InetSocketAddress("localhost", 9898);
		TestProtocol proxy = RPC.getProxy(TestProtocol.class, 1, addr, new Configuration());
		System.out.println(proxy.eat("break"));
		System.out.println(proxy.play("basketBall"));
	}
}

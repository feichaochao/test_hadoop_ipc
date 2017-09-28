package com.autohome.data.test.protocol.server;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.ipc.RPC.Builder;
import org.apache.hadoop.ipc.RPC.Server;

import com.autohome.data.test.protocol.TestProtocol;
import com.autohome.data.test.protocol.impl.TestProtocolImpl;

public class TestRPCServer {
	public static void main(String[] args) throws Exception {
		
//		new RPC.Builder(null).setProtocol(TestProtocol.class).setInstance(new TestProtocolImpl());
		
		Configuration conf = new Configuration();
		Builder builder = new RPC.Builder(conf);
		builder.setProtocol(TestProtocol.class);
		builder.setInstance(new TestProtocolImpl());
		
		builder.setBindAddress("localhost");
		builder.setPort(9898);
		Server server = builder.build();
		server.start();
		
	}
}

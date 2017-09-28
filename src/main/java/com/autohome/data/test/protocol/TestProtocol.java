package com.autohome.data.test.protocol;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface TestProtocol extends VersionedProtocol {
	long versionID = 1L;
	String eat (String smt);
	String play (String smt);
}

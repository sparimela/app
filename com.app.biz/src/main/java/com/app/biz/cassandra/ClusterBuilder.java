package com.app.biz.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class ClusterBuilder {

	private Cluster cluster;
	private Session session;
	private ClusterConfig clusterConfig;
	
	public ClusterBuilder(ClusterConfig clusterConfig) {
		this.clusterConfig = clusterConfig;
		build(clusterConfig);
	}

	private void build(ClusterConfig clusterConfig) {

		cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.withClusterName(clusterConfig.getClusterName())
				.withPort(clusterConfig.getPort())
				.build();

		session = cluster.newSession();
	}

	protected void close() {
		cluster.close();
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}

package com.app.biz.cassandra;

import com.datastax.driver.core.SocketOptions;
import com.datastax.driver.core.ProtocolOptions.Compression;

public class ClusterConfig {

	private String clusterName;
    private String clusterIpAddressList;
    private String cfsClusterIpAddressList;
    private int port;
    private int cfsPort;
    private String dataCentre;

    private String compression= Compression.LZ4.name();
    private int initConnectionsPerHost = 8; //There is bug is datastax code, no sliding window supported for min-max connections
    private int maxHostsPerConnection = 8;
    private int simultaneousRequestsPerConnection = 100;
    private Boolean shuffleReplicasAmongReplicationNodes = true; //Takes a hit on caching if set to true
    private Boolean keepTCPConnectionAlive = true;


    private Integer connectionTimeOut = SocketOptions.DEFAULT_CONNECT_TIMEOUT_MILLIS; //Socket timeout options, should be smaller on client side vs on server
    private Integer readTimeout = SocketOptions.DEFAULT_READ_TIMEOUT_MILLIS;
    private Long reconnectPeriod = 5L;

    private String username;
    private String password;
    private Boolean downgradableConsistency = false;


    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }


    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public int getMaxHostsPerConnection() {
        return maxHostsPerConnection;
    }

    public void setMaxHostsPerConnection(int maxHostsPerConnection) {
        this.maxHostsPerConnection = maxHostsPerConnection;
    }
    

    public String getClusterIpAddressList() {
		return clusterIpAddressList;
	}

	public void setClusterIpAddressList(String clusterIpAddressList) {
		this.clusterIpAddressList = clusterIpAddressList;
	}

	public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getInitConnectionsPerHost() {
        return initConnectionsPerHost;
    }

    public void setInitConnectionsPerHost(int initConnectionsPerHost) {
        this.initConnectionsPerHost = initConnectionsPerHost;
    }

    public String getDataCentre() {
        return dataCentre;
    }

    public void setDataCentre(String dataCentre) {
        this.dataCentre = dataCentre;
    }


    public Integer getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public void setConnectionTimeOut(Integer connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Long getReconnectPeriod() {
        return reconnectPeriod;
    }

    public void setReconnectPeriod(Long reconnectPeriod) {
        this.reconnectPeriod = reconnectPeriod;
    }


    public int getSimultaneousRequestsPerConnection() {
        return simultaneousRequestsPerConnection;
    }

    public void setSimultaneousRequestsPerConnection(int simultaneousRequestsPerConnection) {
        this.simultaneousRequestsPerConnection = simultaneousRequestsPerConnection;
    }
    
	public int getCfsPort() {
		return cfsPort;
	}

	public void setCfsPort(int cfsPort) {
		this.cfsPort = cfsPort;
	}
	
	

	public String getCfsClusterIpAddressList() {
		return cfsClusterIpAddressList;
	}

	public void setCfsClusterIpAddressList(String cfsClusterIpAddressList) {
		this.cfsClusterIpAddressList = cfsClusterIpAddressList;
	}

	public Boolean getShuffleReplicasAmongReplicationNodes() {
		return shuffleReplicasAmongReplicationNodes;
	}

	public void setShuffleReplicasAmongReplicationNodes(
			Boolean shuffleReplicasAmongReplicationNodes) {
		this.shuffleReplicasAmongReplicationNodes = shuffleReplicasAmongReplicationNodes;
	}

	public Boolean getKeepTCPConnectionAlive() {
		return keepTCPConnectionAlive;
	}

	public void setKeepTCPConnectionAlive(Boolean keepTCPConnectionAlive) {
		this.keepTCPConnectionAlive = keepTCPConnectionAlive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getDowngradableConsistency() {
		return downgradableConsistency;
	}

	public void setDowngradableConsistency(Boolean downgradableConsistency) {
		this.downgradableConsistency = downgradableConsistency;
	}
    
	
    
}

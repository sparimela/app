package com.app.biz.cassandra.nosqldaoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.biz.cassandra.ClusterBuilder;
import com.app.biz.cassandra.ClusterConfig;
import com.app.biz.cassandra.CqlConfig;
import com.app.biz.cassandra.CqlDAO;
import com.app.biz.cassandra.CqlDAOImpl;
import com.app.biz.cassandra.CqlDriverConfig;
import com.app.domain.NameDO;

@Configuration
public class AppCassandraConfig {

	@Bean
	public ClusterBuilder clusterBuilder(){
		ClusterBuilder clusterBuilder = new ClusterBuilder(clusterConfig());
		return clusterBuilder;
		
	}
	
	@Bean
    public ClusterConfig clusterConfig() {
        ClusterConfig clusterConfig = new ClusterConfig();
        clusterConfig.setClusterName("MY_APP");
        clusterConfig.setPort(9042);
        return clusterConfig;
    }

	
	@Bean
	public CqlDAO<Object, NameDO> nameNoSqlDAO(){
		CqlDriverConfig cqlDriverConfig = new CqlDriverConfig(getNametCqlConfig(), clusterBuilder());
		CqlDAO<Object, NameDO> nameNoSqlDOCqlDAO = new CqlDAOImpl<NameDO>(cqlDriverConfig);		
		return nameNoSqlDOCqlDAO;
		
	}
	
	 private CqlConfig getNametCqlConfig() {
	        CqlConfig cqlConfig = new CqlConfig();
	        cqlConfig.setKeySpace("sri");
	        cqlConfig.setEntityPackages("com.app.domain");
	        return cqlConfig;
	    }

}
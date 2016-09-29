package com.app.biz.cassandra;

import info.archinnov.achilles.generated.ManagerFactory;
import info.archinnov.achilles.generated.ManagerFactoryBuilder;
import info.archinnov.achilles.generated.manager.NameDO_Manager;

public class CqlDriverConfig {

	//private PersistenceManager persistenceManager;
		private ManagerFactory managerFactory;
		
		private ClusterBuilder clusterBuilder;
	    private CqlConfig cqlConfig;

		public CqlDriverConfig(CqlConfig cqlConfig, ClusterBuilder clusterBuilder) {
	        
			this.cqlConfig = cqlConfig;
			this.clusterBuilder = clusterBuilder;
			init(clusterBuilder, cqlConfig);

		}

		private void init(ClusterBuilder clusterBuilder, CqlConfig cqlConfig) {
			try {
				

//				final PersistenceManagerFactory persistenceManagerFactory =
	//
//						PersistenceManagerFactory.PersistenceManagerFactoryBuilder.builder(clusterBuilder.getCluster())
//								.withNativeSession(clusterBuilder.getSession())
//								.withEntityPackages(cqlConfig.getEntityPackages())
//								.withKeyspaceName(cqlConfig.getKeySpace()).build();
	//
//				persistenceManager = persistenceManagerFactory.createPersistenceManager();
				
				ManagerFactory managerFactory = ManagerFactoryBuilder
			            .builder(clusterBuilder.getCluster()).withDefaultKeyspaceName(cqlConfig.getKeySpace()).withNativeSession(clusterBuilder.getSession())
			            .withExecutorServiceMinThreadCount(5)
			            .withExecutorServiceMaxThreadCount(10).doForceSchemaCreation(false).build();
				
				//NameDO_Manager manager = managerFactory.forNameDO();

				
//				Cluster cluster = Cluster.builder()....build();
//			    ManagerFactory managerFactory = ManagerFactoryBuilder
//			        .builder(cluster)
//			        .withDefaultKeyspaceName("Test Keyspace")
//			        .doForceSchemaCreation(true)
//			        .build();
//			    
			} catch (Exception exception) {
				exception.printStackTrace();
			}

		}

//		public PersistenceManager getPersistenceManager() {
//			return persistenceManager;
//		}
		
		public ManagerFactory getManagerFactory(){
			
			return managerFactory;
		}

	}
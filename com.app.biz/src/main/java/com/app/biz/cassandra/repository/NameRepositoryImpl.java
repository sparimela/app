package com.app.biz.cassandra.repository;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.app.biz.cassandra.CqlDAO;
import com.app.domain.NameDO;

import info.archinnov.achilles.generated.ManagerFactory;
import info.archinnov.achilles.generated.manager.NameDO_Manager;

@Repository("nameRepository")
public class NameRepositoryImpl implements NameRepository{
	
	@Resource(name = "nameNoSqlDAO")
	private CqlDAO<Object, NameDO> nameNoSqlDAO;

	public void update(NameDO nameDO) {
		ManagerFactory managerFactory = nameNoSqlDAO.update(nameDO);		
		NameDO_Manager manager = managerFactory.forNameDO();
		manager
        .crud()
        .insert(nameDO)
        .execute();		
	}

}

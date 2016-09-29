package info.archinnov.achilles.generated.manager;

import com.app.domain.NameDO;
import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.RegularStatement;
import info.archinnov.achilles.generated.dsl.NameDO_Delete;
import info.archinnov.achilles.generated.dsl.NameDO_Select;
import info.archinnov.achilles.generated.dsl.NameDO_Update;
import info.archinnov.achilles.generated.meta.entity.NameDO_AchillesMeta;
import info.archinnov.achilles.internals.query.crud.DeleteWithOptions;
import info.archinnov.achilles.internals.query.crud.FindWithOptions;
import info.archinnov.achilles.internals.query.crud.InsertWithOptions;
import info.archinnov.achilles.internals.query.raw.NativeQuery;
import info.archinnov.achilles.internals.query.typed.TypedQuery;
import info.archinnov.achilles.internals.runtime.AbstractManager;
import info.archinnov.achilles.internals.runtime.RuntimeEngine;
import info.archinnov.achilles.validation.Validator;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class NameDO_Manager extends AbstractManager<NameDO> {
  public final NameDO_AchillesMeta meta;

  public NameDO_Manager(final Class<NameDO> entityClass, final NameDO_AchillesMeta meta, final RuntimeEngine rte) {
    super(entityClass, meta, rte);
    this.meta = meta;
  }

  /**
   * Provide CRUD operations: <br/> 
   * <ul>
   *    <li>FIND BY ID</li>
   *    <li>INSERT</li>
   *    <li>INSERT IF NOT EXISTS</li>
   *    <li>DELETE BY ID</li>
   *    <li>DELETE BY ID IF NOT EXISTS</li>
   *    <li>DELETE BY PARTITION</li>
   * </ul>
   */
  public final NameDO_CRUD crud() {
    return new NameDO_CRUD();
  }

  /**
   * Provide DSL methods: <br/>
   * <ul>
   *    <li>SELECT</li>
   *    <li>ITERATION ON SELECT</li>
   *    <li>UPDATE</li>
   *    <li>DELETE</li>
   * </ul>
   */
  public final NameDO_DSL dsl() {
    return new NameDO_DSL();
  }

  /**
   * Provide QUERY methods: <br/>
   * <ul>
   *    <li>Typed Queries (for SELECT only)</li>
   *    <li>Native Queries (for any kind of statement)</li>
   * </ul>
   */
  public final NameDO_QUERY query() {
    return new NameDO_QUERY();
  }

  public final class NameDO_CRUD {
    /**
     * Find an entity by its complete primary key@param last partition key 'last'@return FindWithOptions<NameDO> */
    public FindWithOptions<NameDO> findById(final String last) {
      List<Object> keys = new ArrayList<>();
      List<Object> encodedKeys = new ArrayList<>();
      Validator.validateNotNull(last, "Partition key '%s' should not be null", "last");
      keys.add(last);
      encodedKeys.add(NameDO_AchillesMeta.last.encodeFromJava(last));
      final Object[] primaryKeyValues = keys.toArray();
      final Object[] encodedPrimaryKeyValues = encodedKeys.toArray();
      return new FindWithOptions<NameDO>(entityClass, meta, rte, primaryKeyValues, encodedPrimaryKeyValues);
    }

    /**
     * Delete an entity instance by extracting its primary keyRemark: <strong>Achilles will throw an exception if any column being part of the primary key is NULL</strong>@param an instance of NameDO to be delete@return DeleteWithOptions<NameDO> */
    public DeleteWithOptions<NameDO> delete(final NameDO instance) {
      return deleteInternal(instance);
    }

    /**
     * Delete an entity using its complete primary key@param last partition key 'last'@return DeleteWithOptions<NameDO> */
    public DeleteWithOptions<NameDO> deleteById(final String last) {
      List<Object> keys = new ArrayList<>();
      List<Object> encodedKeys = new ArrayList<>();
      Validator.validateNotNull(last, "Partition key '%s' should not be null", "last");
      keys.add(last);
      encodedKeys.add(NameDO_AchillesMeta.last.encodeFromJava(last));
      final Object[] partitionKeysValues = keys.toArray();
      final Object[] encodedPartitionKeyValues = encodedKeys.toArray();
      return new DeleteWithOptions<NameDO>(entityClass, meta, rte, partitionKeysValues, encodedPartitionKeyValues, Optional.empty());
    }

    /**
     * Insert this entity@param instance an instance of NameDO@return InsertWithOptions<NameDO> */
    public final InsertWithOptions<NameDO> insert(final NameDO instance) {
      return insertInternal(instance);
    }
  }

  public final class NameDO_DSL {
    /**
     * Generate a <strong>SELECT</strong> statement@return NameDO_Select */
    public final NameDO_Select select() {
      return new NameDO_Select(rte, meta);
    }

    /**
     * Generate a <strong>DELETE</strong> statement@return NameDO_Delete */
    public final NameDO_Delete delete() {
      return new NameDO_Delete(rte, meta);
    }

    /**
     * Generate an <strong>UPDATE</strong> statement@return NameDO_Update */
    public final NameDO_Update update() {
      return new NameDO_Update(rte, meta);
    }
  }

  public final class NameDO_QUERY {
    /**
     * Execute the bound statement and map the result back into an instance of NameDO <br/>
     * Remark: the bound statement should be a <strong>SELECT</strong> statement@param boundStatement a bound statement@return TypedQuery<NameDO> */
    public final TypedQuery<NameDO> typedQueryForSelect(BoundStatement boundStatement) {
      return typedQueryForSelectInternal(boundStatement);
    }

    /**
     * Execute the prepared statement and map the result back into an instance of NameDO <br/>
     * Remark: the prepared statement should be a <strong>SELECT</strong> statement@param preparedStatement a prepared statement@return TypedQuery<NameDO> */
    public final TypedQuery<NameDO> typedQueryForSelect(PreparedStatement preparedStatement, Object... encodedBoundValues) {
      return typedQueryForSelectInternal(preparedStatement, encodedBoundValues);
    }

    /**
     * Execute the regular statement and map the result back into an instance of NameDO <br/>
     * Remark: the regular statement should be a <strong>SELECT</strong> statement@param regularStatement a regular statement@return TypedQuery<NameDO> */
    public final TypedQuery<NameDO> typedQueryForSelect(RegularStatement regularStatement, Object... encodedBoundValues) {
      return typedQueryForSelectInternal(regularStatement, encodedBoundValues);
    }

    /**
     * Execute the native bound statement@param boundStatement a bound statement@return NativeQuery */
    public final NativeQuery nativeQuery(BoundStatement boundStatement) {
      return nativeQueryInternal(boundStatement);
    }

    /**
     * Execute the native prepared statement@param preparedStatement a prepared statement@return NativeQuery */
    public final NativeQuery nativeQuery(PreparedStatement preparedStatement, Object... encodedBoundValues) {
      return nativeQueryInternal(preparedStatement, encodedBoundValues);
    }

    /**
     * Execute the native regular statement@param regularStatement a regular statement@return NativeQuery */
    public final NativeQuery nativeQuery(RegularStatement regularStatement, Object... encodedBoundValues) {
      return nativeQueryInternal(regularStatement, encodedBoundValues);
    }
  }
}

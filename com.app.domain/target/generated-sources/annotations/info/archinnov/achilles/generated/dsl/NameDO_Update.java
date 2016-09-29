package info.archinnov.achilles.generated.dsl;

import com.app.domain.NameDO;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Update;
import info.archinnov.achilles.generated.meta.entity.NameDO_AchillesMeta;
import info.archinnov.achilles.internals.metamodel.AbstractEntityProperty;
import info.archinnov.achilles.internals.options.Options;
import info.archinnov.achilles.internals.query.dsl.update.AbstractUpdate;
import info.archinnov.achilles.internals.query.dsl.update.AbstractUpdateColumns;
import info.archinnov.achilles.internals.query.dsl.update.AbstractUpdateEnd;
import info.archinnov.achilles.internals.query.dsl.update.AbstractUpdateFrom;
import info.archinnov.achilles.internals.query.dsl.update.AbstractUpdateWhere;
import info.archinnov.achilles.internals.runtime.RuntimeEngine;
import info.archinnov.achilles.type.SchemaNameProvider;
import info.archinnov.achilles.validation.Validator;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;

public final class NameDO_Update extends AbstractUpdate {
  protected final NameDO_AchillesMeta meta;

  protected final Class<NameDO> entityClass = NameDO.class;

  public NameDO_Update(RuntimeEngine rte, NameDO_AchillesMeta meta) {
    super(rte);
    this.meta = meta;
  }

  /**
   * Generate an UPDATE <strong>FROM</strong> ... */
  public final NameDO_Update.NameDO_UpdateFrom fromBaseTable() {
    final String currentKeyspace = meta.getKeyspace().orElse("unknown_keyspace_for_" + meta.entityClass.getCanonicalName());
    final Update.Where where = QueryBuilder.update(currentKeyspace, meta.getTableOrViewName()).where();
    return new NameDO_Update.NameDO_UpdateFrom(where);
  }

  /**
   * Generate an UPDATE <strong>FROM</strong> ... using the given SchemaNameProvider */
  public final NameDO_Update.NameDO_UpdateFrom from(final SchemaNameProvider schemaNameProvider) {
    final String currentKeyspace = lookupKeyspace(schemaNameProvider, meta.entityClass);
    final String currentTable = lookupTable(schemaNameProvider, meta.entityClass);
    final Update.Where where = QueryBuilder.update(currentKeyspace, currentTable).where();
    return new NameDO_Update.NameDO_UpdateFrom(where);
  }

  public class NameDO_UpdateColumns extends AbstractUpdateColumns {
    NameDO_UpdateColumns(Update.Where where) {
      super(where);
    }

    public final NameDO_Update.NameDO_UpdateWhere_Last where() {
      return new NameDO_Update.NameDO_UpdateWhere_Last(where);
    }
  }

  public class NameDO_UpdateFrom extends AbstractUpdateFrom {
    NameDO_UpdateFrom(Update.Where where) {
      super(where);
    }
  }

  public final class NameDO_UpdateWhere_Last extends AbstractUpdateWhere {
    public NameDO_UpdateWhere_Last(Update.Where where) {
      super(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last = ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Update.NameDO_UpdateEnd last_Eq(String last) {
      where.and(QueryBuilder.eq("last", QueryBuilder.bindMarker("last_Eq")));
      boundValues.add(last);
      encodedValues.add(meta.last.encodeFromJava(last));
      return new NameDO_Update.NameDO_UpdateEnd(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last IN ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Update.NameDO_UpdateEnd last_IN(String... last) {
      Validator.validateTrue(ArrayUtils.isNotEmpty(last), "Varargs for field '%s' should not be null/empty", "last");
      where.and(QueryBuilder.in("last",QueryBuilder.bindMarker("last")));
      final List<Object> varargs = Arrays.<Object>asList((Object[])last);
      final List<Object> encodedVarargs = Arrays.<String>stream((String[])last).map(x -> meta.last.encodeFromJava(x)).collect(Collectors.toList());
      boundValues.add(varargs);
      encodedValues.add(encodedVarargs);
      return new NameDO_Update.NameDO_UpdateEnd(where);
    }
  }

  public final class NameDO_UpdateEnd extends AbstractUpdateEnd<NameDO_Update.NameDO_UpdateEnd, NameDO> {
    public NameDO_UpdateEnd(Update.Where where) {
      super(where);
    }

    @Override
    protected final Class<NameDO> getEntityClass() {
      return entityClass;
    }

    @Override
    protected final AbstractEntityProperty<NameDO> getMetaInternal() {
      return meta;
    }

    @Override
    protected final RuntimeEngine getRte() {
      return rte;
    }

    @Override
    protected final Options getOptions() {
      return options;
    }

    @Override
    protected final List<Object> getBoundValuesInternal() {
      return boundValues;
    }

    @Override
    protected final List<Object> getEncodedValuesInternal() {
      return encodedValues;
    }

    @Override
    protected final NameDO_Update.NameDO_UpdateEnd getThis() {
      return this;
    }
  }
}

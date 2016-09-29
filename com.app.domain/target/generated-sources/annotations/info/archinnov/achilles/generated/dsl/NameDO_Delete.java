package info.archinnov.achilles.generated.dsl;

import com.app.domain.NameDO;
import com.datastax.driver.core.querybuilder.Delete;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import info.archinnov.achilles.generated.meta.entity.NameDO_AchillesMeta;
import info.archinnov.achilles.internals.metamodel.AbstractEntityProperty;
import info.archinnov.achilles.internals.options.Options;
import info.archinnov.achilles.internals.query.dsl.delete.AbstractDelete;
import info.archinnov.achilles.internals.query.dsl.delete.AbstractDeleteColumns;
import info.archinnov.achilles.internals.query.dsl.delete.AbstractDeleteEnd;
import info.archinnov.achilles.internals.query.dsl.delete.AbstractDeleteFrom;
import info.archinnov.achilles.internals.query.dsl.delete.AbstractDeleteWherePartition;
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

public final class NameDO_Delete extends AbstractDelete {
  protected final NameDO_AchillesMeta meta;

  protected final Class<NameDO> entityClass = NameDO.class;

  public NameDO_Delete(RuntimeEngine rte, NameDO_AchillesMeta meta) {
    super(rte);
    this.meta = meta;
  }

  /**
   * Generate ... * FROM ... */
  public final NameDO_Delete.NameDO_DeleteFrom allColumns_FromBaseTable() {
    final Delete.Where where = delete.all().from(meta.getKeyspace().orElse("unknown_keyspace_for_" + meta.entityClass.getCanonicalName()), meta.getTableOrViewName()).where();
    return new NameDO_Delete.NameDO_DeleteFrom(where);
  }

  /**
   * Generate ... * FROM ... using the given SchemaNameProvider */
  public final NameDO_Delete.NameDO_DeleteFrom allColumns_From(final SchemaNameProvider schemaNameProvider) {
    final String currentKeyspace = lookupKeyspace(schemaNameProvider, meta.entityClass);
    final String currentTable = lookupTable(schemaNameProvider, meta.entityClass);
    final Delete.Where where = delete.all().from(currentKeyspace, currentTable).where();
    return new NameDO_Delete.NameDO_DeleteFrom(where);
  }

  public class NameDO_DeleteColumns extends AbstractDeleteColumns {
    NameDO_DeleteColumns(Delete.Selection deleteColumns) {
      super(deleteColumns);
    }

    /**
     * Generate a ... <strong>FROM xxx</strong> ...  */
    public final NameDO_Delete.NameDO_DeleteFrom fromBaseTable() {
      final Delete.Where where = deleteColumns.from(meta.getKeyspace().orElse("unknown_keyspace_for_" + meta.entityClass.getCanonicalName()), meta.getTableOrViewName()).where();
      return new NameDO_Delete.NameDO_DeleteFrom(where);
    }

    /**
     * Generate a ... <strong>FROM xxx</strong> ... using the given SchemaNameProvider */
    public final NameDO_Delete.NameDO_DeleteFrom from(final SchemaNameProvider schemaNameProvider) {
      final String currentKeyspace = lookupKeyspace(schemaNameProvider, meta.entityClass);
      final String currentTable = lookupTable(schemaNameProvider, meta.entityClass);
      final Delete.Where where = deleteColumns.from(currentKeyspace, currentTable).where();
      return new NameDO_Delete.NameDO_DeleteFrom(where);
    }
  }

  public class NameDO_DeleteFrom extends AbstractDeleteFrom {
    NameDO_DeleteFrom(Delete.Where where) {
      super(where);
    }

    public final NameDO_Delete.NameDO_DeleteWhere_Last where() {
      return new NameDO_Delete.NameDO_DeleteWhere_Last(where);
    }
  }

  public final class NameDO_DeleteWhere_Last extends AbstractDeleteWherePartition {
    public NameDO_DeleteWhere_Last(Delete.Where where) {
      super(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last = ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Delete.NameDO_DeleteEnd last_Eq(String last) {
      where.and(QueryBuilder.eq("last", QueryBuilder.bindMarker("last_Eq")));
      boundValues.add(last);
      encodedValues.add(meta.last.encodeFromJava(last));
      return new NameDO_Delete.NameDO_DeleteEnd(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last IN ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Delete.NameDO_DeleteEnd last_IN(String... last) {
      Validator.validateTrue(ArrayUtils.isNotEmpty(last), "Varargs for field '%s' should not be null/empty", "last");
      where.and(QueryBuilder.in("last",QueryBuilder.bindMarker("last")));
      final List<Object> varargs = Arrays.<Object>asList((Object[])last);
      final List<Object> encodedVarargs = Arrays.<String>stream((String[])last).map(x -> meta.last.encodeFromJava(x)).collect(Collectors.toList());
      boundValues.add(varargs);
      encodedValues.add(encodedVarargs);
      return new NameDO_Delete.NameDO_DeleteEnd(where);
    }
  }

  public final class NameDO_DeleteEnd extends AbstractDeleteEnd<NameDO_Delete.NameDO_DeleteEnd, NameDO> {
    public NameDO_DeleteEnd(Delete.Where where) {
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
    protected final NameDO_Delete.NameDO_DeleteEnd getThis() {
      return this;
    }
  }
}

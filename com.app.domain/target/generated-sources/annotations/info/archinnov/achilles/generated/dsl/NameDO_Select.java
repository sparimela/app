package info.archinnov.achilles.generated.dsl;

import com.app.domain.NameDO;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import info.archinnov.achilles.generated.meta.entity.NameDO_AchillesMeta;
import info.archinnov.achilles.internals.metamodel.AbstractEntityProperty;
import info.archinnov.achilles.internals.options.Options;
import info.archinnov.achilles.internals.query.dsl.select.AbstractSelect;
import info.archinnov.achilles.internals.query.dsl.select.AbstractSelectColumns;
import info.archinnov.achilles.internals.query.dsl.select.AbstractSelectFrom;
import info.archinnov.achilles.internals.query.dsl.select.AbstractSelectWhere;
import info.archinnov.achilles.internals.query.dsl.select.AbstractSelectWherePartition;
import info.archinnov.achilles.internals.runtime.RuntimeEngine;
import info.archinnov.achilles.type.SchemaNameProvider;
import info.archinnov.achilles.validation.Validator;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ArrayUtils;

public final class NameDO_Select extends AbstractSelect {
  protected final NameDO_AchillesMeta meta;

  protected final Class<NameDO> entityClass = NameDO.class;

  public NameDO_Select(RuntimeEngine rte, NameDO_AchillesMeta meta) {
    super(rte);
    this.meta = meta;
  }

  /**
   * Generate a SELECT ... <strong>last</strong> ... */
  public final NameDO_Select.NameDO_SelectColumns last() {
    select.column("last");
    return new NameDO_Select.NameDO_SelectColumns(select);
  }

  /**
   * Generate ... * FROM ... */
  public final NameDO_Select.NameDO_SelectFrom allColumns_FromBaseTable() {
    final Select.Where where = select.all().from(meta.getKeyspace().orElse("unknown_keyspace_for_" + meta.entityClass.getCanonicalName()), meta.getTableOrViewName()).where();
    return new NameDO_Select.NameDO_SelectFrom(where);
  }

  /**
   * Generate ... * FROM ... using the given SchemaNameProvider */
  public final NameDO_Select.NameDO_SelectFrom allColumns_From(final SchemaNameProvider schemaNameProvider) {
    final String currentKeyspace = lookupKeyspace(schemaNameProvider, meta.entityClass);
    final String currentTable = lookupTable(schemaNameProvider, meta.entityClass);
    final Select.Where where = select.all().from(currentKeyspace, currentTable).where();
    return new NameDO_Select.NameDO_SelectFrom(where);
  }

  public class NameDO_SelectColumns extends AbstractSelectColumns {
    public NameDO_SelectColumns(Select.Selection selection) {
      super(selection);
    }

    /**
     * Generate a SELECT ... <strong>last</strong> ... */
    public final NameDO_Select.NameDO_SelectColumns last() {
      selection.column("last");
      return this;
    }

    /**
     * Generate a ... <strong>FROM xxx</strong> ...  */
    public final NameDO_Select.NameDO_SelectFrom fromBaseTable() {
      final Select.Where where = selection.from(meta.getKeyspace().orElse("unknown_keyspace_for_" + meta.entityClass.getCanonicalName()), meta.getTableOrViewName()).where();
      return new NameDO_Select.NameDO_SelectFrom(where);
    }

    /**
     * Generate a ... <strong>FROM xxx</strong> ... using the given SchemaNameProvider */
    public final NameDO_Select.NameDO_SelectFrom from(final SchemaNameProvider schemaNameProvider) {
      final String currentKeyspace = lookupKeyspace(schemaNameProvider, meta.entityClass);
      final String currentTable = lookupTable(schemaNameProvider, meta.entityClass);
      final Select.Where where = selection.from(currentKeyspace, currentTable).where();
      return new NameDO_Select.NameDO_SelectFrom(where);
    }
  }

  public class NameDO_SelectFrom extends AbstractSelectFrom {
    NameDO_SelectFrom(Select.Where where) {
      super(where);
    }

    /**
     * Generate a SELECT ... FROM ... <strong>WHERE</strong> ... */
    public final NameDO_Select.NameDO_SelectWhere_Last where() {
      return new NameDO_Select.NameDO_SelectWhere_Last(where);
    }

    /**
     * Generate a SELECT statement <strong>without</strong> the <strong>WHERE</strong> clause */
    public final NameDO_Select.NameDO_SelectEnd without_WHERE_Clause() {
      return new NameDO_Select.NameDO_SelectEnd(where);
    }
  }

  public final class NameDO_SelectWhere_Last extends AbstractSelectWherePartition {
    public NameDO_SelectWhere_Last(Select.Where where) {
      super(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last = ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Select.NameDO_SelectEnd last_Eq(String last) {
      where.and(QueryBuilder.eq("last", QueryBuilder.bindMarker("last_Eq")));
      boundValues.add(last);
      encodedValues.add(meta.last.encodeFromJava(last));
      return new NameDO_Select.NameDO_SelectEnd(where);
    }

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>last IN ?</strong> */
    @SuppressWarnings("static-access")
    public final NameDO_Select.NameDO_SelectEnd last_IN(String... last) {
      Validator.validateTrue(ArrayUtils.isNotEmpty(last), "Varargs for field '%s' should not be null/empty", "last");
      where.and(QueryBuilder.in("last",QueryBuilder.bindMarker("last")));
      final List<Object> varargs = Arrays.<Object>asList((Object[])last);
      final List<Object> encodedVarargs = Arrays.<String>stream((String[])last).map(x -> meta.last.encodeFromJava(x)).collect(Collectors.toList());
      boundValues.add(varargs);
      encodedValues.add(encodedVarargs);
      return new NameDO_Select.NameDO_SelectEnd(where);
    }
  }

  public final class NameDO_SelectEnd extends AbstractSelectWhere<NameDO_Select.NameDO_SelectEnd, NameDO> {
    public NameDO_SelectEnd(Select.Where where) {
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

    /**
     * Generate a SELECT ... FROM ... WHERE ... <strong>LIMIT :limit</strong> */
    public final NameDO_Select.NameDO_SelectEnd limit(final Integer limit) {
      where.limit(QueryBuilder.bindMarker("lim"));
      boundValues.add(limit);
      encodedValues.add(limit);
      return this;
    }

    @Override
    protected final NameDO_Select.NameDO_SelectEnd getThis() {
      return this;
    }
  }
}

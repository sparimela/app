package info.archinnov.achilles.generated.meta.entity;

import com.app.domain.NameDO;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.DataType;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.reflect.TypeToken;
import info.archinnov.achilles.internals.apt.annotations.AchillesMeta;
import info.archinnov.achilles.internals.codec.FallThroughCodec;
import info.archinnov.achilles.internals.metamodel.AbstractEntityProperty;
import info.archinnov.achilles.internals.metamodel.AbstractProperty;
import info.archinnov.achilles.internals.metamodel.SimpleProperty;
import info.archinnov.achilles.internals.metamodel.columns.ColumnType;
import info.archinnov.achilles.internals.metamodel.columns.FieldInfo;
import info.archinnov.achilles.internals.metamodel.columns.PartitionKeyInfo;
import info.archinnov.achilles.internals.metamodel.index.IndexInfo;
import info.archinnov.achilles.internals.strategy.naming.InternalNamingStrategy;
import info.archinnov.achilles.type.strategy.InsertStrategy;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Meta class of all entities of type NameDO<br/>
 * The meta class is responsible for<br/>
 * <ul>
 *    <li>determining runtime consistency levels (read/write,serial)<li/>
 *    <li>determining runtime insert strategy<li/>
 *    <li>trigger event interceptors (if any)<li/>
 *    <li>map a com.datastax.driver.core.Row back to an instance of NameDO<li/>
 *    <li>determine runtime keyspace name using static annotations and runtime SchemaNameProvider (if any)<li/>
 *    <li>determine runtime table name using static annotations and runtime SchemaNameProvider (if any)<li/>
 *    <li>generate schema during bootstrap<li/>
 *    <li>validate schema during bootstrap<li/>
 *    <li>expose all property meta classes for encoding/decoding purpose on unitary columns<li/>
 * <ul/>
 */
@AchillesMeta
public final class NameDO_AchillesMeta extends AbstractEntityProperty<NameDO> {
  /**
   * Meta class for 'last' property <br/>
   * The meta class exposes some useful methods: <ul>
   *    <li>encodeFromJava: encode a property from raw Java to CQL java compatible type </li>
   *    <li>encodeField: extract the current property value from the given NameDO instance and encode to CQL java compatible type </li>
   *    <li>decodeFromGettable: decode from a {@link com.datastax.driver.core.GettableData} instance (Row, UDTValue, TupleValue) the current property</li>
   * </ul>
   */
  @SuppressWarnings("serial")
  public static final SimpleProperty<NameDO, String, String> last = new SimpleProperty<NameDO, String, String>(new FieldInfo<>((NameDO entity$) -> entity$.getLast(), (NameDO entity$, String value$) -> entity$.setLast(value$), "last", "last", ColumnType.PARTITION, new PartitionKeyInfo(1, false), IndexInfo.noIndex()), DataType.text(), gettableData$ -> gettableData$.get("last", java.lang.String.class), (settableData$, value$) -> settableData$.set("last", value$, java.lang.String.class), new TypeToken<String>(){}, new TypeToken<String>(){}, new FallThroughCodec<>(String.class));

  @Override
  protected Class<NameDO> getEntityClass() {
    return NameDO.class;
  }

  @Override
  protected String getDerivedTableOrViewName() {
    return "namedo";
  }

  @Override
  protected BiMap<String, String> fieldNameToCqlColumn() {
    BiMap<String,String> map = HashBiMap.create(1);
    map.put("last", "last");
    return map;
  }

  @Override
  protected Optional<ConsistencyLevel> getStaticReadConsistency() {
    return Optional.empty();
  }

  @Override
  protected Optional<InternalNamingStrategy> getStaticNamingStrategy() {
    return Optional.empty();
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getPartitionKeys() {
    return Arrays.asList(last);
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getClusteringColumns() {
    return Arrays.asList();
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getNormalColumns() {
    return Arrays.asList();
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getComputedColumns() {
    return Arrays.asList();
  }

  @Override
  protected boolean isCounterTable() {
    return false;
  }

  @Override
  protected Optional<String> getStaticKeyspace() {
    return Optional.empty();
  }

  @Override
  protected Optional<String> getStaticTableOrViewName() {
    return Optional.of("name");
  }

  @Override
  protected Optional<ConsistencyLevel> getStaticWriteConsistency() {
    return Optional.empty();
  }

  @Override
  protected Optional<ConsistencyLevel> getStaticSerialConsistency() {
    return Optional.empty();
  }

  @Override
  protected Optional<Integer> getStaticTTL() {
    return Optional.empty();
  }

  @Override
  protected Optional<InsertStrategy> getStaticInsertStrategy() {
    return Optional.empty();
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getStaticColumns() {
    return Arrays.asList();
  }

  @Override
  protected List<AbstractProperty<NameDO, ?, ?>> getCounterColumns() {
    return Arrays.asList();
  }
}

package info.archinnov.achilles.generated;

import com.app.domain.NameDO;
import com.datastax.driver.core.Cluster;
import info.archinnov.achilles.generated.manager.NameDO_Manager;
import info.archinnov.achilles.generated.meta.entity.NameDO_AchillesMeta;
import info.archinnov.achilles.internals.context.ConfigurationContext;
import info.archinnov.achilles.internals.metamodel.AbstractUDTClassProperty;
import info.archinnov.achilles.internals.runtime.AbstractManagerFactory;
import java.lang.Override;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class ManagerFactory extends AbstractManagerFactory {
  private final NameDO_AchillesMeta nameDO_AchillesMeta = new NameDO_AchillesMeta();

  private final NameDO_Manager nameDO_Manager = new NameDO_Manager(NameDO.class, nameDO_AchillesMeta, rte);

  public ManagerFactory(final Cluster cluster, final ConfigurationContext configContext) {
    super(cluster, configContext);
    this.entityProperties = Arrays.asList(nameDO_AchillesMeta);
    this.entityClasses = this.entityProperties.stream().map(x -> x.entityClass).collect(Collectors.toList());
    bootstrap();
  }

  /**
   * Create a Manager for entity class NameDO
   * @return NameDO_Manager */
  public final NameDO_Manager forNameDO() {
    return nameDO_Manager;
  }

  @Override
  protected final List<AbstractUDTClassProperty<?>> getUdtClassProperties() {
    final List<AbstractUDTClassProperty<?>> list = new ArrayList<>();
    return list;
  }
}

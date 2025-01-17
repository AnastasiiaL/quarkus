package io.quarkus.extest.deployment;

import java.util.Map;

import io.smallrye.config.PropertiesConfigSource;
import io.smallrye.config.SmallRyeConfigBuilder;
import io.smallrye.config.SmallRyeConfigBuilderCustomizer;

public class BuildTimeCustomConfigBuilder implements SmallRyeConfigBuilderCustomizer {
    @Override
    public void configBuilder(final SmallRyeConfigBuilder builder) {
        builder.withSources(
                new PropertiesConfigSource(Map.of("prop.recorded.from.btconfigsource", "1234"), "BuildTimeConfigSource", 100));
    }
}

package se.vermiculus.kafdrop.spi;

import org.apache.kafka.common.serialization.Deserializer;

public interface ExternalDeserializerFactory {
    Deserializer<Object> getDeserializer(String topicName);

    boolean supportsTopic(String topicName);

}

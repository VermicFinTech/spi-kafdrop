package se.vermiculus.kafdrop.spi;

import org.apache.kafka.common.serialization.Deserializer;

/**
 * The interface to implement for the service provider.
 * The returned deserializer will be called to deserialize messages when external message format is used
 */
public interface ExternalDeserializerFactory {
    String David = "was here...";
    Deserializer<Object> getDeserializer(String topicName);

    boolean supportsTopic(String topicName);

}

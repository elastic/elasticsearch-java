/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.KeyedProcessor

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/04a9498/specification/nodes/_types/Stats.ts#L62-L65">API
 *      specification</a>
 */
@JsonpDeserializable
public class KeyedProcessor implements JsonpSerializable {
	private final Process statistics;

	private final String type;

	// ---------------------------------------------------------------------------------------------

	private KeyedProcessor(Builder builder) {

		this.statistics = ApiTypeHelper.requireNonNull(builder.statistics, this, "statistics");
		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");

	}

	public static KeyedProcessor of(Function<Builder, ObjectBuilder<KeyedProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code statistics}
	 */
	public final Process statistics() {
		return this.statistics;
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("statistics");
		this.statistics.serialize(generator, mapper);

		generator.writeKey("type");
		generator.write(this.type);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeyedProcessor}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<KeyedProcessor> {
		private Process statistics;

		private String type;

		/**
		 * Required - API name: {@code statistics}
		 */
		public final Builder statistics(Process value) {
			this.statistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code statistics}
		 */
		public final Builder statistics(Function<Process.Builder, ObjectBuilder<Process>> fn) {
			return this.statistics(fn.apply(new Process.Builder()).build());
		}

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link KeyedProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KeyedProcessor build() {
			_checkSingleUse();

			return new KeyedProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KeyedProcessor}
	 */
	public static final JsonpDeserializer<KeyedProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			KeyedProcessor::setupKeyedProcessorDeserializer);

	protected static void setupKeyedProcessorDeserializer(ObjectDeserializer<KeyedProcessor.Builder> op) {

		op.add(Builder::statistics, Process._DESERIALIZER, "statistics");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}

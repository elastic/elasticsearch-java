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
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.KeyedProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.KeyedProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class KeyedProcessor implements JsonpSerializable {
	@Nullable
	private final Processor stats;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	private KeyedProcessor(Builder builder) {

		this.stats = builder.stats;
		this.type = builder.type;

	}

	public static KeyedProcessor of(Function<Builder, ObjectBuilder<KeyedProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code stats}
	 */
	@Nullable
	public final Processor stats() {
		return this.stats;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
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

		if (this.stats != null) {
			generator.writeKey("stats");
			this.stats.serialize(generator, mapper);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link KeyedProcessor}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<KeyedProcessor> {
		@Nullable
		private Processor stats;

		@Nullable
		private String type;

		/**
		 * API name: {@code stats}
		 */
		public final Builder stats(@Nullable Processor value) {
			this.stats = value;
			return this;
		}

		/**
		 * API name: {@code stats}
		 */
		public final Builder stats(Function<Processor.Builder, ObjectBuilder<Processor>> fn) {
			return this.stats(fn.apply(new Processor.Builder()).build());
		}

		/**
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
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

		op.add(Builder::stats, Processor._DESERIALIZER, "stats");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}

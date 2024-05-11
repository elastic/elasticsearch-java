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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes._types.GarbageCollector

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.GarbageCollector">API
 *      specification</a>
 */
@JsonpDeserializable
public class GarbageCollector implements JsonpSerializable {
	private final Map<String, GarbageCollectorTotal> collectors;

	// ---------------------------------------------------------------------------------------------

	private GarbageCollector(Builder builder) {

		this.collectors = ApiTypeHelper.unmodifiable(builder.collectors);

	}

	public static GarbageCollector of(Function<Builder, ObjectBuilder<GarbageCollector>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code collectors}
	 */
	public final Map<String, GarbageCollectorTotal> collectors() {
		return this.collectors;
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

		if (ApiTypeHelper.isDefined(this.collectors)) {
			generator.writeKey("collectors");
			generator.writeStartObject();
			for (Map.Entry<String, GarbageCollectorTotal> item0 : this.collectors.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GarbageCollector}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GarbageCollector> {
		@Nullable
		private Map<String, GarbageCollectorTotal> collectors;

		/**
		 * API name: {@code collectors}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>collectors</code>.
		 */
		public final Builder collectors(Map<String, GarbageCollectorTotal> map) {
			this.collectors = _mapPutAll(this.collectors, map);
			return this;
		}

		/**
		 * API name: {@code collectors}
		 * <p>
		 * Adds an entry to <code>collectors</code>.
		 */
		public final Builder collectors(String key, GarbageCollectorTotal value) {
			this.collectors = _mapPut(this.collectors, key, value);
			return this;
		}

		/**
		 * API name: {@code collectors}
		 * <p>
		 * Adds an entry to <code>collectors</code> using a builder lambda.
		 */
		public final Builder collectors(String key,
				Function<GarbageCollectorTotal.Builder, ObjectBuilder<GarbageCollectorTotal>> fn) {
			return collectors(key, fn.apply(new GarbageCollectorTotal.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GarbageCollector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GarbageCollector build() {
			_checkSingleUse();

			return new GarbageCollector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GarbageCollector}
	 */
	public static final JsonpDeserializer<GarbageCollector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GarbageCollector::setupGarbageCollectorDeserializer);

	protected static void setupGarbageCollectorDeserializer(ObjectDeserializer<GarbageCollector.Builder> op) {

		op.add(Builder::collectors, JsonpDeserializer.stringMapDeserializer(GarbageCollectorTotal._DESERIALIZER),
				"collectors");

	}

}

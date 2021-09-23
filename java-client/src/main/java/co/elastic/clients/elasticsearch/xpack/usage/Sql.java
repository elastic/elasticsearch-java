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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.Sql
public final class Sql extends Base {
	private final Map<String, Number> features;

	private final Map<String, Query> queries;

	// ---------------------------------------------------------------------------------------------

	public Sql(Builder builder) {
		super(builder);

		this.features = Objects.requireNonNull(builder.features, "features");
		this.queries = Objects.requireNonNull(builder.queries, "queries");

	}

	/**
	 * API name: {@code features}
	 */
	public Map<String, Number> features() {
		return this.features;
	}

	/**
	 * API name: {@code queries}
	 */
	public Map<String, Query> queries() {
		return this.queries;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("features");
		generator.writeStartObject();
		for (Map.Entry<String, Number> item0 : this.features.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.write(item0.getValue().doubleValue());

		}
		generator.writeEnd();

		generator.writeKey("queries");
		generator.writeStartObject();
		for (Map.Entry<String, Query> item0 : this.queries.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Sql}.
	 */
	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Sql> {
		private Map<String, Number> features;

		private Map<String, Query> queries;

		/**
		 * API name: {@code features}
		 */
		public Builder features(Map<String, Number> value) {
			this.features = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #features(Map)}, creating the map if needed.
		 */
		public Builder putFeatures(String key, Number value) {
			if (this.features == null) {
				this.features = new HashMap<>();
			}
			this.features.put(key, value);
			return this;
		}

		/**
		 * API name: {@code queries}
		 */
		public Builder queries(Map<String, Query> value) {
			this.queries = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #queries(Map)}, creating the map if needed.
		 */
		public Builder putQueries(String key, Query value) {
			if (this.queries == null) {
				this.queries = new HashMap<>();
			}
			this.queries.put(key, value);
			return this;
		}

		/**
		 * Set {@link #queries(Map)} to a singleton map.
		 */
		public Builder queries(String key, Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.queries(Collections.singletonMap(key, fn.apply(new Query.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #queries(Map)}, creating the map if needed.
		 */
		public Builder putQueries(String key, Function<Query.Builder, ObjectBuilder<Query>> fn) {
			return this.putQueries(key, fn.apply(new Query.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Sql}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Sql build() {

			return new Sql(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Sql}
	 */
	public static final JsonpDeserializer<Sql> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Sql::setupSqlDeserializer);

	protected static void setupSqlDeserializer(DelegatingDeserializer<Sql.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::features, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.numberDeserializer()),
				"features");
		op.add(Builder::queries, JsonpDeserializer.stringMapDeserializer(Query.DESERIALIZER), "queries");

	}

}

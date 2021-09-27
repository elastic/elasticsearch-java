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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggestCollate
@JsonpDeserializable
public final class PhraseSuggestCollate implements JsonpSerializable {
	@Nullable
	private final Map<String, JsonData> params;

	@Nullable
	private final Boolean prune;

	private final PhraseSuggestCollateQuery query;

	// ---------------------------------------------------------------------------------------------

	public PhraseSuggestCollate(Builder builder) {

		this.params = builder.params;
		this.prune = builder.prune;
		this.query = Objects.requireNonNull(builder.query, "query");

	}

	/**
	 * API name: {@code params}
	 */
	@Nullable
	public Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code prune}
	 */
	@Nullable
	public Boolean prune() {
		return this.prune;
	}

	/**
	 * API name: {@code query}
	 */
	public PhraseSuggestCollateQuery query() {
		return this.query;
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

		if (this.params != null) {

			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.prune != null) {

			generator.writeKey("prune");
			generator.write(this.prune);

		}

		generator.writeKey("query");
		this.query.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestCollate}.
	 */
	public static class Builder implements ObjectBuilder<PhraseSuggestCollate> {
		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Boolean prune;

		private PhraseSuggestCollateQuery query;

		/**
		 * API name: {@code params}
		 */
		public Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #params(Map)}, creating the map if needed.
		 */
		public Builder putParams(String key, JsonData value) {
			if (this.params == null) {
				this.params = new HashMap<>();
			}
			this.params.put(key, value);
			return this;
		}

		/**
		 * API name: {@code prune}
		 */
		public Builder prune(@Nullable Boolean value) {
			this.prune = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(PhraseSuggestCollateQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<PhraseSuggestCollateQuery.Builder, ObjectBuilder<PhraseSuggestCollateQuery>> fn) {
			return this.query(fn.apply(new PhraseSuggestCollateQuery.Builder()).build());
		}

		/**
		 * Builds a {@link PhraseSuggestCollate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestCollate build() {

			return new PhraseSuggestCollate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggestCollate}
	 */
	public static final JsonpDeserializer<PhraseSuggestCollate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhraseSuggestCollate::setupPhraseSuggestCollateDeserializer, Builder::build);

	protected static void setupPhraseSuggestCollateDeserializer(
			DelegatingDeserializer<PhraseSuggestCollate.Builder> op) {

		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::prune, JsonpDeserializer.booleanDeserializer(), "prune");
		op.add(Builder::query, PhraseSuggestCollateQuery._DESERIALIZER, "query");

	}

}

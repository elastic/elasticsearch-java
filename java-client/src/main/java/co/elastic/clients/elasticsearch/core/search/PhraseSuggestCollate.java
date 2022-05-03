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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.json.JsonData;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.PhraseSuggestCollate

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.PhraseSuggestCollate">API
 *      specification</a>
 */
@JsonpDeserializable
public class PhraseSuggestCollate implements JsonpSerializable {
	private final Map<String, JsonData> params;

	@Nullable
	private final Boolean prune;

	private final PhraseSuggestCollateQuery query;

	// ---------------------------------------------------------------------------------------------

	private PhraseSuggestCollate(Builder builder) {

		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.prune = builder.prune;
		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static PhraseSuggestCollate of(Function<Builder, ObjectBuilder<PhraseSuggestCollate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code prune}
	 */
	@Nullable
	public final Boolean prune() {
		return this.prune;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final PhraseSuggestCollateQuery query() {
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

		if (ApiTypeHelper.isDefined(this.params)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestCollate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PhraseSuggestCollate> {
		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Boolean prune;

		private PhraseSuggestCollateQuery query;

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * API name: {@code prune}
		 */
		public final Builder prune(@Nullable Boolean value) {
			this.prune = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(PhraseSuggestCollateQuery value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(
				Function<PhraseSuggestCollateQuery.Builder, ObjectBuilder<PhraseSuggestCollateQuery>> fn) {
			return this.query(fn.apply(new PhraseSuggestCollateQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggestCollate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestCollate build() {
			_checkSingleUse();

			return new PhraseSuggestCollate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggestCollate}
	 */
	public static final JsonpDeserializer<PhraseSuggestCollate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhraseSuggestCollate::setupPhraseSuggestCollateDeserializer);

	protected static void setupPhraseSuggestCollateDeserializer(ObjectDeserializer<PhraseSuggestCollate.Builder> op) {

		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::prune, JsonpDeserializer.booleanDeserializer(), "prune");
		op.add(Builder::query, PhraseSuggestCollateQuery._DESERIALIZER, "query");

	}

}

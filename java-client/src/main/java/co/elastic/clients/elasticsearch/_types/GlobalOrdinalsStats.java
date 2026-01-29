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

package co.elastic.clients.elasticsearch._types;

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
import java.lang.Long;
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

// typedef: _types.GlobalOrdinalsStats

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.GlobalOrdinalsStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class GlobalOrdinalsStats implements JsonpSerializable {
	private final long buildTimeInMillis;

	@Nullable
	private final String buildTime;

	private final Map<String, GlobalOrdinalFieldStats> fields;

	// ---------------------------------------------------------------------------------------------

	private GlobalOrdinalsStats(Builder builder) {

		this.buildTimeInMillis = ApiTypeHelper.requireNonNull(builder.buildTimeInMillis, this, "buildTimeInMillis", 0);
		this.buildTime = builder.buildTime;
		this.fields = ApiTypeHelper.unmodifiable(builder.fields);

	}

	public static GlobalOrdinalsStats of(Function<Builder, ObjectBuilder<GlobalOrdinalsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code build_time_in_millis}
	 */
	public final long buildTimeInMillis() {
		return this.buildTimeInMillis;
	}

	/**
	 * API name: {@code build_time}
	 */
	@Nullable
	public final String buildTime() {
		return this.buildTime;
	}

	/**
	 * API name: {@code fields}
	 */
	public final Map<String, GlobalOrdinalFieldStats> fields() {
		return this.fields;
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

		generator.writeKey("build_time_in_millis");
		generator.write(this.buildTimeInMillis);

		if (this.buildTime != null) {
			generator.writeKey("build_time");
			generator.write(this.buildTime);

		}
		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, GlobalOrdinalFieldStats> item0 : this.fields.entrySet()) {
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
	 * Builder for {@link GlobalOrdinalsStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GlobalOrdinalsStats> {
		private Long buildTimeInMillis;

		@Nullable
		private String buildTime;

		@Nullable
		private Map<String, GlobalOrdinalFieldStats> fields;

		public Builder() {
		}
		private Builder(GlobalOrdinalsStats instance) {
			this.buildTimeInMillis = instance.buildTimeInMillis;
			this.buildTime = instance.buildTime;
			this.fields = instance.fields;

		}
		/**
		 * Required - API name: {@code build_time_in_millis}
		 */
		public final Builder buildTimeInMillis(long value) {
			this.buildTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code build_time}
		 */
		public final Builder buildTime(@Nullable String value) {
			this.buildTime = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, GlobalOrdinalFieldStats> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, GlobalOrdinalFieldStats value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key,
				Function<GlobalOrdinalFieldStats.Builder, ObjectBuilder<GlobalOrdinalFieldStats>> fn) {
			return fields(key, fn.apply(new GlobalOrdinalFieldStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GlobalOrdinalsStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalOrdinalsStats build() {
			_checkSingleUse();

			return new GlobalOrdinalsStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GlobalOrdinalsStats}
	 */
	public static final JsonpDeserializer<GlobalOrdinalsStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GlobalOrdinalsStats::setupGlobalOrdinalsStatsDeserializer);

	protected static void setupGlobalOrdinalsStatsDeserializer(ObjectDeserializer<GlobalOrdinalsStats.Builder> op) {

		op.add(Builder::buildTimeInMillis, JsonpDeserializer.longDeserializer(), "build_time_in_millis");
		op.add(Builder::buildTime, JsonpDeserializer.stringDeserializer(), "build_time");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(GlobalOrdinalFieldStats._DESERIALIZER),
				"fields");

	}

}

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

package co.elastic.clients.elasticsearch.indices.field_usage_stats;

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

// typedef: indices.field_usage_stats.ShardsStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.field_usage_stats.ShardsStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardsStats implements JsonpSerializable {
	private final FieldSummary allFields;

	private final Map<String, FieldSummary> fields;

	// ---------------------------------------------------------------------------------------------

	private ShardsStats(Builder builder) {

		this.allFields = ApiTypeHelper.requireNonNull(builder.allFields, this, "allFields");
		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");

	}

	public static ShardsStats of(Function<Builder, ObjectBuilder<ShardsStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code all_fields}
	 */
	public final FieldSummary allFields() {
		return this.allFields;
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final Map<String, FieldSummary> fields() {
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

		generator.writeKey("all_fields");
		this.allFields.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, FieldSummary> item0 : this.fields.entrySet()) {
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
	 * Builder for {@link ShardsStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardsStats> {
		private FieldSummary allFields;

		private Map<String, FieldSummary> fields;

		/**
		 * Required - API name: {@code all_fields}
		 */
		public final Builder allFields(FieldSummary value) {
			this.allFields = value;
			return this;
		}

		/**
		 * Required - API name: {@code all_fields}
		 */
		public final Builder allFields(Function<FieldSummary.Builder, ObjectBuilder<FieldSummary>> fn) {
			return this.allFields(fn.apply(new FieldSummary.Builder()).build());
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, FieldSummary> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, FieldSummary value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code> using a builder lambda.
		 */
		public final Builder fields(String key, Function<FieldSummary.Builder, ObjectBuilder<FieldSummary>> fn) {
			return fields(key, fn.apply(new FieldSummary.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardsStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardsStats build() {
			_checkSingleUse();

			return new ShardsStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardsStats}
	 */
	public static final JsonpDeserializer<ShardsStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardsStats::setupShardsStatsDeserializer);

	protected static void setupShardsStatsDeserializer(ObjectDeserializer<ShardsStats.Builder> op) {

		op.add(Builder::allFields, FieldSummary._DESERIALIZER, "all_fields");
		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(FieldSummary._DESERIALIZER), "fields");

	}

}

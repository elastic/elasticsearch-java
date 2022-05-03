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

package co.elastic.clients.elasticsearch.rollup.get_rollup_caps;

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
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_caps.RollupCapabilitySummary

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#rollup.get_rollup_caps.RollupCapabilitySummary">API
 *      specification</a>
 */
@JsonpDeserializable
public class RollupCapabilitySummary implements JsonpSerializable {
	private final Map<String, Map<String, JsonData>> fields;

	private final String indexPattern;

	private final String jobId;

	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	private RollupCapabilitySummary(Builder builder) {

		this.fields = ApiTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.indexPattern = ApiTypeHelper.requireNonNull(builder.indexPattern, this, "indexPattern");
		this.jobId = ApiTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.rollupIndex = ApiTypeHelper.requireNonNull(builder.rollupIndex, this, "rollupIndex");

	}

	public static RollupCapabilitySummary of(Function<Builder, ObjectBuilder<RollupCapabilitySummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final Map<String, Map<String, JsonData>> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code index_pattern}
	 */
	public final String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code rollup_index}
	 */
	public final String rollupIndex() {
		return this.rollupIndex;
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

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, Map<String, JsonData>> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartObject();
				if (item0.getValue() != null) {
					for (Map.Entry<String, JsonData> item1 : item0.getValue().entrySet()) {
						generator.writeKey(item1.getKey());
						item1.getValue().serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupCapabilitySummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RollupCapabilitySummary> {
		private Map<String, Map<String, JsonData>> fields;

		private String indexPattern;

		private String jobId;

		private String rollupIndex;

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>fields</code>.
		 */
		public final Builder fields(Map<String, Map<String, JsonData>> map) {
			this.fields = _mapPutAll(this.fields, map);
			return this;
		}

		/**
		 * Required - API name: {@code fields}
		 * <p>
		 * Adds an entry to <code>fields</code>.
		 */
		public final Builder fields(String key, Map<String, JsonData> value) {
			this.fields = _mapPut(this.fields, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code index_pattern}
		 */
		public final Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_index}
		 */
		public final Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupCapabilitySummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupCapabilitySummary build() {
			_checkSingleUse();

			return new RollupCapabilitySummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupCapabilitySummary}
	 */
	public static final JsonpDeserializer<RollupCapabilitySummary> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RollupCapabilitySummary::setupRollupCapabilitySummaryDeserializer);

	protected static void setupRollupCapabilitySummaryDeserializer(
			ObjectDeserializer<RollupCapabilitySummary.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer
				.stringMapDeserializer(JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER)), "fields");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");

	}

}

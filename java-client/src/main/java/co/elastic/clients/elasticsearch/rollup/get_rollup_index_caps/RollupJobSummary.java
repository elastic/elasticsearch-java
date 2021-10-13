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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_caps;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_index_caps.RollupJobSummary
@JsonpDeserializable
public final class RollupJobSummary implements JsonpSerializable {
	private final Map<String, List<RollupJobSummaryField>> fields;

	private final String indexPattern;

	private final String jobId;

	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	public RollupJobSummary(Builder builder) {

		this.fields = ModelTypeHelper.unmodifiableNonNull(builder.fields, "fields");
		this.indexPattern = Objects.requireNonNull(builder.indexPattern, "index_pattern");
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.rollupIndex = Objects.requireNonNull(builder.rollupIndex, "rollup_index");

	}

	public RollupJobSummary(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public Map<String, List<RollupJobSummaryField>> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code index_pattern}
	 */
	public String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code rollup_index}
	 */
	public String rollupIndex() {
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

		generator.writeKey("fields");
		generator.writeStartObject();
		for (Map.Entry<String, List<RollupJobSummaryField>> item0 : this.fields.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (RollupJobSummaryField item1 : item0.getValue()) {
				item1.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobSummary}.
	 */
	public static class Builder implements ObjectBuilder<RollupJobSummary> {
		private Map<String, List<RollupJobSummaryField>> fields;

		private String indexPattern;

		private String jobId;

		private String rollupIndex;

		/**
		 * Required - API name: {@code fields}
		 */
		public Builder fields(Map<String, List<RollupJobSummaryField>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #fields(Map)}, creating the map if needed.
		 */
		public Builder putFields(String key, List<RollupJobSummaryField> value) {
			if (this.fields == null) {
				this.fields = new HashMap<>();
			}
			this.fields.put(key, value);
			return this;
		}

		/**
		 * Required - API name: {@code index_pattern}
		 */
		public Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_index}
		 */
		public Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobSummary build() {

			return new RollupJobSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobSummary}
	 */
	public static final JsonpDeserializer<RollupJobSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJobSummary::setupRollupJobSummaryDeserializer, Builder::build);

	protected static void setupRollupJobSummaryDeserializer(DelegatingDeserializer<RollupJobSummary.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(RollupJobSummaryField._DESERIALIZER)), "fields");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");

	}

}

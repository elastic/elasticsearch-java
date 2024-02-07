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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

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

// typedef: rollup.get_jobs.RollupJobStatus

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#rollup.get_jobs.RollupJobStatus">API
 *      specification</a>
 */
@JsonpDeserializable
public class RollupJobStatus implements JsonpSerializable {
	private final Map<String, JsonData> currentPosition;

	private final IndexingJobState jobState;

	@Nullable
	private final Boolean upgradedDocId;

	// ---------------------------------------------------------------------------------------------

	private RollupJobStatus(Builder builder) {

		this.currentPosition = ApiTypeHelper.unmodifiable(builder.currentPosition);
		this.jobState = ApiTypeHelper.requireNonNull(builder.jobState, this, "jobState");
		this.upgradedDocId = builder.upgradedDocId;

	}

	public static RollupJobStatus of(Function<Builder, ObjectBuilder<RollupJobStatus>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code current_position}
	 */
	public final Map<String, JsonData> currentPosition() {
		return this.currentPosition;
	}

	/**
	 * Required - API name: {@code job_state}
	 */
	public final IndexingJobState jobState() {
		return this.jobState;
	}

	/**
	 * API name: {@code upgraded_doc_id}
	 */
	@Nullable
	public final Boolean upgradedDocId() {
		return this.upgradedDocId;
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

		if (ApiTypeHelper.isDefined(this.currentPosition)) {
			generator.writeKey("current_position");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.currentPosition.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("job_state");
		this.jobState.serialize(generator, mapper);
		if (this.upgradedDocId != null) {
			generator.writeKey("upgraded_doc_id");
			generator.write(this.upgradedDocId);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobStatus}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RollupJobStatus> {
		@Nullable
		private Map<String, JsonData> currentPosition;

		private IndexingJobState jobState;

		@Nullable
		private Boolean upgradedDocId;

		/**
		 * API name: {@code current_position}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>currentPosition</code>.
		 */
		public final Builder currentPosition(Map<String, JsonData> map) {
			this.currentPosition = _mapPutAll(this.currentPosition, map);
			return this;
		}

		/**
		 * API name: {@code current_position}
		 * <p>
		 * Adds an entry to <code>currentPosition</code>.
		 */
		public final Builder currentPosition(String key, JsonData value) {
			this.currentPosition = _mapPut(this.currentPosition, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code job_state}
		 */
		public final Builder jobState(IndexingJobState value) {
			this.jobState = value;
			return this;
		}

		/**
		 * API name: {@code upgraded_doc_id}
		 */
		public final Builder upgradedDocId(@Nullable Boolean value) {
			this.upgradedDocId = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RollupJobStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobStatus build() {
			_checkSingleUse();

			return new RollupJobStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobStatus}
	 */
	public static final JsonpDeserializer<RollupJobStatus> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJobStatus::setupRollupJobStatusDeserializer);

	protected static void setupRollupJobStatusDeserializer(ObjectDeserializer<RollupJobStatus.Builder> op) {

		op.add(Builder::currentPosition, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER),
				"current_position");
		op.add(Builder::jobState, IndexingJobState._DESERIALIZER, "job_state");
		op.add(Builder::upgradedDocId, JsonpDeserializer.booleanDeserializer(), "upgraded_doc_id");

	}

}

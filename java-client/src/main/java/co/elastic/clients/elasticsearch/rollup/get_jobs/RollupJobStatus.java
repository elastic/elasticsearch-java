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

package co.elastic.clients.elasticsearch.rollup.get_jobs;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: rollup.get_jobs.RollupJobStatus
public final class RollupJobStatus implements ToJsonp {
	@Nullable
	private final Map<String, JsonValue> currentPosition;

	private final JsonValue jobState;

	@Nullable
	private final Boolean upgradedDocId;

	// ---------------------------------------------------------------------------------------------

	protected RollupJobStatus(Builder builder) {

		this.currentPosition = builder.currentPosition;
		this.jobState = Objects.requireNonNull(builder.jobState, "job_state");
		this.upgradedDocId = builder.upgradedDocId;

	}

	/**
	 * API name: {@code current_position}
	 */
	@Nullable
	public Map<String, JsonValue> currentPosition() {
		return this.currentPosition;
	}

	/**
	 * API name: {@code job_state}
	 */
	public JsonValue jobState() {
		return this.jobState;
	}

	/**
	 * API name: {@code upgraded_doc_id}
	 */
	@Nullable
	public Boolean upgradedDocId() {
		return this.upgradedDocId;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.currentPosition != null) {

			generator.writeKey("current_position");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.currentPosition.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

		generator.writeKey("job_state");
		generator.write(this.jobState);

		if (this.upgradedDocId != null) {

			generator.writeKey("upgraded_doc_id");
			generator.write(this.upgradedDocId);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobStatus}.
	 */
	public static class Builder implements ObjectBuilder<RollupJobStatus> {
		@Nullable
		private Map<String, JsonValue> currentPosition;

		private JsonValue jobState;

		@Nullable
		private Boolean upgradedDocId;

		/**
		 * API name: {@code current_position}
		 */
		public Builder currentPosition(@Nullable Map<String, JsonValue> value) {
			this.currentPosition = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #currentPosition(Map)}, creating the map if needed.
		 */
		public Builder putCurrentPosition(String key, JsonValue value) {
			if (this.currentPosition == null) {
				this.currentPosition = new HashMap<>();
			}
			this.currentPosition.put(key, value);
			return this;
		}

		/**
		 * API name: {@code job_state}
		 */
		public Builder jobState(JsonValue value) {
			this.jobState = value;
			return this;
		}

		/**
		 * API name: {@code upgraded_doc_id}
		 */
		public Builder upgradedDocId(@Nullable Boolean value) {
			this.upgradedDocId = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobStatus}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobStatus build() {

			return new RollupJobStatus(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for RollupJobStatus
	 */
	public static final JsonpDeserializer<RollupJobStatus> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, RollupJobStatus::setupRollupJobStatusDeserializer);

	protected static void setupRollupJobStatusDeserializer(DelegatingDeserializer<RollupJobStatus.Builder> op) {

		op.add(Builder::currentPosition,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.jsonValueDeserializer()), "current_position");
		op.add(Builder::jobState, JsonpDeserializer.jsonValueDeserializer(), "job_state");
		op.add(Builder::upgradedDocId, JsonpDeserializer.booleanDeserializer(), "upgraded_doc_id");

	}

}

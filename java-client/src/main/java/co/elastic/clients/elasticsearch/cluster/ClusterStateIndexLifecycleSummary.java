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

package co.elastic.clients.elasticsearch.cluster;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster._types.ClusterStateIndexLifecycleSummary
public final class ClusterStateIndexLifecycleSummary implements JsonpSerializable {
	private final ClusterStateIndexLifecyclePolicy policy;

	private final Map<String, List<String>> headers;

	private final Number version;

	private final Number modifiedDate;

	private final String modifiedDateString;

	// ---------------------------------------------------------------------------------------------

	public ClusterStateIndexLifecycleSummary(Builder builder) {

		this.policy = Objects.requireNonNull(builder.policy, "policy");
		this.headers = Objects.requireNonNull(builder.headers, "headers");
		this.version = Objects.requireNonNull(builder.version, "version");
		this.modifiedDate = Objects.requireNonNull(builder.modifiedDate, "modified_date");
		this.modifiedDateString = Objects.requireNonNull(builder.modifiedDateString, "modified_date_string");

	}

	/**
	 * API name: {@code policy}
	 */
	public ClusterStateIndexLifecyclePolicy policy() {
		return this.policy;
	}

	/**
	 * API name: {@code headers}
	 */
	public Map<String, List<String>> headers() {
		return this.headers;
	}

	/**
	 * API name: {@code version}
	 */
	public Number version() {
		return this.version;
	}

	/**
	 * API name: {@code modified_date}
	 */
	public Number modifiedDate() {
		return this.modifiedDate;
	}

	/**
	 * API name: {@code modified_date_string}
	 */
	public String modifiedDateString() {
		return this.modifiedDateString;
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

		generator.writeKey("policy");
		this.policy.serialize(generator, mapper);

		generator.writeKey("headers");
		generator.writeStartObject();
		for (Map.Entry<String, List<String>> item0 : this.headers.entrySet()) {
			generator.writeKey(item0.getKey());
			generator.writeStartArray();
			for (String item1 : item0.getValue()) {
				generator.write(item1);

			}
			generator.writeEnd();

		}
		generator.writeEnd();

		generator.writeKey("version");
		generator.write(this.version.doubleValue());

		generator.writeKey("modified_date");
		generator.write(this.modifiedDate.doubleValue());

		generator.writeKey("modified_date_string");
		generator.write(this.modifiedDateString);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterStateIndexLifecycleSummary}.
	 */
	public static class Builder implements ObjectBuilder<ClusterStateIndexLifecycleSummary> {
		private ClusterStateIndexLifecyclePolicy policy;

		private Map<String, List<String>> headers;

		private Number version;

		private Number modifiedDate;

		private String modifiedDateString;

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(ClusterStateIndexLifecyclePolicy value) {
			this.policy = value;
			return this;
		}

		/**
		 * API name: {@code policy}
		 */
		public Builder policy(
				Function<ClusterStateIndexLifecyclePolicy.Builder, ObjectBuilder<ClusterStateIndexLifecyclePolicy>> fn) {
			return this.policy(fn.apply(new ClusterStateIndexLifecyclePolicy.Builder()).build());
		}

		/**
		 * API name: {@code headers}
		 */
		public Builder headers(Map<String, List<String>> value) {
			this.headers = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #headers(Map)}, creating the map if needed.
		 */
		public Builder putHeaders(String key, List<String> value) {
			if (this.headers == null) {
				this.headers = new HashMap<>();
			}
			this.headers.put(key, value);
			return this;
		}

		/**
		 * API name: {@code version}
		 */
		public Builder version(Number value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code modified_date}
		 */
		public Builder modifiedDate(Number value) {
			this.modifiedDate = value;
			return this;
		}

		/**
		 * API name: {@code modified_date_string}
		 */
		public Builder modifiedDateString(String value) {
			this.modifiedDateString = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterStateIndexLifecycleSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterStateIndexLifecycleSummary build() {

			return new ClusterStateIndexLifecycleSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ClusterStateIndexLifecycleSummary}
	 */
	public static final JsonpDeserializer<ClusterStateIndexLifecycleSummary> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					ClusterStateIndexLifecycleSummary::setupClusterStateIndexLifecycleSummaryDeserializer);

	protected static void setupClusterStateIndexLifecycleSummaryDeserializer(
			DelegatingDeserializer<ClusterStateIndexLifecycleSummary.Builder> op) {

		op.add(Builder::policy, ClusterStateIndexLifecyclePolicy.DESERIALIZER, "policy");
		op.add(Builder::headers, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer())), "headers");
		op.add(Builder::version, JsonpDeserializer.numberDeserializer(), "version");
		op.add(Builder::modifiedDate, JsonpDeserializer.numberDeserializer(), "modified_date");
		op.add(Builder::modifiedDateString, JsonpDeserializer.stringDeserializer(), "modified_date_string");

	}

}

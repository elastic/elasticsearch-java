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

package co.elastic.clients.elasticsearch.slm;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: slm._types.Configuration
@JsonpDeserializable
public class Configuration implements JsonpSerializable {
	@Nullable
	private final Boolean ignoreUnavailable;

	private final List<String> indices;

	@Nullable
	private final Boolean includeGlobalState;

	private final List<String> featureStates;

	private final Map<String, JsonData> metadata;

	@Nullable
	private final Boolean partial;

	// ---------------------------------------------------------------------------------------------

	private Configuration(Builder builder) {

		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.indices = ModelTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.includeGlobalState = builder.includeGlobalState;
		this.featureStates = ModelTypeHelper.unmodifiable(builder.featureStates);
		this.metadata = ModelTypeHelper.unmodifiable(builder.metadata);
		this.partial = builder.partial;

	}

	public static Configuration of(Function<Builder, ObjectBuilder<Configuration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If false, the snapshot fails if any data stream or index in indices is
	 * missing or closed. If true, the snapshot ignores missing or closed data
	 * streams and indices.
	 * <p>
	 * API name: {@code ignore_unavailable}
	 */
	@Nullable
	public final Boolean ignoreUnavailable() {
		return this.ignoreUnavailable;
	}

	/**
	 * Required - A comma-separated list of data streams and indices to include in
	 * the snapshot. Multi-index syntax is supported. By default, a snapshot
	 * includes all data streams and indices in the cluster. If this argument is
	 * provided, the snapshot only includes the specified data streams and clusters.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * If true, the current global state is included in the snapshot.
	 * <p>
	 * API name: {@code include_global_state}
	 */
	@Nullable
	public final Boolean includeGlobalState() {
		return this.includeGlobalState;
	}

	/**
	 * A list of feature states to be included in this snapshot. A list of features
	 * available for inclusion in the snapshot and their descriptions be can be
	 * retrieved using the get features API. Each feature state includes one or more
	 * system indices containing data necessary for the function of that feature.
	 * Providing an empty array will include no feature states in the snapshot,
	 * regardless of the value of include_global_state. By default, all available
	 * feature states will be included in the snapshot if include_global_state is
	 * true, or no feature states if include_global_state is false.
	 * <p>
	 * API name: {@code feature_states}
	 */
	public final List<String> featureStates() {
		return this.featureStates;
	}

	/**
	 * Attaches arbitrary metadata to the snapshot, such as a record of who took the
	 * snapshot, why it was taken, or any other useful data. Metadata must be less
	 * than 1024 bytes.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * If false, the entire snapshot will fail if one or more indices included in
	 * the snapshot do not have all primary shards available.
	 * <p>
	 * API name: {@code partial}
	 */
	@Nullable
	public final Boolean partial() {
		return this.partial;
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

		if (this.ignoreUnavailable != null) {
			generator.writeKey("ignore_unavailable");
			generator.write(this.ignoreUnavailable);

		}
		if (ModelTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.includeGlobalState != null) {
			generator.writeKey("include_global_state");
			generator.write(this.includeGlobalState);

		}
		if (ModelTypeHelper.isDefined(this.featureStates)) {
			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (String item0 : this.featureStates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.partial != null) {
			generator.writeKey("partial");
			generator.write(this.partial);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Configuration}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Configuration> {
		@Nullable
		private Boolean ignoreUnavailable;

		private List<String> indices;

		@Nullable
		private Boolean includeGlobalState;

		@Nullable
		private List<String> featureStates;

		@Nullable
		private Map<String, JsonData> metadata;

		@Nullable
		private Boolean partial;

		/**
		 * If false, the snapshot fails if any data stream or index in indices is
		 * missing or closed. If true, the snapshot ignores missing or closed data
		 * streams and indices.
		 * <p>
		 * API name: {@code ignore_unavailable}
		 */
		public final Builder ignoreUnavailable(@Nullable Boolean value) {
			this.ignoreUnavailable = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of data streams and indices to include in
		 * the snapshot. Multi-index syntax is supported. By default, a snapshot
		 * includes all data streams and indices in the cluster. If this argument is
		 * provided, the snapshot only includes the specified data streams and clusters.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * Required - A comma-separated list of data streams and indices to include in
		 * the snapshot. Multi-index syntax is supported. By default, a snapshot
		 * includes all data streams and indices in the cluster. If this argument is
		 * provided, the snapshot only includes the specified data streams and clusters.
		 * <p>
		 * API name: {@code indices}
		 */
		public final Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * If true, the current global state is included in the snapshot.
		 * <p>
		 * API name: {@code include_global_state}
		 */
		public final Builder includeGlobalState(@Nullable Boolean value) {
			this.includeGlobalState = value;
			return this;
		}

		/**
		 * A list of feature states to be included in this snapshot. A list of features
		 * available for inclusion in the snapshot and their descriptions be can be
		 * retrieved using the get features API. Each feature state includes one or more
		 * system indices containing data necessary for the function of that feature.
		 * Providing an empty array will include no feature states in the snapshot,
		 * regardless of the value of include_global_state. By default, all available
		 * feature states will be included in the snapshot if include_global_state is
		 * true, or no feature states if include_global_state is false.
		 * <p>
		 * API name: {@code feature_states}
		 */
		public final Builder featureStates(@Nullable List<String> value) {
			this.featureStates = value;
			return this;
		}

		/**
		 * A list of feature states to be included in this snapshot. A list of features
		 * available for inclusion in the snapshot and their descriptions be can be
		 * retrieved using the get features API. Each feature state includes one or more
		 * system indices containing data necessary for the function of that feature.
		 * Providing an empty array will include no feature states in the snapshot,
		 * regardless of the value of include_global_state. By default, all available
		 * feature states will be included in the snapshot if include_global_state is
		 * true, or no feature states if include_global_state is false.
		 * <p>
		 * API name: {@code feature_states}
		 */
		public final Builder featureStates(String... value) {
			this.featureStates = Arrays.asList(value);
			return this;
		}

		/**
		 * Attaches arbitrary metadata to the snapshot, such as a record of who took the
		 * snapshot, why it was taken, or any other useful data. Metadata must be less
		 * than 1024 bytes.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * If false, the entire snapshot will fail if one or more indices included in
		 * the snapshot do not have all primary shards available.
		 * <p>
		 * API name: {@code partial}
		 */
		public final Builder partial(@Nullable Boolean value) {
			this.partial = value;
			return this;
		}

		/**
		 * Builds a {@link Configuration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Configuration build() {
			_checkSingleUse();

			return new Configuration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Configuration}
	 */
	public static final JsonpDeserializer<Configuration> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Configuration::setupConfigurationDeserializer, Builder::build);

	protected static void setupConfigurationDeserializer(DelegatingDeserializer<Configuration.Builder> op) {

		op.add(Builder::ignoreUnavailable, JsonpDeserializer.booleanDeserializer(), "ignore_unavailable");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::includeGlobalState, JsonpDeserializer.booleanDeserializer(), "include_global_state");
		op.add(Builder::featureStates, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"feature_states");
		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::partial, JsonpDeserializer.booleanDeserializer(), "partial");

	}

}

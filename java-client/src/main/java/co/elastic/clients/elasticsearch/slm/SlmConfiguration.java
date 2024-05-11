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

package co.elastic.clients.elasticsearch.slm;

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
import java.util.List;
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

// typedef: slm._types.Configuration

/**
 *
 * @see <a href="../doc-files/api-spec.html#slm._types.Configuration">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlmConfiguration implements JsonpSerializable {
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

	private SlmConfiguration(Builder builder) {

		this.ignoreUnavailable = builder.ignoreUnavailable;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.includeGlobalState = builder.includeGlobalState;
		this.featureStates = ApiTypeHelper.unmodifiable(builder.featureStates);
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.partial = builder.partial;

	}

	public static SlmConfiguration of(Function<Builder, ObjectBuilder<SlmConfiguration>> fn) {
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
	 * A comma-separated list of data streams and indices to include in the
	 * snapshot. Multi-index syntax is supported. By default, a snapshot includes
	 * all data streams and indices in the cluster. If this argument is provided,
	 * the snapshot only includes the specified data streams and clusters.
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
		if (ApiTypeHelper.isDefined(this.indices)) {
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
		if (ApiTypeHelper.isDefined(this.featureStates)) {
			generator.writeKey("feature_states");
			generator.writeStartArray();
			for (String item0 : this.featureStates) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.metadata)) {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlmConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlmConfiguration> {
		@Nullable
		private Boolean ignoreUnavailable;

		@Nullable
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
		 * A comma-separated list of data streams and indices to include in the
		 * snapshot. Multi-index syntax is supported. By default, a snapshot includes
		 * all data streams and indices in the cluster. If this argument is provided,
		 * the snapshot only includes the specified data streams and clusters.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * A comma-separated list of data streams and indices to include in the
		 * snapshot. Multi-index syntax is supported. By default, a snapshot includes
		 * all data streams and indices in the cluster. If this argument is provided,
		 * the snapshot only includes the specified data streams and clusters.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
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
		 * <p>
		 * Adds all elements of <code>list</code> to <code>featureStates</code>.
		 */
		public final Builder featureStates(List<String> list) {
			this.featureStates = _listAddAll(this.featureStates, list);
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
		 * <p>
		 * Adds one or more values to <code>featureStates</code>.
		 */
		public final Builder featureStates(String value, String... values) {
			this.featureStates = _listAdd(this.featureStates, value, values);
			return this;
		}

		/**
		 * Attaches arbitrary metadata to the snapshot, such as a record of who took the
		 * snapshot, why it was taken, or any other useful data. Metadata must be less
		 * than 1024 bytes.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>metadata</code>.
		 */
		public final Builder metadata(Map<String, JsonData> map) {
			this.metadata = _mapPutAll(this.metadata, map);
			return this;
		}

		/**
		 * Attaches arbitrary metadata to the snapshot, such as a record of who took the
		 * snapshot, why it was taken, or any other useful data. Metadata must be less
		 * than 1024 bytes.
		 * <p>
		 * API name: {@code metadata}
		 * <p>
		 * Adds an entry to <code>metadata</code>.
		 */
		public final Builder metadata(String key, JsonData value) {
			this.metadata = _mapPut(this.metadata, key, value);
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

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlmConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlmConfiguration build() {
			_checkSingleUse();

			return new SlmConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlmConfiguration}
	 */
	public static final JsonpDeserializer<SlmConfiguration> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlmConfiguration::setupSlmConfigurationDeserializer);

	protected static void setupSlmConfigurationDeserializer(ObjectDeserializer<SlmConfiguration.Builder> op) {

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

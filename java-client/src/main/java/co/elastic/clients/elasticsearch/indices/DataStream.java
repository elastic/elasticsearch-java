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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.HealthStatus;
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
import java.lang.Integer;
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

// typedef: indices._types.DataStream

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.DataStream">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStream implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final Boolean allowCustomRouting;

	@Nullable
	private final FailureStore failureStore;

	private final int generation;

	private final boolean hidden;

	@Nullable
	private final String ilmPolicy;

	private final ManagedBy nextGenerationManagedBy;

	private final boolean preferIlm;

	private final List<DataStreamIndex> indices;

	@Nullable
	private final DataStreamLifecycleWithRollover lifecycle;

	private final String name;

	@Nullable
	private final Boolean replicated;

	private final boolean rolloverOnWrite;

	private final HealthStatus status;

	@Nullable
	private final Boolean system;

	private final String template;

	private final DataStreamTimestampField timestampField;

	// ---------------------------------------------------------------------------------------------

	private DataStream(Builder builder) {

		this.meta = ApiTypeHelper.unmodifiable(builder.meta);
		this.allowCustomRouting = builder.allowCustomRouting;
		this.failureStore = builder.failureStore;
		this.generation = ApiTypeHelper.requireNonNull(builder.generation, this, "generation");
		this.hidden = ApiTypeHelper.requireNonNull(builder.hidden, this, "hidden");
		this.ilmPolicy = builder.ilmPolicy;
		this.nextGenerationManagedBy = ApiTypeHelper.requireNonNull(builder.nextGenerationManagedBy, this,
				"nextGenerationManagedBy");
		this.preferIlm = ApiTypeHelper.requireNonNull(builder.preferIlm, this, "preferIlm");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.lifecycle = builder.lifecycle;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.replicated = builder.replicated;
		this.rolloverOnWrite = ApiTypeHelper.requireNonNull(builder.rolloverOnWrite, this, "rolloverOnWrite");
		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");
		this.system = builder.system;
		this.template = ApiTypeHelper.requireNonNull(builder.template, this, "template");
		this.timestampField = ApiTypeHelper.requireNonNull(builder.timestampField, this, "timestampField");

	}

	public static DataStream of(Function<Builder, ObjectBuilder<DataStream>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Custom metadata for the stream, copied from the <code>_meta</code> object of
	 * the stream’s matching index template. If empty, the response omits this
	 * property.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * If <code>true</code>, the data stream allows custom routing on write request.
	 * <p>
	 * API name: {@code allow_custom_routing}
	 */
	@Nullable
	public final Boolean allowCustomRouting() {
		return this.allowCustomRouting;
	}

	/**
	 * Information about failure store backing indices
	 * <p>
	 * API name: {@code failure_store}
	 */
	@Nullable
	public final FailureStore failureStore() {
		return this.failureStore;
	}

	/**
	 * Required - Current generation for the data stream. This number acts as a
	 * cumulative count of the stream’s rollovers, starting at 1.
	 * <p>
	 * API name: {@code generation}
	 */
	public final int generation() {
		return this.generation;
	}

	/**
	 * Required - If <code>true</code>, the data stream is hidden.
	 * <p>
	 * API name: {@code hidden}
	 */
	public final boolean hidden() {
		return this.hidden;
	}

	/**
	 * Name of the current ILM lifecycle policy in the stream’s matching index
	 * template. This lifecycle policy is set in the
	 * <code>index.lifecycle.name</code> setting. If the template does not include a
	 * lifecycle policy, this property is not included in the response. NOTE: A data
	 * stream’s backing indices may be assigned different lifecycle policies. To
	 * retrieve the lifecycle policy for individual backing indices, use the get
	 * index settings API.
	 * <p>
	 * API name: {@code ilm_policy}
	 */
	@Nullable
	public final String ilmPolicy() {
		return this.ilmPolicy;
	}

	/**
	 * Required - Name of the lifecycle system that'll manage the next generation of
	 * the data stream.
	 * <p>
	 * API name: {@code next_generation_managed_by}
	 */
	public final ManagedBy nextGenerationManagedBy() {
		return this.nextGenerationManagedBy;
	}

	/**
	 * Required - Indicates if ILM should take precedence over DSL in case both are
	 * configured to managed this data stream.
	 * <p>
	 * API name: {@code prefer_ilm}
	 */
	public final boolean preferIlm() {
		return this.preferIlm;
	}

	/**
	 * Required - Array of objects containing information about the data stream’s
	 * backing indices. The last item in this array contains information about the
	 * stream’s current write index.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<DataStreamIndex> indices() {
		return this.indices;
	}

	/**
	 * Contains the configuration for the data stream lifecycle of this data stream.
	 * <p>
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final DataStreamLifecycleWithRollover lifecycle() {
		return this.lifecycle;
	}

	/**
	 * Required - Name of the data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * If <code>true</code>, the data stream is created and managed by cross-cluster
	 * replication and the local cluster can not write into this data stream or
	 * change its mappings.
	 * <p>
	 * API name: {@code replicated}
	 */
	@Nullable
	public final Boolean replicated() {
		return this.replicated;
	}

	/**
	 * Required - If <code>true</code>, the next write to this data stream will
	 * trigger a rollover first and the document will be indexed in the new backing
	 * index. If the rollover fails the indexing request will fail too.
	 * <p>
	 * API name: {@code rollover_on_write}
	 */
	public final boolean rolloverOnWrite() {
		return this.rolloverOnWrite;
	}

	/**
	 * Required - Health status of the data stream. This health status is based on
	 * the state of the primary and replica shards of the stream’s backing indices.
	 * <p>
	 * API name: {@code status}
	 */
	public final HealthStatus status() {
		return this.status;
	}

	/**
	 * If <code>true</code>, the data stream is created and managed by an Elastic
	 * stack component and cannot be modified through normal user interaction.
	 * <p>
	 * API name: {@code system}
	 */
	@Nullable
	public final Boolean system() {
		return this.system;
	}

	/**
	 * Required - Name of the index template used to create the data stream’s
	 * backing indices. The template’s index pattern must match the name of this
	 * data stream.
	 * <p>
	 * API name: {@code template}
	 */
	public final String template() {
		return this.template;
	}

	/**
	 * Required - Information about the <code>@timestamp</code> field in the data
	 * stream.
	 * <p>
	 * API name: {@code timestamp_field}
	 */
	public final DataStreamTimestampField timestampField() {
		return this.timestampField;
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

		if (ApiTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowCustomRouting != null) {
			generator.writeKey("allow_custom_routing");
			generator.write(this.allowCustomRouting);

		}
		if (this.failureStore != null) {
			generator.writeKey("failure_store");
			this.failureStore.serialize(generator, mapper);

		}
		generator.writeKey("generation");
		generator.write(this.generation);

		generator.writeKey("hidden");
		generator.write(this.hidden);

		if (this.ilmPolicy != null) {
			generator.writeKey("ilm_policy");
			generator.write(this.ilmPolicy);

		}
		generator.writeKey("next_generation_managed_by");
		this.nextGenerationManagedBy.serialize(generator, mapper);
		generator.writeKey("prefer_ilm");
		generator.write(this.preferIlm);

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (DataStreamIndex item0 : this.indices) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.lifecycle != null) {
			generator.writeKey("lifecycle");
			this.lifecycle.serialize(generator, mapper);

		}
		generator.writeKey("name");
		generator.write(this.name);

		if (this.replicated != null) {
			generator.writeKey("replicated");
			generator.write(this.replicated);

		}
		generator.writeKey("rollover_on_write");
		generator.write(this.rolloverOnWrite);

		generator.writeKey("status");
		this.status.serialize(generator, mapper);
		if (this.system != null) {
			generator.writeKey("system");
			generator.write(this.system);

		}
		generator.writeKey("template");
		generator.write(this.template);

		generator.writeKey("timestamp_field");
		this.timestampField.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStream}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DataStream> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private Boolean allowCustomRouting;

		@Nullable
		private FailureStore failureStore;

		private Integer generation;

		private Boolean hidden;

		@Nullable
		private String ilmPolicy;

		private ManagedBy nextGenerationManagedBy;

		private Boolean preferIlm;

		private List<DataStreamIndex> indices;

		@Nullable
		private DataStreamLifecycleWithRollover lifecycle;

		private String name;

		@Nullable
		private Boolean replicated;

		private Boolean rolloverOnWrite;

		private HealthStatus status;

		@Nullable
		private Boolean system;

		private String template;

		private DataStreamTimestampField timestampField;

		/**
		 * Custom metadata for the stream, copied from the <code>_meta</code> object of
		 * the stream’s matching index template. If empty, the response omits this
		 * property.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>meta</code>.
		 */
		public final Builder meta(Map<String, JsonData> map) {
			this.meta = _mapPutAll(this.meta, map);
			return this;
		}

		/**
		 * Custom metadata for the stream, copied from the <code>_meta</code> object of
		 * the stream’s matching index template. If empty, the response omits this
		 * property.
		 * <p>
		 * API name: {@code _meta}
		 * <p>
		 * Adds an entry to <code>meta</code>.
		 */
		public final Builder meta(String key, JsonData value) {
			this.meta = _mapPut(this.meta, key, value);
			return this;
		}

		/**
		 * If <code>true</code>, the data stream allows custom routing on write request.
		 * <p>
		 * API name: {@code allow_custom_routing}
		 */
		public final Builder allowCustomRouting(@Nullable Boolean value) {
			this.allowCustomRouting = value;
			return this;
		}

		/**
		 * Information about failure store backing indices
		 * <p>
		 * API name: {@code failure_store}
		 */
		public final Builder failureStore(@Nullable FailureStore value) {
			this.failureStore = value;
			return this;
		}

		/**
		 * Information about failure store backing indices
		 * <p>
		 * API name: {@code failure_store}
		 */
		public final Builder failureStore(Function<FailureStore.Builder, ObjectBuilder<FailureStore>> fn) {
			return this.failureStore(fn.apply(new FailureStore.Builder()).build());
		}

		/**
		 * Required - Current generation for the data stream. This number acts as a
		 * cumulative count of the stream’s rollovers, starting at 1.
		 * <p>
		 * API name: {@code generation}
		 */
		public final Builder generation(int value) {
			this.generation = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the data stream is hidden.
		 * <p>
		 * API name: {@code hidden}
		 */
		public final Builder hidden(boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * Name of the current ILM lifecycle policy in the stream’s matching index
		 * template. This lifecycle policy is set in the
		 * <code>index.lifecycle.name</code> setting. If the template does not include a
		 * lifecycle policy, this property is not included in the response. NOTE: A data
		 * stream’s backing indices may be assigned different lifecycle policies. To
		 * retrieve the lifecycle policy for individual backing indices, use the get
		 * index settings API.
		 * <p>
		 * API name: {@code ilm_policy}
		 */
		public final Builder ilmPolicy(@Nullable String value) {
			this.ilmPolicy = value;
			return this;
		}

		/**
		 * Required - Name of the lifecycle system that'll manage the next generation of
		 * the data stream.
		 * <p>
		 * API name: {@code next_generation_managed_by}
		 */
		public final Builder nextGenerationManagedBy(ManagedBy value) {
			this.nextGenerationManagedBy = value;
			return this;
		}

		/**
		 * Required - Indicates if ILM should take precedence over DSL in case both are
		 * configured to managed this data stream.
		 * <p>
		 * API name: {@code prefer_ilm}
		 */
		public final Builder preferIlm(boolean value) {
			this.preferIlm = value;
			return this;
		}

		/**
		 * Required - Array of objects containing information about the data stream’s
		 * backing indices. The last item in this array contains information about the
		 * stream’s current write index.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<DataStreamIndex> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - Array of objects containing information about the data stream’s
		 * backing indices. The last item in this array contains information about the
		 * stream’s current write index.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(DataStreamIndex value, DataStreamIndex... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - Array of objects containing information about the data stream’s
		 * backing indices. The last item in this array contains information about the
		 * stream’s current write index.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds a value to <code>indices</code> using a builder lambda.
		 */
		public final Builder indices(Function<DataStreamIndex.Builder, ObjectBuilder<DataStreamIndex>> fn) {
			return indices(fn.apply(new DataStreamIndex.Builder()).build());
		}

		/**
		 * Contains the configuration for the data stream lifecycle of this data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable DataStreamLifecycleWithRollover value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * Contains the configuration for the data stream lifecycle of this data stream.
		 * <p>
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(
				Function<DataStreamLifecycleWithRollover.Builder, ObjectBuilder<DataStreamLifecycleWithRollover>> fn) {
			return this.lifecycle(fn.apply(new DataStreamLifecycleWithRollover.Builder()).build());
		}

		/**
		 * Required - Name of the data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * If <code>true</code>, the data stream is created and managed by cross-cluster
		 * replication and the local cluster can not write into this data stream or
		 * change its mappings.
		 * <p>
		 * API name: {@code replicated}
		 */
		public final Builder replicated(@Nullable Boolean value) {
			this.replicated = value;
			return this;
		}

		/**
		 * Required - If <code>true</code>, the next write to this data stream will
		 * trigger a rollover first and the document will be indexed in the new backing
		 * index. If the rollover fails the indexing request will fail too.
		 * <p>
		 * API name: {@code rollover_on_write}
		 */
		public final Builder rolloverOnWrite(boolean value) {
			this.rolloverOnWrite = value;
			return this;
		}

		/**
		 * Required - Health status of the data stream. This health status is based on
		 * the state of the primary and replica shards of the stream’s backing indices.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(HealthStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * If <code>true</code>, the data stream is created and managed by an Elastic
		 * stack component and cannot be modified through normal user interaction.
		 * <p>
		 * API name: {@code system}
		 */
		public final Builder system(@Nullable Boolean value) {
			this.system = value;
			return this;
		}

		/**
		 * Required - Name of the index template used to create the data stream’s
		 * backing indices. The template’s index pattern must match the name of this
		 * data stream.
		 * <p>
		 * API name: {@code template}
		 */
		public final Builder template(String value) {
			this.template = value;
			return this;
		}

		/**
		 * Required - Information about the <code>@timestamp</code> field in the data
		 * stream.
		 * <p>
		 * API name: {@code timestamp_field}
		 */
		public final Builder timestampField(DataStreamTimestampField value) {
			this.timestampField = value;
			return this;
		}

		/**
		 * Required - Information about the <code>@timestamp</code> field in the data
		 * stream.
		 * <p>
		 * API name: {@code timestamp_field}
		 */
		public final Builder timestampField(
				Function<DataStreamTimestampField.Builder, ObjectBuilder<DataStreamTimestampField>> fn) {
			return this.timestampField(fn.apply(new DataStreamTimestampField.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStream}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStream build() {
			_checkSingleUse();

			return new DataStream(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStream}
	 */
	public static final JsonpDeserializer<DataStream> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataStream::setupDataStreamDeserializer);

	protected static void setupDataStreamDeserializer(ObjectDeserializer<DataStream.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::allowCustomRouting, JsonpDeserializer.booleanDeserializer(), "allow_custom_routing");
		op.add(Builder::failureStore, FailureStore._DESERIALIZER, "failure_store");
		op.add(Builder::generation, JsonpDeserializer.integerDeserializer(), "generation");
		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");
		op.add(Builder::ilmPolicy, JsonpDeserializer.stringDeserializer(), "ilm_policy");
		op.add(Builder::nextGenerationManagedBy, ManagedBy._DESERIALIZER, "next_generation_managed_by");
		op.add(Builder::preferIlm, JsonpDeserializer.booleanDeserializer(), "prefer_ilm");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(DataStreamIndex._DESERIALIZER), "indices");
		op.add(Builder::lifecycle, DataStreamLifecycleWithRollover._DESERIALIZER, "lifecycle");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::replicated, JsonpDeserializer.booleanDeserializer(), "replicated");
		op.add(Builder::rolloverOnWrite, JsonpDeserializer.booleanDeserializer(), "rollover_on_write");
		op.add(Builder::status, HealthStatus._DESERIALIZER, "status");
		op.add(Builder::system, JsonpDeserializer.booleanDeserializer(), "system");
		op.add(Builder::template, JsonpDeserializer.stringDeserializer(), "template");
		op.add(Builder::timestampField, DataStreamTimestampField._DESERIALIZER, "timestamp_field");

	}

}

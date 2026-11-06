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

package co.elastic.clients.elasticsearch.data_recovery;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch.data_recovery.start_recovery.RecoveryMode;
import co.elastic.clients.elasticsearch.data_recovery.start_recovery.RenameStrategy;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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

// typedef: data_recovery.start_recovery.Request

/**
 * Start a recovery.
 * <p>
 * Start recovering indices and data streams from a recovery point. This API is
 * intended for internal operator use. Depending on the mode, the sources are
 * either replaced with their state at the recovery point, over the data that
 * currently exists, or recovered under new names. The recovery runs in the
 * background, so the API returns with a <code>202 Accepted</code> status once
 * it has started.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#data_recovery.start_recovery.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class StartRecoveryRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Time masterTimeout;

	private final Map<String, JsonData> metadata;

	private final RecoveryMode mode;

	private final DateTime recoveryPointEndTime;

	@Nullable
	private final RenameStrategy renameStrategy;

	private final List<String> sources;

	// ---------------------------------------------------------------------------------------------

	private StartRecoveryRequest(Builder builder) {

		this.masterTimeout = builder.masterTimeout;
		this.metadata = ApiTypeHelper.unmodifiable(builder.metadata);
		this.mode = ApiTypeHelper.requireNonNull(builder.mode, this, "mode");
		this.recoveryPointEndTime = ApiTypeHelper.requireNonNull(builder.recoveryPointEndTime, this,
				"recoveryPointEndTime");
		this.renameStrategy = builder.renameStrategy;
		this.sources = ApiTypeHelper.unmodifiableRequired(builder.sources, this, "sources");

	}

	public static StartRecoveryRequest of(Function<Builder, ObjectBuilder<StartRecoveryRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The period to wait for the master node. If the master node is not available
	 * before the timeout expires, the request fails and returns an error. To
	 * indicate that the request should never timeout, set it to <code>-1</code>.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Custom metadata for the recovery.
	 * <p>
	 * API name: {@code metadata}
	 */
	public final Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * Required - How to recover the sources: <code>replace</code> recovers them in
	 * place, over the data that currently exists, and <code>rename</code> recovers
	 * them under new names.
	 * <p>
	 * API name: {@code mode}
	 */
	public final RecoveryMode mode() {
		return this.mode;
	}

	/**
	 * Required - The exact end time of the recovery point to recover from, as a
	 * date or epoch milliseconds. An <code>end_time</code> returned when listing
	 * recovery points can be passed back as it is.
	 * <p>
	 * API name: {@code recovery_point_end_time}
	 */
	public final DateTime recoveryPointEndTime() {
		return this.recoveryPointEndTime;
	}

	/**
	 * How to derive the new name of each recovered source from its name. Required
	 * when <code>mode</code> is <code>rename</code>, and not allowed when
	 * <code>mode</code> is <code>replace</code>.
	 * <p>
	 * API name: {@code rename_strategy}
	 */
	@Nullable
	public final RenameStrategy renameStrategy() {
		return this.renameStrategy;
	}

	/**
	 * Required - The sources to recover. Each value is an index or data stream
	 * expression. Wildcards and exclusions prefixed with <code>-</code> are
	 * supported. The list must not be empty and must not contain blank values.
	 * <p>
	 * API name: {@code sources}
	 */
	public final List<String> sources() {
		return this.sources;
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

		if (ApiTypeHelper.isDefined(this.metadata)) {
			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("mode");
		this.mode.serialize(generator, mapper);
		generator.writeKey("recovery_point_end_time");
		this.recoveryPointEndTime.serialize(generator, mapper);
		if (this.renameStrategy != null) {
			generator.writeKey("rename_strategy");
			this.renameStrategy.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.sources)) {
			generator.writeKey("sources");
			generator.writeStartArray();
			for (String item0 : this.sources) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StartRecoveryRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<StartRecoveryRequest> {
		@Nullable
		private Time masterTimeout;

		@Nullable
		private Map<String, JsonData> metadata;

		private RecoveryMode mode;

		private DateTime recoveryPointEndTime;

		@Nullable
		private RenameStrategy renameStrategy;

		private List<String> sources;

		public Builder() {
		}
		private Builder(StartRecoveryRequest instance) {
			this.masterTimeout = instance.masterTimeout;
			this.metadata = instance.metadata;
			this.mode = instance.mode;
			this.recoveryPointEndTime = instance.recoveryPointEndTime;
			this.renameStrategy = instance.renameStrategy;
			this.sources = instance.sources;

		}
		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The period to wait for the master node. If the master node is not available
		 * before the timeout expires, the request fails and returns an error. To
		 * indicate that the request should never timeout, set it to <code>-1</code>.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Custom metadata for the recovery.
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
		 * Custom metadata for the recovery.
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
		 * Required - How to recover the sources: <code>replace</code> recovers them in
		 * place, over the data that currently exists, and <code>rename</code> recovers
		 * them under new names.
		 * <p>
		 * API name: {@code mode}
		 */
		public final Builder mode(RecoveryMode value) {
			this.mode = value;
			return this;
		}

		/**
		 * Required - The exact end time of the recovery point to recover from, as a
		 * date or epoch milliseconds. An <code>end_time</code> returned when listing
		 * recovery points can be passed back as it is.
		 * <p>
		 * API name: {@code recovery_point_end_time}
		 */
		public final Builder recoveryPointEndTime(DateTime value) {
			this.recoveryPointEndTime = value;
			return this;
		}

		/**
		 * How to derive the new name of each recovered source from its name. Required
		 * when <code>mode</code> is <code>rename</code>, and not allowed when
		 * <code>mode</code> is <code>replace</code>.
		 * <p>
		 * API name: {@code rename_strategy}
		 */
		public final Builder renameStrategy(@Nullable RenameStrategy value) {
			this.renameStrategy = value;
			return this;
		}

		/**
		 * How to derive the new name of each recovered source from its name. Required
		 * when <code>mode</code> is <code>rename</code>, and not allowed when
		 * <code>mode</code> is <code>replace</code>.
		 * <p>
		 * API name: {@code rename_strategy}
		 */
		public final Builder renameStrategy(Function<RenameStrategy.Builder, ObjectBuilder<RenameStrategy>> fn) {
			return this.renameStrategy(fn.apply(new RenameStrategy.Builder()).build());
		}

		/**
		 * Required - The sources to recover. Each value is an index or data stream
		 * expression. Wildcards and exclusions prefixed with <code>-</code> are
		 * supported. The list must not be empty and must not contain blank values.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>sources</code>.
		 */
		public final Builder sources(List<String> list) {
			this.sources = _listAddAll(this.sources, list);
			return this;
		}

		/**
		 * Required - The sources to recover. Each value is an index or data stream
		 * expression. Wildcards and exclusions prefixed with <code>-</code> are
		 * supported. The list must not be empty and must not contain blank values.
		 * <p>
		 * API name: {@code sources}
		 * <p>
		 * Adds one or more values to <code>sources</code>.
		 */
		public final Builder sources(String value, String... values) {
			this.sources = _listAdd(this.sources, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StartRecoveryRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StartRecoveryRequest build() {
			_checkSingleUse();

			return new StartRecoveryRequest(this);
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
	 * Json deserializer for {@link StartRecoveryRequest}
	 */
	public static final JsonpDeserializer<StartRecoveryRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, StartRecoveryRequest::setupStartRecoveryRequestDeserializer);

	protected static void setupStartRecoveryRequestDeserializer(ObjectDeserializer<StartRecoveryRequest.Builder> op) {

		op.add(Builder::metadata, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "metadata");
		op.add(Builder::mode, RecoveryMode._DESERIALIZER, "mode");
		op.add(Builder::recoveryPointEndTime, DateTime._DESERIALIZER, "recovery_point_end_time");
		op.add(Builder::renameStrategy, RenameStrategy._DESERIALIZER, "rename_strategy");
		op.add(Builder::sources, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"sources");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code data_recovery.start_recovery}".
	 */
	public static final Endpoint<StartRecoveryRequest, StartRecoveryResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/data_recovery.start_recovery",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_data_recovery/recoveries";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, StartRecoveryResponse._DESERIALIZER);
}

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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: indices._types.DataStreamLifecycleWithRollover

/**
 * Data stream lifecycle with rollover can be used to display the configuration
 * including the default rollover conditions, if asked.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamLifecycleWithRollover">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleWithRollover implements JsonpSerializable {
	@Nullable
	private final Time dataRetention;

	@Nullable
	private final DataStreamLifecycleDownsampling downsampling;

	@Nullable
	private final DataStreamLifecycleRolloverConditions rollover;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleWithRollover(Builder builder) {

		this.dataRetention = builder.dataRetention;
		this.downsampling = builder.downsampling;
		this.rollover = builder.rollover;

	}

	public static DataStreamLifecycleWithRollover of(
			Function<Builder, ObjectBuilder<DataStreamLifecycleWithRollover>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If defined, every document added to this data stream will be stored at least
	 * for this time frame. Any time after this duration the document could be
	 * deleted. When empty, every document in this data stream will be stored
	 * indefinitely.
	 * <p>
	 * API name: {@code data_retention}
	 */
	@Nullable
	public final Time dataRetention() {
		return this.dataRetention;
	}

	/**
	 * The downsampling configuration to execute for the managed backing index after
	 * rollover.
	 * <p>
	 * API name: {@code downsampling}
	 */
	@Nullable
	public final DataStreamLifecycleDownsampling downsampling() {
		return this.downsampling;
	}

	/**
	 * The conditions which will trigger the rollover of a backing index as
	 * configured by the cluster setting
	 * <code>cluster.lifecycle.default.rollover</code>. This property is an
	 * implementation detail and it will only be retrieved when the query param
	 * <code>include_defaults</code> is set to true. The contents of this field are
	 * subject to change.
	 * <p>
	 * API name: {@code rollover}
	 */
	@Nullable
	public final DataStreamLifecycleRolloverConditions rollover() {
		return this.rollover;
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

		if (this.dataRetention != null) {
			generator.writeKey("data_retention");
			this.dataRetention.serialize(generator, mapper);

		}
		if (this.downsampling != null) {
			generator.writeKey("downsampling");
			this.downsampling.serialize(generator, mapper);

		}
		if (this.rollover != null) {
			generator.writeKey("rollover");
			this.rollover.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycleWithRollover}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleWithRollover> {
		@Nullable
		private Time dataRetention;

		@Nullable
		private DataStreamLifecycleDownsampling downsampling;

		@Nullable
		private DataStreamLifecycleRolloverConditions rollover;

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(@Nullable Time value) {
			this.dataRetention = value;
			return this;
		}

		/**
		 * If defined, every document added to this data stream will be stored at least
		 * for this time frame. Any time after this duration the document could be
		 * deleted. When empty, every document in this data stream will be stored
		 * indefinitely.
		 * <p>
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.dataRetention(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The downsampling configuration to execute for the managed backing index after
		 * rollover.
		 * <p>
		 * API name: {@code downsampling}
		 */
		public final Builder downsampling(@Nullable DataStreamLifecycleDownsampling value) {
			this.downsampling = value;
			return this;
		}

		/**
		 * The downsampling configuration to execute for the managed backing index after
		 * rollover.
		 * <p>
		 * API name: {@code downsampling}
		 */
		public final Builder downsampling(
				Function<DataStreamLifecycleDownsampling.Builder, ObjectBuilder<DataStreamLifecycleDownsampling>> fn) {
			return this.downsampling(fn.apply(new DataStreamLifecycleDownsampling.Builder()).build());
		}

		/**
		 * The conditions which will trigger the rollover of a backing index as
		 * configured by the cluster setting
		 * <code>cluster.lifecycle.default.rollover</code>. This property is an
		 * implementation detail and it will only be retrieved when the query param
		 * <code>include_defaults</code> is set to true. The contents of this field are
		 * subject to change.
		 * <p>
		 * API name: {@code rollover}
		 */
		public final Builder rollover(@Nullable DataStreamLifecycleRolloverConditions value) {
			this.rollover = value;
			return this;
		}

		/**
		 * The conditions which will trigger the rollover of a backing index as
		 * configured by the cluster setting
		 * <code>cluster.lifecycle.default.rollover</code>. This property is an
		 * implementation detail and it will only be retrieved when the query param
		 * <code>include_defaults</code> is set to true. The contents of this field are
		 * subject to change.
		 * <p>
		 * API name: {@code rollover}
		 */
		public final Builder rollover(
				Function<DataStreamLifecycleRolloverConditions.Builder, ObjectBuilder<DataStreamLifecycleRolloverConditions>> fn) {
			return this.rollover(fn.apply(new DataStreamLifecycleRolloverConditions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleWithRollover}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleWithRollover build() {
			_checkSingleUse();

			return new DataStreamLifecycleWithRollover(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycleWithRollover}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleWithRollover> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycleWithRollover::setupDataStreamLifecycleWithRolloverDeserializer);

	protected static void setupDataStreamLifecycleWithRolloverDeserializer(
			ObjectDeserializer<DataStreamLifecycleWithRollover.Builder> op) {

		op.add(Builder::dataRetention, Time._DESERIALIZER, "data_retention");
		op.add(Builder::downsampling, DataStreamLifecycleDownsampling._DESERIALIZER, "downsampling");
		op.add(Builder::rollover, DataStreamLifecycleRolloverConditions._DESERIALIZER, "rollover");

	}

}

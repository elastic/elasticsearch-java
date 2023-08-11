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

// typedef: indices._types.DataLifecycleWithRollover

/**
 * Data lifecycle with rollover can be used to display the configuration
 * including the default rollover conditions, if asked.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataLifecycleWithRollover">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataLifecycleWithRollover implements JsonpSerializable {
	@Nullable
	private final Time dataRetention;

	@Nullable
	private final DlmRolloverConditions rollover;

	// ---------------------------------------------------------------------------------------------

	private DataLifecycleWithRollover(Builder builder) {

		this.dataRetention = builder.dataRetention;
		this.rollover = builder.rollover;

	}

	public static DataLifecycleWithRollover of(Function<Builder, ObjectBuilder<DataLifecycleWithRollover>> fn) {
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
	public final DlmRolloverConditions rollover() {
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
	 * Builder for {@link DataLifecycleWithRollover}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataLifecycleWithRollover> {
		@Nullable
		private Time dataRetention;

		@Nullable
		private DlmRolloverConditions rollover;

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
		 * The conditions which will trigger the rollover of a backing index as
		 * configured by the cluster setting
		 * <code>cluster.lifecycle.default.rollover</code>. This property is an
		 * implementation detail and it will only be retrieved when the query param
		 * <code>include_defaults</code> is set to true. The contents of this field are
		 * subject to change.
		 * <p>
		 * API name: {@code rollover}
		 */
		public final Builder rollover(@Nullable DlmRolloverConditions value) {
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
				Function<DlmRolloverConditions.Builder, ObjectBuilder<DlmRolloverConditions>> fn) {
			return this.rollover(fn.apply(new DlmRolloverConditions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataLifecycleWithRollover}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataLifecycleWithRollover build() {
			_checkSingleUse();

			return new DataLifecycleWithRollover(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataLifecycleWithRollover}
	 */
	public static final JsonpDeserializer<DataLifecycleWithRollover> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataLifecycleWithRollover::setupDataLifecycleWithRolloverDeserializer);

	protected static void setupDataLifecycleWithRolloverDeserializer(
			ObjectDeserializer<DataLifecycleWithRollover.Builder> op) {

		op.add(Builder::dataRetention, Time._DESERIALIZER, "data_retention");
		op.add(Builder::rollover, DlmRolloverConditions._DESERIALIZER, "rollover");

	}

}

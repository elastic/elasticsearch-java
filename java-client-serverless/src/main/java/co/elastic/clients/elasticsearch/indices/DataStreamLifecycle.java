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

// typedef: indices._types.DataStreamLifecycle

/**
 * Data stream lifecycle denotes that a data stream is managed by the data
 * stream lifecycle and contains the configuration.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamLifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycle implements JsonpSerializable {
	@Nullable
	private final Time dataRetention;

	@Nullable
	private final DataStreamLifecycleDownsampling downsampling;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycle(Builder builder) {

		this.dataRetention = builder.dataRetention;
		this.downsampling = builder.downsampling;

	}

	public static DataStreamLifecycle of(Function<Builder, ObjectBuilder<DataStreamLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code data_retention}
	 */
	@Nullable
	public final Time dataRetention() {
		return this.dataRetention;
	}

	/**
	 * API name: {@code downsampling}
	 */
	@Nullable
	public final DataStreamLifecycleDownsampling downsampling() {
		return this.downsampling;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycle> {
		@Nullable
		private Time dataRetention;

		@Nullable
		private DataStreamLifecycleDownsampling downsampling;

		/**
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(@Nullable Time value) {
			this.dataRetention = value;
			return this;
		}

		/**
		 * API name: {@code data_retention}
		 */
		public final Builder dataRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.dataRetention(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code downsampling}
		 */
		public final Builder downsampling(@Nullable DataStreamLifecycleDownsampling value) {
			this.downsampling = value;
			return this;
		}

		/**
		 * API name: {@code downsampling}
		 */
		public final Builder downsampling(
				Function<DataStreamLifecycleDownsampling.Builder, ObjectBuilder<DataStreamLifecycleDownsampling>> fn) {
			return this.downsampling(fn.apply(new DataStreamLifecycleDownsampling.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycle build() {
			_checkSingleUse();

			return new DataStreamLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycle}
	 */
	public static final JsonpDeserializer<DataStreamLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycle::setupDataStreamLifecycleDeserializer);

	protected static void setupDataStreamLifecycleDeserializer(ObjectDeserializer<DataStreamLifecycle.Builder> op) {

		op.add(Builder::dataRetention, Time._DESERIALIZER, "data_retention");
		op.add(Builder::downsampling, DataStreamLifecycleDownsampling._DESERIALIZER, "downsampling");

	}

}

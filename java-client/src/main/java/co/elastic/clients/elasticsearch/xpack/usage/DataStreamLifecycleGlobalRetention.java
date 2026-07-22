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

package co.elastic.clients.elasticsearch.xpack.usage;

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

// typedef: xpack.usage.DataStreamLifecycleGlobalRetention

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.DataStreamLifecycleGlobalRetention">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleGlobalRetention implements JsonpSerializable {
	private final DataStreamLifecycleGlobalRetentionStats default_;

	private final DataStreamLifecycleGlobalRetentionStats max;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleGlobalRetention(Builder builder) {

		this.default_ = ApiTypeHelper.requireNonNull(builder.default_, this, "default_");
		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");

	}

	public static DataStreamLifecycleGlobalRetention of(
			Function<Builder, ObjectBuilder<DataStreamLifecycleGlobalRetention>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Statistics about the cluster's default global retention.
	 * <p>
	 * API name: {@code default}
	 */
	public final DataStreamLifecycleGlobalRetentionStats default_() {
		return this.default_;
	}

	/**
	 * Required - Statistics about the cluster's maximum global retention.
	 * <p>
	 * API name: {@code max}
	 */
	public final DataStreamLifecycleGlobalRetentionStats max() {
		return this.max;
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

		generator.writeKey("default");
		this.default_.serialize(generator, mapper);

		generator.writeKey("max");
		this.max.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamLifecycleGlobalRetention}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleGlobalRetention> {
		private DataStreamLifecycleGlobalRetentionStats default_;

		private DataStreamLifecycleGlobalRetentionStats max;

		public Builder() {
		}
		private Builder(DataStreamLifecycleGlobalRetention instance) {
			this.default_ = instance.default_;
			this.max = instance.max;

		}
		/**
		 * Required - Statistics about the cluster's default global retention.
		 * <p>
		 * API name: {@code default}
		 */
		public final Builder default_(DataStreamLifecycleGlobalRetentionStats value) {
			this.default_ = value;
			return this;
		}

		/**
		 * Required - Statistics about the cluster's default global retention.
		 * <p>
		 * API name: {@code default}
		 */
		public final Builder default_(
				Function<DataStreamLifecycleGlobalRetentionStats.Builder, ObjectBuilder<DataStreamLifecycleGlobalRetentionStats>> fn) {
			return this.default_(fn.apply(new DataStreamLifecycleGlobalRetentionStats.Builder()).build());
		}

		/**
		 * Required - Statistics about the cluster's maximum global retention.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(DataStreamLifecycleGlobalRetentionStats value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - Statistics about the cluster's maximum global retention.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(
				Function<DataStreamLifecycleGlobalRetentionStats.Builder, ObjectBuilder<DataStreamLifecycleGlobalRetentionStats>> fn) {
			return this.max(fn.apply(new DataStreamLifecycleGlobalRetentionStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleGlobalRetention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleGlobalRetention build() {
			_checkSingleUse();

			return new DataStreamLifecycleGlobalRetention(this);
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
	 * Json deserializer for {@link DataStreamLifecycleGlobalRetention}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleGlobalRetention> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataStreamLifecycleGlobalRetention::setupDataStreamLifecycleGlobalRetentionDeserializer);

	protected static void setupDataStreamLifecycleGlobalRetentionDeserializer(
			ObjectDeserializer<DataStreamLifecycleGlobalRetention.Builder> op) {

		op.add(Builder::default_, DataStreamLifecycleGlobalRetentionStats._DESERIALIZER, "default");
		op.add(Builder::max, DataStreamLifecycleGlobalRetentionStats._DESERIALIZER, "max");

	}

}

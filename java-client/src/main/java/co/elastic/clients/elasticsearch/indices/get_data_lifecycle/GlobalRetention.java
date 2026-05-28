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

package co.elastic.clients.elasticsearch.indices.get_data_lifecycle;

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

// typedef: indices.get_data_lifecycle._types.GlobalRetention

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_lifecycle._types.GlobalRetention">API
 *      specification</a>
 */
@JsonpDeserializable
public class GlobalRetention implements JsonpSerializable {
	@Nullable
	private final Time maxRetention;

	@Nullable
	private final Time defaultRetention;

	// ---------------------------------------------------------------------------------------------

	private GlobalRetention(Builder builder) {

		this.maxRetention = builder.maxRetention;
		this.defaultRetention = builder.defaultRetention;

	}

	public static GlobalRetention of(Function<Builder, ObjectBuilder<GlobalRetention>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_retention}
	 */
	@Nullable
	public final Time maxRetention() {
		return this.maxRetention;
	}

	/**
	 * API name: {@code default_retention}
	 */
	@Nullable
	public final Time defaultRetention() {
		return this.defaultRetention;
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

		if (this.maxRetention != null) {
			generator.writeKey("max_retention");
			this.maxRetention.serialize(generator, mapper);

		}
		if (this.defaultRetention != null) {
			generator.writeKey("default_retention");
			this.defaultRetention.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GlobalRetention}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<GlobalRetention> {
		@Nullable
		private Time maxRetention;

		@Nullable
		private Time defaultRetention;

		public Builder() {
		}
		private Builder(GlobalRetention instance) {
			this.maxRetention = instance.maxRetention;
			this.defaultRetention = instance.defaultRetention;

		}
		/**
		 * API name: {@code max_retention}
		 */
		public final Builder maxRetention(@Nullable Time value) {
			this.maxRetention = value;
			return this;
		}

		/**
		 * API name: {@code max_retention}
		 */
		public final Builder maxRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxRetention(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code default_retention}
		 */
		public final Builder defaultRetention(@Nullable Time value) {
			this.defaultRetention = value;
			return this;
		}

		/**
		 * API name: {@code default_retention}
		 */
		public final Builder defaultRetention(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.defaultRetention(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GlobalRetention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GlobalRetention build() {
			_checkSingleUse();

			return new GlobalRetention(this);
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
	 * Json deserializer for {@link GlobalRetention}
	 */
	public static final JsonpDeserializer<GlobalRetention> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GlobalRetention::setupGlobalRetentionDeserializer);

	protected static void setupGlobalRetentionDeserializer(ObjectDeserializer<GlobalRetention.Builder> op) {

		op.add(Builder::maxRetention, Time._DESERIALIZER, "max_retention");
		op.add(Builder::defaultRetention, Time._DESERIALIZER, "default_retention");

	}

}

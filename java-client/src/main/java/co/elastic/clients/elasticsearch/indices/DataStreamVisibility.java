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
import java.lang.Boolean;
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

// typedef: indices._types.DataStreamVisibility

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamVisibility">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamVisibility implements JsonpSerializable {
	@Nullable
	private final Boolean hidden;

	@Nullable
	private final Boolean allowCustomRouting;

	// ---------------------------------------------------------------------------------------------

	private DataStreamVisibility(Builder builder) {

		this.hidden = builder.hidden;
		this.allowCustomRouting = builder.allowCustomRouting;

	}

	public static DataStreamVisibility of(Function<Builder, ObjectBuilder<DataStreamVisibility>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code hidden}
	 */
	@Nullable
	public final Boolean hidden() {
		return this.hidden;
	}

	/**
	 * API name: {@code allow_custom_routing}
	 */
	@Nullable
	public final Boolean allowCustomRouting() {
		return this.allowCustomRouting;
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

		if (this.hidden != null) {
			generator.writeKey("hidden");
			generator.write(this.hidden);

		}
		if (this.allowCustomRouting != null) {
			generator.writeKey("allow_custom_routing");
			generator.write(this.allowCustomRouting);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamVisibility}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamVisibility> {
		@Nullable
		private Boolean hidden;

		@Nullable
		private Boolean allowCustomRouting;

		/**
		 * API name: {@code hidden}
		 */
		public final Builder hidden(@Nullable Boolean value) {
			this.hidden = value;
			return this;
		}

		/**
		 * API name: {@code allow_custom_routing}
		 */
		public final Builder allowCustomRouting(@Nullable Boolean value) {
			this.allowCustomRouting = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamVisibility}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamVisibility build() {
			_checkSingleUse();

			return new DataStreamVisibility(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamVisibility}
	 */
	public static final JsonpDeserializer<DataStreamVisibility> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamVisibility::setupDataStreamVisibilityDeserializer);

	protected static void setupDataStreamVisibilityDeserializer(ObjectDeserializer<DataStreamVisibility.Builder> op) {

		op.add(Builder::hidden, JsonpDeserializer.booleanDeserializer(), "hidden");
		op.add(Builder::allowCustomRouting, JsonpDeserializer.booleanDeserializer(), "allow_custom_routing");

	}

}

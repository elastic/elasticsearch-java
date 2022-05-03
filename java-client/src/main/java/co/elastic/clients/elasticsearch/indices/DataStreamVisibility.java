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

	// ---------------------------------------------------------------------------------------------

	private DataStreamVisibility(Builder builder) {

		this.hidden = builder.hidden;

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

		/**
		 * API name: {@code hidden}
		 */
		public final Builder hidden(@Nullable Boolean value) {
			this.hidden = value;
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

	}

}

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

import co.elastic.clients.elasticsearch.indices.DataStreamLifecycle;
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
import java.lang.String;
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

// typedef: indices.get_data_lifecycle.DataStreamWithLifecycle

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_lifecycle.DataStreamWithLifecycle">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamWithLifecycle implements JsonpSerializable {
	private final String name;

	@Nullable
	private final DataStreamLifecycle lifecycle;

	// ---------------------------------------------------------------------------------------------

	private DataStreamWithLifecycle(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.lifecycle = builder.lifecycle;

	}

	public static DataStreamWithLifecycle of(Function<Builder, ObjectBuilder<DataStreamWithLifecycle>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code lifecycle}
	 */
	@Nullable
	public final DataStreamLifecycle lifecycle() {
		return this.lifecycle;
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

		generator.writeKey("name");
		generator.write(this.name);

		if (this.lifecycle != null) {
			generator.writeKey("lifecycle");
			this.lifecycle.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamWithLifecycle}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamWithLifecycle> {
		private String name;

		@Nullable
		private DataStreamLifecycle lifecycle;

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(@Nullable DataStreamLifecycle value) {
			this.lifecycle = value;
			return this;
		}

		/**
		 * API name: {@code lifecycle}
		 */
		public final Builder lifecycle(Function<DataStreamLifecycle.Builder, ObjectBuilder<DataStreamLifecycle>> fn) {
			return this.lifecycle(fn.apply(new DataStreamLifecycle.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamWithLifecycle}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamWithLifecycle build() {
			_checkSingleUse();

			return new DataStreamWithLifecycle(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamWithLifecycle}
	 */
	public static final JsonpDeserializer<DataStreamWithLifecycle> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamWithLifecycle::setupDataStreamWithLifecycleDeserializer);

	protected static void setupDataStreamWithLifecycleDeserializer(
			ObjectDeserializer<DataStreamWithLifecycle.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::lifecycle, DataStreamLifecycle._DESERIALIZER, "lifecycle");

	}

}

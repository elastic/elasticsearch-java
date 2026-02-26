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

package co.elastic.clients.elasticsearch.indices.put_data_stream_settings;

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

// typedef: indices.put_data_stream_settings.DataStreamSettingsError

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.put_data_stream_settings.DataStreamSettingsError">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamSettingsError implements JsonpSerializable {
	private final String index;

	private final String error;

	// ---------------------------------------------------------------------------------------------

	private DataStreamSettingsError(Builder builder) {

		this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
		this.error = ApiTypeHelper.requireNonNull(builder.error, this, "error");

	}

	public static DataStreamSettingsError of(Function<Builder, ObjectBuilder<DataStreamSettingsError>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index}
	 */
	public final String index() {
		return this.index;
	}

	/**
	 * Required - A message explaining why the settings could not be applied to
	 * specific indices.
	 * <p>
	 * API name: {@code error}
	 */
	public final String error() {
		return this.error;
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

		generator.writeKey("index");
		generator.write(this.index);

		generator.writeKey("error");
		generator.write(this.error);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamSettingsError}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamSettingsError> {
		private String index;

		private String error;

		public Builder() {
		}
		private Builder(DataStreamSettingsError instance) {
			this.index = instance.index;
			this.error = instance.error;

		}
		/**
		 * Required - API name: {@code index}
		 */
		public final Builder index(String value) {
			this.index = value;
			return this;
		}

		/**
		 * Required - A message explaining why the settings could not be applied to
		 * specific indices.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(String value) {
			this.error = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamSettingsError}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamSettingsError build() {
			_checkSingleUse();

			return new DataStreamSettingsError(this);
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
	 * Json deserializer for {@link DataStreamSettingsError}
	 */
	public static final JsonpDeserializer<DataStreamSettingsError> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamSettingsError::setupDataStreamSettingsErrorDeserializer);

	protected static void setupDataStreamSettingsErrorDeserializer(
			ObjectDeserializer<DataStreamSettingsError.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");

	}

}

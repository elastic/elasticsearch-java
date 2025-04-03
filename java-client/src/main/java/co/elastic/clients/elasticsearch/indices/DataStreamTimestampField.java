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

// typedef: indices._types.DataStreamTimestampField

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamTimestampField">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamTimestampField implements JsonpSerializable {
	private final String name;

	// ---------------------------------------------------------------------------------------------

	private DataStreamTimestampField(Builder builder) {

		this.name = ApiTypeHelper.requireNonNullWithDefault(builder.name, this, "name", this.name());

	}

	public static DataStreamTimestampField of(Function<Builder, ObjectBuilder<DataStreamTimestampField>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Name of the timestamp field for the data stream, which must be
	 * <code>@timestamp</code>. The <code>@timestamp</code> field must be included
	 * in every document indexed to the data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamTimestampField}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamTimestampField> {
		private String name;

		/**
		 * Required - Name of the timestamp field for the data stream, which must be
		 * <code>@timestamp</code>. The <code>@timestamp</code> field must be included
		 * in every document indexed to the data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamTimestampField}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamTimestampField build() {
			_checkSingleUse();

			return new DataStreamTimestampField(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamTimestampField}
	 */
	public static final JsonpDeserializer<DataStreamTimestampField> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamTimestampField::setupDataStreamTimestampFieldDeserializer);

	protected static void setupDataStreamTimestampFieldDeserializer(
			ObjectDeserializer<DataStreamTimestampField.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}

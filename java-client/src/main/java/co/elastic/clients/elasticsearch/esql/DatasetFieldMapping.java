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

package co.elastic.clients.elasticsearch.esql;

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

// typedef: esql._types.DatasetFieldMapping

/**
 * A per-column declaration inside a dataset mapping's <code>properties</code>.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.DatasetFieldMapping">API
 *      specification</a>
 */
@JsonpDeserializable
public class DatasetFieldMapping implements JsonpSerializable {
	private final String type;

	@Nullable
	private final String path;

	@Nullable
	private final String format;

	// ---------------------------------------------------------------------------------------------

	private DatasetFieldMapping(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.path = builder.path;
		this.format = builder.format;

	}

	public static DatasetFieldMapping of(Function<Builder, ObjectBuilder<DatasetFieldMapping>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The declared column type.
	 * <p>
	 * API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * The underlying file column that this logical column reads from. This is a
	 * read-path rename: the physical column becomes this single logical column.
	 * <p>
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
	}

	/**
	 * The date-parse pattern for a declared <code>date</code> column, mirroring the
	 * index date-field <code>format</code>.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
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

		generator.writeKey("type");
		generator.write(this.type);

		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DatasetFieldMapping}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DatasetFieldMapping> {
		private String type;

		@Nullable
		private String path;

		@Nullable
		private String format;

		public Builder() {
		}
		private Builder(DatasetFieldMapping instance) {
			this.type = instance.type;
			this.path = instance.path;
			this.format = instance.format;

		}
		/**
		 * Required - The declared column type.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * The underlying file column that this logical column reads from. This is a
		 * read-path rename: the physical column becomes this single logical column.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		/**
		 * The date-parse pattern for a declared <code>date</code> column, mirroring the
		 * index date-field <code>format</code>.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DatasetFieldMapping}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DatasetFieldMapping build() {
			_checkSingleUse();

			return new DatasetFieldMapping(this);
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
	 * Json deserializer for {@link DatasetFieldMapping}
	 */
	public static final JsonpDeserializer<DatasetFieldMapping> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DatasetFieldMapping::setupDatasetFieldMappingDeserializer);

	protected static void setupDatasetFieldMappingDeserializer(ObjectDeserializer<DatasetFieldMapping.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");

	}

}

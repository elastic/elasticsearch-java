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

package co.elastic.clients.elasticsearch.indices.get_data_stream_mappings;

import co.elastic.clients.elasticsearch._types.mapping.TypeMapping;
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

// typedef: indices.get_data_stream_mappings.DataStreamMappings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_stream_mappings.DataStreamMappings">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamMappings implements JsonpSerializable {
	private final String name;

	private final TypeMapping mappings;

	private final TypeMapping effectiveMappings;

	// ---------------------------------------------------------------------------------------------

	private DataStreamMappings(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.mappings = ApiTypeHelper.requireNonNull(builder.mappings, this, "mappings");
		this.effectiveMappings = ApiTypeHelper.requireNonNull(builder.effectiveMappings, this, "effectiveMappings");

	}

	public static DataStreamMappings of(Function<Builder, ObjectBuilder<DataStreamMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The settings specific to this data stream
	 * <p>
	 * API name: {@code mappings}
	 */
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * Required - The settings specific to this data stream merged with the settings
	 * from its template. These <code>effective_settings</code> are the settings
	 * that will be used when a new index is created for this data stream.
	 * <p>
	 * API name: {@code effective_mappings}
	 */
	public final TypeMapping effectiveMappings() {
		return this.effectiveMappings;
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

		generator.writeKey("mappings");
		this.mappings.serialize(generator, mapper);

		generator.writeKey("effective_mappings");
		this.effectiveMappings.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamMappings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamMappings> {
		private String name;

		private TypeMapping mappings;

		private TypeMapping effectiveMappings;

		/**
		 * Required - The name of the data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * Required - The settings specific to this data stream merged with the settings
		 * from its template. These <code>effective_settings</code> are the settings
		 * that will be used when a new index is created for this data stream.
		 * <p>
		 * API name: {@code effective_mappings}
		 */
		public final Builder effectiveMappings(TypeMapping value) {
			this.effectiveMappings = value;
			return this;
		}

		/**
		 * Required - The settings specific to this data stream merged with the settings
		 * from its template. These <code>effective_settings</code> are the settings
		 * that will be used when a new index is created for this data stream.
		 * <p>
		 * API name: {@code effective_mappings}
		 */
		public final Builder effectiveMappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.effectiveMappings(fn.apply(new TypeMapping.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamMappings build() {
			_checkSingleUse();

			return new DataStreamMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamMappings}
	 */
	public static final JsonpDeserializer<DataStreamMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamMappings::setupDataStreamMappingsDeserializer);

	protected static void setupDataStreamMappingsDeserializer(ObjectDeserializer<DataStreamMappings.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::effectiveMappings, TypeMapping._DESERIALIZER, "effective_mappings");

	}

}

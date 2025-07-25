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

package co.elastic.clients.elasticsearch.indices.put_data_stream_mappings;

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
import java.lang.Boolean;
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

// typedef: indices.put_data_stream_mappings.UpdatedDataStreamMappings

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.put_data_stream_mappings.UpdatedDataStreamMappings">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpdatedDataStreamMappings implements JsonpSerializable {
	private final String name;

	private final boolean appliedToDataStream;

	@Nullable
	private final String error;

	@Nullable
	private final TypeMapping mappings;

	@Nullable
	private final TypeMapping effectiveMappings;

	// ---------------------------------------------------------------------------------------------

	private UpdatedDataStreamMappings(Builder builder) {

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.appliedToDataStream = ApiTypeHelper.requireNonNull(builder.appliedToDataStream, this,
				"appliedToDataStream", false);
		this.error = builder.error;
		this.mappings = builder.mappings;
		this.effectiveMappings = builder.effectiveMappings;

	}

	public static UpdatedDataStreamMappings of(Function<Builder, ObjectBuilder<UpdatedDataStreamMappings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The data stream name.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - If the mappings were successfully applied to the data stream (or
	 * would have been, if running in <code>dry_run</code> mode), it is
	 * <code>true</code>. If an error occurred, it is <code>false</code>.
	 * <p>
	 * API name: {@code applied_to_data_stream}
	 */
	public final boolean appliedToDataStream() {
		return this.appliedToDataStream;
	}

	/**
	 * A message explaining why the mappings could not be applied to the data
	 * stream.
	 * <p>
	 * API name: {@code error}
	 */
	@Nullable
	public final String error() {
		return this.error;
	}

	/**
	 * The mappings that are specfic to this data stream that will override any
	 * mappings from the matching index template.
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public final TypeMapping mappings() {
		return this.mappings;
	}

	/**
	 * The mappings that are effective on this data stream, taking into account the
	 * mappings from the matching index template and the mappings specific to this
	 * data stream.
	 * <p>
	 * API name: {@code effective_mappings}
	 */
	@Nullable
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

		generator.writeKey("applied_to_data_stream");
		generator.write(this.appliedToDataStream);

		if (this.error != null) {
			generator.writeKey("error");
			generator.write(this.error);

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		if (this.effectiveMappings != null) {
			generator.writeKey("effective_mappings");
			this.effectiveMappings.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpdatedDataStreamMappings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpdatedDataStreamMappings> {
		private String name;

		private Boolean appliedToDataStream;

		@Nullable
		private String error;

		@Nullable
		private TypeMapping mappings;

		@Nullable
		private TypeMapping effectiveMappings;

		/**
		 * Required - The data stream name.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - If the mappings were successfully applied to the data stream (or
		 * would have been, if running in <code>dry_run</code> mode), it is
		 * <code>true</code>. If an error occurred, it is <code>false</code>.
		 * <p>
		 * API name: {@code applied_to_data_stream}
		 */
		public final Builder appliedToDataStream(boolean value) {
			this.appliedToDataStream = value;
			return this;
		}

		/**
		 * A message explaining why the mappings could not be applied to the data
		 * stream.
		 * <p>
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable String value) {
			this.error = value;
			return this;
		}

		/**
		 * The mappings that are specfic to this data stream that will override any
		 * mappings from the matching index template.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable TypeMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * The mappings that are specfic to this data stream that will override any
		 * mappings from the matching index template.
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<TypeMapping.Builder, ObjectBuilder<TypeMapping>> fn) {
			return this.mappings(fn.apply(new TypeMapping.Builder()).build());
		}

		/**
		 * The mappings that are effective on this data stream, taking into account the
		 * mappings from the matching index template and the mappings specific to this
		 * data stream.
		 * <p>
		 * API name: {@code effective_mappings}
		 */
		public final Builder effectiveMappings(@Nullable TypeMapping value) {
			this.effectiveMappings = value;
			return this;
		}

		/**
		 * The mappings that are effective on this data stream, taking into account the
		 * mappings from the matching index template and the mappings specific to this
		 * data stream.
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
		 * Builds a {@link UpdatedDataStreamMappings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpdatedDataStreamMappings build() {
			_checkSingleUse();

			return new UpdatedDataStreamMappings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpdatedDataStreamMappings}
	 */
	public static final JsonpDeserializer<UpdatedDataStreamMappings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpdatedDataStreamMappings::setupUpdatedDataStreamMappingsDeserializer);

	protected static void setupUpdatedDataStreamMappingsDeserializer(
			ObjectDeserializer<UpdatedDataStreamMappings.Builder> op) {

		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::appliedToDataStream, JsonpDeserializer.booleanDeserializer(), "applied_to_data_stream");
		op.add(Builder::error, JsonpDeserializer.stringDeserializer(), "error");
		op.add(Builder::mappings, TypeMapping._DESERIALIZER, "mappings");
		op.add(Builder::effectiveMappings, TypeMapping._DESERIALIZER, "effective_mappings");

	}

}

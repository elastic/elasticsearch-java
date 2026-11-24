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

package co.elastic.clients.elasticsearch.inference;

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
import java.util.List;
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

// typedef: inference._types.EndpointMetadataHeuristics

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#inference._types.EndpointMetadataHeuristics">API
 *      specification</a>
 */
@JsonpDeserializable
public class EndpointMetadataHeuristics implements JsonpSerializable {
	private final List<String> properties;

	@Nullable
	private final EndpointMetadataStatus status;

	@Nullable
	private final String releaseDate;

	@Nullable
	private final String endOfLifeDate;

	// ---------------------------------------------------------------------------------------------

	private EndpointMetadataHeuristics(Builder builder) {

		this.properties = ApiTypeHelper.unmodifiableRequired(builder.properties, this, "properties");
		this.status = builder.status;
		this.releaseDate = builder.releaseDate;
		this.endOfLifeDate = builder.endOfLifeDate;

	}

	public static EndpointMetadataHeuristics of(Function<Builder, ObjectBuilder<EndpointMetadataHeuristics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Tags that describe the properties of the model, for example
	 * <code>multilingual</code>, <code>english</code> or <code>multimodal</code>.
	 * <p>
	 * API name: {@code properties}
	 */
	public final List<String> properties() {
		return this.properties;
	}

	/**
	 * The release status of the model.
	 * <p>
	 * API name: {@code status}
	 */
	@Nullable
	public final EndpointMetadataStatus status() {
		return this.status;
	}

	/**
	 * The date on which the model was released, in <code>yyyy-MM-dd</code> format.
	 * <p>
	 * API name: {@code release_date}
	 */
	@Nullable
	public final String releaseDate() {
		return this.releaseDate;
	}

	/**
	 * The date on which the model reaches the end of its life, in
	 * <code>yyyy-MM-dd</code> format.
	 * <p>
	 * API name: {@code end_of_life_date}
	 */
	@Nullable
	public final String endOfLifeDate() {
		return this.endOfLifeDate;
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

		if (ApiTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartArray();
			for (String item0 : this.properties) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}
		if (this.releaseDate != null) {
			generator.writeKey("release_date");
			generator.write(this.releaseDate);

		}
		if (this.endOfLifeDate != null) {
			generator.writeKey("end_of_life_date");
			generator.write(this.endOfLifeDate);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EndpointMetadataHeuristics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EndpointMetadataHeuristics> {
		private List<String> properties;

		@Nullable
		private EndpointMetadataStatus status;

		@Nullable
		private String releaseDate;

		@Nullable
		private String endOfLifeDate;

		public Builder() {
		}
		private Builder(EndpointMetadataHeuristics instance) {
			this.properties = instance.properties;
			this.status = instance.status;
			this.releaseDate = instance.releaseDate;
			this.endOfLifeDate = instance.endOfLifeDate;

		}
		/**
		 * Required - Tags that describe the properties of the model, for example
		 * <code>multilingual</code>, <code>english</code> or <code>multimodal</code>.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>properties</code>.
		 */
		public final Builder properties(List<String> list) {
			this.properties = _listAddAll(this.properties, list);
			return this;
		}

		/**
		 * Required - Tags that describe the properties of the model, for example
		 * <code>multilingual</code>, <code>english</code> or <code>multimodal</code>.
		 * <p>
		 * API name: {@code properties}
		 * <p>
		 * Adds one or more values to <code>properties</code>.
		 */
		public final Builder properties(String value, String... values) {
			this.properties = _listAdd(this.properties, value, values);
			return this;
		}

		/**
		 * The release status of the model.
		 * <p>
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable EndpointMetadataStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * The date on which the model was released, in <code>yyyy-MM-dd</code> format.
		 * <p>
		 * API name: {@code release_date}
		 */
		public final Builder releaseDate(@Nullable String value) {
			this.releaseDate = value;
			return this;
		}

		/**
		 * The date on which the model reaches the end of its life, in
		 * <code>yyyy-MM-dd</code> format.
		 * <p>
		 * API name: {@code end_of_life_date}
		 */
		public final Builder endOfLifeDate(@Nullable String value) {
			this.endOfLifeDate = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EndpointMetadataHeuristics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EndpointMetadataHeuristics build() {
			_checkSingleUse();

			return new EndpointMetadataHeuristics(this);
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
	 * Json deserializer for {@link EndpointMetadataHeuristics}
	 */
	public static final JsonpDeserializer<EndpointMetadataHeuristics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EndpointMetadataHeuristics::setupEndpointMetadataHeuristicsDeserializer);

	protected static void setupEndpointMetadataHeuristicsDeserializer(
			ObjectDeserializer<EndpointMetadataHeuristics.Builder> op) {

		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"properties");
		op.add(Builder::status, EndpointMetadataStatus._DESERIALIZER, "status");
		op.add(Builder::releaseDate, JsonpDeserializer.stringDeserializer(), "release_date");
		op.add(Builder::endOfLifeDate, JsonpDeserializer.stringDeserializer(), "end_of_life_date");

	}

}

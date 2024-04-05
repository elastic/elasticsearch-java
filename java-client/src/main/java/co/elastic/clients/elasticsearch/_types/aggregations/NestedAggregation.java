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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.aggregations.NestedAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.NestedAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class NestedAggregation extends BucketAggregationBase implements AggregationVariant, JsonpSerializable {
	@Nullable
	private final String path;

	// ---------------------------------------------------------------------------------------------

	private NestedAggregation(Builder builder) {

		this.path = builder.path;

	}

	public static NestedAggregation of(Function<Builder, ObjectBuilder<NestedAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.Nested;
	}

	/**
	 * The path to the field of type <code>nested</code>.
	 * <p>
	 * API name: {@code path}
	 */
	@Nullable
	public final String path() {
		return this.path;
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

		if (this.path != null) {
			generator.writeKey("path");
			generator.write(this.path);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NestedAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NestedAggregation> {
		@Nullable
		private String path;

		/**
		 * The path to the field of type <code>nested</code>.
		 * <p>
		 * API name: {@code path}
		 */
		public final Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NestedAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NestedAggregation build() {
			_checkSingleUse();

			return new NestedAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NestedAggregation}
	 */
	public static final JsonpDeserializer<NestedAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NestedAggregation::setupNestedAggregationDeserializer);

	protected static void setupNestedAggregationDeserializer(ObjectDeserializer<NestedAggregation.Builder> op) {

		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

	}

}

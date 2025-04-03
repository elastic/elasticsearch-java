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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.query_dsl.ShapeQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.ShapeQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShapeQuery extends QueryBase implements QueryVariant {
	private final String field;

	private final ShapeFieldQuery shape;

	@Nullable
	private final Boolean ignoreUnmapped;

	// ---------------------------------------------------------------------------------------------

	private ShapeQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.shape = ApiTypeHelper.requireNonNull(builder.shape, this, "shape");

		this.ignoreUnmapped = builder.ignoreUnmapped;

	}

	public static ShapeQuery of(Function<Builder, ObjectBuilder<ShapeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Shape;
	}

	/**
	 * Required -
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required -
	 */
	public final ShapeFieldQuery shape() {
		return this.shape;
	}

	/**
	 * When set to <code>true</code> the query ignores an unmapped field and will
	 * not match any documents.
	 * <p>
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeKey(this.field);
		this.shape.serialize(generator, mapper);

		super.serializeInternal(generator, mapper);
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShapeQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ShapeQuery> {
		private String field;

		private ShapeFieldQuery shape;

		/**
		 * Required -
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder shape(ShapeFieldQuery value) {
			this.shape = value;
			return this;
		}

		/**
		 * Required -
		 */
		public final Builder shape(Function<ShapeFieldQuery.Builder, ObjectBuilder<ShapeFieldQuery>> fn) {
			return this.shape(fn.apply(new ShapeFieldQuery.Builder()).build());
		}

		@Nullable
		private Boolean ignoreUnmapped;

		/**
		 * When set to <code>true</code> the query ignores an unmapped field and will
		 * not match any documents.
		 * <p>
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShapeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShapeQuery build() {
			_checkSingleUse();

			return new ShapeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShapeQuery}
	 */
	public static final JsonpDeserializer<ShapeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShapeQuery::setupShapeQueryDeserializer);

	protected static void setupShapeQueryDeserializer(ObjectDeserializer<ShapeQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.field(name);
			builder.shape(ShapeFieldQuery._DESERIALIZER.deserialize(parser, mapper));
		});

	}

}

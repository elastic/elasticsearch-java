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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
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

// typedef: _types.mapping.SparseVectorProperty

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.mapping.SparseVectorProperty">API
 *      specification</a>
 */
@JsonpDeserializable
public class SparseVectorProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean store;

	@Nullable
	private final SparseVectorIndexOptions indexOptions;

	// ---------------------------------------------------------------------------------------------

	private SparseVectorProperty(Builder builder) {
		super(builder);

		this.store = builder.store;
		this.indexOptions = builder.indexOptions;

	}

	public static SparseVectorProperty of(Function<Builder, ObjectBuilder<SparseVectorProperty>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Property variant kind.
	 */
	@Override
	public Property.Kind _propertyKind() {
		return Property.Kind.SparseVector;
	}

	/**
	 * API name: {@code store}
	 */
	@Nullable
	public final Boolean store() {
		return this.store;
	}

	/**
	 * Additional index options for the sparse vector field that controls the token
	 * pruning behavior of the sparse vector field.
	 * <p>
	 * API name: {@code index_options}
	 */
	@Nullable
	public final SparseVectorIndexOptions indexOptions() {
		return this.indexOptions;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "sparse_vector");
		super.serializeInternal(generator, mapper);
		if (this.store != null) {
			generator.writeKey("store");
			generator.write(this.store);

		}
		if (this.indexOptions != null) {
			generator.writeKey("index_options");
			this.indexOptions.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SparseVectorProperty}.
	 */

	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SparseVectorProperty> {
		@Nullable
		private Boolean store;

		@Nullable
		private SparseVectorIndexOptions indexOptions;

		/**
		 * API name: {@code store}
		 */
		public final Builder store(@Nullable Boolean value) {
			this.store = value;
			return this;
		}

		/**
		 * Additional index options for the sparse vector field that controls the token
		 * pruning behavior of the sparse vector field.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(@Nullable SparseVectorIndexOptions value) {
			this.indexOptions = value;
			return this;
		}

		/**
		 * Additional index options for the sparse vector field that controls the token
		 * pruning behavior of the sparse vector field.
		 * <p>
		 * API name: {@code index_options}
		 */
		public final Builder indexOptions(
				Function<SparseVectorIndexOptions.Builder, ObjectBuilder<SparseVectorIndexOptions>> fn) {
			return this.indexOptions(fn.apply(new SparseVectorIndexOptions.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SparseVectorProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SparseVectorProperty build() {
			_checkSingleUse();

			return new SparseVectorProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SparseVectorProperty}
	 */
	public static final JsonpDeserializer<SparseVectorProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SparseVectorProperty::setupSparseVectorPropertyDeserializer);

	protected static void setupSparseVectorPropertyDeserializer(ObjectDeserializer<SparseVectorProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::store, JsonpDeserializer.booleanDeserializer(), "store");
		op.add(Builder::indexOptions, SparseVectorIndexOptions._DESERIALIZER, "index_options");

		op.ignore("type");
	}

}

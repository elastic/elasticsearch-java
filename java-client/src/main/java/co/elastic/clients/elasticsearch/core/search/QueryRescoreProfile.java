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

package co.elastic.clients.elasticsearch.core.search;

import co.elastic.clients.elasticsearch._types.EmptyObject;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: _global.search._types.QueryRescoreProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.QueryRescoreProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class QueryRescoreProfile extends RescoreProfileBase implements RescoreProfileVariant {
	private final EmptyObject breakdown;

	// ---------------------------------------------------------------------------------------------

	private QueryRescoreProfile(Builder builder) {
		super(builder);

		this.breakdown = ApiTypeHelper.requireNonNull(builder.breakdown, this, "breakdown");

	}

	public static QueryRescoreProfile of(Function<Builder, ObjectBuilder<QueryRescoreProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * RescoreProfile variant kind.
	 */
	@Override
	public RescoreProfile.Kind _rescoreProfileKind() {
		return RescoreProfile.Kind.Query;
	}

	/**
	 * Required - The <code>query</code> rescorer does not report any steps.
	 * <p>
	 * API name: {@code breakdown}
	 */
	public final EmptyObject breakdown() {
		return this.breakdown;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "query");
		super.serializeInternal(generator, mapper);
		generator.writeKey("breakdown");
		this.breakdown.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link QueryRescoreProfile}.
	 */

	public static class Builder extends RescoreProfileBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<QueryRescoreProfile> {
		private EmptyObject breakdown;

		public Builder() {
		}
		private Builder(QueryRescoreProfile instance) {
			super(instance);
			this.breakdown = instance.breakdown;

		}
		/**
		 * Required - The <code>query</code> rescorer does not report any steps.
		 * <p>
		 * API name: {@code breakdown}
		 */
		public final Builder breakdown(EmptyObject value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * Required - The <code>query</code> rescorer does not report any steps.
		 * <p>
		 * API name: {@code breakdown}
		 */
		public final Builder breakdown(Function<EmptyObject.Builder, ObjectBuilder<EmptyObject>> fn) {
			return this.breakdown(fn.apply(new EmptyObject.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link QueryRescoreProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public QueryRescoreProfile build() {
			_checkSingleUse();

			return new QueryRescoreProfile(this);
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
	 * Json deserializer for {@link QueryRescoreProfile}
	 */
	public static final JsonpDeserializer<QueryRescoreProfile> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, QueryRescoreProfile::setupQueryRescoreProfileDeserializer);

	protected static void setupQueryRescoreProfileDeserializer(ObjectDeserializer<QueryRescoreProfile.Builder> op) {
		RescoreProfileBase.setupRescoreProfileBaseDeserializer(op);
		op.add(Builder::breakdown, EmptyObject._DESERIALIZER, "breakdown");

		op.ignore("type");
	}

}

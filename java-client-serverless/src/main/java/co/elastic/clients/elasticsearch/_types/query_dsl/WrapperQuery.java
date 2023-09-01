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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.WrapperQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.WrapperQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class WrapperQuery extends QueryBase implements QueryVariant {
	private final String query;

	// ---------------------------------------------------------------------------------------------

	private WrapperQuery(Builder builder) {
		super(builder);

		this.query = ApiTypeHelper.requireNonNull(builder.query, this, "query");

	}

	public static WrapperQuery of(Function<Builder, ObjectBuilder<WrapperQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Wrapper;
	}

	/**
	 * Required - A base64 encoded query. The binary data format can be any of JSON,
	 * YAML, CBOR or SMILE encodings
	 * <p>
	 * API name: {@code query}
	 */
	public final String query() {
		return this.query;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("query");
		generator.write(this.query);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WrapperQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<WrapperQuery> {
		private String query;

		/**
		 * Required - A base64 encoded query. The binary data format can be any of JSON,
		 * YAML, CBOR or SMILE encodings
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(String value) {
			this.query = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WrapperQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WrapperQuery build() {
			_checkSingleUse();

			return new WrapperQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WrapperQuery}
	 */
	public static final JsonpDeserializer<WrapperQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			WrapperQuery::setupWrapperQueryDeserializer);

	protected static void setupWrapperQueryDeserializer(ObjectDeserializer<WrapperQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");

	}

}

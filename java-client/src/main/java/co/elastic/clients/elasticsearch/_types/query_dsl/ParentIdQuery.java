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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.ParentIdQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.ParentIdQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class ParentIdQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final String id;

	@Nullable
	private final Boolean ignoreUnmapped;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	private ParentIdQuery(Builder builder) {
		super(builder);

		this.id = builder.id;
		this.ignoreUnmapped = builder.ignoreUnmapped;
		this.type = builder.type;

	}

	public static ParentIdQuery of(Function<Builder, ObjectBuilder<ParentIdQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.ParentId;
	}

	/**
	 * ID of the parent document.
	 * <p>
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Indicates whether to ignore an unmapped <code>type</code> and not return any
	 * documents instead of an error.
	 * <p>
	 * API name: {@code ignore_unmapped}
	 */
	@Nullable
	public final Boolean ignoreUnmapped() {
		return this.ignoreUnmapped;
	}

	/**
	 * Name of the child relationship mapped for the <code>join</code> field.
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public final String type() {
		return this.type;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.ignoreUnmapped != null) {
			generator.writeKey("ignore_unmapped");
			generator.write(this.ignoreUnmapped);

		}
		if (this.type != null) {
			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ParentIdQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<ParentIdQuery> {
		@Nullable
		private String id;

		@Nullable
		private Boolean ignoreUnmapped;

		@Nullable
		private String type;

		/**
		 * ID of the parent document.
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * Indicates whether to ignore an unmapped <code>type</code> and not return any
		 * documents instead of an error.
		 * <p>
		 * API name: {@code ignore_unmapped}
		 */
		public final Builder ignoreUnmapped(@Nullable Boolean value) {
			this.ignoreUnmapped = value;
			return this;
		}

		/**
		 * Name of the child relationship mapped for the <code>join</code> field.
		 * <p>
		 * API name: {@code type}
		 */
		public final Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ParentIdQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ParentIdQuery build() {
			_checkSingleUse();

			return new ParentIdQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ParentIdQuery}
	 */
	public static final JsonpDeserializer<ParentIdQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ParentIdQuery::setupParentIdQueryDeserializer);

	protected static void setupParentIdQueryDeserializer(ObjectDeserializer<ParentIdQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::ignoreUnmapped, JsonpDeserializer.booleanDeserializer(), "ignore_unmapped");
		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");

	}

}

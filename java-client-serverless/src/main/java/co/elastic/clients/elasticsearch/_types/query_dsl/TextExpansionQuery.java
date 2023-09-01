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

// typedef: _types.query_dsl.TextExpansionQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.TextExpansionQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class TextExpansionQuery extends QueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	private final String modelId;

	private final String modelText;

	// ---------------------------------------------------------------------------------------------

	private TextExpansionQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.modelId = ApiTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.modelText = ApiTypeHelper.requireNonNull(builder.modelText, this, "modelText");

	}

	public static TextExpansionQuery of(Function<Builder, ObjectBuilder<TextExpansionQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.TextExpansion;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - The text expansion NLP model to use
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - The query text
	 * <p>
	 * API name: {@code model_text}
	 */
	public final String modelText() {
		return this.modelText;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		generator.writeKey("model_id");
		generator.write(this.modelId);

		generator.writeKey("model_text");
		generator.write(this.modelText);

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TextExpansionQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<TextExpansionQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		private String modelId;

		private String modelText;

		/**
		 * Required - The text expansion NLP model to use
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - The query text
		 * <p>
		 * API name: {@code model_text}
		 */
		public final Builder modelText(String value) {
			this.modelText = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TextExpansionQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TextExpansionQuery build() {
			_checkSingleUse();

			return new TextExpansionQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TextExpansionQuery}
	 */
	public static final JsonpDeserializer<TextExpansionQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TextExpansionQuery::setupTextExpansionQueryDeserializer);

	protected static void setupTextExpansionQueryDeserializer(ObjectDeserializer<TextExpansionQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::modelText, JsonpDeserializer.stringDeserializer(), "model_text");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}

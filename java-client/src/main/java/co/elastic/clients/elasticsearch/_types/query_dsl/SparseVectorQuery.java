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

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
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

// typedef: _types.query_dsl.SparseVectorQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.SparseVectorQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class SparseVectorQuery extends QueryBase
		implements
			TaggedUnion<SparseVectorQuery.Kind, Object>,
			QueryVariant,
			JsonpSerializable {

	/**
	 * {@link SparseVectorQuery} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#_types.query_dsl.SparseVectorQuery">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		QueryVector("query_vector"),

		InferenceId("inference_id"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.SparseVector;
	}

	private final Kind _kind;
	private final Object _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final Object _get() {
		return _value;
	}

	private final String field;

	@Nullable
	private final String query;

	@Nullable
	private final Boolean prune;

	@Nullable
	private final TokenPruningConfig pruningConfig;

	private SparseVectorQuery(Builder builder) {
		super(builder);

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.query = builder.query;
		this.prune = builder.prune;
		this.pruningConfig = builder.pruningConfig;

	}

	public static SparseVectorQuery of(Function<Builder, ObjectBuilder<SparseVectorQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the field that contains the token-weight pairs to be
	 * searched against. This field must be a mapped sparse_vector field.
	 * <p>
	 * API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * The query text you want to use for search. If inference_id is specified,
	 * query must also be specified.
	 * <p>
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * Whether to perform pruning, omitting the non-significant tokens from the
	 * query to improve query performance. If prune is true but the pruning_config
	 * is not specified, pruning will occur but default values will be used.
	 * Default: false
	 * <p>
	 * API name: {@code prune}
	 */
	@Nullable
	public final Boolean prune() {
		return this.prune;
	}

	/**
	 * Optional pruning configuration. If enabled, this will omit non-significant
	 * tokens from the query in order to improve query performance. This is only
	 * used if prune is set to true. If prune is set to true but pruning_config is
	 * not specified, default values will be used.
	 * <p>
	 * API name: {@code pruning_config}
	 */
	@Nullable
	public final TokenPruningConfig pruningConfig() {
		return this.pruningConfig;
	}

	/**
	 * Is this variant instance of kind {@code query_vector}?
	 */
	public boolean isQueryVector() {
		return _kind == Kind.QueryVector;
	}

	/**
	 * Get the {@code query_vector} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code query_vector} kind.
	 */
	public Map<String, Float> queryVector() {
		return TaggedUnionUtils.get(this, Kind.QueryVector);
	}

	/**
	 * Is this variant instance of kind {@code inference_id}?
	 */
	public boolean isInferenceId() {
		return _kind == Kind.InferenceId;
	}

	/**
	 * Get the {@code inference_id} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code inference_id} kind.
	 */
	public String inferenceId() {
		return TaggedUnionUtils.get(this, Kind.InferenceId);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeStartObject();

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.query != null) {
			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.prune != null) {
			generator.writeKey("prune");
			generator.write(this.prune);

		}
		if (this.pruningConfig != null) {
			generator.writeKey("pruning_config");
			this.pruningConfig.serialize(generator, mapper);

		}

		generator.writeKey(_kind.jsonValue());
		if (_value instanceof JsonpSerializable) {
			((JsonpSerializable) _value).serialize(generator, mapper);
		} else {
			switch (_kind) {
				case QueryVector :
					generator.writeStartObject();
					for (Map.Entry<String, Float> item0 : ((Map<String, Float>) this._value).entrySet()) {
						generator.writeKey(item0.getKey());
						generator.write(item0.getValue());

					}
					generator.writeEnd();

					break;
				case InferenceId :
					generator.write(((String) this._value));

					break;
			}
		}

		generator.writeEnd();

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<SparseVectorQuery> {
		private Kind _kind;
		private Object _value;

		private String field;

		@Nullable
		private String query;

		@Nullable
		private Boolean prune;

		@Nullable
		private TokenPruningConfig pruningConfig;

		/**
		 * Required - The name of the field that contains the token-weight pairs to be
		 * searched against. This field must be a mapped sparse_vector field.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * The query text you want to use for search. If inference_id is specified,
		 * query must also be specified.
		 * <p>
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * Whether to perform pruning, omitting the non-significant tokens from the
		 * query to improve query performance. If prune is true but the pruning_config
		 * is not specified, pruning will occur but default values will be used.
		 * Default: false
		 * <p>
		 * API name: {@code prune}
		 */
		public final Builder prune(@Nullable Boolean value) {
			this.prune = value;
			return this;
		}

		/**
		 * Optional pruning configuration. If enabled, this will omit non-significant
		 * tokens from the query in order to improve query performance. This is only
		 * used if prune is set to true. If prune is set to true but pruning_config is
		 * not specified, default values will be used.
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(@Nullable TokenPruningConfig value) {
			this.pruningConfig = value;
			return this;
		}

		/**
		 * Optional pruning configuration. If enabled, this will omit non-significant
		 * tokens from the query in order to improve query performance. This is only
		 * used if prune is set to true. If prune is set to true but pruning_config is
		 * not specified, default values will be used.
		 * <p>
		 * API name: {@code pruning_config}
		 */
		public final Builder pruningConfig(Function<TokenPruningConfig.Builder, ObjectBuilder<TokenPruningConfig>> fn) {
			return this.pruningConfig(fn.apply(new TokenPruningConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}
		public ContainerBuilder queryVector(Map<String, Float> v) {
			this._kind = Kind.QueryVector;
			this._value = v;
			return new ContainerBuilder();
		}

		public ContainerBuilder inferenceId(String v) {
			this._kind = Kind.InferenceId;
			this._value = v;
			return new ContainerBuilder();
		}

		public SparseVectorQuery build() {
			_checkSingleUse();
			return new SparseVectorQuery(this);
		}

		public class ContainerBuilder implements ObjectBuilder<SparseVectorQuery> {

			/**
			 * Required - The name of the field that contains the token-weight pairs to be
			 * searched against. This field must be a mapped sparse_vector field.
			 * <p>
			 * API name: {@code field}
			 */
			public final ContainerBuilder field(String value) {
				Builder.this.field = value;
				return this;
			}

			/**
			 * The query text you want to use for search. If inference_id is specified,
			 * query must also be specified.
			 * <p>
			 * API name: {@code query}
			 */
			public final ContainerBuilder query(@Nullable String value) {
				Builder.this.query = value;
				return this;
			}

			/**
			 * Whether to perform pruning, omitting the non-significant tokens from the
			 * query to improve query performance. If prune is true but the pruning_config
			 * is not specified, pruning will occur but default values will be used.
			 * Default: false
			 * <p>
			 * API name: {@code prune}
			 */
			public final ContainerBuilder prune(@Nullable Boolean value) {
				Builder.this.prune = value;
				return this;
			}

			/**
			 * Optional pruning configuration. If enabled, this will omit non-significant
			 * tokens from the query in order to improve query performance. This is only
			 * used if prune is set to true. If prune is set to true but pruning_config is
			 * not specified, default values will be used.
			 * <p>
			 * API name: {@code pruning_config}
			 */
			public final ContainerBuilder pruningConfig(@Nullable TokenPruningConfig value) {
				Builder.this.pruningConfig = value;
				return this;
			}

			/**
			 * Optional pruning configuration. If enabled, this will omit non-significant
			 * tokens from the query in order to improve query performance. This is only
			 * used if prune is set to true. If prune is set to true but pruning_config is
			 * not specified, default values will be used.
			 * <p>
			 * API name: {@code pruning_config}
			 */
			public final ContainerBuilder pruningConfig(
					Function<TokenPruningConfig.Builder, ObjectBuilder<TokenPruningConfig>> fn) {
				return this.pruningConfig(fn.apply(new TokenPruningConfig.Builder()).build());
			}

			public SparseVectorQuery build() {
				return Builder.this.build();
			}
		}
	}

	protected static void setupSparseVectorQueryDeserializer(ObjectDeserializer<Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::queryVector, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.floatDeserializer()),
				"query_vector");
		op.add(Builder::inferenceId, JsonpDeserializer.stringDeserializer(), "inference_id");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::prune, JsonpDeserializer.booleanDeserializer(), "prune");
		op.add(Builder::pruningConfig, TokenPruningConfig._DESERIALIZER, "pruning_config");

	}

	public static final JsonpDeserializer<SparseVectorQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SparseVectorQuery::setupSparseVectorQueryDeserializer, Builder::build);
}
